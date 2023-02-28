package com.page_object;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class uat_url_booking {
	public WebDriver driver;

	//==================================== admin login ========================================
		@FindBy(how=How.XPATH,using="//div[text()='Automation City']")
		private WebElement uat_Automation_city;
		
		@FindBy(how=How.XPATH,using="//div[text()='Login']")
		private WebElement uat_login_button;
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='e.g. 70000000001']")
		private WebElement uat_username;

		
		@FindBy(how=How.XPATH,using="//div[text()='LOGIN']")
		private WebElement uat_user_login_button;

		
		@FindBy(how=How.XPATH,using="(//input[@autocapitalize='sentences'])[4]")
		private WebElement uat_enter_otp;

		
		@FindBy(how=How.XPATH,using="//div[text()='Verify Code']")
		private WebElement uat_verify_code;
		
/////////////////////////////////////////// Bike book  ///////////////////////////////////////
		
		@FindBy(how=How.XPATH,using="//option[text()='Pick-Up Point']")
		private WebElement uat_pick_up_point;
		
		@FindBy(how=How.XPATH,using="//option[text()='Automation']")
		private WebElement uat_Automation;

		@FindBy(how=How.XPATH,using="//input[@placeholder='Pick Up Date']")
		private WebElement uat_pick_up_date;

		@FindBy(how=How.XPATH,using="//td[@class='rdtDay rdtToday']//following-sibling::td[1]")
		private WebElement uat_calendar_nextday;

		@FindBy(how=How.XPATH,using="//div[text()='Select']")
		private WebElement uat_click_select_button;

		@FindBy(how=How.XPATH,using="//option[text()='Duration']")
		private WebElement uat_click_Duration;

		@FindBy(how=How.XPATH,using="//option[text()='1 Days']")
		private WebElement uat_click_1_days;

		@FindBy(how=How.XPATH,using="//div[@class='css-1dbjc4n r-1awozwy r-1jk19d6 r-1q9bdsx r-1loqt21 r-18u37iz r-1ygb39h r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-13qz1uu']")
		private WebElement uat_search_button;

		@FindBy(how=How.XPATH,using="(//div[text()='Book Now'])[1]")
		private WebElement uat_book_first_bike;

		@FindBy(how=How.XPATH,using="//div[text()='Book Vehicle']")
		private WebElement uat_book_vehicle_button;

		@FindBy(how=How.XPATH,using="//div[text()='Continue']")
		private WebElement uat_Continue_button;

		@FindBy(how=How.XPATH,using="//div[text()='Pay Now']")
		private WebElement uat_pay_now_button;

		@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
		private WebElement uat_cod_checkbox;

		@FindBy(how=How.XPATH,using="//div[text()='Pay using Netbanking']")
		private WebElement uat_pay_using_netbanking;

		@FindBy(how=How.XPATH,using="//div[text()='SBI']")
		private WebElement uat_pay_sbi;

		@FindBy(how=How.XPATH,using="//button[text()='Pay Now']")
		private WebElement uat_pay_button;

		@FindBy(how=How.XPATH,using="//button[text()='Success']")
		private WebElement uat_payment_success;
		
		
	//===========================================================================================
			public uat_url_booking(WebDriver driver) 
			{
				this.driver=driver;
			}
						public WebDriver getDriver() {
							return driver;
						}
	//==================================== Admin Login ==========================================					
						public WebElement getuat_Automation_city() {
							return uat_Automation_city;
						}			
						public WebElement getuat_login_button() {
							return uat_login_button;
						}			
						public WebElement getuat_username() {
							return uat_username;
						}			
						public WebElement getuat_user_login_button() {
							return uat_user_login_button;
						}			
						public WebElement getuat_enter_otp() {
							return uat_enter_otp;
						}			
						public WebElement getuat_verify_code() {
							return uat_verify_code;
						}	
//========================================= bike book =============================================
						public WebElement getuat_pick_up_point() {
							return uat_pick_up_point;
						}			
						public WebElement getuat_Automation() {
							return uat_Automation;
						}			
						public WebElement getuat_pick_up_date() {
							return uat_pick_up_date;
						}			
						public WebElement getuat_calendar_nextday() {
							return uat_calendar_nextday;
						}			
						public WebElement getuat_click_select_button() {
							return uat_click_select_button;
						}			
						public WebElement getuat_click_Duration() {
							return uat_click_Duration;
						}			
						public WebElement getuat_click_1_days() {
							return uat_click_1_days;
						}			
						public WebElement getuat_search_button() {
							return uat_search_button;
						}			
						public WebElement getuat_book_first_bike() {
							return uat_book_first_bike;
						}			
						public WebElement getuat_book_vehicle_button() {
							return uat_book_vehicle_button;
						}			
						public WebElement getuat_Continue_button() {
							return uat_Continue_button;
						}			
						public WebElement getuat_pay_now_button() {
							return uat_pay_now_button;
						}			
						public WebElement getuat_cod_checkbox() {
							return uat_cod_checkbox;
						}			
						public WebElement getuat_pay_using_netbanking() {
							return uat_pay_using_netbanking;
						}			
						public WebElement getuat_pay_sbi() {
							return uat_pay_sbi;
						}			
						public WebElement getuat_pay_button() {
							return uat_pay_button;
						}			
						public WebElement getuat_payment_success() {
							return uat_payment_success;
						}
						

			
		

	}


