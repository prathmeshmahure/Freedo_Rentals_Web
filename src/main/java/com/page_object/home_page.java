package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class home_page {
public WebDriver driver;

//==================================== home page dashboard component ===================================
	@FindBy(xpath="//p[text()='Dashboard']")			
	private WebElement Dashboard;
	
	@FindBy(xpath="//div[text()='Dashboard Management']")			
	private WebElement txt_Dashboard_Management;
	//=================================== Vehicle statics============
	@FindBy(xpath="//p[text()='Total Vehicles']//following-sibling::p")			//total vehicle
	private WebElement Ds_vs_txt_Total_Vehicles;
	
	@FindBy(xpath="//p[text()='Available Vehicles']//following-sibling::p")			
	private WebElement Ds_vs_txt_Available_Vehicles;
	
	@FindBy(xpath="//p[text()='Booked Vehicles']//following-sibling::p")			
	private WebElement Ds_vs_txt_Booked_Vehicles;
	
	@FindBy(xpath="//p[text()='InService Vehicles']//following-sibling::p")			
	private WebElement Ds_vs_txt_InService_Vehicles;
	//=================================== user statics============
	@FindBy(xpath="//p[text()='Registered Users']//following-sibling::p")			
	private WebElement Ds_us_txt_Registered_Users;
	
	@FindBy(xpath="//p[text()='Active Users']//following-sibling::p")			
	private WebElement Ds_us_txt_Active_Users;
	
	@FindBy(xpath="//p[text()='Pending KYC']//following-sibling::p")			
	private WebElement DS_us_txt_Pending_KYC;
	//=================================== Booking statics============
	@FindBy(xpath="//p[text()='Revenue Collected']//following-sibling::p")			
	private WebElement DS_bs_txt_Revenue_Collected;
	
	@FindBy(xpath="//p[text()='Total Bookings']//following-sibling::p")			
	private WebElement DS_bs_txt_Total_Bookings;
	
	@FindBy(xpath="//p[text()='Completed Bookings']//following-sibling::p")			
	private WebElement Ds_bs_txt_Completed_Bookings;
	
	@FindBy(xpath="(//input[@placeholder='dd-mm-yyyy'])[1]")			
	private WebElement Ds_date1;
	
	@FindBy(xpath="(//input[@placeholder='dd-mm-yyyy'])[2]")			
	private WebElement Ds_date2;
	
	@FindBy(xpath="(//input[@placeholder='dd-mm-yyyy'])[3]")			
	private WebElement Ds_date3;
	
	@FindBy(xpath="(//button[@tabindex='0'])[3]")			
	private WebElement Ds_click_date2;
	//=============== table data===================================
	@FindBy(xpath="//h5[text()='New Bookings Received']")			
	private WebElement DS_click_New_Bookings_Received;
	
	@FindBy(xpath="//h5[text()='Scheduled Bookings']")			
	private WebElement Ds_click_Scheduled_Bookings;
	
	@FindBy(xpath="//h5[text()='Near To Return Bookings']")			
	private WebElement Ds_click_Near_To_Return_Bookings;
	
	@FindBy(xpath="//h5[text()='Not Returned']")			
	private WebElement Ds_click_Not_Returned;
	
	@FindBy(xpath="//h5[text()='Return Requests Received']")			
	private WebElement Ds_click_Return_Requests_Received;
	
	@FindBy(xpath="//p[text()='User Name']")			
	private WebElement Ds_txt_User_Name;
	
	@FindBy(xpath="//p[text()='Mobile Number']")			
	private WebElement Ds_txt_Mobile_Number;

	
	@FindBy(xpath="//p[text()='Model Name']")			
	private WebElement Ds_txt_Model_Name;
	
	@FindBy(xpath="//p[text()='Vehicle']")			
	private WebElement Ds_txt_Vehicle;
	
	@FindBy(xpath="//p[text()='From']")			
	private WebElement Ds_txt_Booking_from_date;
	
	@FindBy(xpath="//p[text()='To']")			
	private WebElement Ds_txt_Booking_to_date;
	
	@FindBy(xpath="//p[text()='Payment Type']")			
	private WebElement Ds_txt_Payment_Type;
	
	@FindBy(xpath="//p[text()='COD']")			
	private WebElement Ds_txt_COD;
	
	@FindBy(xpath="//p[text()='Action']")			
	private WebElement Ds_txt_Action;
	/// inside table data  //////////////////////////
	
	@FindBy(xpath="//text[text()='Prathmesh']//parent::div//parent::td//following-sibling::td//div[@id='view-action']")			
	private WebElement DS_click_view_action;
	
	@FindBy(xpath="//text[text()='Prathmesh']//parent::div//parent::td//following-sibling::td//div[@id='approve-action']")			
	private WebElement DS_click_approve_action;
	
	@FindBy(xpath="//text[text()='Prathmesh']//parent::div//parent::td//following-sibling::td//div[@id='reject-action']")			
	private WebElement Ds_click_reject_action;
	
	@FindBy(xpath="//text[text()='Prathmesh']//parent::div//parent::td//following-sibling::td//div[@id='view-calendar-action']")			
	private WebElement Ds_click_calendar_action;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")			
	private WebElement Ds_approve_yes_button;
	
//	@FindBy(xpath="//p[text()='COD']")			
//	private WebElement Ds_txt_COD;
	
	
	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Statistics']")			
	private WebElement Statistics;
	
	@FindBy(xpath="//div[text()='Statistics']")			
	private WebElement txt_Statistics;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Role Management']")			
	private WebElement Role_Management;
	
	@FindBy(xpath="//div[text()='Roles']")			
	private WebElement txt_Roles;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Warehouse Management']")			
	private WebElement Warehouse_Management;
	
	@FindBy(xpath="//div[text()='Warehouse Management']")			
	private WebElement txt_Warehouse_Management;	
//========================================== User Management ============================================================
	
	@FindBy(xpath="//p[text()='User Management']")			
	private WebElement User_Management;
	
	@FindBy(xpath="//div[text()='Users']")			
	private WebElement txt_Users;
	
	@FindBy(xpath="//input[@placeholder='Search Users']")	//Click_UM_Search_user
	private WebElement Click_UM_Search_user;

	@FindBy(xpath="//div[@id='view-action']")				//Click_view_action
	private WebElement Click_view_action;

	@FindBy(xpath="//h5[text()='Bookings']")				//Click_Bookings_button
	private WebElement Click_Bookings_button;

	@FindBy(xpath="//span[text()='Upcoming']")				//Click_Upcoming_bike_booking
	private WebElement Click_Upcoming_bike_booking;
//======================================================================================================
						 			//		Inventory 		//
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Inventory']")			
	private WebElement Inventory;
	
	@FindBy(xpath="//div[text()='Vehicle Inventory Management']")			
	private WebElement txt_Vehicle_Inventory_Management;	
//======================================================================================================
									//		Vehicle Management 		//
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Vehicle Management']")			
	private WebElement Vehicle_Management;
	
	@FindBy(xpath="//div[text()='Vehicle Management']")			
	private WebElement txt_Vehicle_Management;	
	
	@FindBy(xpath="//em[normalize-space()='Search By City']")			
	private WebElement Vm_search_by_city_dropdown;							// dropdown
				// dropdown data //
				
				@FindBy(xpath="//li[@data-value='Delhi']")			
				private WebElement Vm_1st_drop_delhi;	
		
	
	@FindBy(xpath="//em[normalize-space()='Search By Location']")			
	private WebElement Vm_search_by_location_dropdown;						// dropdown
				// dropdown data //
	
				@FindBy(xpath="//li[text()='Metro Hospital Sector 12']")			
				private WebElement Vm_2nd_drop_Metro_Hospital_Sector_12;
	
	@FindBy(xpath="//em[normalize-space()='Select By Vehicle Type']")			
	private WebElement Vm_select_by_vehicle_type_dropdown;					// dropdown
				// dropdown data //
				
				@FindBy(xpath="//li[text()='Bike']")			
				private WebElement Vm_3rd_drop_Bike;
	
	@FindBy(xpath="//input[@placeholder='Search By Vehicle Number']")			
	private WebElement Vm_Search_By_Vehicle_Number;	
	
	@FindBy(xpath="//em[normalize-space()='Search By Model']")			
	private WebElement Vm_search_by_model_dropdown;	
	
	@FindBy(xpath="//em[normalize-space()='Search By Status']")			
	private WebElement Vm_search_by_status_dropdown;	
	
	@FindBy(xpath="//p[text()='Location']")			
	private WebElement Vm_location;	
	
	@FindBy(xpath="//p[text()='Model']")			
	private WebElement Vm_model;	
	
	@FindBy(xpath="//p[text()='Vehicle Type']")			
	private WebElement Vm_vehicle_type;	
	
	@FindBy(xpath="//p[text()='Color']")			
	private WebElement Vm_color;	
	
	@FindBy(xpath="//p[text()='Vehicle Number']")			
	private WebElement Vm_vehicle_number;	
	
	@FindBy(xpath="//p[text()='Booking Frequency']")			
	private WebElement Vm_booking_frequency;	
	
	@FindBy(xpath="//p[text()='Service Frequency']")			
	private WebElement Vm_service_frequency;	
	
	@FindBy(xpath="//p[text()='Status']")			
	private WebElement Vm_status;	
	
	@FindBy(xpath="//p[text()='Action']")			
	private WebElement Vm_action;	
	
	@FindBy(xpath="//div[@aria-label='Refresh']")			
	private WebElement Vm_refresh_button;	
	
	@FindBy(xpath="//button[text()='Reset']")			
	private WebElement Vm_reset_button;	
	
	@FindBy(xpath="//button[text()='Bulk Upload']")			
	private WebElement Vm_bulk_upload_button;	
	
	@FindBy(xpath="//button[text()='Add Vehicle']")			
	private WebElement Vm_add_vehicle_button;	
	
	@FindBy(xpath="//button[text()='Block Vehicle']")			
	private WebElement Vm_block_vehicle_button;	
	
	@FindBy(xpath="//button[text()='UnBlock Vehicle']")			
	private WebElement Vm_unblock_vehicle_button;	
	
	@FindBy(xpath="//p[text()='CSV Download']")			
	private WebElement Vm_csv_download_button;	

	
	@FindBy(xpath="//tbody/tr[1]/td[1]/text[1]")			
	private WebElement Vm_table_location_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/text[1]")			
	private WebElement Vm_table_model_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/text[1]")			
	private WebElement Vm_table_vehicle_type_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/text[1]")			
	private WebElement Vm_table_color_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/text[1]")			
	private WebElement Vm_table_vehicle_number_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/text[1]")			
	private WebElement Vm_table_Booking_Frequency_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/text[1]")			
	private WebElement Vm_table_Service_Frequency_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[8]/div/span")			
	private WebElement Vm_table_Status_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/div/div[1]")			
	private WebElement Vm_table_view_action_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/div/div[2]")			
	private WebElement Vm_table_update_action_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/div/div[3]")			
	private WebElement Vm_table_delete_action_1stR;	
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/div/div[4]")			
	private WebElement Vm_table_view_calendar_action_1stR;	
	
/*	@FindBy(xpath="")			
	private WebElement Click;	
	
	@FindBy(xpath="")			
	private WebElement Click;*/
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Rental Plans']")			
	private WebElement Rental_Plans;
	
	@FindBy(xpath="//div[text()='Rental Plans']")			
	private WebElement txt_Rental_Plans;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Package Management']")			
	private WebElement Package_Management;
	
	@FindBy(xpath="//div[text()='Packages']")			
	private WebElement txt_Packages;	
//================================== Booking management ========================================================

	@FindBy(xpath="//p[text()='Booking Management']")		//Click_Booking_Management
	private WebElement Booking_Management;
	
	@FindBy(xpath="//div[text()='Bookings Management']")			
	private WebElement txt_Bookings_Management;	
	
	@FindBy(xpath="//span[text()='Upcoming']")			
	private WebElement Bm_upcoming_status;
//======================================================================================================

	@FindBy(xpath="//p[text()='Location Management']")
	private WebElement Location_Management;
	
	@FindBy(xpath="//div[text()='Location Management']")			
	private WebElement txt_Location_Management;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Feedback Management']")
	private WebElement Feedback_Management;
	
	@FindBy(xpath="//div[text()='Feedback Management']")			
	private WebElement txt_Feedback_Management;	
//==================================== Manual booking area=================================================================
	
	@FindBy(xpath="//p[text()='Manual Booking']")			//Click_Manual_Booking
	private WebElement Manual_Booking;	
	
	@FindBy(xpath="//div[text()='New Booking']")			
	private WebElement txt_New_Booking;	
		
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
//=========================================================================================================	
	@FindBy(xpath="//p[text()='Promotions']")
	private WebElement Promotions;
	
	@FindBy(xpath="//div[text()='Promotions']")			
	private WebElement txt_Promotions;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Slot Pause']")			
	private WebElement Slot_Pause;
	
	@FindBy(xpath="//div[text()='Slot Pause']")			
	private WebElement txt_Slot_Pause;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Payment Management']")			
	private WebElement Payment_Management;
	
	@FindBy(xpath="//div[text()='Payment Management']")			
	private WebElement txt_Payment_Management;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Reports']")			
	private WebElement Reports;
	
	@FindBy(xpath="//p[text()='User Reports']")			
	private WebElement Click_User_Reports;	
	
	@FindBy(xpath="//div[text()='User Reports']")			
	private WebElement txt_User_Reports;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Master Management']")			
	private WebElement Master_Management;
	
	@FindBy(xpath="//div[text()='City Management']")			
	private WebElement txt_City_Management;	
	
	@FindBy(xpath="//p[text()='City']")			
	private WebElement Click_City;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Bussiness Management']")			
	private WebElement Bussiness_Management;
	
	@FindBy(xpath="//div[text()='Business Management']")			
	private WebElement txt_Business_Management;	
//======================================================================================================
	
	@FindBy(xpath="//p[text()='Settings']")			
	private WebElement Settings;
	
	@FindBy(xpath="//div[text()='Update Secondary Email And Mobile Number']")			
	private WebElement txt_Update_Secondary_Email_And_Mobile_Number;	
//======================================================================================================
	
//	@FindBy(xpath="")			
//	private WebElement Click;
//	
//	@FindBy(xpath="")			
//	private WebElement Click;
//	
//	@FindBy(xpath="")			
//	private WebElement Click;

	
	
	
//===============================================================================================================
		public home_page(WebDriver driver) 		{
			this.driver=driver;
		}
					public WebDriver getDriver() {
						return driver;
					}
//============================== home page dashboard component ===================================================
					public WebElement getDashboard() {
						return Dashboard;
					}
					public WebElement gettxt_Dashboard_Management() {
						return txt_Dashboard_Management;
					}//=================Vehicle statics ================
					public WebElement getDs_vs_txt_Total_Vehicles() {
					return Ds_vs_txt_Total_Vehicles;
					}
					public WebElement getDs_vs_txt_Available_Vehicles() {
					return Ds_vs_txt_Available_Vehicles;
					}
					public WebElement getDs_vs_txt_Booked_Vehicles() {
					return Ds_vs_txt_Booked_Vehicles;
					}
					public WebElement getDs_vs_txt_InService_Vehicles() {
					return Ds_vs_txt_InService_Vehicles;
					}//=================user statics ================
					public WebElement getDs_us_txt_Registered_Users() {
					return Ds_us_txt_Registered_Users;
					}
					public WebElement getDs_us_txt_Active_Users() {
					return Ds_us_txt_Active_Users;
					}
					public WebElement getDS_us_txt_Pending_KYC() {
					return DS_us_txt_Pending_KYC;
					}//=================Booking statics ================
					public WebElement getDS_bs_txt_Revenue_Collected() {
					return DS_bs_txt_Revenue_Collected;
					}
					public WebElement getDS_bs_txt_Total_Bookings() {
					return DS_bs_txt_Total_Bookings;
					}
					public WebElement getDs_bs_txt_Completed_Bookings() {
					return Ds_bs_txt_Completed_Bookings;
					}
					public WebElement getDs_date1() {
					return Ds_date1;
					}
					public WebElement getDs_date2() {
					return Ds_date2;
					}
					public WebElement getDs_date3() {
					return Ds_date3;
					}
					public WebElement getDs_click_date2() {
					return Ds_click_date2;
					}//====================== table data ================
					public WebElement getDS_click_New_Bookings_Received() {
					return DS_click_New_Bookings_Received;
					}
					public WebElement getDs_click_Scheduled_Bookings() {
					return Ds_click_Scheduled_Bookings;
					}
					public WebElement getDs_click_Near_To_Return_Bookings() {
					return Ds_click_Near_To_Return_Bookings;
					}
					public WebElement getDs_click_Not_Returned() {
					return Ds_click_Not_Returned;
					}
					public WebElement getDs_click_Return_Requests_Received() {
					return Ds_click_Return_Requests_Received;
					}
					public WebElement getDs_txt_User_Name() {
					return Ds_txt_User_Name;
					}
					public WebElement getDs_txt_Mobile_Number() {
					return Ds_txt_Mobile_Number;
					}
					public WebElement getDs_txt_Model_Name() {
					return Ds_txt_Model_Name;
					}
					public WebElement getDs_txt_Vehicle() {
					return Ds_txt_Vehicle;
					}
					public WebElement getDs_txt_Booking_from_date() {
					return Ds_txt_Booking_from_date;
					}
					public WebElement getDs_txt_Booking_to_date() {
					return Ds_txt_Booking_to_date;
					}
					public WebElement getDs_txt_Payment_Type() {
					return Ds_txt_Payment_Type;
					}
					public WebElement getDs_txt_COD() {
					return Ds_txt_COD;
					}
					public WebElement getDs_txt_Action() {
					return Ds_txt_Action;
					}
					/// inside table data ////
					public WebElement getDS_click_view_action() {
					return DS_click_view_action;
					}
					public WebElement getDS_click_approve_action() {
					return DS_click_approve_action;
					}
					public WebElement getDs_click_reject_action() {
					return Ds_click_reject_action;
					}
					public WebElement getDs_click_calendar_action() {
					return Ds_click_calendar_action;
					}
					public WebElement getDs_approve_yes_button() {
					return Ds_approve_yes_button;
					}
//=======================================================================================================
//=======================================================================================================
					public WebElement getStatistics() {
						return Statistics;
					}
					public WebElement gettxt_Statistics() {
						return txt_Statistics;
					}
//=======================================================================================================
//=======================================================================================================
					public WebElement getRole_Management() {
						return Role_Management;
					}
					public WebElement gettxt_Roles() {
						return txt_Roles;
					}
//=======================================================================================================
//=======================================================================================================
					public WebElement getWarehouse_Management() {
						return Warehouse_Management;
					}
					public WebElement gettxt_Warehouse_Management() {
						return txt_Warehouse_Management;
					}
//=======================================================================================================
					public WebElement getUser_Management() {
						return User_Management;
					}
					public WebElement gettxt_Users() {
						return txt_Users;
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
//=======================================================================================================
					public WebElement getInventory() {
						return Inventory;
					}
					public WebElement gettxt_Vehicle_Inventory_Management() {
						return txt_Vehicle_Inventory_Management;
					}
//=======================================================================================================
								// 			Vehicle Management		//2
//=======================================================================================================
					public WebElement getVehicle_Management() {
						return Vehicle_Management;
					}
					public WebElement gettxt_Vehicle_Management() {
						return txt_Vehicle_Management;
					}
					public WebElement getVm_search_by_city_dropdown() {
						return Vm_search_by_city_dropdown;
					}  // drop down data  //
							public WebElement getVm_1st_drop_delhi() {
								return Vm_1st_drop_delhi;
							}
						//================================
					public WebElement getVm_search_by_location_dropdown() {
						return Vm_search_by_location_dropdown;
					}// drop down data  //
					public WebElement getVm_2nd_drop_Metro_Hospital_Sector_12() {
						return Vm_2nd_drop_Metro_Hospital_Sector_12;
					}
				//================================
					public WebElement getVm_select_by_vehicle_type_dropdown() {
						return Vm_select_by_vehicle_type_dropdown;
					}
					public WebElement getVm_Search_By_Vehicle_Number() {
						return Vm_Search_By_Vehicle_Number;
					}
					public WebElement getVm_search_by_model_dropdown() {
						return Vm_search_by_model_dropdown;
					}
					public WebElement getVm_search_by_status_dropdown() {
						return Vm_search_by_status_dropdown;
					}
					public WebElement getVm_location() {
						return Vm_location;
					}
					public WebElement getVm_model() {
						return Vm_model;
					}
					public WebElement getVm_vehicle_type() {
						return Vm_vehicle_type;
					}
					public WebElement getVm_color() {
						return Vm_color;
					}
					public WebElement getVm_vehicle_number() {
						return Vm_vehicle_number;
					}
					public WebElement getVm_booking_frequency() {
						return Vm_booking_frequency;
					}
					public WebElement getVm_service_frequency() {
						return Vm_service_frequency;
					}
					public WebElement getVm_status() {
						return Vm_status;
					}
					public WebElement getVm_action() {
						return Vm_action;
					}
					public WebElement getVm_refresh_button() {
						return Vm_refresh_button;
					}
					public WebElement getVm_reset_button() {
						return Vm_reset_button;
					}
					public WebElement getVm_bulk_upload_button() {
						return Vm_bulk_upload_button;
					}
					public WebElement getVm_add_vehicle_button() {
						return Vm_add_vehicle_button;
					}
					public WebElement getVm_block_vehicle_button() {
						return Vm_block_vehicle_button;
					}
					public WebElement getVm_unblock_vehicle_button() {
						return Vm_unblock_vehicle_button;
					}
					public WebElement getVm_csv_download_button() {
						return Vm_csv_download_button;
					}
					// table data //
					public WebElement getVm_table_location_1stR() {
						return Vm_table_location_1stR;
					}
					public WebElement getVm_table_model_1stR() {
						return Vm_table_model_1stR;
					}
					public WebElement getVm_table_vehicle_type_1stR() {
						return Vm_table_vehicle_type_1stR;
					}
					public WebElement getVm_table_color_1stR() {
						return Vm_table_color_1stR;
					}
					public WebElement getVm_table_vehicle_number_1stR() {
						return Vm_table_vehicle_number_1stR;
					}
					public WebElement getVm_table_Booking_Frequency_1stR() {
						return Vm_table_Booking_Frequency_1stR;
					}
					public WebElement getVm_table_Service_Frequency_1stR() {
						return Vm_table_Service_Frequency_1stR;
					}
					public WebElement getVm_table_Status_1stR() {
						return Vm_table_Status_1stR;
					}
					public WebElement getVm_table_view_action_1stR() {
						return Vm_table_view_action_1stR;
					}
					public WebElement getVm_table_update_action_1stR() {
						return Vm_table_update_action_1stR;
					}
					public WebElement getVm_table_delete_action_1stR() {
						return Vm_table_delete_action_1stR;
					}
					public WebElement getVm_table_view_calendar_action_1stR() {
						return Vm_table_view_calendar_action_1stR;
					}
					public WebElement getVm_3rd_drop_Bike() {
						return Vm_3rd_drop_Bike;
					}
//=======================================================================================================
					public WebElement getRental_Plans() {
						return Rental_Plans;
					}
					public WebElement gettxt_Rental_Plans() {
						return txt_Rental_Plans;
					}
//=======================================================================================================
					public WebElement getPackage_Management() {
						return Package_Management;
					}
					public WebElement gettxt_Packages() {
						return txt_Packages;
					}
//=======================================================================================================
					public WebElement getLocation_Management() {
						return Location_Management;
					}
					public WebElement gettxt_Location_Management() {
						return txt_Location_Management;
					}
//======================================================================================================
//================================= Booking management====================================================
					public WebElement getBooking_Management() {
						return Booking_Management;
					}
					public WebElement gettxt_Bookings_Management() {
						return txt_Bookings_Management;
					}
					public WebElement getBm_upcoming_status() {
						return Bm_upcoming_status;
					}
//=======================================================================================================
					public WebElement getFeedback_Management() {
						return Feedback_Management;
					}
					public WebElement gettxt_Feedback_Management() {
						return txt_Feedback_Management;
					}
//==================================== manual booking ====================================================					
					public WebElement getManual_Booking() {
						return Manual_Booking;
					}
					public WebElement gettxt_New_Booking() {
						return txt_New_Booking;
					}		
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
//=========================================================================================================
					public WebElement getPromotions() {
						return Promotions;
					}
					public WebElement gettxt_Promotions() {
						return txt_Promotions;
					}
//=======================================================================================================
					public WebElement getSlot_Pause() {
						return Slot_Pause;
					}
					public WebElement gettxt_Slot_Pause() {
						return txt_Slot_Pause;
					}
//=======================================================================================================
					public WebElement getPayment_Management() {
						return Payment_Management;
					}
					public WebElement gettxt_Payment_Management() {
						return txt_Payment_Management;
					}
//=======================================================================================================
					public WebElement getReports() {
						return Reports;
					}
					public WebElement getClick_User_Reports() {
						return Click_User_Reports;
					}
					public WebElement gettxt_User_Reports() {
						return txt_User_Reports;
					}
//=======================================================================================================
					public WebElement getMaster_Management() {
						return Master_Management;
					}
					public WebElement gettxt_City_Management() {
						return txt_City_Management;
					}
					public WebElement getClick_City() {
						return Click_City;
					}
//=======================================================================================================
					public WebElement getBussiness_Management() {
						return Bussiness_Management;
					}
					public WebElement gettxt_Business_Management() {
						return txt_Business_Management;
					}
//=======================================================================================================
					public WebElement getSettings() {
						return Settings;
					}
					public WebElement gettxt_Update_Secondary_Email_And_Mobile_Number() {
						return txt_Update_Secondary_Email_And_Mobile_Number;
					}
//=======================================================================================================
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}
//					public WebElement get() {
//						return Click;
//					}

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
