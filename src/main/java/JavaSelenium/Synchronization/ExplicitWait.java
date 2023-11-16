package JavaSelenium.Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        By logoLocator = By.className("brand greenLogo");
        WebElement logo = driver.findElement(logoLocator);
        
        //use any one of the below
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //or
        Wait <WebDriver> explicitwait = new WebDriverWait(driver, Duration.ofSeconds(5)); //Wait is generic interface where Explicit and Fluent classes are derived
        

        //use any one of the syntax one accceps Locator and the other Webelement itself
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(logoLocator));
        explicitwait.until(d -> logo.isDisplayed());
        
    }
}
