package PageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class DepositPage {
	private static WebElement element = null;
	public static String successDepot = "Transaction details of Deposit for Account ";
public static WebElement DepositTab(WebDriver driver) {
		element = driver.findElement(By.linkText("Deposit"));
				
	return element;
	}
public static WebElement AccountNo(WebDriver driver) {
		element = driver.findElement(By.name("accountno"));
		return element;
	}
public static WebElement Amount(WebDriver driver) {
	element = driver.findElement(By.name("ammount"));
	return element;
}
public static WebElement Desc(WebDriver driver) {
	element = driver.findElement(By.name("desc"));
	return element;
}
public static WebElement AccountSubmit(WebDriver driver) {
	element = driver.findElement(By.name("AccSubmit"));
	return element;
}
public static WebElement GettextDepositsuccess(WebDriver driver) {
	element = driver.findElement(By.xpath("//table[@id='deposit']/tbody/tr[1]/td[1]/p[1]"));
	return element;
}

}

