package com.page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class user_management {
	public WebDriver driver;

//========================================== User Management ============================================================
	
		@FindBy(xpath="//p[text()='User Management']")			
		private WebElement User_Management;
		
		@FindBy(xpath="//div[text()='Users']")			
		private WebElement txt_Users;
		
		@FindBy(xpath="//input[@placeholder='Search Users']")	//Click_UM_Search_user
		private WebElement Click_UM_Search_user;

		@FindBy(xpath="//em[text()='Select Status']")
		private WebElement um_Select_Status_dropdown;			//dropdown
		
		@FindBy(xpath="//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']")
		private List<WebElement> um_1st_dropdown_all_common_status;
			
				// drop down data  ///
				@FindBy(xpath="//li[normalize-space()='All']")
				private WebElement um_1st_drop_All;
				
				@FindBy(xpath="//li[normalize-space()='Active']")
				private WebElement um_1st_drop_Active;
				
				@FindBy(xpath="//li[normalize-space()='InActive']")
				private WebElement um_1st_drop_InActive;
				
				@FindBy(xpath="//li[normalize-space()='Deleted']")
				private WebElement um_1st_drop_Deleted;
				
				@FindBy(xpath="//li[normalize-space()='Blocked']")
				private WebElement um_1st_drop_Blocked;
				/////    end     ///
		
		@FindBy(xpath="//em[text()='KYC Status']")
		private WebElement um_2nd_drop_KYC_Status;				//dropdown
		
		@FindBy(xpath="(//*[name()='svg'][@data-icon='circle-check' or @data-icon='circle-xmark'])")
		private List<WebElement> um_2nd_dropdown_all_common;
		// drop down data  ///
		
				@FindBy(xpath="//li[normalize-space()='All']")
				private WebElement um_2nd_drop_All;
				
				@FindBy(xpath="//li[normalize-space()='Unverified']")
				private WebElement um_2nd_drop_Unverified;
				
				@FindBy(xpath="//li[normalize-space()='Verified']")
				private WebElement um_2nd_drop_Verified;
				////	end		////
		// table data//
				
		@FindBy(xpath="//p[text()='S.No.']")
		private WebElement um_table_S_No;
		
		@FindBy(xpath="//p[text()='Name']")
		private WebElement um_table_Name;
		
		@FindBy(xpath="//p[text()='Email']")
		private WebElement um_table_Email;
		
		@FindBy(xpath="//p[text()='Mobile']")
		private WebElement um_table_Mobile;
		
		@FindBy(xpath="//p[text()='Gender']")
		private WebElement um_table_Gender;
		
		@FindBy(xpath="//p[text()='KYC Status']")
		private WebElement um_table_KYC_Status;
		
		@FindBy(xpath="//p[text()='Status']")
		private WebElement um_table_Status;
		
		@FindBy(xpath="//p[text()='Action']")
		private WebElement um_table_Action;
		
		@FindBy(xpath="//tbody/tr[1]/td[1]")
		private WebElement um_table_row_S_No;
		
		@FindBy(xpath="//tbody/tr[1]/td[2]")
		private WebElement um_table_row_Name;
		
		@FindBy(xpath="//tbody/tr[1]/td[3]")
		private WebElement um_table_row_Email;
		
		@FindBy(xpath="//tbody/tr[1]/td[4]")
		private WebElement um_table_row_Mobile;
		
		@FindBy(xpath="//tbody/tr[1]/td[5]")
		private WebElement um_table_row_Gender;
		
		@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/div[1]//*[name()='svg']")
		private WebElement um_table_row_KYC_image;
		
		@FindBy(xpath="//tbody/tr[1]/td[7]")
		private WebElement um_table_row_status_active_delete;
		
		@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]//div[@id='view-action']")
		private WebElement um_table_row_view_action;
		
		@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]//div[@id='update-action']")
		private WebElement um_table_row_update_action;
		
		@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]//div[@id='delete-action']")
		private WebElement um_table_row_delete_action;
		
		@FindBy(xpath="//button[normalize-space()='Reset']")
		private WebElement um_Reset_button;
		
		@FindBy(xpath="//div[normalize-space()='No Data Found']")
		private WebElement um_table_No_Data_Found;
		
		@FindBy(xpath="(//div[text()='10'])[2]")
		private WebElement um_click_10_user_list;
		
		@FindBy(xpath="//li[@data-value='100']")
		private WebElement um_select_100_user_list;
		
		@FindBy(xpath="//div[@aria-label='Refresh']")
		private WebElement um_refresh_button;
		
		@FindBy(xpath="//p[normalize-space()='First Name']")
		private WebElement um_view_first_name;
		
		@FindBy(xpath="//p[normalize-space()='Last Name']")
		private WebElement um_view_last_name;
		
		@FindBy(xpath="//p[normalize-space()='Email Id']")
		private WebElement um_view_email_id;
		
		@FindBy(xpath="//p[normalize-space()='Mobile Number']")
		private WebElement um_view_mobile_number;
		
		@FindBy(xpath="//p[normalize-space()='Joining Date']")
		private WebElement um_view_joining_date;
		
		@FindBy(xpath="//p[normalize-space()='Gender']")
		private WebElement um_view_gender;
		
		@FindBy(xpath="//p[normalize-space()='Status']")
		private WebElement um_view_status;
		
		@FindBy(xpath="//p[normalize-space()='Name']")
		private WebElement um_view_ED_name;
		
		@FindBy(xpath="//p[normalize-space()='Emergency Number']")
		private WebElement um_view_ED_emergency_number;
		
		@FindBy(xpath="//p[normalize-space()='Relation']")
		private WebElement um_view_ED_relation;
		
		@FindBy(xpath="//h5[normalize-space()='Info and Summary']")
		private WebElement um_view_info_and_summary_button;
		
		@FindBy(xpath="//h5[normalize-space()='KYC Details']")
		private WebElement um_view_kyc_details_button;
		
		@FindBy(xpath="//h5[normalize-space()='Bookings']")
		private WebElement um_view_bookings_button;
		
		@FindBy(xpath="//p[normalize-space()='Booking Info']")
		private WebElement um_view_booking_info;
		
		@FindBy(xpath="//p[text()='Total Bookings:']/following-sibling::p")
		private WebElement um_view_BI_total_booking_txt;
		
		@FindBy(xpath="//p[text()='Total Payment Done:']/following-sibling::p")
		private WebElement um_view_BI_total_payment_done_txt;
		
		@FindBy(xpath="//p[text()='Total KM Driven:']/following-sibling::p")
		private WebElement um_view_B_total_km_driver_txt;
		
		@FindBy(xpath="//button[normalize-space()='Block']")
		private WebElement um_view_block_button;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement um_view_back_button;
		
