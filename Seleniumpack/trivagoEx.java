package Seleniumpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trivagoEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		 //select   
			driver.get("https://www.trivago.in/");
		    Select cnt=new Select(driver.findElement(By.id("select-country")));
			   cnt.selectByVisibleText("India");
		//search	   
			   WebElement search=driver.findElement(By.id("querytext"));
				search.sendKeys("Pune");
				WebElement gobtn=driver.findElement(By.cssSelector("#js-fullscreen-hero > div.hero__content > div.js-dealform.dealform.dealform--no-detail > button.btn.btn--primary.btn--regular.search-button.js-search-button"));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(gobtn);
				System.out.println(gobtn.getText());
				gobtn.sendKeys(Keys.TAB);
				gobtn.sendKeys(Keys.TAB);
				gobtn.sendKeys(Keys.TAB);
				gobtn.sendKeys(Keys.TAB);
				gobtn.sendKeys(Keys.ENTER);
				System.out.println("search clicked");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
			/*	
			//	WebDriverWait wait = new WebDriverWait(driver,10);
			//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='js-fullscreen-hero']/div[1]/div[2]/button[2]")));
			    System.out.println("Click search");
				//driver.findElement(By.xpath("//*[@id='js-fullscreen-hero']/div[1]/div[2]/button[2]")).click();
				driver.findElement(By.className("btn btn--primary btn--regular search-button js-search-button")).click();
				System.out.println("Search Clicked");*/
				
				
				
				
				
				//login
			   /*driver.get("https://access.trivago.com/oauth/en-IN/login");
				WebElement email=driver.findElement(By.id("check_email"));
				email.sendKeys("vijaysriv_2805@yahoo.com");
				driver.findElement(By.id("login_email_submit")).click();
				driver.get("https://access.trivago.com/oauth/en-IN/login?step=login");
				WebElement password=driver.findElement(By.id("login_password"));
				password.sendKeys("qwerty1234");
				driver.findElement(By.id("login_submit")).click();
				
			   */
	}
}
