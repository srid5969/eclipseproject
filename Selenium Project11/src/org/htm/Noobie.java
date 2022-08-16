package org.htm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Noobie {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91709\\eclipse-workspace\\Selenium Project11\\Driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://demo.guru99.com/test/drag_drop.html");
		drive.manage().window().maximize();
		WebElement five = drive.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = drive.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions action=new Actions(drive);
		action.dragAndDrop(five, dest).perform();
		Thread.sleep(3000);
		drive.close();
	}

}
