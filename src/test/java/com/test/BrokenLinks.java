package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Sample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/index.php");

		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.tagName("a"));
		link.s
		
		link.g

		int linkCount = link.size();
		System.out.println(linkCount);

		for (int i = 0; i < linkCount; i++) {

			WebElement element = link.get(i);

			String url = element.getAttribute("href");

			URL urlLink = new URL(url);

			HttpURLConnection httpConnect = (HttpURLConnection) urlLink.openConnection();

			httpConnect.connect();

			int responseCode = httpConnect.getResponseCode();

			if (responseCode >= 400) {

				System.out.println(url + " - " + " Broken Link");

			} else {

				System.out.println(url + " -" + "Valid link");

			}

		}

		driver.quit();

	}

}
