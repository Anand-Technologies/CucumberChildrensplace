package org.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

  public static WebDriver driver;
	//Launch Browser
		public static void launchBrowser() {
			WebDriverManager.chromedriver().version("79").setup();
			driver = new ChromeDriver();
			}
	//Launch URL	
		public static void launchUrl(String value) {
			driver.get(value);
			driver.manage().window().maximize();
		}
	//Fill---sendKeys
		public static void fill(WebElement e, String value) {
			e.sendKeys(value);
		}
		
		
		
	
}
