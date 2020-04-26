import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestFile  extends LaunchBrowser{
static String sPath="/Users/mohitkumar/eclipse-workspace/Maven_Hackethon/Book1.xlsx";
	public static void main(String[] args) throws Exception {
		
		
		loginErrorMessage1();
		loginToSalesforce2();
		checkRememberMe3();
		forgotPassword4A() ;
		forgotPassword4B();
		tc05();
		tc06();
		
		tc07();
		tc08();
		tc09();
		tc10();
		tc11();
		tc12();
		tc13();
		tc14();
		tc15();
		tc16();
		tc17();
		tc18();
		tc19();
		tc20();
		tc21();
		tc22();
		tc23();
		tc24();
		tc25();
		tc26();
		tc27();
		tc28();
		tc29();
		tc30();
		tc31();
		tc32();
		tc33(); 
		tc34();
		tc35();
		tc36();
		tc37();
		
	}
	public static void loginErrorMessage1() throws Exception {
		launch();
		Thread.sleep(4000);
		login(0);
		
	}
	public static void loginToSalesforce2() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		
	}
	public static void checkRememberMe3() throws Exception {
		loginToSalesforce2();
	WebElement user=driver.findElement(By.id("userNavButton"));
	waitForVisibilty(user);
	user.click();
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	Thread.sleep(4000);
	WebElement id=driver.findElement(By.id("idcard-identity"));
	waitForVisibilty(id);
	id.click();
	String s=id.getText();
	if(s!=null) {
		System.out.println("Remember Me Pass  "+s);
	}
		
	}
	
	public static void forgotPassword4A() throws Exception {
		launch();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		WebElement f=driver.findElement(By.id("forgot_password_link"));
		waitForVisibilty(f);
		f.click();
		
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.xpath("//input[@id='un']"));
		waitForVisibilty(user);
		
		
		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(1);
		String u=row1.getCell(1).getStringCellValue();
		user.sendKeys(u);
	
		driver.findElement(By.id("continue")).click();
		}catch(Exception e) {
			System.out.println("Exception Found!");
		}
		
	}
	
	public static void forgotPassword4B() throws Exception {
		launch();
		//Thread.sleep(4000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		

		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(1);
		String u=row1.getCell(2).getStringCellValue();
			System.out.println(u);
			
			XSSFRow row2=sheet.getRow(2);
			String p=row2.getCell(2).getStringCellValue();
			System.out.println(p);
			
			WebElement w=driver.findElement(By.xpath("//input[@id='username']"));
			waitForVisibilty(w);
			w.sendKeys(u);
			
			
	
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(p);	
			driver.findElement(By.id("rememberUn")).click();
			
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			}catch(Exception e) {
				System.out.println("Exception ");
			}

		
	}
	
	public static void tc05() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		
	}
	public static void tc06() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		
	WebElement edit=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		waitForVisibilty(edit);
		edit.click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		waitForVisibilty(lname);
		
		lname.sendKeys("umar");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
	Thread.sleep(3000);

	Actions action=new Actions(driver);

	WebElement post=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
	waitForVisibilty(post);

	action.moveToElement(post).perform();
	
	post.click();
	WebElement e=driver.findElement(By.xpath("//div[@id='cke_publisherRichTextEditor']"));
	e.click();

	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body[contains(@class,'chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]//p")).sendKeys("Hello world!");
	Thread.sleep(3000);

	driver.switchTo().defaultContent();
	WebElement s=driver.findElement(By.xpath("//div[@class='profileSection']"));
	action.moveToElement(s).perform();
	s.click();
	
	driver.findElement(By.xpath("//span[@class='publisherShareButtonPlaceholder']//input[@id='publishersharebutton']")).click();
	Thread.sleep(3000);
	WebElement f=driver.findElement(By.xpath("//span[contains(text(),'File')]"));
	f.click();
	WebElement fi=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
	waitForVisibilty(fi);

	fi.click();
	
	WebElement file=driver.findElement(By.xpath("//input[@id='chatterFile']"));
	waitForVisibilty(file);
	
	file.sendKeys("/Users/mohitkumar/Desktop/file1.png");
	
	
	WebElement pic=driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
	waitForVisibilty(pic);

	action.moveToElement(pic).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='uploadLink']")).click();

	WebElement upload=driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
	waitForVisibilty(upload);

	action.moveToElement(upload).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='uploadPhotoContent']")).click();
	
	driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("/Users/mohitkumar/Desktop/file1.png");
	Thread.sleep(3000);
	//driver.switchTo().defaultContent();
	//driver.findElement(By.xpath("//div[@class='uploadButtonPanel']")).click();
	
	WebElement save=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn' and @type='submit']"));
	//waitForVisibilty(save);
	save.click();
	
	Thread.sleep(3000);
	WebElement sa=driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
	sa.click();
	}
	
	
	public static void tc07() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
	driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
	Thread.sleep(3000);
		WebElement p=driver.findElement(By.xpath("//div[@id='AutoNumber5']//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
		waitForVisibilty(p);
		p.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		
		WebElement dn=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		waitForVisibilty(dn);
		dn.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='AutoNumber5']//span[@id='DisplayAndLayout_font']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
		
	
		WebElement ch=driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Chatter')]"));
		waitForVisibilty(ch);
		ch.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='downArrowIcon']")).click();

		WebElement re=driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
		waitForVisibilty(re);
		re.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='save']")).click();

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='AutoNumber5']//span[@id='EmailSetup_font']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		
		WebElement s=driver.findElement(By.xpath("//input[@name='save']"));
	waitForVisibilty(s);
	s.click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='AutoNumber5']//span[@id='CalendarAndReminders_font']")).click();
		

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		WebElement rem=driver.findElement(By.xpath("//input[@id='testbtn']"));
		waitForVisibilty(rem);
		rem.click();
	
		
	}
	
	public static void tc08() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
		ArrayList<String> wTab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wTab.get(1));
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wTab.get(0));
		
	}

	public static void tc09() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		
	}
	public static void tc10() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(4000);
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	//System.out.println("sss");
		WebElement acc=driver.findElement(By.xpath("//div[contains(@class,'bPageBlock secondaryPalette')]//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);
driver.switchTo().activeElement();

driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
driver.switchTo().defaultContent();
		WebElement newA=driver.findElement(By.xpath("//div[@class='bPageBlock brandSecondaryBrd secondaryPalette']//input[@name='new']"));
		waitForVisibilty(newA);
		newA.click();
Thread.sleep(3000);
		WebElement nA=driver.findElement(By.xpath("//div[contains(@class,'requiredInput')]//input[@id='acc2']"));
		waitForVisibilty(nA);
		nA.click();
		
		
		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(1);
		String u=row1.getCell(2).getStringCellValue();
		nA.sendKeys(u);
	
		}catch(Exception e) {
			System.out.println("Exception Found!");
		}
		
		Thread.sleep(3000);
		WebElement ty=driver.findElement(By.xpath("//form[@id='editPage']//tr[6]//td[2]//select[@id='acc6']"));
		waitForVisibilty(ty);
		Select dropDown1=new Select(ty);
		dropDown1.selectByIndex(6);
		Thread.sleep(3000);
		
		WebElement pr=driver.findElement(By.xpath("//div[7]//table[1]//tbody[1]//tr[1]//td[2]//select[@id='00N5w00000HYnOx']"));
		waitForVisibilty(pr);
		pr.sendKeys("High");
		Thread.sleep(3000);
		
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
		waitForVisibilty(save);
	save.click();
	
	}
	
	public static void tc11() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//div[contains(@class,'bPageBlock secondaryPalette')]//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);
