package com.guidenegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blog_Negative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Invalid mail
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://guidejuniors.com/");
		driver.manage().window().maximize();
		WebElement blog = driver.findElement(By.xpath("//a[text()='Blog']"));
		blog.click();
		String title = driver.getTitle();
		System.out.println("The title of the page is:"+title);
		WebElement tech = driver.findElement(By.xpath("//div[text()='Tech']"));
		tech.click();
		WebElement Education = driver.findElement(By.xpath("//div[text()='Education']"));
		Education.click();
		WebElement health = driver.findElement(By.xpath("//div[text()='Health']"));
		health.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='Email']"));
		email.sendKeys("m.sivaganesh1#5@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkbox.click();
		boolean selected = checkbox.isSelected();
		System.out.println("The checkbox is selected:"+selected);
		js.executeScript("window.scrollBy(0,100);");
		WebElement subscribe = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		subscribe.click();//it is not subscribed
	}

}
