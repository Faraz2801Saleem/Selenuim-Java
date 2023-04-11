
public class Reverse
  {

	public static void main(String[] args) 
	  {
	    String name = "My name is Faraz";
	    String rev= "";
	    String[] arr= name.split("\\s");
	    
	    for(int i = arr.length-1;i>=0;i--)
	     {
	    	
	    	rev= rev+arr[i]+" ";
	    	
	     }
	    		System.out.println(rev);
	  }

 }

//