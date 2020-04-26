import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static WebDriver driver;
	static String sPath="/Users/mohitkumar/eclipse-workspace/Maven_Hackethon/Book1.xlsx";
	
	public static void launch() throws Exception{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		FileInputStream fi=new FileInputStream(sPath);
		XSSFWorkbook mybook=new XSSFWorkbook(fi);
		XSSFSheet sheet=mybook.getSheet("mysheet");
		XSSFRow row1=sheet.getRow(0);
		String u=row1.getCell(1).getStringCellValue();
		driver.get(u);
	
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
	
	}
	
public static void login(int c) throws Exception {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	

	try {
		FileInputStream fi=new FileInputStream(sPath);
		XSSFWorkbook mybook=new XSSFWorkbook(fi);
		XSSFSheet sheet=mybook.getSheet("mysheet");
		XSSFRow row1=sheet.getRow(1);
	String u=row1.getCell(1).getStringCellValue();
		System.out.println(u);
		
		XSSFRow row2=sheet.getRow(2);
		String p=row2.getCell(1).getStringCellValue();
		System.out.println(p);
		
		WebElement w=driver.findElement(By.xpath("//input[@id='username']"));
		waitForVisibilty(w);
		w.sendKeys(u);
		if(c==0) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		}else {
		
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(p);	
		}
		driver.findElement(By.id("rememberUn")).click();
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		}catch(Exception e) {
			System.out.println("Exception ");
		}

		
		
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Student Registration Form')]"))));
		
		
		
		
	}
public static void quitBrowser() throws Exception {
	Thread.sleep(5000);
	driver.quit();
}
public static void waitForVisibilty(WebElement w) {
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(w));
	
	
}
}
