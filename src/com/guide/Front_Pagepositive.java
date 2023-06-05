package com.guide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Front_Pagepositive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://guidejuniors.com/");
		driver.manage().window().maximize();
		//home
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
		//our story
		WebElement ourstory = driver.findElement(By.xpath("//a[text()='Our Story']"));
		ourstory.click();
		//founder
		WebElement founder = driver.findElement(By.xpath("//a[text()='Founder']"));
		founder.click();
		
	    //contact
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contact']"));
		Actions a = new Actions(driver);
		a.doubleClick(contact).build().perform();
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("Vasu");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("vasuxcel@gmail.com");
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9494805982");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		WebElement message = driver.findElement(By.xpath("//input[@placeholder='Message']"));
		message.sendKeys("Its a great pleasure for using guide junior ");
		js.executeScript("window.scrollBy(0,100);");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		//driver.close();
		

	}

	

}
