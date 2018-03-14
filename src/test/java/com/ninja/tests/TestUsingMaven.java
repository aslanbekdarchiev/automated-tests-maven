package com.ninja.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUsingMaven {
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cybertekschool.com/");
	}

	// public static void main(String[] args) {
	//
	// String str="WRITE a code that capitalizes words";
	// str = WordUtils.capitalize(str);
	// System.out.println(str);
	// }

}