driver.switchTo().activeElement();

driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
driver.switchTo().defaultContent();

WebElement view=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
waitForVisibilty(view);
view.click();
Thread.sleep(3000);
WebElement vName=driver.findElement(By.xpath("//input[@id='fname']"));
waitForVisibilty(vName);
try {
	FileInputStream fi=new FileInputStream(sPath);
	XSSFWorkbook mybook=new XSSFWorkbook(fi);
	XSSFSheet sheet=mybook.getSheet("mysheet");
	XSSFRow row1=sheet.getRow(3);
String u=row1.getCell(2).getStringCellValue();
vName.sendKeys(u);
WebElement un=driver.findElement(By.xpath("//input[@id='devname']"));
waitForVisibilty(un);
XSSFRow row2=sheet.getRow(4);
String s=row2.getCell(2).getStringCellValue();
un.sendKeys(s);

}catch(Exception e) {
	System.out.println("Exception Found!");
}
Thread.sleep(3000);

WebElement sa=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
waitForVisibilty(sa);
sa.click();


	}
	public static void tc12() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//div[contains(@class,'bPageBlock secondaryPalette')]//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);
driver.switchTo().activeElement();

driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
WebElement view=driver.findElement(By.xpath("//div[contains(@class,'bFilterView')]//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]"));
waitForVisibilty(view);
view.click();
Thread.sleep(3000);
WebElement viewn=driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/form/div/div[1]/div[2]//input[@id='fname']"));
waitForVisibilty(viewn);

