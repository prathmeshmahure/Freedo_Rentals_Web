package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class vehicle_management {
	public WebDriver driver;
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
				// dropdown data //
			
					@FindBy(xpath="//li[text()='HF Deluxe']")			
					private WebElement Vm_4th_drop_HF_Deluxe;
			
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
	
	
	
	
	
	
	
	
	
	
//===============================================================================================================
			public vehicle_management(WebDriver driver) 		{
				this.driver=driver;
			}
						public WebDriver getDriver() {
							return driver;
						}
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
								}// drop down data  //
										public WebElement getVm_4th_drop_HF_Deluxe() {
											return Vm_4th_drop_HF_Deluxe;
										}
								//==========================
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
}
