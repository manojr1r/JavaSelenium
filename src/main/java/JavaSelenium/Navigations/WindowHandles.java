package JavaSelenium.Navigations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    Set<String> windows = driver.getWindowHandles(); 
    //***The elements from the set are returned in a random order. How can we fix what is parent and child
    //Have to Work on
    Iterator<String>singleWindow = windows.iterator();

    String parentId = singleWindow.next();
    
    // to switch with above captured id 
    driver.switchTo().window(parentId);

    }
}
