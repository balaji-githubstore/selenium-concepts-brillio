package com.brillio.seleniumadvance;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo7FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size());
		
		for(int i=0;i<elements.size();i++)
		{
			String text=elements.get(i).getText();
			System.out.println(text);
			
			if(text.equals("Images"))
			{
				elements.get(i).click();
				break;
			}
		}
	}
	
}
