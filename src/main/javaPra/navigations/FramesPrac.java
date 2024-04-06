package navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPrac {
    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://jqueryui.com/droppable/");

    driver.switchTo().frame("null");
    //can switch by id or Name 
    //WebElement
    //no. of frames
    driver.switchTo().defaultContent();

    driver.quit();


    
    }
        
}
