package com.amdocs.SeliniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing2 {
	
	public static void main(String args[]) {
		
		WebDriver dr = new FirefoxDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		dr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		dr.findElement(By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(1) > a:nth-child(1)")).click();
		
		
		
	}

}