viewn.clear();
viewn.sendKeys("newView");
Thread.sleep(3000);
WebElement ac=driver.findElement(By.xpath("//table[@class='declarativeFilterTable']//select[@id='fcol1']"));
waitForVisibilty(ac);
ac.sendKeys("Account Name");
Thread.sleep(3000);
WebElement op=driver.findElement(By.xpath("//select[@id='fop1']"));
waitForVisibilty(op);
op.sendKeys("contains");

WebElement v=driver.findElement(By.xpath("//input[@id='fval1']"));
waitForVisibilty(v);
v.clear();
v.sendKeys("a");
Thread.sleep(3000);
WebElement sa=driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
waitForVisibilty(sa);
	sa.click();
	}
	
	public static void tc13() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//div[contains(@class,'bPageBlock secondaryPalette')]//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);
driver.switchTo().activeElement();

driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
WebElement merge=driver.findElement(By.xpath("//div[contains(@class,'toolsContentRight')]//div[contains(@class,'bSubBlock brandSecondaryBrd secondaryPalette')]//a[contains(text(),'Merge Accounts')]"));
waitForVisibilty(merge);
merge.click();
Thread.sleep(3000);

WebElement se=driver.findElement(By.xpath("//input[@id='srch']"));
waitForVisibilty(se);
se.sendKeys("garima");
Thread.sleep(3000);
	
WebElement m=driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]"));
waitForVisibilty(m);
m.click();
Thread.sleep(3000);

WebElement sa=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"));
waitForVisibilty(sa);
sa.click();
Thread.sleep(3000);
WebElement mr=driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]"));
waitForVisibilty(mr);
mr.click();
Thread.sleep(3000);
Alert a=driver.switchTo().alert();
a.accept();
	}


	public static void tc14() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//div[contains(@class,'bPageBlock secondaryPalette')]//a[contains(@class,'listRelatedObject accountBlock title')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);
driver.switchTo().activeElement();

driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
WebElement act=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
waitForVisibilty(act);
act.click();
Thread.sleep(3000);

WebElement lact=driver.findElement(By.xpath("//img[@id='ext-gen148']"));
waitForVisibilty(lact);
lact.click();
Thread.sleep(3000);
WebElement mo=driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
waitForVisibilty(mo);
mo.click();
Thread.sleep(3000);
WebElement from=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
waitForVisibilty(from);
from.click();
Thread.sleep(3000);
WebElement fm=driver.findElement(By.xpath("//td[@title='Today']"));
waitForVisibilty(fm);
fm.click();
Thread.sleep(3000);


WebElement to=driver.findElement(By.xpath("//img[@id='ext-gen154']"));
waitForVisibilty(to);
to.click();
Thread.sleep(3000);
WebElement t=driver.findElement(By.xpath("//table[@id='ext-gen288']//td[contains(@class,'x-date-right')]"));
waitForVisibilty(t);
t.click();
Thread.sleep(3000);

WebElement sa=driver.findElement(By.xpath("//table[@id='ext-gen288']//span[contains(text(),'25')]"));
waitForVisibilty(sa);
sa.click();
Thread.sleep(3000);

