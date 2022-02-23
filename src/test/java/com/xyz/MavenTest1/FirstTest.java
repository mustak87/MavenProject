package com.xyz.MavenTest1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setup/ give the location for driver/ configuration
				System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");
				
				//creating object for driver to tell Selenium/java
				WebDriver driver = new ChromeDriver();
				
				//make the browser window to full screen
				driver.manage().window().maximize();
				
				//to open the URL
				driver.get("https://etsy.com/");
				Thread.sleep(5000);
				
                driver.close();
	}

}
