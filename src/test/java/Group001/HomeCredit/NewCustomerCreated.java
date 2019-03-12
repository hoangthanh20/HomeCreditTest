package Group001.HomeCredit;

import org.testng.annotations.Test;

import PageObjects.DepositPage;
import PageObjects.HomePage;
import PageObjects.NewAccountPage;
import PageObjects.NewCustomerPage;
import Utility.Constant;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewCustomerCreated {
private static WebDriver driver = null;

  @Test
  public void main() throws InterruptedException {
	  HomePage.GuruAccountID(driver).sendKeys("mngr183649");
	  HomePage.GuruPassword(driver).sendKeys("yvugenE");
	  HomePage.GuruSubmit(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 // Create New Customer 
	  NewCustomerPage.NewCustomerTab(driver).click();
	  NewCustomerPage.CustomerName(driver).sendKeys("ThanhTestHC");
	  NewCustomerPage.Gender(driver).click();
	  NewCustomerPage.Dob(driver).sendKeys("15/09/1989");
	  NewCustomerPage.Addr(driver).sendKeys("123cmt8");
	  NewCustomerPage.City(driver).sendKeys("BT");
	  NewCustomerPage.State(driver).sendKeys("HCM");
	  NewCustomerPage.Pin(driver).sendKeys("700000");
	  NewCustomerPage.MobilePhone(driver).sendKeys("1234567839");
	  NewCustomerPage.Email(driver).sendKeys("hoangthanh39@gmail.com");
	  NewCustomerPage.Pass(driver).sendKeys("123456");
	  NewCustomerPage.SubmitButton(driver).click();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
	    String GettextAddnewCostomSusscess = NewCustomerPage.GettextSuccess(driver).getText().trim();
	    String CusID = NewCustomerPage.GetCustomerID(driver).getText().trim();
	    
	    String successAddNewCustomer = NewCustomerPage.successAddNewCus;
	    System.out.println(GettextAddnewCostomSusscess);
	    System.out.println(successAddNewCustomer);
	    System.out.println(GettextAddnewCostomSusscess.equals(successAddNewCustomer));
	 //Create New Account
	 NewAccountPage.NewAccountTab(driver).click();
	 NewAccountPage.CustomID(driver).sendKeys(CusID);
	 NewAccountPage.AccountType(driver).click();
	 NewAccountPage.InitDepot(driver).sendKeys("50000");
	 NewAccountPage.SubmitNewAccount(driver).click();
	 
	   String GettextAccountSuccess = NewAccountPage.GettextAccSuccess(driver).getText().trim();     
       String AccID = NewAccountPage.GettextAccID(driver).getText().trim();
       String SuccessAddNewAccount = NewAccountPage.successAddNewAcc;
       System.out.println(GettextAccountSuccess);
	   System.out.println(SuccessAddNewAccount);
	   System.out.println(GettextAccountSuccess.equals(GettextAccountSuccess));
	   Assert.assertEquals(GettextAccountSuccess, SuccessAddNewAccount);	
		 //Deposit
	 DepositPage.DepositTab(driver).click();
	 DepositPage.AccountNo(driver).sendKeys(AccID);
	 DepositPage.Amount(driver).sendKeys("10000");
	 DepositPage.Desc(driver).sendKeys("Dp10000");
	 DepositPage.AccountSubmit(driver).click();
	  String Depotsucess = DepositPage.successDepot; 
	  String Depotsucessfull = Depotsucess.concat(AccID);
      String GettextDepsuccess = DepositPage.GettextDepositsuccess(driver).getText().trim();
      System.out.println(Depotsucessfull);
	  System.out.println(GettextDepsuccess);
	  System.out.println(GettextDepsuccess.equals(Depotsucessfull));
	  
	  Assert.assertEquals(GettextAddnewCostomSusscess, successAddNewCustomer);
	  Assert.assertEquals(GettextAccountSuccess, SuccessAddNewAccount);	
	  Assert.assertEquals(GettextDepsuccess, Depotsucessfull);	

  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
		driver.get("http://demo.guru99.com/v4/index.php");
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
