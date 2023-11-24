package navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {
    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
        
     driver.switchTo().alert().getText();
     driver.switchTo().alert().accept();
     driver.quit();

    }
}
