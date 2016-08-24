package com.gspann;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public void jeans() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.get("https://www.flipkart.com/");
		  
		  driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys("Jeans");
		  driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		  driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/a[1]/div[1]/div/div[1]/img")).click();
		  driver.findElement(By.xpath("//li[@id='swatch-0-size']/a")).click();
		  driver.findElement(By.xpath("//div[@class='_1oaFsP']/ul/li[1]/button")).click();
		  driver.findElement(By.xpath("//div[@class='row']/a")).click();
		  driver.findElement(By.xpath("//td[@class='product-action fk-font-11']/div[2]")).click();
		  System.out.println("Product has been removed from your cart");
		  driver.quit();
		  
		   
}
}
