package Merlin_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

public class TC_0001 extends base_class{
	
	@Test
	public void Login_FB()  {
		login_page login = PageFactory.initElements(driver, login_page.class);
	//	login.getEmail().sendKeys("7385820122");
		
		
		library.custom_sendkeys(login.getEmail(), config.getusername(), "Email");
		library.custom_sendkeys(login.getPass(), config.getpassword(), "Password");
		library.Custom_click(login.getButton(), "Login_Button");
//		Assert.assertTrue(true);
		
//		library.Dropdown_handle(login.getDropdown(), "INDIA", "Dropdown");
		
		
		
//		login.getPass().sendKeys("Mahure@123");
//		login.getButton().click();
		
	}

}
