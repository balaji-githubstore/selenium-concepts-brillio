package com.brillio.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1OrangeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Software\\msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
//		By loc= By.id("txtUsername");
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("Admin");
		
		WebElement ele= driver.findElement(By.id("txtUsername"));
		ele.sendKeys("Admin");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}

}


