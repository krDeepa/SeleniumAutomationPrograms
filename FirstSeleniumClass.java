package com.training.seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); //to automatically download, configure, and manage the ChromeDriver binary
		WebDriver driver=new ChromeDriver();
		String url="https://selenium-prd.firebaseapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email_field"));
		Thread.sleep(1000);
		email.sendKeys("admin123@gmail.com");
		WebElement pwd=driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
		Thread.sleep(1000);
		driver.close();
	}

}
