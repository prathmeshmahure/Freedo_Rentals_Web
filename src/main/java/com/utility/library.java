package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class library {
	
	public static ExtentTest test;
	public static WebDriver driver;
	
		public static void custom_sendkeys(WebElement element,String value,String fieldname) {
			try {
					if(element.isEnabled()==true) {
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
					test.log(Status.FAIL, "==Unable To Click =="+e);
								}
		}
	////////////////////////////////////////////////////////////////////////////////////////////////	
		public static void Dropdown_handle(WebElement element,String DROP_down_value,String field) {
			try{
				if(element.isDisplayed() && element.isEnabled()==true) {
						Select sel=new Select(element);
					
						if(sel.equals(DROP_down_value)) {
							
							test.log(Status.PASS, "==Successfully click Dropdown=="+field);
							}
					}
			   }
				catch (Exception e ){
							test.log(Status.FAIL, "==Unable to find dropDown element++"+ e);
					}
			}
	////////////////////////////////////////////////////////////////////////////////////////////////////		
	
		
}
