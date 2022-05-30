package com.brillio.seleniumadvance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	public static void main(String[] args) {

		File file=new File("file/Balaji-Profile.pdf");
		String fileDetail=file.getAbsolutePath();
		
		System.out.println(fileDetail);
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://smallpdf.com/pdf-to-word");

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(fileDetail);
	}

}
