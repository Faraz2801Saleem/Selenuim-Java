package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
//	public LoginPageTest() {
//		super();
//	}
	
	@BeforeMethod
	public void setUp() {
		doInitialization();
		loginPage= new LoginPage();
	}
	
	
	@Test
	public void loginPageTitleTest() {
		String title=loginPage.verifyTitle();
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}

}
