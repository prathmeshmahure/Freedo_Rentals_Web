package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

public class web_admin_1 extends base_class {
	
	public static login_page login;
	public static home_page home;
	
//===================================================================================================================	
	@Test
	public void TC_001_verify_valid_launch_of_web_application()  {
		log.info("TC_001_verify_valid_launch_of_web_application Starts");
		login = PageFactory.initElements(driver, login_page.class);
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Hero Rentals");
//		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
//		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
//		library.Custom_click(login.getClick_submit_Button(), "Submit button");	
	}
//===================================================================================================================	
	@Test(enabled=false)
	public void TC_002_verify_valid_launch_of_web_application()  {
		log.info("TC_001_verify_valid_launch_of_web_application Starts");
		login = PageFactory.initElements(driver, login_page.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
