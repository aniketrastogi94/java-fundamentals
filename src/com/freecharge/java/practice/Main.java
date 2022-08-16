package com.freecharge.java.practice;

public class Main {
	
	public static void main(String[] args) {
		try {
			Car car1=new Car("R1","Sedan",1,450000.0,"AUDI",1);
			Car car2=new Car("R2","Sedan",1,1500000.0,"BMW",2);
			Car car3=new Car("R3","Sedan",1,2350000.0,"MARUTI",3);
			Car car4=new Car("R4","Sedan",1,670000.0,"HYUNDAI",4);
			Car car5=new Car("R5","Sedan",1,890000.0,"MAHINDRA",5);
			Car[] cars;
			cars = new Car[5];
			cars[0]=car1;
			cars[1]=car2;
			cars[2]=car3;
			cars[3]=car4;
			cars[4]=car5;
			
			//creating user
			User user = new User("Aniket","aniketrastogi94@gmail.com",1,"Gold","9811478641");
			
			// searching with name
			searchCarByName(cars,"R1");
			
			//searching with brand
			searchCarByBrand(cars,"AUDI");
			
			// searching with price range
			searchCarByPrice(cars,653647.0,1500000.0);
			
			// searching with rating
			searchCarByRating(cars,5);
			
			//final discount
			findFinalPrice(cars,user.membership);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
		
	}
	public static void searchCarByName(Car[] cars,String name) throws CarNotFoundException {
		boolean found;
		found=false;
		System.out.println("Searching car by name.....");
		for(int i=0;i<cars.length;i++) {
			if(cars[i].name==name) {
				found=true;
				cars[i].displayCarDetails();
			}
		}
		if(!found || name==null) {
			throw new CarNotFoundException("Car not found with this name");
		}
	}
	
	public static void searchCarByBrand(Car[] cars,String brand) throws CarNotFoundException {
		boolean found;
		found=false;
		System.out.println("Searching car by brand.....");
		for(int i=0;i<cars.length;i++) {
			if(cars[i].company==brand) {
				found=true;
				cars[i].displayCarDetails();
			}
		}
		if(!found || brand==null) {
			throw new CarNotFoundException("Car not found with this brand");
		}
	}
	public static void searchCarByPrice(Car[] cars,double minPrice,double maxPrice) throws CarNotFoundException {
		boolean found;
		found=false;
		System.out.println("Searching car by price range.....");
		for(int i=0;i<cars.length;i++) {
			if(cars[i].price>=minPrice && cars[i].price<=maxPrice) {
				found=true;
				cars[i].displayCarDetails();
			}
		}
		if(!found || minPrice<0 || maxPrice<0) {
			throw new CarNotFoundException("Car not found with this price range");
		}
	}
	public static void searchCarByRating(Car[] cars,int rating) throws CarNotFoundException {
		boolean found;
		found=false;
		System.out.println("Searching car by rating.....");
		for(int i=0;i<cars.length;i++) {
			if(cars[i].rating==rating) {
				found=true;
				cars[i].displayCarDetails();
			}
		}
		if(!found || rating<0) {
			throw new CarNotFoundException("Car not found with this rating");
		}
	}
	public static void findFinalPrice(Car[] cars,String memberShip) {
		if(memberShip==null) {
			System.out.println("Invalid membership type");
		}
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].finalPrice(memberShip));
		}
	}
}