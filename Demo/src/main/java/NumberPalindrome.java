
public class NumberPalindrome 
 {
   
	public static void main(String[] args) 
	 {
		int num=123321;
		int temp= num;
		int rev=0,rem;
        while(temp!=0)
         {
        	rem= temp%10;
        	rev= rev*10+rem;
        	temp=temp/10;
         }
        System.out.println(rev);
        if(num==rev)
        {
        	System.out.println("Palindrome number");
        }
        else
        {
        	System.out.println("Not Palindrome");
        }
        
        
	 }

 }
