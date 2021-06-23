package basicprograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year =s.nextInt();
		s.close();
		if(year<100)
		{
			System.out.println("Enter a valid Year ");
		}
		
		else if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Entered year is Leap year");
		}
		else
			System.out.println("Entered year is not leap year");
		// TODO Auto-generated method stub

	}
     
}
