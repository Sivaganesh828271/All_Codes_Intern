package com.guide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://portal.intelschool.in/");
		driver.manage().window().maximize();
		//Link text
	//	WebElement linktext = driver.findElement(By.linkText("Register Your School"));
	//	linktext.click();
		//partial link text
		WebElement Partiallinktext = driver.findElement(By.partialLinkText("Register"));
		Partiallinktext.click();
		//WebElement tagname = driver.findElement(By.tagName("input"));
		//tagname.sendKeys("chennai");
		//Without using select option we can use sendkeys
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//select"));
	//	option.click();
		//option.sendKeys("Tamilnadu");
		//Without using select option we can use java script executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Andhra Pradesh'", option);
		driver.close();
		
	}

}
