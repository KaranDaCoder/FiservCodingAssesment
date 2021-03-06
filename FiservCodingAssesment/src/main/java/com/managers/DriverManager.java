package com.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	
	
	public WebDriver init(String browser) {
	
	System.out.println("initiating driver instance: " +browser);
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		threadDriver.set(new ChromeDriver());
		
	} else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		threadDriver.set(new FirefoxDriver());
	} else {
		System.out.println("Error initiating driver instance: " +browser);
	}
		getDriverInstance().manage().deleteAllCookies();
		getDriverInstance().manage().window().maximize();
		return getDriverInstance();
	}
	
	public static WebDriver getDriverInstance() {
		return threadDriver.get();
	}
	
}
