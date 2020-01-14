package Seleniumpack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumClasss {
	
	
	public static void main(String[] args) throws InterruptedException,IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	//	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	//	capabilities.setCapability("marionette", true);
		
		
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.primevideo.com/");
	    
//	   
//	   driver.findElement(By.className("_33ixDQ")).click();
//	   driver.findElement(By.id("ap_email")).sendKeys("Just Jhand-off");
//	   
//	   WebElement chkbox=driver.findElement(By.name("rememberMe"));
//	   chkbox.click();
//	   if(chkbox.isSelected())
//	   {
//		   System.out.println("checkbox is on");
//	   }
	   
	 //  driver.findElement(By.linkText("Forgot your password?")).click();
		
//	   Select cnt=new Select(driver.findElement(By.className("pv-nav-locales-icon")));
//	   cnt.selectByVisibleText("Dansk");
//	   
//		driver.get("https://www.facebook.com/");
//	   driver.findElement(By.className("_58mt")).click();
	   
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src,new File("C:/selenium/err.png"));
	   
	   
	   
	   
	}
}
