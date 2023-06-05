package orange.com.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.com.Testbase.Testbase;

public class LoginPage extends Testbase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	public void setUsername() {
		username.sendKeys(prop.getProperty("username"));
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	public void setPassword() {
		password.sendKeys(prop.getProperty("password"));
	}

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginbt;

	public void clickLogin() {
		loginbt.click();
	}
}
