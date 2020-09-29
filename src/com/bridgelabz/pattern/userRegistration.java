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
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System ");
	    userRegistration obj = new userRegistration();
	    obj.check_firstName();
	    obj.check_lastName();
	    }
}
