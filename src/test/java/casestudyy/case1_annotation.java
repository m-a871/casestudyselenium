package casestudyy;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import casestudyy.drivers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class case1_annotation {
	 WebDriver driver=drivers.getDriver("chrome");
	 
	 ExtentReports extent=null;
	 ExtentHtmlReporter Htmlreporter=null;
	 ExtentTest logger=null;
 @Test
 public void testcart(){
	 
  }
 @Test
 public void testPayment(){
	 
 }
 @Test
 public void testLogin(){
	 
 }
 @Test
 public void testRegistration(){
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a"));
	 driver.findElement(By.name("userName")).sendKeys("user1");
	 driver.findElement(By.name("firstName")).sendKeys("mayank");
	 driver.findElement(By.name("lastName")).sendKeys("anand");
	 driver.findElement(By.id("password")).sendKeys("Password123");
	 driver.findElement(By.name("confirmpassword")).sendKeys("Password123");
	WebElement radio1= driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]"));
	radio1.click();
	driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("anand.mayank1995@gmail.com");
	driver.findElement(By.id("mobileNumber")).sendKeys("7903317118");
	driver.findElement(By.name("dob")).sendKeys("26/01/1997");
	driver.findElement(By.id("address")).sendKeys("bangalore");
	Select PC=new Select(driver.findElement(By.name("securityQuestion")));
	PC.selectByVisibleText("What is your Birth Place");
	driver.findElement(By.id("answer")).sendKeys("patna");
	driver.findElement(By.linkText("Register")).click();
 }
 // @BeforeMethod
  //public void testlogin() {
	 
 // }

  @AfterMethod
  public void getResultAftermethod() {
  }

 // @BeforeClass
  //public void testRegistration() {
 // }

  //@AfterClass
 // public void testpayment() {
  //}

  @BeforeTest
  public void startreportBeforeTest() {
	
	  String url="http://10.232.237.143:443/TestMeApp/RegisterUser.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("the title of the webpage is"+driver.getTitle());
	  
  }

  @AfterTest
  public void endReportAfterTest() {
  }

  //@BeforeSuite
 // public void beforeSuite() {
  //}

  //@AfterSuite
  //public void getResultAftermetrhod() {
 // }

}
