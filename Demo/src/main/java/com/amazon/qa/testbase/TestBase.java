package com.amazon.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.amazon.qa.testutil.WebEventListener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
 {
	public static  Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
    ExtentReports extent;
    
	public TestBase()    {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Extentreport/Report.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		  prop= new Properties();
		  try {
			FileInputStream filePath=  new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Demo\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
		try {
			prop.load(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
    }
   public static void doInitialization()
   {
	 String browserName= prop.getProperty("browser");
	 if(browserName.equals("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	 }
	 
	 e_driver=new EventFiringWebDriver(driver);
	 eventListener= new WebEventListener();
	 e_driver.register(eventListener);
	 driver=e_driver;

	   
	   driver.get(prop.getProperty("url"));
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().deleteAllCookies();
	   	   
   }
 }
