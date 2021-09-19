package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'u_0_2')]"));
		element.click();
		
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select s = new Select(year);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement element2 = options.get(i);
			String text = element2.getAttribute("value");
			System.out.print(text +" ");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
