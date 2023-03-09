package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page_object.user_management;
import com.utility.base_class;
import com.utility.library;

public class user_management1 extends base_class{
	public static user_management um;
	
//===============================================================================================
	@Test
	public void TC_001_verify_user_management_tab_under_admin() throws Exception {
		log.info("=========== TC_001_verify_user_management_tab_under_admin Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		Thread.sleep(2000);
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.visible(um.getClick_UM_Search_user() , "Search_user ");
		library.visible(um.getUm_Select_Status_dropdown() , "Select_Status_dropdown ");
		library.visible(um.getUm_2nd_drop_KYC_Status() , "KYC_Status");
		library.visible(um.getUm_Reset_button() , "Reset button ");
		library.visible(um.getUm_table_S_No() , "S.No. ");
		library.visible(um.getUm_table_Name() , "Name");
		library.visible(um.getUm_table_Email() , "Email");
		library.visible(um.getUm_table_Mobile() , "Mobile ");
		library.visible(um.getUm_table_Gender() , "Gender ");
		library.visible(um.getUm_table_KYC_Status() , "KYC_Status ");
		library.visible(um.getUm_table_Status() , "Status ");
		library.visible(um.getUm_table_Action() , "Action ");
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  All register user = ", all[2]);
	}
//==================================================================================================	
	@Test
	public void TC_002_verify_valid_register_user_by_name() throws Exception {
		log.info("=========== TC_002_verify_valid_register_user_by_name Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getname(), "Search user by name");
		Thread.sleep(2000);
		library.visible(um.getUm_table_row_S_No() , "S.No. = "+um.getUm_table_row_S_No().getText());
		library.visible(um.getUm_table_row_Name() , "Name = "+um.getUm_table_row_Name() .getText());
		library.visible(um.getUm_table_row_Email() , "Email = "+um.getUm_table_row_Email().getText());
		library.visible(um.getUm_table_row_Mobile() , "Mobile = "+um.getUm_table_row_Mobile() .getText());
		library.visible(um.getUm_table_row_Gender() , "Gender = "+um.getUm_table_row_Gender().getText());
		library.visible(um.getUm_table_row_KYC_image() , "KYC_Status = "+um.getUm_table_row_KYC_image().getAttribute("data-icon"));
		library.visible(um.getUm_table_row_status_active_delete() , "Status = "+um.getUm_table_row_status_active_delete().getText());
		library.visible(um.getUm_table_row_view_action(), "View-Action");
		library.visible(um.getUm_table_row_update_action(), "Update-action");
		library.visible(um.getUm_table_row_delete_action(), "Delete-action");
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
		String name=um.getUm_table_row_Name().getText();
		Assert.assertTrue(name.startsWith(config.getname()));
	}
//===================================================================================================
	@Test
	public void TC_003_verify_valid_register_user_by_mobile_number() throws Exception {
		log.info("=========== TC_003_verify_valid_register_user_by_mobile_number Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getmobilenu(), "Search user by Mobile number");
		Thread.sleep(2000);
		library.visible(um.getUm_table_row_S_No() , "S.No. = "+um.getUm_table_row_S_No().getText());
		library.visible(um.getUm_table_row_Name() , "Name = "+um.getUm_table_row_Name() .getText());
		library.visible(um.getUm_table_row_Email() , "Email = "+um.getUm_table_row_Email().getText());
		library.visible(um.getUm_table_row_Mobile() , "Mobile = "+um.getUm_table_row_Mobile() .getText());
		library.visible(um.getUm_table_row_Gender() , "Gender = "+um.getUm_table_row_Gender().getText());
		library.visible(um.getUm_table_row_KYC_image() , "KYC_Status = "+um.getUm_table_row_KYC_image().getAttribute("data-icon"));
		library.visible(um.getUm_table_row_status_active_delete() , "Status = "+um.getUm_table_row_status_active_delete().getText());
		library.visible(um.getUm_table_row_view_action(), "View-Action");
		library.visible(um.getUm_table_row_update_action(), "Update-action");
		library.visible(um.getUm_table_row_delete_action(), "Delete-action");
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
		Assert.assertEquals(um.getUm_table_row_Mobile() .getText(), config.getmobilenu());
	}
//=========================================================================================================
	@Test
	public void TC_004_verify_valid_register_user_by_email() throws Exception {
		log.info("=========== TC_004_verify_valid_register_user_by_email Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		Thread.sleep(2000);
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getemail(), "Search user by Email-id");
		Thread.sleep(2000);
		library.visible(um.getUm_table_row_S_No() , "S.No. = "+um.getUm_table_row_S_No().getText());
		library.visible(um.getUm_table_row_Name() , "Name = "+um.getUm_table_row_Name() .getText());
		library.visible(um.getUm_table_row_Email() , "Email = "+um.getUm_table_row_Email().getText());
		library.visible(um.getUm_table_row_Mobile() , "Mobile = "+um.getUm_table_row_Mobile() .getText());
		library.visible(um.getUm_table_row_Gender() , "Gender = "+um.getUm_table_row_Gender().getText());
		library.visible(um.getUm_table_row_KYC_image() , "KYC_Status = "+um.getUm_table_row_KYC_image().getAttribute("data-icon"));
		library.visible(um.getUm_table_row_status_active_delete() , "Status = "+um.getUm_table_row_status_active_delete().getText());
		library.visible(um.getUm_table_row_view_action(), "View-Action");
		library.visible(um.getUm_table_row_update_action(), "Update-action");
		library.visible(um.getUm_table_row_delete_action(), "Delete-action");
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
		Assert.assertEquals(um.getUm_table_row_Email().getText(), config.getemail());
	}
//==================================================================================================================
	@Test()
	public void TC_005_Verify_In_valid_register_user_search_by_user_name() throws Exception {
		log.info("=========== TC_005_Verify_In_valid_register_user_search_by_user_name Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getinvalid_name(), "Search user by invalid name");
		Thread.sleep(1000);
		Assert.assertTrue(um.getUm_table_No_Data_Found().isDisplayed());
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
		Assert.assertTrue(um.getUm_table_No_Data_Found().isDisplayed());
		log.info("   No data found");
	}
//=================================================================================================================
	@Test()
	public void TC_006_Verify_In_valid_register_user_search_by_user_mobile_number() throws Exception {
		log.info("=========== TC_006_Verify_In_valid_register_user_search_by_user_mobile_number Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getinvalid_mobile_no(), "Search user by invalid mobile number");
		Thread.sleep(1000);
		Assert.assertTrue(um.getUm_table_No_Data_Found().isDisplayed());
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
		Assert.assertTrue(um.getUm_table_No_Data_Found().isDisplayed());
		log.info("   No data found");
	}
//==============================================================================================================
	@Test()
	public void TC_007_Verify_In_valid_register_user_search_by_user_email_id() throws Exception {
		log.info("=========== TC_007_Verify_In_valid_register_user_search_by_user_email_id Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getinvalid_email(), "Search user by invalid email id");
		Thread.sleep(1000);
		Assert.assertTrue(um.getUm_table_No_Data_Found().isDisplayed());
		///  all table records
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
		Assert.assertTrue(um.getUm_table_No_Data_Found().isDisplayed());
		log.info("   No data found");
	}
//===============================================================================================================
	
	
	
	
	
	
	
	
	
	
}
