package com.brillio.seleniumadvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Dynamic {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phptravels.net/flights");
		
		driver.findElement(By.id("autocomplete")).sendKeys("LAX");
		driver.findElement(By.xpath("//b[text()='LAX']")).click();
		
		driver.findElement(By.id("autocomplete2")).sendKeys("DAL");
		
		Actions action=new Actions(driver);
		action.pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
	
}
