package Freedo_domain;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page_object.user_management;
import com.utility.base_class;
import com.utility.library;

public class user_management1 extends base_class{
	public static user_management um;
	
//===============================================================================================
	@Test(priority=1)
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
	@Test(priority=2)
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
	@Test(priority=3)
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
	@Test(priority=4)
	public void TC_004_verify_valid_register_user_by_email() throws Exception {
		log.info("=========== TC_004_verify_valid_register_user_by_email Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
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
	@Test(priority=5)
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
	@Test(priority=6)
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
	@Test(priority=7)
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
	@Test(priority=8)
	public void TC_008_Verify_all_elements_of_the_Select_status_drop_down() throws Exception {
		log.info("=========== TC_008_Verify_all_elements_of_the_Select_status_drop_down Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.visible(um.getUm_1st_drop_All(), "All");
		library.visible(um.getUm_1st_drop_Active(), "Active");
		library.visible(um.getUm_1st_drop_InActive(), "InActive");
		library.visible(um.getUm_1st_drop_Deleted(), "Deleted");
		library.visible(um.getUm_1st_drop_Blocked(), "Blocked");
		library.Custom_click(um.getUm_1st_drop_All(), "All tab");
	}
//================================================================================================================
	@Test(priority=9)
	public void TC_009_Verify_Select_status_drop_down_All_tab() throws Exception {
		log.info("=========== TC_009_Verify_Select_status_drop_down_All_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_All(), "All");
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		// Check user list and compare
//		List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		LinkedList<String> activelist=new LinkedList<String>();
		LinkedList<String> deletelist=new LinkedList<String>();
		LinkedList<String> blockedlist=new LinkedList<String>();
		LinkedList<String> inactivelist=new LinkedList<String>();	
		for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
				if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
					activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
					deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
					blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
					inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
				}
		}
		library.msg("  Active User = ",""+activelist.size());
		library.msg("  Delete User = ",""+deletelist.size());
		library.msg("  Blocked User = ",""+blockedlist.size());
		library.msg("  Inactive User = ",""+inactivelist.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
	}
//====================================================================================================================	
	@Test(priority=10)
	public void TC_0010_Verify_Select_status_drop_down_Active_tab() throws Exception {
		log.info("=========== TC_0010_Verify_Select_status_drop_down_Active_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_Active(), " Active ");
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		// Check user list and compare
//		List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		LinkedList<String> activelist=new LinkedList<String>();
		LinkedList<String> deletelist=new LinkedList<String>();
		LinkedList<String> blockedlist=new LinkedList<String>();
		LinkedList<String> inactivelist=new LinkedList<String>();	
		for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
				if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
					activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
					deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
					blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
					inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
		}
		library.msg("  Active User = ",""+activelist.size());
		library.msg("  Delete User = ",""+deletelist.size());
		library.msg("  Blocked User = ",""+blockedlist.size());
		library.msg("  Inactive User = ",""+inactivelist.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
	}
//================================================================================================================================
	@Test(priority=11)
	public void TC_0011_Verify_Select_status_drop_down_InActive_tab() throws Exception {
		log.info("=========== TC_0011_Verify_Select_status_drop_down_InActive_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_InActive(), " In-Active ");
//		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
//		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		// Check user list and compare
//		List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		LinkedList<String> activelist=new LinkedList<String>();
		LinkedList<String> deletelist=new LinkedList<String>();
		LinkedList<String> blockedlist=new LinkedList<String>();
		LinkedList<String> inactivelist=new LinkedList<String>();	
		for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
				if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
					activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
					deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
					blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
					inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					
				}
		}
		library.msg("  Active User = ",""+activelist.size());
		library.msg("  Delete User = ",""+deletelist.size());
		library.msg("  Blocked User = ",""+blockedlist.size());
		library.msg("  Inactive User = ",""+inactivelist.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
	}
//========================================================================================================
	@Test(priority=12)
	public void TC_0012_Verify_Select_status_drop_down_Deleted_tab() throws Exception {
		log.info("=========== TC_0012_Verify_Select_status_drop_down_Deleted_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_Deleted(), " Deleted ");
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		// Check user list and compare
//		List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		LinkedList<String> activelist=new LinkedList<String>();
		LinkedList<String> deletelist=new LinkedList<String>();
		LinkedList<String> blockedlist=new LinkedList<String>();
		LinkedList<String> inactivelist=new LinkedList<String>();	
		for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
				if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
					activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
					deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
					blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
					inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
		}
		library.msg("  Active User = ",""+activelist.size());
		library.msg("  Delete User = ",""+deletelist.size());
		library.msg("  Blocked User = ",""+blockedlist.size());
		library.msg("  Inactive User = ",""+inactivelist.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
	}
//==========================================================================================================================
	@Test(priority=13)
	public void TC_0013_Verify_Select_status_drop_down_Blocked_tab() throws Exception {
		log.info("=========== TC_0013_Verify_Select_status_drop_down_Blocked_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_Blocked(), " Blocked ");
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		// Check user list and compare
//		List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		LinkedList<String> activelist=new LinkedList<String>();
		LinkedList<String> deletelist=new LinkedList<String>();
		LinkedList<String> blockedlist=new LinkedList<String>();
		LinkedList<String> inactivelist=new LinkedList<String>();	
		for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
				if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
					activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
					deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
					blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					
				}
				else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
					inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
					Assert.assertTrue(false);
				}
		}
		library.msg("  Active User = ",""+activelist.size());
		library.msg("  Delete User = ",""+deletelist.size());
		library.msg("  Blocked User = ",""+blockedlist.size());
		library.msg("  Inactive User = ",""+inactivelist.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);
	}
//===========================================================================================================================
	@Test(priority=14)//Negative Scenario
	public void TC_0014_Verify_Select_status_drop_down_All_tab_negative() throws Exception {
		log.info("=========== TC_0014_Verify_Select_status_drop_down_All_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_All(), " All ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
						library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
						library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
						// Check user list and compare
//						List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
						LinkedList<String> activelist=new LinkedList<String>();
						LinkedList<String> deletelist=new LinkedList<String>();
						LinkedList<String> blockedlist=new LinkedList<String>();
						LinkedList<String> inactivelist=new LinkedList<String>();	
						for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
								if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
									activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
									deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
									blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
									inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
								}
						}
						library.msg("  Active User = ",""+activelist.size());
						library.msg("  Delete User = ",""+deletelist.size());
						library.msg("  Blocked User = ",""+blockedlist.size());
						library.msg("  Inactive User = ",""+inactivelist.size());
						// total user
						String size =um.getUm_table_totaldata_size().getText();
						String all[]=size.split(" "); //////
						library.msg("  Total user = ", all[2]);
					}// if condition close
		}catch(Exception e) {
			library.visible(um.getUm_table_No_Data_Found(), "No data found");
		}	
	}
//=========================================================================================================================
	@Test(priority=15)//Negative Scenario
	public void TC_0015_Verify_Select_status_drop_down_Active_tab_negative() throws Exception {
		log.info("=========== TC_0015_Verify_Select_status_drop_down_Active_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_Active(), " Active ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
						library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
						library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
						// Check user list and compare
//						List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
						LinkedList<String> activelist=new LinkedList<String>();
						LinkedList<String> deletelist=new LinkedList<String>();
						LinkedList<String> blockedlist=new LinkedList<String>();
						LinkedList<String> inactivelist=new LinkedList<String>();	
						for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
								if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
									activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
									deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
									blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
									inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
						}
						library.msg("  Active User = ",""+activelist.size());
						library.msg("  Delete User = ",""+deletelist.size());
						library.msg("  Blocked User = ",""+blockedlist.size());
						library.msg("  Inactive User = ",""+inactivelist.size());
						// total user
						String size =um.getUm_table_totaldata_size().getText();
						String all[]=size.split(" "); //////
						library.msg("  Total user = ", all[2]);
					}// if condition close
		}catch(Exception e) {
			library.visible(um.getUm_table_No_Data_Found(), "No data found");
		}	
	}
