package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\new workspace\\Testing project\\DemoPom\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
}
public static void loadUrl(){
	driver.get("https://www.facebook.com/");
}
public static void fill(WebElement ele, String value){
	ele.sendKeys(value);
}
public static void click(WebElement ele){
	ele.click();
}
}
