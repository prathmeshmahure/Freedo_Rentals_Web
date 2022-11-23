package Merlin_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page_object.login_page;
import com.utility.base_class;

public class TC_0001 extends base_class{
	
	@Test
	public void ts() throws InterruptedException {
		login_page login = PageFactory.initElements(driver, login_page.class);
		
		Thread.sleep(2000);
		login.getEmail().sendKeys("7385820122");
		login.getPass().sendKeys("Mahure@123");
		login.getButton().click();
	}

}
