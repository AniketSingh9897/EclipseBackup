package SimpleProgram;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char c=sc.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u' || c=='A' ||c=='E' || c=='I' ||c=='O' || c=='U')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("cons");
		}
	}

}
