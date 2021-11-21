package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Intermiles_homepage;
import page.SignUp;
import page.Signout;



public class Tc01_navigatetoHomepage {
	
	
	WebDriver driver;
	Intermiles_homepage ip;
	//LogIn lp;
	Signout so;
	SignUp sup;
	

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Jar files\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.intermiles.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}	
	
	@Test
	public void verifyHomepage() {
	
		ip=PageFactory.initElements(driver, Intermiles_homepage.class);
		sup=PageFactory.initElements(driver, SignUp.class);
		so=PageFactory.initElements(driver, Signout.class);
		
		
		//clicking on sign in button on home page
		ip.clickSigninbtn();
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();
	}

}


