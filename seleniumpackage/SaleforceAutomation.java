package com.training.seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleforceAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		String url="https://orgfarm-7685ace588-dev-ed.develop.my.salesforce.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("dkrdeepa.d7ac923d3afe@agentforce.com");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		WebElement remember=driver.findElement(By.name("rememberUn"));
		remember.click();
		driver.findElement(By.id("password")).sendKeys("Salesforce1");
		WebElement login1=driver.findElement(By.id("Login"));
		login1.click();
		Thread.sleep(14000);
		driver.findElement(By.id("RememberDeviceCheckbox")).click();
		driver.findElement(By.id("save")).click();		
	}
}
