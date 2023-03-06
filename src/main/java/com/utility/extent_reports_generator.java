
package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_generator {
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		
		String path=System.getProperty("user.dir")+"\\Report\\index.html";
		report=new ExtentSparkReporter(path);
		
		report.config().setDocumentTitle("Freedo-Automation Test Report");
		report.config().setReportName("Freedo Rentals");
		report.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("System Name", "Project Name");
		extent.setSystemInfo("Laptop-Lenovo", "Freedo Web Application");
		extent.setSystemInfo("QA", "Prathmesh Mahure");
		extent.setSystemInfo("Operating system", "Windows 10");
		extent.setSystemInfo("BrowserName", "Chrome");
		return extent;
	}

}
