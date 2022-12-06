
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
		report.config().setReportName("Freedo");
		report.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Laptop-Dell", "Freedo");
		extent.setSystemInfo("QA", "Prathmesh Mahure");
		extent.setSystemInfo("Operating system", "Windows 11");
		extent.setSystemInfo("BrowserName", path);
		return extent;
	}

}
