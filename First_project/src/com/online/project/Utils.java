package com.online.project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

public class Utils {

	public static void takeScreenshot(WebDriver driver, String outputDir)
			throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(outputDir));

	}
	
	public static void click(WebDriver driver,String element){
		driver.findElement(By.xpath(element)).click();
	}
	
	public static void sendValue(WebDriver driver,String element,String value){
		driver.findElement(By.xpath(element)).sendKeys(value);
	}

}
