package com.xyz.MavenTest1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void Test1() {
		System.out.println("Test1");
		System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");

	}
	@Test
	public void Test2() throws InterruptedException {
		System.out.println("Test2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(50000);

		//to open the URL
		driver.navigate().to("https://scheduling.healthfirst.org/");
		//Thread.sleep(2000);

	}
	@Test
	public void Test3() {
		System.out.println("Test3");
		String str1= Driver(By.xpath("//div[@class='commonStyle__PageContainer-sc-12p1cmg-0 header__Title-zsgnr1-2 bhErDl bEkFtX']")).getText();
		System.out.println(str1.equalsIgnoreCase("Schedule an Appointment to Enroll"));
		System.out.println(str1.matches("Schedule an Appointment to Enroll"));
		


	}
	@Test
	public void Test4() {
		System.out.println("Test4");
		
	}
	@Test
	public void Test5() {
		System.out.println("Test5");
		
	}

}
