package assignment2;

import java.util.Scanner;

public class largestOfThreeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0,rem=0;
		System.out.println("Enter first number : ");
		int num1=s.nextInt();
		System.out.println("Enter second number : ");
		int num2=s.nextInt();
		System.out.println("Enter third number : ");
		int num3=s.nextInt();
		int largest = (num1>num2? (num1>num3? num1 :num3):(num2>num3)?num2:num3);
		System.out.println("Largest number :" + largest);

	}

}
