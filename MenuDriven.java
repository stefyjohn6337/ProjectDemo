package assignment2;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int no1=s.nextInt();
		System.out.println("Enter second number : ");
		int no2=s.nextInt();
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Add : Add 2 number");
		System.out.println("Subtract : Subtract 2 number");
		System.out.println("Multiply : Multiply 2 number");
		System.out.println("Exit : Exit");
		System.out.println("-----------------------------");
		System.out.println("Enter your choice : ");
		String choice = s.next();
		switch(choice) {
		case "add":
		case "Add":
		case "ADD": System.out.println("Sum : " + (no1+no2));
			break;
		case "subtract":
		case "Subtract":
		case "SUBTRACT": System.out.println("Subtract : " + (no1-no2));
			break;
		case "multiply":
		case "Multiply":
		case "MULTIPLY": System.out.println("Multiply : "+ (no1*no2));
			break;
		default: System.out.println("Wrong choice");
		}
	}

}
