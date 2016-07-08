package BrandandLocations;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.Utility;



public class Test1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	String baseUrl = "http://www.turner.com/";
	String expectedTitle = "Turner";
	String actualTitle = null;
	driver.get(baseUrl);
	actualTitle = driver.getTitle();
	if (actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
	}else {
		System.out.println("Test filed");
	}
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/"
			+ "div/div/section[1]/div/div/div/div/nav/ul/li[2]"
			+ "/a")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/section[2]/div/div/section/div/div/div/div[1]/div[1]"
			+ "/div[1]/div/a/img")).click();
	driver.navigate().back();
	
     Thread.sleep(3000);
	driver.findElement(By.className("is-active-trail is-active")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/section[2]/div/div/"
			+ "                  section/div[3]/div[1]/p[1]/a[1]")).click();
	
	
	Utility.captureScreenshots(driver);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/section[2]/div/div/section/div[3]"
			+ "                     /div[1]/div[1]/div[1]/div/a/img")).click();
	
	Utility.captureScreenshots(driver);
	driver.navigate().back();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/section[2]/div/div/section"
			+ "                 /div[3]/div[1]/div[1]/div[2]/div/a/img")).click();
	Utility.captureScreenshots(driver);
	
	driver.close();
	
		

		
		
	
	

		
		
		
	}

	}
	
	
	
	
  

 
	  
 
  

 

