package ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ex1 {

	public static void main(String[] args)  {
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver(option);
//		WebDriver driver = new InternetExplorerDriver();
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.baidu.com");
//		driver.findElement(By.xpath("//a[text()='糯米']")).click();
//		Thread.sleep(2000);
//		driver.close();
//		driver.findElement(By.xpath("a//[text()='糯米']")).click();
		
			
	}

}
