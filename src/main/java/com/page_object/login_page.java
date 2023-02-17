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
	
//========================================= popup ================================================	
	@FindBy(how=How.XPATH,using="//div[text()='Password is invalid' or @class='rrt-text']")
	private WebElement popup_invalid_Password;
	
	@FindBy(how=How.XPATH,using="//span[text()='✕']")
	private WebElement popup_close;
		
	@FindBy(how=How.XPATH,using="//div[text()='You have reached max number of attempts! Please try after sometime']")
	private WebElement popup_error;
	
	@FindBy(how=How.XPATH,using="//div[text()='You are logged in Successfully']")
	private WebElement popup_login_successfully;
	
	@FindBy(id="email")
	WebElement email;
	
	//
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
//=========================================== popup =================================================					
					
					public WebElement getpopup_invalid_Password() {
						return popup_invalid_Password;
					}
					public WebElement getpopup_close() {
						return popup_close;
					}
					public WebElement getpopup_error() {
						return popup_error;
					}
					public WebElement getpopup_login_successfully() {
						return popup_login_successfully;
					}

		
	

}
