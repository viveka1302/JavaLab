package oopsjava1;

import java.util.Scanner;

public class Exp3_prog3 {

	public static String number2month(int no) {
		switch(no) {
		case 1:
			return "January";
			 
		case 2:
			return "February";
			 
		case 3:
			return "March";
			 
		case 4:
			return "April";
			 
		case 5:
			return "May";
			 
		case 6:
			return "June";
			 
		case 7:
			return "July";
			 
		case 8:
			return "August";
			 
		case 9:
			return "September";
			
		case 10:
			return "October";
			 
		case 11:
			return "November";
			 
		case 12:
			return "December";
			 
		default:
			return "Wrong input";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number= sc.nextInt();
		String month= number2month(number);
		System.out.println("Month: "+month);
	}

}
