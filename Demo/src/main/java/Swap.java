
public class Swap
 {
static int a=10,b=20,temp;
	public static void main(String[] args) 
	 {
		/*
		 * temp=a; a=b; b=temp;
		 * 
		 * System.out.print("The value of a is: "+a+" The value of b is: "+b);
		 */
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("The value of a is: "+a+" The value of b is: "+b);
		
	 }

 }
