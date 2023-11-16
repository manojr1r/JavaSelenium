package JavaSelenium.Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
    @SuppressWarnings("deprecation")
	public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //this is deprecated use the nextline
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
    }

}
