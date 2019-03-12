package PageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class NewCustomerPage {
	 private static WebElement element = null;	
	 public static String successAddNewCus = "Customer Registered Successfully!!!";

public static WebElement GettextSuccess(WebDriver driver) {
			element = driver.findElement(By.xpath("//P[contains(text(),'Customer Registered Successfully!!!')]"));
			
			return element;
	}	
public static WebElement GetCustomerID(WebDriver driver) {
	element = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]"));
	
	return element;
}	

public static WebElement NewCustomerTab(WebDriver driver) {
	element = driver.findElement(By.linkText("New Customer"));
	
	    return element;
	}
public static WebElement CustomerName(WebDriver driver) {
	element = driver.findElement(By.name("name"));
	return element;
	
}
public static WebElement Gender(WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@value='m']"));
	return element;
}
public static WebElement Dob(WebDriver driver) {
	element = driver.findElement(By.id("dob"));
	return element;
}
public static WebElement Addr(WebDriver driver) {
	element = driver.findElement(By.name("addr"));
	return element;
}
public static WebElement City(WebDriver driver) {
	element = driver.findElement(By.name("city"));
	return element;

}
public static WebElement State(WebDriver driver) {
	element = driver.findElement(By.name("state"));
	return element;

}
public static WebElement Pin(WebDriver driver) {
	element = driver.findElement(By.name("pinno"));
	return element;

}
public static WebElement MobilePhone(WebDriver driver) {
	element = driver.findElement(By.name("telephoneno"));
	return element;

}
public static WebElement Email(WebDriver driver) {
	element = driver.findElement(By.name("emailid"));
	return element;

}
public static WebElement Pass(WebDriver driver) {
	element = driver.findElement(By.name("password"));
	return element;

}
public static WebElement SubmitButton(WebDriver driver) {
	element = driver.findElement(By.name("sub"));
	return element;

}
public static WebElement SuccessText(WebDriver driver) {
	element = driver.findElement(By.cssSelector("p.heading3"));
	return element;

}


}
