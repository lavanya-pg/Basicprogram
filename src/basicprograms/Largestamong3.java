package basicprograms;

import java.util.Scanner;

public class Largestamong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
			System.out.println(a+"is largest number");
		else if (b>a&&b>c)
			System.out.println(b+"is largest number");
		else 
			System.out.println(c+"is largest number");
		}
	}


