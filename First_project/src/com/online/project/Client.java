package com.online.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Client {

	@Test
	public static void test1() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		Thread.sleep(9000);
		//ElementIdentifier.clickById(driver, "fsl");
		//ElementIdentifier.clickByName(driver, "btnK");
		ElementIdentifier.clickByClassName(driver, "Fx4vi");
		driver.close();
	}

}
