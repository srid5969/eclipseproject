package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91709\\eclipse-workspace\\FaceBookLogin\\Drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginId = driver.findElement(By.xpath("//input[@autofocus='1']"));
		loginId.sendKeys("kanjay");
		WebElement loginPass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		loginPass.sendKeys("password");
		WebElement btnCreate = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		Thread.sleep(1000);
		btnCreate.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		
	}
}


