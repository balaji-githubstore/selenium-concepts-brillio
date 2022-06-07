package com.brillio.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1DBFree2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("phpMyAdmin"))
			{
				break;
			}
		}
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin");
		driver.findElement(By.id("input_go")).click();
	}

}










