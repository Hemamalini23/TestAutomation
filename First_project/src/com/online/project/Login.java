package com.online.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;


public class Login {
	
	private WebDriver driver;
	
/*	public Login(){
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		this.driver=new ChromeDriver();
	} */
	
	/*@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		this.driver=new ChromeDriver();
	} */
	
	
	
	@Parameters({ "browser" })
	@Test
	public void loginAction() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		this.driver=new ChromeDriver();
		this.driver.get("https://www.google.com");
		this.driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		this.driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hemamalini2309@gmail.com");
		this.driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		this.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nageswari");
		this.driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		this.driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		this.driver.findElement(By.xpath("//a[contains(@title,'Google Account:')]")).click();
		this.driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	    Thread.sleep(9000);
		
		
	}
	
	@AfterClass
	public void afterClass(){
		this.driver.close();
	}
	
	
	

}
