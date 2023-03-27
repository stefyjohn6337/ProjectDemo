package assignment2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0,rem=0;
		System.out.println("Enter a number : ");
		int num=s.nextInt();
		if(num==1)
			System.out.println("Number is 1");
		else if(num<=0)
			System.out.println("Number is negative");
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					a++;
					break;
				}
			}
			if(a>0)
				System.out.println("Number is not prime.");
			else
				System.out.println("Number is prime.");
		}
		

	}

}
