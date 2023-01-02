package com.utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class library {
	
	public static ExtentTest test;
	public static WebDriver driver;
	
		public static void custom_sendkeys(WebElement element,String value,String fieldname) {
			try {
					if(element.isEnabled() && element.isDisplayed()==true) {
						element.sendKeys(value);
					test.log(Status.PASS, fieldname+ "==Value Successfully send=="+value);	
					}
			}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Send  Value=="+e);
			}
		}
	/////////////////////////////////////////////////////////////////////////////////////////////////
		public static void Custom_click(WebElement element,String fieldname) {
			try {
					if(element.isDisplayed() && element.isEnabled()==true) {
						element.click();
						test.log(Status.PASS, "Successfully click=="+ fieldname);
					}
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Click =="+e);
								}
		}
	////////////////////////////////////////////////////////////////////////////////////////////////	
		
	////////////////////////////////////////////////////////////////////////////////////////////////////		
	
		
}
