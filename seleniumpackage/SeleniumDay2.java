package com.training.seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="C:/Users/dkrde/OneDrive/Desktop/Deepa/Prep/Tekarch%20Automation%20training/Selenium.html";
		driver.get(url);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcde@gmail.com"); //Relative Xpath
		driver.findElement(By.xpath("/html/body/input[@placeholder='Password']")).sendKeys("pwd112233"); //Absolute Xpath
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"Login\")]")).click();		
		
	}

}
