package ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ex12_24 {

	public static void main(String[] args) throws Exception {
		ChromeOptions option =new ChromeOptions();
		option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Chrome.exe");
		WebDriver driver = new ChromeDriver(option);
//		driver.get("http://192.168.0.198/phpwind/index.php");
//		driver.findElement(By.xpath("//a[@class='btn btn_big btn_error']")).click();
//		driver.findElement(By.xpath("//input[@id='J_reg_username' and @class='input length_4 J_reg_input']")).sendKeys("xiexie123");
//		driver.findElement(By.xpath("//input[@id='J_reg_password']")).sendKeys("123456");
//		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div/dl[3]/dd/input")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@id='J_reg_email']")).sendKeys("xieguangyu0402@163.com");
//		driver.findElement(By.xpath("//button[@class='btn btn_big btn_submit mr20']")).click();
		
		//driver.quit();
		driver.get("http://192.168.0.198/phpwind/index.php");
		driver.findElement(By.xpath("//input[@id='J_username']")).sendKeys("xiexie123");
		driver.findElement(By.xpath("//input[@id='J_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='J_sidebar_login' and @class='btn btn_big btn_submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='http://192.168.0.198/phpwind/index.php?c=thread&fid=2' and text()='新版块']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[3]/a")).click();
									
	}	

}
