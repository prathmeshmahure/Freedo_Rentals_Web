package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
	public static WebDriver driver;
	public static config_data_provider config;
	public static excel_data_provider excel;
	
	@BeforeSuite
	public void  BS() throws Exception {
		config=new config_data_provider();
		excel=new excel_data_provider();
				
	}
	
	@Parameters({"browser_name"})
	
	@BeforeTest
	public void browser(String browser_name) 
		{
			if(browser_name.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				}
			else if(browser_name.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				}
			else if(browser_name.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		
			driver.get(config.getstageurl());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	@AfterTest
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
