package appium_ex;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidDriver driver =null;
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("automation", "Appium"); //Selendroid
		des.setCapability("platformName", "Android");
		des.setCapability("platforVersion","4.2" );
		des.setCapability("udid", "");
		des.setCapability("deviceName", "S4");
		
		
		des.setCapability("apppackage", "");
	}

}
