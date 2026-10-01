package com.training.seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIncognito {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--incognito");
		option.addArguments("--headless=new"); // Runs Chrome without GUI
		option.addArguments("--disable-gpu");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		String url="https://selenium-prd.firebaseapp.com/";
		driver.get(url);
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement pwd=driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();		
		Thread.sleep(3000);
		WebElement homeButton=driver.findElement(By.linkText("Home"));
		homeButton.click();
		WebElement userName=driver.findElement(By.id("name"));
		userName.sendKeys("Deepa");
		WebElement lastName=driver.findElement(By.id("lname"));
		lastName.sendKeys("Raj");
		WebElement postalAdd=driver.findElement(By.xpath("//input[@id='postaladdress']"));
		postalAdd.sendKeys("Florida,USA");
		WebElement personalAdd=driver.findElement(By.id("personaladdress"));
		personalAdd.sendKeys("Florida,USA");
		WebElement gender=driver.findElement(By.xpath("//input[@value='female']"));
		gender.click();
		WebElement city=driver.findElement(By.id("city"));
		Select cityDropdown=new Select(city);
		cityDropdown.selectByVisibleText("NEW DELHI");
		WebElement course=driver.findElement(By.id("course"));
		Select courseDropdown=new Select(course);
		courseDropdown.selectByValue("mba");
		WebElement district=driver.findElement(By.xpath("//select[@id='district']"));
		Select districtDropdown=new Select(district);
		districtDropdown.selectByIndex(1);
		WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
		Select stateDropdown=new Select(state);
		stateDropdown.selectByIndex(3);
		driver.findElement(By.id("pincode")).sendKeys("122345");
		driver.findElement(By.id("emailid")).sendKeys("deepa@dkr.com");
		Thread.sleep(1000);
		driver.findElement(By.className("bootbutton")).click();
		
	}

}