WebElement sr=driver.findElement(By.xpath("//button[@id='ext-gen49']"));
waitForVisibilty(sr);
sr.click();
Thread.sleep(3000);
WebElement rn=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
waitForVisibilty(rn);
try {
	FileInputStream fi=new FileInputStream(sPath);
	XSSFWorkbook mybook=new XSSFWorkbook(fi);
	XSSFSheet sheet=mybook.getSheet("mysheet");
	XSSFRow row1=sheet.getRow(3);
String u=row1.getCell(3).getStringCellValue();
rn.sendKeys(u);
WebElement un=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
waitForVisibilty(un);
XSSFRow row2=sheet.getRow(4);
String s=row2.getCell(3).getStringCellValue();
un.sendKeys(s);
Thread.sleep(3000);


}catch(Exception e) {
	System.out.println("Exception Found!");
}
Thread.sleep(3000);
WebElement run=driver.findElement(By.id("dlgSaveAndRun"));
waitForVisibilty(run);
run.click();
	}
	
	
	
	public static void tc15() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();

	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	Thread.sleep(3000);
	WebElement opr=driver.findElement(By.xpath("//select[@id='fcf']"));
	waitForVisibilty(opr);
	opr.click();

		
	}
	
	
	public static void tc16() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();

	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	Thread.sleep(3000);
	WebElement opr=driver.findElement(By.xpath("//input[contains(@name,'new')]"));
	waitForVisibilty(opr);
	opr.click();
Thread.sleep(3000);
		
	WebElement on=driver.findElement(By.xpath("//input[@id='opp3']"));
	waitForVisibilty(on);
	on.sendKeys("Opportunity2");
	Thread.sleep(3000);
	
	WebElement an=driver.findElement(By.xpath("//input[@id='opp4']"));
	waitForVisibilty(an);
	an.sendKeys("garima@sa.com");
	Thread.sleep(3000);
	
	WebElement pb=driver.findElement(By.xpath("//input[@id='opp12']"));
	waitForVisibilty(pb);
	pb.sendKeys("67");
	Thread.sleep(3000);
	
	WebElement ty=driver.findElement(By.xpath("//select[@id='opp5']"));
	waitForVisibilty(ty);
	ty.sendKeys("New Customer");;
	Thread.sleep(3000);

	WebElement ls=driver.findElement(By.xpath("//select[@id='opp6']"));
	waitForVisibilty(ls);
	ls.sendKeys("Web");
	//WebElement pc=driver.findElement(By.xpath("//input[@id='opp17']"));
	//waitForVisibilty(pc);
	//pc.sendKeys("*");
	WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
	waitForVisibilty(stage);
	stage.sendKeys("Prospecting");
	
	WebElement d=driver.findElement(By.xpath("//input[@id='opp9']"));
	waitForVisibilty(d);
	d.sendKeys("8/8/2020");
	
	Thread.sleep(3000);
	WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save_new')]"));
	waitForVisibilty(save);
	save.click();
	
	
	
	}
	
	public static void tc17() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();

	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	Thread.sleep(3000);
	WebElement opr=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
	waitForVisibilty(opr);
	opr.click();
Thread.sleep(3000);
		
	}
	public static void tc18() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();

	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	Thread.sleep(3000);
	WebElement opr=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
	waitForVisibilty(opr);
	opr.click();
Thread.sleep(3000);

		
	}
	public static void tc19() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();

	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	Thread.sleep(3000);
	WebElement opr=driver.findElement(By.xpath("//select[@id='quarter_q']"));
	waitForVisibilty(opr);
	opr.sendKeys("Next FQ");
Thread.sleep(3000);

WebElement opt=driver.findElement(By.xpath("//select[@id='open']"));
waitForVisibilty(opt);
opt.sendKeys("Open Opportunities");
Thread.sleep(3000);

WebElement sub=driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
waitForVisibilty(sub);
sub.click();;
Thread.sleep(3000);


	}
	
	
	public static void tc20() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibilty(log);
		log.click();
		
		quitBrowser();
		
	}
	public static void tc21() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();
	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);


	WebElement opr=driver.findElement(By.xpath("//select[@id='fcf']"));
	waitForVisibilty(opr);
	opr.click();
