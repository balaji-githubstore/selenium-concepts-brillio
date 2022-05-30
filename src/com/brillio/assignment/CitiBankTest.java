package com.brillio.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CitiBankTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		//img[@class='appClose']
		driver.findElement(By.className("appClose")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//div[contains(text(),'Forgot User')]")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'product type')]")).click();
		driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
		//not working
		//driver.findElement(By.id("bill-date-long")).sendKeys("14/04/2000");
		
		//working
//		driver.findElement(By.id("bill-date-long")).click();
//		
//		Select selMon=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
//		selMon.selectByVisibleText("Apr");
//		
//		Select selYear=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//		selYear.selectByVisibleText("2000");
//		
//		driver.findElement(By.xpath("//a[text()='14']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#bill-date-long').value='14/04/2000'");
		
//		js.executeScript("document.querySelector(\"[name='DOB']\").value='14/04/2000'");
		
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		
		String actualValue=driver.findElement(By.xpath("//div[contains(@id,'ui-id')]")).getText();
		System.out.println(actualValue);
	}

}




