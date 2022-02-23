package com.xyz.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenClass1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");

		//creating object for driver to tell Selenium/java
		WebDriver driver = new ChromeDriver();

		//make the browser window to full screen
		driver.manage().window().maximize();
		Thread.sleep(50000);

		//to open the URL
		driver.navigate().to("https://scheduling.healthfirst.org/");
		Thread.sleep(2000);

		String str1= driver.findElement(By.xpath("//div[@class='commonStyle__PageContainer-sc-12p1cmg-0 header__Title-zsgnr1-2 bhErDl bEkFtX']")).getText();
		System.out.println(str1.equalsIgnoreCase("Schedule an Appointment to Enroll"));
		System.out.println(str1.matches("Schedule an Appointment to Enroll"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(550)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//class[@id=\"__next\"]/div/div[4]/div[3]/div[1]/div/div[2]/div[3]")).click();

	}

}
