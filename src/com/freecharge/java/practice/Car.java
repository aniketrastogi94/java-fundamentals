package com.freecharge.java.practice;

public class Car {
	String name;
	String company;
	String category;
	int id;
	double price;
	int rating;
	double finalPrice;
	Car(String name,String category,int id,double price,String company,int rating){
		try {
			this.name=name;
			this.category=category;
			this.id=id;
			this.price=price;
			this.rating=rating;
			this.company=company;
		}catch(Exception e) {
			System.out.println("Something went wrong while creating car object");
		}
		
	}
	void displayCarDetails() {
		System.out.println("Car details are");
		System.out.println("name : " + name);
		System.out.println("company : " + company);
		System.out.println("category : " + category );
		System.out.println("id : " + id);
		System.out.println("price : " + price);
		System.out.println("rating : " + rating);
	}
	double finalPrice(String memberShip) {
		try {
			if(memberShip=="Silver") {
				this.finalPrice = this.price - (this.price*0.05);
			}
			else if(memberShip=="Gold") {
				this.finalPrice = this.price - (this.price*0.10);
			}
			else if(memberShip=="Diamond") {
				this.finalPrice = this.price - (this.price*0.15);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong while calculating final price");
		}
		return finalPrice;
	}
	public static void main(String[] args) {
		Car car=new Car("R5","Sedan",1,450000.0,"Audi",5);
		car.displayCarDetails();
		System.out.println(car.finalPrice("Gold"));
	}
}
