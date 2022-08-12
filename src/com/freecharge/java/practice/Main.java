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
			for(int i=0;i<5;i++) {
				if(cars[i].name=="R1") {
					cars[i].displayCarDetails();
				}
			}
			//searching with brand
			for(int i=0;i<5;i++) {
				if(cars[i].company=="AUDI") {
					cars[i].displayCarDetails();
				}
			}
			// searching with price range
			for(int i=0;i<5;i++) {
				if(cars[i].price>=653647.0 && cars[i].price<=1500000.0) {
					cars[i].displayCarDetails();
				}
			}
			// searching with rating
			for(int i=0;i<5;i++) {
				if(cars[i].rating==5) {
					cars[i].displayCarDetails();
				}
			}
			//final discount
			for(int i=0;i<5;i++) {
				System.out.println(cars[i].finalPrice(user.membership));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
		
	}
}