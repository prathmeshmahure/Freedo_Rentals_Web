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

///////////////////////////////////////////////////////////////////////////////////////////////////////
		public static void custom_sendkeys(WebElement element,String value,String fieldname) {
			try {
					if(element.isEnabled() || element.isDisplayed()==true) {
						element.clear();
						element.sendKeys(value);
					test.log(Status.PASS, fieldname+ "==Value Successfully send=="+value);
					log.info("  Successfully send Value "+fieldname);
					}
			}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Send  Value=="+e);
					log.error("==Unable to send Value "+fieldname);
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////
		public static void Custom_click(WebElement element,String fieldname) {
			try {
					if(element.isDisplayed() || element.isEnabled()==true) {
						element.click();
						test.log(Status.PASS, "Successfully click=="+ fieldname);
						log.info("  Successfully Click "+fieldname);
					}
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Click =="+e);
					log.error("==Unable to Click "+fieldname);
								}
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////	
		public static void msg(String fieldname,String fieldname1) {
			try {
						test.log(Status.PASS,""+fieldname+" "+ fieldname1);
						log.info(fieldname+""+fieldname1);
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname1+"==Unable Action performed =="+e);
					log.error(fieldname+""+fieldname1);
								}
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////		
		public static void visible_and_click(WebElement element,String fieldname) {
			try {
					if(element.isDisplayed() || element.isEnabled()==true) {
					//	Thread.sleep(1500);
						library.Explicit_wait_for_APK(element);
						element.click();
						test.log(Status.PASS, "Element is visible =="+ fieldname);
						log.info("  Element is visible "+fieldname);
					}
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Element visible =="+e);
					log.error("==Unable to Element visible "+fieldname);
								}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		public static void visible(WebElement element,String fieldname) {
			try {
					if(element.isDisplayed() || element.isEnabled()==true) {
						Thread.sleep(500);
						test.log(Status.PASS, "Element is visible =="+ fieldname);
						log.info("  Element is visible "+fieldname);
					}
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"==Unable To Element visible =="+e);
					log.error("==Unable to Element visible "+fieldname);
								}
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
