package orange.com.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import orange.com.Testbase.Testbase;

public class AdminPage extends Testbase {

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin;

	public void clickAdmin() {
		admin.click();
	}

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement admUsername;

	public void setAdmUsername() {
		admUsername.sendKeys(prop.getProperty("AdminUsername"));
	}

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	private WebElement userRole;

	public void clickUserRole() {
		userRole.click();
	}

	@FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
	private WebElement selectadmin;

	public void setAdmin() {
		selectadmin.click();
	}

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeename;

	public void setEmployee() {
		employeename.sendKeys(prop.getProperty("Employee"));
	}

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
	private WebElement status;

	public void clickStatus() {
		status.click();
	}
	@FindBy(xpath="(//div[@class='oxd-select-option'])[2]")
	private WebElement selectstats;
	public void selectstatus() {
		selectstats.click();
	}

	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement search;

	public void clickSearch() {
		search.click();
	}

}
