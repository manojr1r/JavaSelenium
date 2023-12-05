package pomFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// create constructor to intilaize driver and assign to Pagefactory Web elements
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// The below elements have no idea about driver initialized with init in
	// constructor
//  WebElement userEmailElement = driver.findElement(By.id("userEmail"));
	@FindBy(id = "userEmail")
	WebElement userEmailElement;

	@FindBy(id = "userPasword")
	WebElement passwordElement;
	@FindBy(css = "login")
	List<WebElement> submit;

	// Action methods
	public void login(String username, String password) {
		userEmailElement.sendKeys(username);
		passwordElement.sendKeys(password);
	}

}
