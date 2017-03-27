package ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ex13_1 {
	public static void main(String args[]) throws InterruptedException{
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://192.168.0.198/phpwind/index.php");
		driver.findElement(By.xpath("//input[@id='J_username']")).sendKeys("xiexie123");
		driver.findElement(By.xpath("//input[@id='J_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='J_sidebar_login' and @class='btn btn_big btn_submit']")).click();
		Actions action =new Actions(driver);
		Thread.sleep(2000);
		WebElement e =driver.findElement(By.xpath("//*[@id='J_ava_ie6']/a[1]/img"));
		action.moveToElement(e).perform();
		driver.findElement(By.xpath("//*[@id='J_ava_ie6']/a[2]/span")).click();
	}

}
