package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermiles_homepage {

	
		@FindBy(xpath="//button[contains(text(),'Sign Up')]")
		public WebElement signInbtn;
		
		public void clickSigninbtn() {
			signInbtn.click();
		}
		
		@FindBy(xpath="//a[@id='jp-adobe-login']")
		public WebElement loginbtn;
		
		public void clickloginbtn() {
			loginbtn.click();
		}
		
		
	}