Thread.sleep(3000);
		
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibilty(log);
		log.click();
		
		quitBrowser();
		
	}
	
	
	public static void tc22() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();
	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);


	WebElement opr=driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
	waitForVisibilty(opr);
	opr.click();
Thread.sleep(3000);
		
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibilty(log);
		log.click();
		
		quitBrowser();
		
	}
	
	public static void tc23() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();
	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	WebElement ld=driver.findElement(By.xpath("//select[@id='fcf']"));
	waitForVisibilty(ld);
	ld.sendKeys("Todays's Leads");
Thread.sleep(3000);
	
	WebElement opr=driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
	waitForVisibilty(opr);
	opr.click();
Thread.sleep(3000);
		
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibilty(log);
		log.click();
		
		quitBrowser();
		
	}

	public static void tc24() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
	Thread.sleep(3000);
	WebElement op=driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
	waitForVisibilty(op);
	op.click();
	driver.switchTo().activeElement();
	driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	WebElement newb=driver.findElement(By.xpath("//input[contains(@name,'new')]"));
	waitForVisibilty(newb);
	newb.click();
	Thread.sleep(3000);

	WebElement ln=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
	waitForVisibilty(ln);
	ln.sendKeys("ABCD");
	Thread.sleep(3000);

	WebElement cn=driver.findElement(By.xpath("//input[@id='lea3']"));
	waitForVisibilty(cn);
	cn.sendKeys("ABCD");
	Thread.sleep(3000);

	WebElement add=driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
	waitForVisibilty(add);
	add.click();
	Thread.sleep(3000);

		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibilty(log);
		log.click();
		
		quitBrowser();
		
	}

	
	public static void tc25() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		WebElement newA=driver.findElement(By.xpath("//input[@name='new']"));
		waitForVisibilty(newA);
		newA.click();
Thread.sleep(3000);

		WebElement nA=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		waitForVisibilty(nA);
		nA.click();
		
		
		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(1);
		String u=row1.getCell(3).getStringCellValue();
		nA.sendKeys(u);
		

		WebElement cA=driver.findElement(By.xpath("//input[@id='con4']"));
		waitForVisibilty(cA);
		XSSFRow row2=sheet.getRow(1);
		String an=row2.getCell(4).getStringCellValue();
		
		
	
		}catch(Exception e) {
			System.out.println("Exception Found!");
		}
		
		
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
		waitForVisibilty(save);
	save.click();
	
}
	
	public static void tc26() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		WebElement newA=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitForVisibilty(newA);
		newA.click();
Thread.sleep(3000);

		WebElement nA=driver.findElement(By.xpath("//input[@id='fname']"));
		waitForVisibilty(nA);
		nA.click();
		
		
		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(3);
		String u=row1.getCell(2).getStringCellValue();
		nA.sendKeys(u);
		
		
	
		}catch(Exception e) {
			System.out.println("Exception Found!");
		}
		
		
		WebElement save=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		waitForVisibilty(save);
	save.click();
	
}
	

	
		public static void tc27() throws Exception {
			launch();
			Thread.sleep(4000);
			login(1);
			Thread.sleep(3000);
			//WebElement user=driver.findElement(By.id("userNavButton"));
			//waitForVisibilty(user);
			//user.click();
			
		Thread.sleep(3000);
			WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			waitForVisibilty(acc);
			acc.click();
			Thread.sleep(3000);

			driver.switchTo().activeElement();
			driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(3000);


Thread.sleep(3000);
WebElement rv=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
waitForVisibilty(rv);
rv.sendKeys("Recently Created");

	}

	public static void tc28() throws Exception {
	
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		//WebElement user=driver.findElement(By.id("userNavButton"));
		//waitForVisibilty(user);
		//user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


Thread.sleep(3000);
WebElement rv=driver.findElement(By.xpath("//select[@id='fcf']"));
waitForVisibilty(rv);
rv.sendKeys("My Accounts");

	}


	public static void tc29() throws Exception {
		
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		//WebElement user=driver.findElement(By.id("userNavButton"));
		//waitForVisibilty(user);
		//user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

Thread.sleep(3000);
WebElement rv=driver.findElement(By.xpath("//span[contains(text(),'Lovely@sf.com')]"));
waitForVisibilty(rv);
rv.click();

	}


	public static void tc30() throws Exception {
		
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		//WebElement user=driver.findElement(By.id("userNavButton"));
		//waitForVisibilty(user);
		//user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement newA=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitForVisibilty(newA);
		newA.click();
Thread.sleep(3000);

		WebElement nA=driver.findElement(By.xpath("//input[@id='devname']"));
		waitForVisibilty(nA);
		nA.sendKeys("EFGH");
		WebElement s=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		waitForVisibilty(s);
		s.click();

	}
	public static void tc31() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		WebElement newA=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitForVisibilty(newA);
		newA.click();
