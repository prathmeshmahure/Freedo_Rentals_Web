package com.utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
@Listeners(com.utility.listner.class)
public class library extends base_class{
	
	public static ExtentTest test;
	public static WebDriver driver;
	
		public static void custom_sendkeys(WebElement element,String value,String fieldname) {
			try {
					if(element.isEnabled() || element.isDisplayed()==true) {
						element.sendKeys(value);
					test.log(Status.PASS, fieldname+ "==Value Successfully send=="+value);
					log.info("Successfully send Value "+fieldname);
					}
			}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Send  Value=="+e);
					log.error("==Unable to send Value "+fieldname);
			}
		}
	/////////////////////////////////////////////////////////////////////////////////////////////////
		public static void Custom_click(WebElement element,String fieldname) {
			try {
					if(element.isDisplayed() || element.isEnabled()==true) {
						element.click();
						test.log(Status.PASS, "Successfully click=="+ fieldname);
						log.info("Successfully Click "+fieldname);
					}
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Click =="+e);
					log.error("==Unable to Click "+fieldname);
								}
		}
	////////////////////////////////////////////////////////////////////////////////////////////////	
		
	////////////////////////////////////////////////////////////////////////////////////////////////////		
	
		
}
