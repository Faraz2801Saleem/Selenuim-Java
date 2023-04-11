package com.Datadriven;

  
  
   
	import java.io.IOException;

	import org.testng.annotations.Test;
	import com.simplyforhomes.utilities.Xls_Reader;
	

	public class Datadriventest  {
		
		
		
		@Test

		public void datatest() throws IOException, InterruptedException {
			
			
				
		
			Xls_Reader reader= new Xls_Reader("C:\\Users\\kanchan.kumari\\eclipse-workspace\\project\\src\\test\\java\\simplyforhome\\testdata\\testdata.xlsx");
			 int rowcount = reader.getRowCount("logintestdata");
			
			for (int rownum=2; rownum<=3; rownum++) {

			System.out.println("========");
				
			String userid=reader.getCellData("logintestdata", "userid", rownum);
			
			System .out.println(userid);
			
	        String pass=reader.getCellData("logintestdata", "pass", rownum);
			
			System .out.println(pass);
			
  }
		}
	}
