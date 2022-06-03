package com.brillio.seleniumadvance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://smallpdf.com/pdf-to-word");

		TakesScreenshot ts=(TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		
		file.renameTo(new File("file/error.png"));
		
	}

}
