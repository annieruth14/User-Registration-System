package com.bridgelabz.pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class userRegistration {
	Scanner sc = new Scanner(System.in);
	
	public void check_firstName() {
		   System.out.println("Enter first name");  
		   String value = sc.nextLine();
		   
		   String pattern = "^[A-Z][a-z]{2,}$";
		   Pattern r = Pattern.compile(pattern);
		   Matcher m = r.matcher(value);
		   if (m.find())
			   	System.out.println("Valid first name");
		   else 
			   System.out.println("Invalid first name");
	   }
	public void check_lastName() {
		   System.out.println("Enter last name");  
		   String value = sc.nextLine();
		   
		   String pattern = "^[A-Z][a-z]{2,}$";
		   Pattern r = Pattern.compile(pattern);
		   Matcher m = r.matcher(value);
		   if (m.find())
			   	System.out.println("Valid last name");
		   else 
			   System.out.println("Invalid last name");
	}
	public void check_email() {
		   System.out.println("Enter email");  
		   String value = sc.nextLine();
		   
		   String pattern = "^[A-Za-z0-9]+([_+-.]?[A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}(.[A-Za-z]{2})?$";
		   Pattern r = Pattern.compile(pattern);
		   Matcher m = r.matcher(value);
		   if (m.find())
			   	System.out.println("Valid email");
		   else 
			   System.out.println("Invalid email");
	}
	public void check_phone() {
		System.out.println("Enter phone number ");  
		   String value = sc.nextLine();
		   String pattern = "^[0-9]{1,3}[ ][0-9]{10}?$";
		   Pattern r = Pattern.compile(pattern);
		   Matcher m = r.matcher(value);
		   if (m.find())
			   	System.out.println("Valid phone number");
		   else 
			   System.out.println("Invalid phone number");
	}
	public void check_Password() {
		System.out.println("Enter Password");  
		   String value = sc.nextLine();
		   String pattern = "^.{8,}$";
		   Pattern r = Pattern.compile(pattern);
		   Matcher m = r.matcher(value);
		   if (m.find())
			   	System.out.println("Valid Password");
		   else 
			   System.out.println("Invalid Password");
	}	

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System ");
	    userRegistration obj = new userRegistration();
	    obj.check_firstName();
	    obj.check_lastName();
	    obj.check_email();
	    obj.check_phone();
	    obj.check_Password();
	}
	
	
}
