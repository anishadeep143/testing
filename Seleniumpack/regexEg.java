package Seleniumpack;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class regexEg {

	public static void main(String[] args) {
		String str="NEW world order 2020 vinmar";
		if(str.matches("[A-Z]{3} world [A-Z][a-z]{5} [0-9]{4}.*"))
			System.out.println(true);
		else
			System.out.println(false);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    
	    WebElement we=driver.findElement(By.xpath("//*[@id='gbqfq']"));
	    we.sendKeys("not able to see sponsered links on google search");
	    driver.findElement(By.xpath("//*[@id='gbqfq']")).click();
	    List<WebElement> allelem=(List<WebElement>) driver.findElement(By.xpath("//h3/a"));
	    for(WebElement ele:allelem)
	    {
	    	allelem.size();
	    	System.out.println(ele.getText());
	    }
	    we.click();
	    
	    }
}
