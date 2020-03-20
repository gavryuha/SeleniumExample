package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver webDriver = new FirefoxDriver();
		
		 webDriver.get("https://www.ynet.co.il/home/0,7340,L-8,00.html");
	        System.out.println(webDriver.getTitle());
	        
	        webDriver.get("http://www.walla.co.il");
	        System.out.println(webDriver.getTitle());

	        webDriver.navigate().back();
	        System.out.println(webDriver.getCurrentUrl());

	        webDriver.navigate().forward();
	        System.out.println(webDriver.getCurrentUrl());
	        webDriver.quit();

	       


	}

}
