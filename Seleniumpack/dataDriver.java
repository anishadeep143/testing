package Seleniumpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dataDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			
			FileInputStream f1=new FileInputStream("C:\\test\\test.xlsx");
        	XSSFWorkbook wb=new XSSFWorkbook(f1);
			XSSFSheet sh=wb.getSheetAt(0);
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			System.out.println(c);
			WebDriver driver=new ChromeDriver();
		    driver.get(c.toString());
		    
	//	    WebElement var1=driver.findElement(By.linkText("With any credit card or select debit cards"));
//			FileOutputStream f2=new FileOutputStream("C:\\test\\test.xlsx");
//			
			
		    FileOutputStream webdata=new FileOutputStream("C:\\test\\test1.xlsx");
	        wb.write(webdata);
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
