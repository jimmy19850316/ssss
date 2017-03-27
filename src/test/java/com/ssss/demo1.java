package com.ssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Chrome.exe");
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.baidu.com");
//		WebElement e=driver.findElement(By.cssSelector("div#lg img"));
//		System.out.println(e.getTagName());
//		Actions action =new Actions(driver);
//		action.contextClick(e).perform();
		WebElement e=driver.findElement(By.cssSelector("a[name='tj_briicon']"));
		Actions action =new Actions(driver);
		action.moveToElement(e).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.bdbriimgitem_2")).click();

	}

}
