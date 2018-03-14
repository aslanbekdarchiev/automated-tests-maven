package com.ninja.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.perstoshop.utilities.ConfigurationSDemo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	private static WebDriver driver;

	public static WebDriver getDriver(String browser) {

		String driverType=browser==null?Configuration.getProperties("chrome"):browser;
		
		
		if (driver == null) {

			switch (driverType) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			default:
				break;
			}
		}
		return driver;

	}

	public static void quit() {
		if (driver != null)
			driver.quit();
		driver = null;
	}
}