Thread.sleep(3000);

		WebElement nA=driver.findElement(By.xpath("//input[@id='fname']"));
		waitForVisibilty(nA);
		nA.click();
		
		
		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(3);
		String u=row1.getCell(2).getStringCellValue();
		nA.sendKeys(u);
		
		
	
		}catch(Exception e) {
			System.out.println("Exception Found!");
		}
		
		
		WebElement save=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
		waitForVisibilty(save);
	save.click();
	
}
	
	public static void tc32() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
	Thread.sleep(3000);
		WebElement acc=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		waitForVisibilty(acc);
		acc.click();
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		WebElement newA=driver.findElement(By.xpath("//input[@name='new']"));
		waitForVisibilty(newA);
		newA.click();
Thread.sleep(3000);

		WebElement nA=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		waitForVisibilty(nA);
		nA.click();
		
		
		try {
			FileInputStream fi=new FileInputStream(sPath);
			XSSFWorkbook mybook=new XSSFWorkbook(fi);
			XSSFSheet sheet=mybook.getSheet("mysheet");
			XSSFRow row1=sheet.getRow(5);
		String u=row1.getCell(0).getStringCellValue();
		nA.sendKeys(u);
		Thread.sleep(3000);

		WebElement cA=driver.findElement(By.xpath("//input[@id='con4']"));
		waitForVisibilty(cA);
		XSSFRow row2=sheet.getRow(5);
		String an=row2.getCell(1).getStringCellValue();
		
		cA.sendKeys(an);
	
		}catch(Exception e) {
			System.out.println("Exception Found!");
		}
		
		
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
		waitForVisibilty(save);
	save.click();
	
}

	public static void tc33() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
			WebElement u=driver.findElement(By.id("home_Tab"));
		waitForVisibilty(u);
		u.click();
		
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		Thread.sleep(3000);
		WebElement us=driver.findElement(By.xpath("//h1[contains(@class,'currentStatusUserName')]//a[contains(text(),'Garima K')]"));
		waitForVisibilty(us);
		us.click();
		
		
	}
	public static void tc34() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
			WebElement u=driver.findElement(By.id("home_Tab"));
		waitForVisibilty(u);
		u.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		Thread.sleep(3000);
		WebElement us=driver.findElement(By.xpath("//h1[contains(@class,'currentStatusUserName')]//a[contains(text(),'Garima K')]"));
		waitForVisibilty(us);
		String pre=us.getText();
		us.click();
		

		Thread.sleep(3000);
		WebElement ed=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		waitForVisibilty(ed);
		ed.click();
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		
		Thread.sleep(3000);
		WebElement ab=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		waitForVisibilty(ab);
		ab.click();
		Thread.sleep(3000);
		WebElement ln=driver.findElement(By.xpath("//input[@id='lastName']"));
		waitForVisibilty(ln);
		ln.clear();
		ln.sendKeys("ABCD");
		
