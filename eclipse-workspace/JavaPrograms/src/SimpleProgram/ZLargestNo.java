package SimpleProgram;

public class ZLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=100;
		
		/*if((a>b && a>c))
		{ System.out.println("a is largest");}
		else if (b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else 
			{System.out.println("c is largest");
		}*/
		int d= (c>(a>b ? a:b)? c:(a>b ? a:b));
		System.out.println(d +"is largest");
}
}