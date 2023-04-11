package seleniumPrac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumPrep\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://a.vdo.ai/core/gardenmanage/sample");
	      driver.manage().window().maximize();
	     Robot robot;
		try {
			robot = new Robot();

	          robot.keyPress(KeyEvent.VK_F12);
	          robot.keyRelease(KeyEvent.VK_F12);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