Thread.sleep(3000);
		WebElement s=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		waitForVisibilty(s);
		s.click();
		
		Thread.sleep(3000);
		WebElement n=driver.findElement(By.id("tailBreadcrumbNode"));
		waitForVisibilty(n);
		
	String nw=n.getText();
	if(nw.equalsIgnoreCase(pre)) {
		System.out.println("Failed");
	}
	else {
		System.out.println("Pass");
	}
		
	}

	
	public static void tc35() throws Exception {
		
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
		
		
		WebElement el=driver.findElement(By.xpath("//ul[@id='tabBar']//img[@class='allTabsArrow']"));
		waitForVisibilty(el);
		el.click();
		
		Thread.sleep(3000);

		WebElement cu=driver.findElement(By.xpath("//input[contains(@name,'customize')]"));
		waitForVisibilty(cu);
		cu.click();
		
		Thread.sleep(3000);
		WebElement st=driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Libraries')]"));
		waitForVisibilty(st);
		st.click();
		
		Thread.sleep(3000);
		
		WebElement rm=driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]"));
		waitForVisibilty(rm);
		rm.click();
		
		Thread.sleep(3000);
		
		WebElement sa=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]"));
		waitForVisibilty(sa);
		sa.click();
		
		Thread.sleep(3000);
		
		
		WebElement user=driver.findElement(By.id("userNavButton"));
		waitForVisibilty(user);
		user.click();
		
		
		
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibilty(log);
		log.click();
		
		Thread.sleep(3000);
		WebElement pa=driver.findElement(By.id("password"));
		waitForVisibilty(pa);
		pa.sendKeys("test@123");;
		
		Thread.sleep(3000);
		

		WebElement login=driver.findElement(By.id("Login"));
		waitForVisibilty(login);
		login.click();
	}
	
	public static void tc36() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
			WebElement u=driver.findElement(By.id("home_Tab"));
		waitForVisibilty(u);
		u.click();
		
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		Thread.sleep(3000);
		WebElement us=driver.findElement(By.xpath("//a[contains(text(),'Saturday April 25, 2020')]"));
		waitForVisibilty(us);
		us.click();
		Thread.sleep(3000);
		WebElement pm=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		waitForVisibilty(pm);
		pm.click();
		
		Thread.sleep(3000);
		
		WebElement cm=driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
		waitForVisibilty(cm);
		cm.click();
		
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(win.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		
		driver.switchTo().window(win.get(0));
		Thread.sleep(3000);

		
		
		Thread.sleep(3000);
		WebElement et=driver.findElement(By.id("EndDateTime_time"));
		waitForVisibilty(et);
		et.sendKeys("9:00 PM");
		
		Thread.sleep(3000);
		WebElement s=driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]"));
		waitForVisibilty(s);
		s.click();
		
	}

	public static void tc37() throws Exception {
		launch();
		Thread.sleep(4000);
		login(1);
		Thread.sleep(3000);
			WebElement u=driver.findElement(By.id("home_Tab"));
		waitForVisibilty(u);
		u.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='topRight']//a[@id='tryLexDialogX']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);


		Thread.sleep(3000);
		WebElement us=driver.findElement(By.xpath("//a[contains(text(),'Saturday April 25, 2020')]"));
		waitForVisibilty(us);
		us.click();
		Thread.sleep(3000);
		WebElement pm=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		waitForVisibilty(pm);
		pm.click();
		
		Thread.sleep(3000);
		
		WebElement cm=driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
		waitForVisibilty(cm);
		cm.click();
		
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(win.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		
		driver.switchTo().window(win.get(0));
		Thread.sleep(3000);

		
		
		Thread.sleep(3000);
		WebElement et=driver.findElement(By.id("EndDateTime_time"));
		waitForVisibilty(et);
		et.sendKeys("7:00 PM");
		
		
		Thread.sleep(3000);
		WebElement c=driver.findElement(By.id("IsRecurrence"));
		waitForVisibilty(c);
		c.click();
		Thread.sleep(3000);
		WebElement w=driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		waitForVisibilty(w);
		w.click();
		Thread.sleep(3000);
		WebElement d=driver.findElement(By.id("RecurrenceEndDateOnly"));
		waitForVisibilty(d);
		d.sendKeys("5/8/2020");
		
		Thread.sleep(3000);
		WebElement sa=driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]"));
		waitForVisibilty(sa);
		sa.click();
	}



}
