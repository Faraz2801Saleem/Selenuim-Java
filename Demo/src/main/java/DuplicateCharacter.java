
public class DuplicateCharacter 
 {
   static String name = "Madam";
    String rev="";
	  public  void reverse()
	    {
	      for(int i=name.length()-1;i>=0;i--)
	      {
	    	rev= rev+name.charAt(i);
	      }
	    System.out.println(rev);
	    if(name.equalsIgnoreCase(rev))
	    {
	    	System.out.println("palindrome");
	    }
	    else {
	    	System.out.println("not palindrome");
	    }
	 }
	
	public static void main(String[] args) 
	  {
		DuplicateCharacter dc = new DuplicateCharacter();
		dc.reverse();	
	  }

 }