//========================================================================================================================
	@Test(priority=16)//Negative Scenario
	public void TC_0016_Verify_Select_status_drop_down_InActive_tab_negative() throws Exception {
		log.info("=========== TC_0016_Verify_Select_status_drop_down_InActive_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_InActive(), " InActive ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
					//	library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
					//	library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
						// Check user list and compare
//						List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
						LinkedList<String> activelist=new LinkedList<String>();
						LinkedList<String> deletelist=new LinkedList<String>();
						LinkedList<String> blockedlist=new LinkedList<String>();
						LinkedList<String> inactivelist=new LinkedList<String>();	
						for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
								if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
									activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
									deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
									blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
									inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									
								}
						}
						library.msg("  Active User = ",""+activelist.size());
						library.msg("  Delete User = ",""+deletelist.size());
						library.msg("  Blocked User = ",""+blockedlist.size());
						library.msg("  Inactive User = ",""+inactivelist.size());
						// total user
						String size =um.getUm_table_totaldata_size().getText();
						String all[]=size.split(" "); //////
						library.msg("  Total user = ", all[2]);
					}// if condition close
		}catch(Exception e) {
			library.visible(um.getUm_table_No_Data_Found(), "No data found");
		}	
	}
	
//========================================================================================================================
	@Test(priority=17)//Negative Scenario
	public void TC_0017_Verify_Select_status_drop_down_Deleted_tab_negative() throws Exception {
		log.info("=========== TC_0017_Verify_Select_status_drop_down_Deleted_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_Deleted(), " Deleted ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
						library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
						library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
						// Check user list and compare
//						List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
						LinkedList<String> activelist=new LinkedList<String>();
						LinkedList<String> deletelist=new LinkedList<String>();
						LinkedList<String> blockedlist=new LinkedList<String>();
						LinkedList<String> inactivelist=new LinkedList<String>();	
						for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
								if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
									activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
									deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
									blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
									inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
						}
						library.msg("  Active User = ",""+activelist.size());
						library.msg("  Delete User = ",""+deletelist.size());
						library.msg("  Blocked User = ",""+blockedlist.size());
						library.msg("  Inactive User = ",""+inactivelist.size());
						// total user
						String size =um.getUm_table_totaldata_size().getText();
						String all[]=size.split(" "); //////
						library.msg("  Total user = ", all[2]);
					}// if condition close
		}catch(Exception e) {
			library.visible(um.getUm_table_No_Data_Found(), "No data found");
		}	
	}
