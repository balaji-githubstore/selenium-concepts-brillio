package com.brillio.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		
		//driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='login / Signup']"));		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",ele);
		
	
		//js.executeScript("document.querySelector(\"[name='DOB']\").value='14/04/2000';document.querySelector(\"[name='lastname']\").value='14/04/2000';document.querySelector(\"[name='firstname']\").value='14/04/2000'")
		
//		WebElement ele1=driver.findElement(By.xpath("//a[text()='login / Signup']"));
//		WebElement ele2=driver.findElement(By.xpath("//a[text()='login / Signup']"));
//		
//		js.executeScript("arguments[0].click();arguments[1].value='hello'",ele1,ele2);
	
	}

}
