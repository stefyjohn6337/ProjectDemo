package assignment2;
import java.util.Scanner;
public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=0, b=1, c=0;
		System.out.println("Enter a number");
		int series=s.nextInt();
		while(series>0) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			series--;
		}
		
	}

}