//=========================================================================================================================
	@Test(priority=18)//Negative Scenario
	public void TC_0018_Verify_Select_status_drop_down_Blocked_tab_negative() throws Exception {
		log.info("=========== TC_0018_Verify_Select_status_drop_down_Blocked_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.Custom_click(um.getUm_1st_drop_Blocked(), " Blocked ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
						library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
						library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
						// Check user list and compare
//						List<WebElement> um.getUm_1st_dropdown_all_common_status()=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
						LinkedList<String> activelist=new LinkedList<String>();
						LinkedList<String> deletelist=new LinkedList<String>();
						LinkedList<String> blockedlist=new LinkedList<String>();
						LinkedList<String> inactivelist=new LinkedList<String>();	
						for(int i=0;i<um.getUm_1st_dropdown_all_common_status().size();i++) {
								if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Active")) {
									activelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Deleted")) {
									deletelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Blocked")) {
									blockedlist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									
								}
								else if(um.getUm_1st_dropdown_all_common_status().get(i).getText().equalsIgnoreCase("Inactive")) {
									inactivelist.add(um.getUm_1st_dropdown_all_common_status().get(i).getText());
									Assert.assertTrue(false);
								}
						}
						library.msg("  Active User = ",""+activelist.size());
						library.msg("  Delete User = ",""+deletelist.size());
						library.msg("  Blocked User = ",""+blockedlist.size());
						library.msg("  Inactive User = ",""+inactivelist.size());
						// total user
						String size =um.getUm_table_totaldata_size().getText();
						String all[]=size.split(" "); //////
						library.msg("  Total user = ", all[2]);
					}// if condition close
		}catch(Exception e) {
			library.visible(um.getUm_table_No_Data_Found(), "No data found");
		}	
	}
