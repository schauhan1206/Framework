package com.macys.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	static WebDriver driver;
	static Properties prop;
	
	
	
	
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("\\Users\\seemal\\eclipse-workspace\\MacysTest\\src\\main\\java\\com\\macys\\qa\\config\\config.properties");
					
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("FireFoxdriver"));
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\seemal\\git\\Seleniumframwork\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe");
         driver = new FirefoxDriver();
         }
	
    Driver.manage().window().maximize();
    Driver.manage().deleteAllCookies();
    Driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
