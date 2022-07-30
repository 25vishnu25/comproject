package com.Tide.seliniumclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		driver.findElement(By.cssSelector("[class=login-register]")).click();
		driver.findElement(By.linkText("Sign up now")).click();
		
		String screen = driver.getWindowHandle();
		Set<String> sswitch = driver.getWindowHandles();
		for(String press: sswitch) {
			if(!press.equalsIgnoreCase(screen)) {
				driver.switchTo().window(press);
				
				driver.get("https://www.pggoodeveryday.com/signup/tide-coupons/");
				
			}
		}
		driver.findElement(By.id("name")).sendKeys("Vishnu");
		driver.findElement(By.id("email")).sendKeys("rv.345648@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vish@123456788");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//         2
		screen = driver.getWindowHandle();
		sswitch = driver.getWindowHandles();
		for(String pres:sswitch) {
			if(!pres.equalsIgnoreCase(screen)) {
				
				driver.switchTo().window(pres);
				
				driver.get("https://tide.com/en-us");
				
			}
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("What's New")).click();
		driver.findElement(By.linkText("Read More")).click();
		driver.navigate().back();
		driver.navigate().back();
//         3
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.click();
		search.sendKeys("Fabric care");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("product-preview-content")).click();
		driver.get("https://tide.com/en-us");        
	}

}
