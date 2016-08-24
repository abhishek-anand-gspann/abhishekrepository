package com.gspann;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Seleniumsearch {
	@Test
	public void googlesearch() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.xpath("//div[@class='sbib_b']/div")).sendKeys("Selenium");
		System.out.println("Element Entered");
		driver.findElement(By.xpath("//div[@id='sbds']")).click();
		System.out.println("Search Clicked");
		driver.findElement(By.xpath("//div[@id='ires']/div/div[2]/div[2]/div/h3/a")).click();
		System.out.println("Selenium Clicked");
		driver.findElement(By.xpath("//div[@id='header']/ul/li[4]/a")).click();
		System.out.println("Download Clicked");
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL is -" +URL);
		
		
		driver.quit();
		
	}

}
