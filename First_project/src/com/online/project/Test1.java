package com.online.project;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.asserts.Assertion;

public class Test1 {
	
	private static WebDriver driver;
	private static Assertion assert1=new Assertion();
	
	@Parameters({ "browser" })
	@Test
	public void testCase(String browser) throws Exception{
		if(browser.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
			DesiredCapabilities desired= DesiredCapabilities.chrome();
			desired.setBrowserName("chrome");
            desired.setPlatform(Platform.LINUX);
            URL url= new URL("http://192.168.99.100:4444/wd/hub"); 
			driver=new RemoteWebDriver(url, desired);
			//driver=new ChromeDriver();
		}
		else if(browser.contains("firefox")){
			driver=new FirefoxDriver();
		}
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(5000);
		Utils.sendValue(driver, ".//input[@name='userName']", "mercury");
		Utils.sendValue(driver, ".//input[@name='password']", "mercury");
		Utils.click(driver, ".//input[@name='login']");
	//	ElementIdentifier.clickById(driver, "");
		
		Thread.sleep(9000);
		String actualTitle = driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).getText();
		System.out.println("Actual"+actualTitle);
		assert1.assertEquals(actualTitle, "SIGN-OFF" );
		Utils.takeScreenshot(driver, ".//screenShot//Loginsuccess.png");
		Utils.click(driver, ".//*[contains(text(),'SIGN-OFF')]");
		
	}
	
	@AfterSuite
	public void tearDown() throws Exception{
		Thread.sleep(6000);
		Utils.takeScreenshot(driver, ".//screenShot//LogoutSuccess.png");
		driver.close();
	}

}
