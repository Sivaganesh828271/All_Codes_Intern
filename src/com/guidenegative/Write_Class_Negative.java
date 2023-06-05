package com.guidenegative;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_Class_Negative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://guidejuniors.com/#home");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(3000);
		
		WebElement write = driver.findElement(By.xpath("//button[text()='Write Now']"));
		write.click();
		
		js.executeScript("window.scrollBy(0,4000);");
		WebElement authorname = driver.findElement(By.name("uname"));
		authorname.sendKeys("Praveen");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Praveen123@gmail.com");
		
		WebElement additionalinfo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		additionalinfo.sendKeys("siva");
	
		
		WebElement fileupload = driver.findElement(By.id("example"));
		fileupload.sendKeys("C:\\Users\\XSC--10259\\Desktop\\Selenium\\LICENSE.chromedriver");
		
		//WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		//submit.click();
	}

}
