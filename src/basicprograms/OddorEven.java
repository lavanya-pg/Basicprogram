package basicprograms;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}

	}

}
