package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getUserPass() {
		return userPass;
	}
	public WebElement getClickLogin() {
		return clickLogin;
	}

	@FindBy(id="pass")
	private WebElement userPass;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement clickLogin;

	


}
