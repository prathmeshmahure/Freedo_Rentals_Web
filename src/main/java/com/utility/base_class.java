package com.utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public static Logger log;
	
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
			 log = LogManager.getLogger("Freedo_Rentals_Web");
			
		}
	@AfterTest
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
	
/////////////////////////////////////////// Explicit Wait //////////////////////////////////////////////////////////////  	
    public static void Explicit_wait_for_visible(WebElement element) {
    	
    	WebDriverWait wait=new WebDriverWait(driver ,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void Explicit_wait_for_clickable(WebElement element) {
    	
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    
    
    
    
    
    
    
}
