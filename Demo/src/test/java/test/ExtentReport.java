package test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeMethod
	public void Beforemethod() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Report.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger=extent.createTest("test");
	}

	@Test
	public void test() {
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("http://localhost:8888/");
		Assert.assertTrue(driver.getTitle().contains("gautav"));
	}

	@AfterMethod
	private void afterMethod(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			String Pt = failscreenshot(driver, result.getName());
			//logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(Pt).build());
		}
		extent.flush();
		driver.quit();
	}

	public String failscreenshot(WebDriver diver, String name) {
		TakesScreenshot takeshot = (TakesScreenshot) driver;
		File srcfile = takeshot.getScreenshotAs(OutputType.FILE);
		String path = "Screenshot/failScreenshot/" + name + ".png";
		File storeFile = new File(path);
		try {
			Files.copy(srcfile, storeFile);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return path;
	}
}