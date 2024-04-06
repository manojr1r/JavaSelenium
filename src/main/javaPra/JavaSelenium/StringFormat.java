package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StringFormat {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        
         driver.findElement(By.linkText("Forgot your password?")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        driver.findElement(By.cssSelector("form p")).getText();

        
    


        // passwordText.substring(10);
        // System.out.println(passwordText);

    }
    
    public static StringBuffer collectpassword (WebDriver driver) {
        
        driver.findElement(By.linkText("Forgot your password?")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        StringBuffer passwordText = new StringBuffer(driver.findElement(By.cssSelector("form p")).getText());
        passwordText.substring(passwordText.lastIndexOf("'"));
        return passwordText;
    }

}
