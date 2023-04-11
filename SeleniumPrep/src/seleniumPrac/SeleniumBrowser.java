package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumPrep\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      
      driver.findElement(By.name("q")).sendKeys("mango");
      driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
      driver.navigate().back();
//      driver.findElement(By.name("q")).sendKeys("apple");
      
      driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);

      //      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).click();
//      driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
      
      String title = driver.getTitle();
      System.out.println(title);
      driver.quit();
	}

}
