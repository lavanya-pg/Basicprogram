package basicprograms;

import java.util.Scanner;
public class Primefact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		while(n%2==0)
		{
			System.out.println(2+" ");
			n/=2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				System.out.println(i+" ");
				n/=i;
			}
		}
		if(n>2)
			System.out.print(n);

	}

}
