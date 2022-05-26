package com.brillio.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		//click on create new account 
		driver.findElement(By.linkText("Create New Account")).click();
		//enter firstname as John 
		driver.findElement(By.name("firstname")).sendKeys("John");
		//enter lastname as Wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		//enter password as welcome@123
		driver.findElement(By.id("password_step_input")).sendKeys("welcome@123");
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("15");
		
		//select Dec
		Select selectMon=new Select(driver.findElement(By.name("birthday_month")));
		selectMon.selectByVisibleText("Dec");
		//Select 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
				
		Select selectPro=new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPro.selectByValue("6");		
		
		//click on signup
		driver.findElement(By.name("websubmit")).click();
		
	}

}

