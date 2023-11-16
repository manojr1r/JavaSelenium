package JavaSelenium.Slenium4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UiUX {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/angularpractice/");      
        String courseName= "Learn API Automation Testing";
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);

    // Screenshot

        File file = name.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("logo.png"));
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    // GEt Height & Width

        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth()); 

        driver.quit();
    }

}