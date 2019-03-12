package PageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
public class HomePage {
	 private static WebElement element = null;
public static WebElement GuruAccountID(WebDriver driver) {
	element = driver.findElement(By.name("uid"));

    return element;
}
public static WebElement GuruPassword(WebDriver driver) {
	element = driver.findElement(By.name("password"));
	

    return element;
}
public static WebElement GuruSubmit(WebDriver driver) {
	element = driver.findElement(By.name("btnLogin"));
	return element;
}


}
