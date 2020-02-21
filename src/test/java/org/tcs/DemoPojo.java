package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoPojo extends BaseClass{

	public static void main(String[] args) {
		launchBrowser();
		loadUrl();
		PojoClass a=new PojoClass();
		fill(a.getUserName(), "praveen");
		fill(a.getUserPass(), "123456");
		click(a.getClickLogin());
				
	}

}