//============================================================================================================================
	@Test(priority=19)
	public void TC_0019_Verify_all_the_elements_of_KYC_Status_drop_down() throws Exception {
		log.info("=========== TC_0019_Verify_all_the_elements_of_KYC_Status_drop_down Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		Thread.sleep(2000);
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.visible(um.getUm_2nd_drop_All(), " All ");
		library.visible(um.getUm_2nd_drop_Verified(), "Verified");
		library.visible(um.getUm_2nd_drop_Unverified(), "Un-Verified");
		library.Custom_click(um.getUm_2nd_drop_All(), " All ");
	}
//============================================================================================================================
	@Test(priority=20)
	public void TC_0020_Verify_KYC_Status_drop_down_All_tab() throws Exception {
		log.info("=========== TC_0020_Verify_KYC_Status_drop_down_All_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_All(), " All ");
		Thread.sleep(2000);
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		LinkedList<String> Verified=new LinkedList<String>();
		LinkedList<String> UnVerified=new LinkedList<String>();
		for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
				if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
					Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					
				}
				else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
					UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					
				}
		}
		library.msg("  KYC verified User = ",""+Verified.size());
		library.msg("  KYC UnVerified User = ",""+UnVerified.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);	
	}
//====================================================================================================================	
	@Test(priority=21)
	public void TC_0021_Verify_KYC_Status_drop_down_Unverified_tab() throws Exception {
		log.info("=========== TC_0021_Verify_KYC_Status_drop_down_Unverified_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_Unverified(), " Unverified ");
		Thread.sleep(2000);
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		LinkedList<String> Verified=new LinkedList<String>();
		LinkedList<String> UnVerified=new LinkedList<String>();
		for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
				if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
					Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					Assert.assertTrue(false);
				}
				else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
					UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					
				}
		}
		library.msg("  KYC verified User = ",""+Verified.size());
		library.msg("  KYC UnVerified User = ",""+UnVerified.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);	
	}
//====================================================================================================================
	@Test(priority=22)
	public void TC_0022_Verify_KYC_Status_drop_down_Verified_tab() throws Exception {
		log.info("=========== TC_0022_Verify_KYC_Status_drop_down_Verified_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_Verified(), " Verified ");
		Thread.sleep(2000);
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		LinkedList<String> Verified=new LinkedList<String>();
		LinkedList<String> UnVerified=new LinkedList<String>();
		for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
				if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
					Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					
				}
				else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
					UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					Assert.assertTrue(false);
				}
		}
		library.msg("  KYC verified User = ",""+Verified.size());
		library.msg("  KYC UnVerified User = ",""+UnVerified.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);	
	}
//====================================================================================================================
	@Test(priority=23)//Negative
	public void TC_0023_Verify_KYC_Status_drop_down_All_tab_negative() throws Exception {
		log.info("=========== TC_0023_Verify_KYC_Status_drop_down_All_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_All(), " All ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
				library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
				library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
				LinkedList<String> Verified=new LinkedList<String>();
				LinkedList<String> UnVerified=new LinkedList<String>();
				for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
						if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
							Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
							
						}
						else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
							UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
							
						}
				}
				library.msg("  KYC verified User = ",""+Verified.size());
				library.msg("  KYC UnVerified User = ",""+UnVerified.size());
				// total user
				String size =um.getUm_table_totaldata_size().getText();
				String all[]=size.split(" "); //////
				library.msg("  Total user = ", all[2]);	
			}//if blocked is closed
			}catch(Exception e) {
				library.visible(um.getUm_table_No_Data_Found(), "No data found");
			}	
	}
//====================================================================================================================	
	@Test(priority=24)//Negative
	public void TC_0024_Verify_KYC_Status_drop_down_Unverified_tab_negative() throws Exception {
		log.info("=========== TC_0024_Verify_KYC_Status_drop_down_Unverified_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_Unverified(), " Unverified ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
				library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
				library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
				LinkedList<String> Verified=new LinkedList<String>();
				LinkedList<String> UnVerified=new LinkedList<String>();
				for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
						if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
							Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
							Assert.assertTrue(false);
						}
						else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
							UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
							
						}
				}
				library.msg("  KYC verified User = ",""+Verified.size());
				library.msg("  KYC UnVerified User = ",""+UnVerified.size());
				// total user
				String size =um.getUm_table_totaldata_size().getText();
				String all[]=size.split(" "); //////
				library.msg("  Total user = ", all[2]);	
			}//if blocked is closed
			}catch(Exception e) {
				library.visible(um.getUm_table_No_Data_Found(), "No data found");
			}	
	}
