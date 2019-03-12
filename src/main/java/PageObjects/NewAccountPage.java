package PageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class NewAccountPage {
	 private static WebElement element = null;
	 public static String successAddNewAcc = "Account Generated Successfully!!!";

public static WebElement NewAccountTab(WebDriver driver) {
	element = driver.findElement(By.linkText("New Account"));
			
    return element;
			}
public static WebElement CustomID(WebDriver driver) {
	element = driver.findElement(By.name("cusid"));
	return element;
}
public static WebElement AccountType(WebDriver driver) {
	element = driver.findElement(By.xpath("//select[@name='selaccount']/option[text()='Savings']"));
	return element;
}

public static WebElement InitDepot(WebDriver driver) {
	element = driver.findElement(By.name("inideposit"));
	return element;
}
public static WebElement SubmitNewAccount(WebDriver driver) {
	element = driver.findElement(By.name("button2"));
	return element;
}
public static WebElement GettextAccSuccess(WebDriver driver) {
	element = driver.findElement(By.xpath("//table[@id='account']/tbody/tr[1]/td[1]/p[1]"));

	return element;
}
public static WebElement GettextAccID(WebDriver driver) {
	element = driver.findElement(By.xpath("//table[@id='account']/tbody/tr[4]/td[2]"));
	return element;
}


}
