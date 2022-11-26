package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page {
	public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement Button;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	private WebElement Dropdown;

		public login_page(WebDriver driver) 
		{
			this.driver=driver;
		}

					public WebDriver getDriver() {
						return driver;
					}
					
					public WebElement getEmail() {
						return Email;
					}
			
					public WebElement getPass() {
						return Pass;
					}
			
					public WebElement getButton() {
						return Button;
					}
					
					public WebElement getDropdown() {
						return Dropdown;
					}

		
	

}
