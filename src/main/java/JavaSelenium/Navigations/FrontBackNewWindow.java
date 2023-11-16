package JavaSelenium.Navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontBackNewWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().deleteAllCookies();
        //Open New Window
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://rahulshettyacademy.com");
        // driver.findElement(By.xpath("//a[text()='Learning paths']")).click();
        //will open links in new tab
        driver.findElement(By.tagName("a")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

        driver.quit();


}
    
}
