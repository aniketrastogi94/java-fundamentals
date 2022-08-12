package com.freecharge.java.practice;

public class User {
	String name;
	String email;
	int id;
	String membership;
	String contactNo;
	User(String name,String email,int id,String MemberShip,String contactNo){
		try {
			this.name=name;
			this.email=email;
			this.id=id;
			this.membership=MemberShip;
			this.contactNo=contactNo;
		} catch (Exception e) {
			System.out.println("Something went wrong while creating user");
		}
		
	}
	void displayUserDetails() {
		System.out.println("User details are");
		System.out.println("name : "+ name);
		System.out.println("email : "+ email);
		System.out.println("id : "+ id);
		System.out.println("member ship type : " + membership);
		System.out.println("contact no : " + contactNo);
	}
	
	public static void main(String[] args) {
		User user = new User("Aniket","aniketrastogi94@gmail.com",1,"Gold","9811478641");
		user.displayUserDetails();
	}
}
