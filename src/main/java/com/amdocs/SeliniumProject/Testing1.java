package com.amdocs.SeliniumProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Testing1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		dr.findElement(By.id("ap_email")).sendKeys("vedant.h132000@gmail.com");
		dr.findElement(By.id("continue")).click();
		dr.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("jagdish*27");
		dr.findElement(By.id("signInSubmit")).click();
		//Thread.sleep(10000);
		dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[2]/div/a[2]/div/img")).click();
		dr.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
		//dr.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[5]/div[2]/span[2]")).click();
		//dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")).click();
	}

}
