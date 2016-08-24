package com.gspann;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmailemail {
	@Test
	public void gmail(){
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	String title = driver.getTitle();
	System.out.println("Title is" +title);
	String url = driver.getCurrentUrl();
			System.out.println("This is current URL " + url);
	driver.findElement(By.xpath("//div[@id='identifier-shown']/div/input[1]")).sendKeys("buntyverma29@gmail.com");
	driver.findElement(By.xpath("//input[@id='next']")).click();
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("blackmoon");
	driver.findElement(By.xpath("//input[@id='signIn']")).click();
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	driver.findElement(By.xpath("//div[@class='wO nr l1']/textarea")).sendKeys("abhishek.anand@gspann.com");
	System.out.println("receipent entered");
	driver.findElement(By.xpath("//div[@class='aoD az6']/input")).sendKeys("Automated Email Abhishek Anand.......");
	driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Hi Shubham, This is an automated email sent to you by Abhishek.");
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
	//driver.quit();
	}
    
}
