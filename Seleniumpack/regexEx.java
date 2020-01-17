package Seleniumpack;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class regexEx {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
		WebElement eid=driver.findElement(By.xpath("//*[@id='u_0_m']"));
		  eid.sendKeys("anrfjvb");
		  
//		 
//		  File file =   new File("D:\\test\\test.txt"); 
//					    Scanner sc = new Scanner(file); 
//					  
//					    while (sc.hasNextLine()) 
//					      System.out.println(sc.nextLine());
//					    
//					    FileWriter fw=new FileWriter("D:\\test\\test.txt", true);    
//		           fw.write("Okay!.");    
//			 fw.close();    
	}
	  
  
	
}
