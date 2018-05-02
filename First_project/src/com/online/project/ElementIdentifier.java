package com.online.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ElementIdentifier {

	public static void clickById(WebDriver driver, String idValue) {
		driver.findElement(By.id(idValue)).click();
	}
	
	public static void clickByName(WebDriver driver,String nameValue){
		driver.findElement(By.name(nameValue)).click();
	}
	
	public static void clickByClassName(WebDriver driver,String classValue){
		driver.findElement(By.className(classValue)).click();
	}
}
