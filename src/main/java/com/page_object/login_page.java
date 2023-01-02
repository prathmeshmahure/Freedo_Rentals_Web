package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page {
	public WebDriver driver;

//==================================== admin login ========================================
	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@title='SUBMIT']")
	private WebElement Button;
//=========================================================================================	
	@FindBy(id="email")
	WebElement email;
	
	
//===========================================================================================
		public login_page(WebDriver driver) 
		{
			this.driver=driver;
		}
					public WebDriver getDriver() {
						return driver;
					}
//==================================== Admin Login ==========================================					
					public WebElement getusername() {
						return username;
					}
			
					public WebElement getPassword() {
						return Password;
					}
			
					public WebElement getClick_submit_Button() {
						return Button;
					}
//============================================================================================					
					

		
	

}
