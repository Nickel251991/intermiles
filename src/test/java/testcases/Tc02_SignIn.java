package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;

import page.Intermiles_homepage;
import page.SignUp;
import page.Signout;

public class Tc02_SignIn {

	
	WebDriver driver;
	Intermiles_homepage ip;
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
	public void verifyHomepage () {
	
		ip=PageFactory.initElements(driver, Intermiles_homepage.class);
		sup=PageFactory.initElements(driver, SignUp.class);
		so=PageFactory.initElements(driver, Signout.class);
		//lp=PageFactory.initElements(driver, LogIn.class);
		
		
		//ip.clickSigninbtn();
		/*ip.clickloginbtn();
		driver.findElement(By.id("jp-adobe-login")).click();
		driver.findElement(By.id("userName")).sendKeys("214431162");
		driver.findElement(By.id("password Label")).sendKeys("Goodbye@123");
		driver.findElement(By.id("button")).click();
		*/
		driver.findElement(By.xpath("//header/div[@id='intermiles_header']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		
	}
       
	
		
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();
	}


}