/*		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;
		
		@FindBy(xpath="")
		private WebElement um_;*/
		
		
		
		
		
		
		@FindBy(xpath="//div[@id='view-action']")				//Click_view_action
		private WebElement Click_view_action;

		

		
		
		@FindBy(xpath="//h5[text()='Bookings']")				//Click_Bookings_button
		private WebElement Click_Bookings_button;

		@FindBy(xpath="//span[text()='Upcoming']")				//Click_Upcoming_bike_booking
		private WebElement Click_Upcoming_bike_booking;
		
		@FindBy(xpath="//p[@class='MuiTablePagination-displayedRows css-1chpzqh']")
		private WebElement um_table_totaldata_size;
		
		
		
//===========================================================================================
			public user_management(WebDriver driver) 
			{
				this.driver=driver;
			}
						public WebDriver getDriver() {
							return driver;
						}
//==================================== Admin Login ==========================================					
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
						public WebElement getTxt_Users() {
							return txt_Users;
						}

						public WebElement getUm_Select_Status_dropdown() {
							return um_Select_Status_dropdown;
						}

						public WebElement getUm_1st_drop_All() {
							return um_1st_drop_All;
						}

						public WebElement getUm_1st_drop_Active() {
							return um_1st_drop_Active;
						}

						public WebElement getUm_1st_drop_InActive() {
							return um_1st_drop_InActive;
						}

						public WebElement getUm_1st_drop_Deleted() {
							return um_1st_drop_Deleted;
						}

						public WebElement getUm_1st_drop_Blocked() {
							return um_1st_drop_Blocked;
						}

						public WebElement getUm_2nd_drop_KYC_Status() {
							return um_2nd_drop_KYC_Status;
						}

						public WebElement getUm_2nd_drop_All() {
							return um_2nd_drop_All;
						}

						public WebElement getUm_2nd_drop_Unverified() {
							return um_2nd_drop_Unverified;
						}

						public WebElement getUm_2nd_drop_Verified() {
							return um_2nd_drop_Verified;
						}

						public WebElement getUm_table_S_No() {
							return um_table_S_No;
						}

						public WebElement getUm_table_Name() {
							return um_table_Name;
						}

						public WebElement getUm_table_Email() {
							return um_table_Email;
						}

						public WebElement getUm_table_Mobile() {
							return um_table_Mobile;
						}

						public WebElement getUm_table_Gender() {
							return um_table_Gender;
						}

						public WebElement getUm_table_KYC_Status() {
							return um_table_KYC_Status;
						}

						public WebElement getUm_table_Status() {
							return um_table_Status;
						}

						public WebElement getUm_table_Action() {
							return um_table_Action;
						}

						public WebElement getUm_table_row_S_No() {
							return um_table_row_S_No;
						}

						public WebElement getUm_table_row_Name() {
							return um_table_row_Name;
						}

						public WebElement getUm_table_row_Email() {
							return um_table_row_Email;
						}

						public WebElement getUm_table_row_Mobile() {
							return um_table_row_Mobile;
						}

						public WebElement getUm_table_row_Gender() {
							return um_table_row_Gender;
						}

						public WebElement getUm_table_row_KYC_image() {
							return um_table_row_KYC_image;
						}

						public WebElement getUm_table_row_status_active_delete() {
							return um_table_row_status_active_delete;
						}

						public WebElement getUm_table_totaldata_size() {
							return um_table_totaldata_size;
						}
	
						public WebElement getUm_Reset_button() {
							return um_Reset_button;
						}
	
						public WebElement getUm_table_row_view_action() {
							return um_table_row_view_action;
						}
						public WebElement getUm_table_row_update_action() {
							return um_table_row_update_action;
						}
						public WebElement getUm_table_row_delete_action() {
							return um_table_row_delete_action;
						}
						
						public WebElement getUm_table_No_Data_Found() {
							return um_table_No_Data_Found;
						}
						public WebElement getUm_click_10_user_list() {
							return um_click_10_user_list;
						}
						public WebElement getUm_select_100_user_list() {
							return um_select_100_user_list;
						}
						public List<WebElement> getUm_2nd_dropdown_all_common() {
							return um_2nd_dropdown_all_common;
						}
						public List<WebElement> getUm_1st_dropdown_all_common_status() {
							return um_1st_dropdown_all_common_status;
						}
						public WebElement getUm_refresh_button() {
							return um_refresh_button;
						}
						public WebElement getUm_view_first_name() {
							return um_view_first_name;
						}
						public WebElement getUm_view_last_name() {
							return um_view_last_name;
						}
						public WebElement getUm_view_email_id() {
							return um_view_email_id;
						}
						public WebElement getUm_view_mobile_number() {
							return um_view_mobile_number;
						}
						public WebElement getUm_view_joining_date() {
							return um_view_joining_date;
						}
						public WebElement getUm_view_gender() {
							return um_view_gender;
						}
						public WebElement getUm_view_status() {
							return um_view_status;
						}
						public WebElement getUm_view_ED_name() {
							return um_view_ED_name;
						}
						public WebElement getUm_view_ED_emergency_number() {
							return um_view_ED_emergency_number;
						}
						public WebElement getUm_view_ED_relation() {
							return um_view_ED_relation;
						}
						public WebElement getUm_view_info_and_summary_button() {
							return um_view_info_and_summary_button;
						}
						public WebElement getUm_view_kyc_details_button() {
							return um_view_kyc_details_button;
						}
						public WebElement getUm_view_bookings_button() {
							return um_view_bookings_button;
						}
						public WebElement getUm_view_booking_info() {
							return um_view_booking_info;
						}
						public WebElement getUm_view_BI_total_booking_txt() {
							return um_view_BI_total_booking_txt;
						}
						public WebElement getUm_view_BI_total_payment_done_txt() {
							return um_view_BI_total_payment_done_txt;
						}
						public WebElement getUm_view_B_total_km_driver_txt() {
							return um_view_B_total_km_driver_txt;
						}
						public WebElement getUm_view_block_button() {
							return um_view_block_button;
						}
						public WebElement getUm_view_back_button() {
							return um_view_back_button;
						}
						
						
						
						
						
						
						
						
						
						
}
