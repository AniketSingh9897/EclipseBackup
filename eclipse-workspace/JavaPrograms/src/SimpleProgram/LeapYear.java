package SimpleProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if((year % 100 != 0 && year % 4 == 0)||(year %400==0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

		 
	}

}
