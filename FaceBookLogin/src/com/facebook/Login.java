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
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		Thread.sleep(1000);
		loginBtn.click();
		WebElement notMe = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[4]/span[2]/a"));
		Thread.sleep(2000);
		notMe.click();
		driver.navigate().back();
		WebElement CreateAccBtn = driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]"));
		CreateAccBtn.click();
		Thread.sleep(2000);
		WebElement MaleRadioBtn = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		MaleRadioBtn.click();
		Thread.sleep(3000);
   		driver.close();
//		
	}
}