//====================================================================================================================
	@Test(priority=25)//Negative
	public void TC_0025_Verify_KYC_Status_drop_down_Verified_tab_negative() throws Exception {
		log.info("=========== TC_0025_Verify_KYC_Status_drop_down_Verified_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_Verified(), " Verified ");
		Thread.sleep(2000);
		try {
			if(um.getUm_table_row_Name().isDisplayed() || um.getUm_table_row_Email().isDisplayed()) {
				library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
				library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
				LinkedList<String> Verified=new LinkedList<String>();
				LinkedList<String> UnVerified=new LinkedList<String>();
				for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
						if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
							Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
							
						}
						else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
							UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
							Assert.assertTrue(false);
						}
				}
				library.msg("  KYC verified User = ",""+Verified.size());
				library.msg("  KYC UnVerified User = ",""+UnVerified.size());
				// total user
				String size =um.getUm_table_totaldata_size().getText();
				String all[]=size.split(" "); //////
				library.msg("  Total user = ", all[2]);	
			}//if blocked is closed
			}catch(Exception e) {
				library.visible(um.getUm_table_No_Data_Found(), "No data found");
			}	
	}
//====================================================================================================================	
	@Test(priority=26)
	public void TC_0026_verify_the_Reset_button_by_clicking_on_it() throws Exception {
		log.info("=========== TC_0026_verify_the_Reset_button_by_clicking_on_it Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select select status drop down");
		library.Custom_click(um.getUm_1st_drop_All(), " All ");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_All(), " All ");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		Assert.assertTrue(um.getUm_Select_Status_dropdown().isDisplayed());
	}
//====================================================================================================================	
	@Test(priority=27)//Negative
	public void TC_0027_verify_the_Reset_button_by_clicking_on_it_negative() throws Exception {
		log.info("=========== TC_0027_verify_the_Reset_button_by_clicking_on_it_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getinvalid_name(), "Prathemsh");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select select status drop down");
		library.Custom_click(um.getUm_1st_drop_All(), " All ");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_All(), " All ");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		Assert.assertTrue(um.getUm_Select_Status_dropdown().isDisplayed());
		library.msg("1st drop down", " Is successfully reset");
		Assert.assertTrue(um.getUm_2nd_drop_KYC_Status().isDisplayed());
		library.msg("2nd drop down", " Is successfully reset");
		Assert.assertTrue(um.getClick_UM_Search_user().isDisplayed());
		library.msg("Search user", " Is successfully reset");
	}
//====================================================================================================================	
	@Test(priority=28)
	public void TC_0028_verify_the_Refresh_icon_by_clicking_on_it() throws Exception {
		log.info("=========== TC_0028_verify_the_Refresh_icon_by_clicking_on_it Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_refresh_button(), "Refresh Button");
		library.msg("All page element", "Successfull refresh");
	}
//====================================================================================================================	
	@Test(priority=29)
	public void TC_0029_verify_the_View_icon_by_clicking_on_it_under_Action() throws Exception {
		log.info("=========== TC_0029_verify_the_View_icon_by_clicking_on_it_under_Action Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");		
		library.Custom_click(um.getUm_Reset_button(), "Reset Button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getname(), "Prathmesh");
		Thread.sleep(1000);
		library.Custom_click(um.getUm_table_row_view_action(), "view action");
		library.visible(um.getUm_view_first_name() , "First name ");
		library.visible(um.getUm_view_last_name() , "Last name ");
		library.visible(um.getUm_view_email_id() , "Email-id ");
		library.visible(um.getUm_view_mobile_number() , "Mobile number ");
		library.visible(um.getUm_view_joining_date() , "Joining date ");
		library.visible(um.getUm_view_gender() , "Gender ");
		library.visible(um.getUm_view_status() , "Status ");
		library.visible(um.getUm_view_ED_name() , "Emergency name ");
		library.visible(um.getUm_view_ED_emergency_number() , "Emergency number ");
		library.visible(um.getUm_view_ED_relation() , "Relation ");
		library.visible(um.getUm_view_info_and_summary_button() , "info_and_summary_button ");
		library.visible(um.getUm_view_kyc_details_button() , "kyc_details_button ");
		library.visible(um.getUm_view_bookings_button() , "Bookings button ");
		library.visible(um.getUm_view_booking_info() , "booking_info ");
		library.visible(um.getUm_view_block_button() , "Block_button ");
		library.visible(um.getUm_view_back_button() , "Back_button ");		
	}
//====================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
