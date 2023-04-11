package seleniumPrac;

public class StringReverse 
 {

	 String name = "Vaibhav";
	 static String reverse ="";
	int len = name.length();
	public void rev()
	 {
		for(int i = len-1;i>=0;i--)
		{
			reverse= reverse+name.charAt(i);
		}
		System.out.println(reverse);
		
	 }
	public static void main(String[] args) 
	 {	
		StringReverse strRev = new StringReverse();
         strRev.rev();
	 }

 }
