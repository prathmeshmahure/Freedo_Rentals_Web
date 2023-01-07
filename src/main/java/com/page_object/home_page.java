package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class home_page {
public WebDriver driver;
//==================================== Manual booking area=================================================================
	
	@FindBy(xpath="//p[text()='Manual Booking']")			//Click_Manual_Booking
	private WebElement Click_Manual_Booking;

//=====================================================================================================	
	
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")	//Click_Mobile_Number
	private WebElement Click_Mobile_Number;

	@FindBy(xpath="//button[@title='Search User']")			//Click_Search_User
	private WebElement Click_Search_User;

	@FindBy(xpath="(//*[text()='Select Package'])[2]")		//Click_Select_Package
	private WebElement Click_Select_Package;

	@FindBy(xpath="//li[@data-value='1 Days']")				//Click_1_days_package
	private WebElement Click_1_days_package;

	@FindBy(xpath="(//*[text()='Select City'])[2]")			//Click_Select_City
	private WebElement Click_Select_City;

	@FindBy(xpath="//li[@data-value='Noida']")				//Click_select_city_Noida
	private WebElement Click_select_city_Noida;

	@FindBy(xpath="//button[@title='Search Vehicle']")		//Click_Search_Vehicle
	private WebElement Click_Search_Vehicle;

	@FindBy(xpath="(//*[text()='Select Vehicle'])[2]")		//Click_Select_Vehicle	
	private WebElement Click_Select_Vehicle;
	
	@FindBy(xpath="(//li[@data-value])[2]")					//Click_Select_random_1st_Vehicle
	private WebElement Click_Select_random_1st_Vehicle;

	@FindBy(xpath="//li[@data-value='Glamour']")			//Click_Glamour_bike
	private WebElement Click_Glamour_bike;

	@FindBy(xpath="(//*[text()='Select Location'])[2]")		//Click_Select_Location
	private WebElement Click_Select_Location;

	@FindBy(xpath="//li[@data-value='Noida Uttar Pradesh']")//Click_Noida_Uttar_Pradesh
	private WebElement Click_Noida_Uttar_Pradesh;

	@FindBy(xpath="//button[@title='Create Booking']")
	private WebElement Click_Create_Booking;
//===================================== User manaement area ==============================================================
	
	@FindBy(xpath="//p[text()='User Management']")			//Click_User_Management
	private WebElement Click_User_Management;
	
	@FindBy(xpath="//input[@placeholder='Search Users']")	//Click_UM_Search_user
	private WebElement Click_UM_Search_user;

	@FindBy(xpath="//div[@id='view-action']")				//Click_view_action
	private WebElement Click_view_action;

	@FindBy(xpath="//h5[text()='Bookings']")				//Click_Bookings_button
	private WebElement Click_Bookings_button;

	@FindBy(xpath="//span[text()='Upcoming']")				//Click_Upcoming_bike_booking
	private WebElement Click_Upcoming_bike_booking;

//================================== Booking management ========================================================

	@FindBy(xpath="//p[text()='Booking Management']")		//Click_Booking_Management
	private WebElement Click_Booking_Management;

	@FindBy(xpath="")
	private WebElement Click;

	@FindBy(xpath="")
	private WebElement Click;

	@FindBy(xpath="")
	private WebElement Click;
	
	
	
//===============================================================================================================
		public home_page(WebDriver driver) 		{
			this.driver=driver;
		}
					public WebDriver getDriver() {
						return driver;
					}
//==================================== manual booking ==========================================================================					
					public WebElement getClick_Manual_Booking() {
						return Click_Manual_Booking;
					}
//============================================================================================			
					public WebElement getClick_Mobile_Number() {
						return Click_Mobile_Number;
					}
			
					public WebElement getClick_Search_User() {
						return Click_Search_User;
					}
			
					public WebElement getClick_Select_Package() {
						return Click_Select_Package;
					}
			
					public WebElement getClick_1_days_package() {
						return Click_1_days_package;
					}
			
					public WebElement getClick_Select_City() {
						return Click_Select_City;
					}
			
					public WebElement getClick_select_city_Noida() {
						return Click_select_city_Noida;
					}
			
					public WebElement getClick_Search_Vehicle() {
						return Click_Search_Vehicle;
					}
			
					public WebElement getClick_Select_Vehicle() {
						return Click_Select_Vehicle;
					}
			
					public WebElement getClick_Select_random_1st_Vehicle() {
						return Click_Select_random_1st_Vehicle;
					}
			
					public WebElement getClick_Glamour_bike() {
						return Click_Glamour_bike;
					}
			
					public WebElement getClick_Select_Location() {
						return Click_Select_Location;
					}
			
					public WebElement getClick_Noida_Uttar_Pradesh() {
						return Click_Noida_Uttar_Pradesh;
					}
			
					public WebElement getClick_Create_Booking() {
						return Click_Create_Booking;
					}
//====================================== User management ===================================================
										
					public WebElement getClick_User_Management() {
						return Click_User_Management;
					}
					public WebElement getClick_UM_Search_user() {
						return Click_UM_Search_user;
					}
			
					public WebElement getClick_view_action() {
						return Click_view_action;
					}
			
					public WebElement getClick_Bookings_button() {
						return Click_Bookings_button;
					}
			
					public WebElement getClick_Upcoming_bike_booking() {
						return Click_Upcoming_bike_booking;
					}
//================================= Booking management====================================================
					public WebElement getClick_Booking_Management() {
						return Click_Booking_Management;
					}
			
					public WebElement getPass() {
						return Pass;
					}
			
					public WebElement getPass() {
						return Pass;
					}
//			
//					public WebElement getPass() {
//						return Pass;
//					}
//			
//					public WebElement getPass() {
//						return Pass;
//					}
//			
//					public WebElement getPass() {
//						return Pass;
//					}
//			
//					public WebElement getPass() {
//						return Pass;
//					}
//			
//					public WebElement getPass() {
//						return Pass;
//					}
//			
//					public WebElement getButton() {
//						return Button;
//					}
}
