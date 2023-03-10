package sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.home_page;
import com.page_object.login_page;
import com.page_object.uat_url_booking;
import com.page_object.user_management;
import com.page_object.vehicle_management;
import com.utility.base_class;
import com.utility.library;

public class TC_0001 extends base_class{
	public static login_page login;
	public static uat_url_booking uat;
	public static user_management um;
	public static vehicle_management vm;
	@Test
	public void Login_Account() throws Exception  {
		login = PageFactory.initElements(driver, login_page.class);
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");
		library.zoomin();
	}
//========================================================================================================
	@Test()//Negative Scenario
	public void TC_0014_Verify_Select_status_drop_down_All_tab_negative() throws Exception {
		log.info("=========== TC_0014_Verify_Select_status_drop_down_All_tab_negative Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		Thread.sleep(2000);
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
						List<WebElement> ele=driver.findElements(By.xpath("//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
						LinkedList<String> activelist=new LinkedList<String>();
						LinkedList<String> deletelist=new LinkedList<String>();
						LinkedList<String> blockedlist=new LinkedList<String>();
						LinkedList<String> inactivelist=new LinkedList<String>();	
						for(int i=0;i<ele.size();i++) {
								if(ele.get(i).getText().equalsIgnoreCase("Active")) {
									activelist.add(ele.get(i).getText());
									
								}
								else if(ele.get(i).getText().equalsIgnoreCase("Deleted")) {
									deletelist.add(ele.get(i).getText());
								}
								else if(ele.get(i).getText().equalsIgnoreCase("Blocked")) {
									blockedlist.add(ele.get(i).getText());
								}
								else if(ele.get(i).getText().equalsIgnoreCase("Inactive")) {
									inactivelist.add(ele.get(i).getText());
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
	
	
	
	
	
	
	
	
	
}