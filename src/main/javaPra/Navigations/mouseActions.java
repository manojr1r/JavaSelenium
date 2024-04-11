package Navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
   public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();

  Actions action = new Actions(driver);
  action.moveToElement(driver.findElement(By.id("test"))).contextClick().build().perform();//ContextClick is right click
//action.sendKeys(null, args);
  action.moveToElement(driver.findElement(By.id("test"))).click().keyDown(Keys.SHIFT).sendKeys("hola").doubleClick().build().perform();
  
  driver.get("https://jqueryui.com/droppable/");
  //drag and drop
  WebElement WebElementSource = driver.findElement(By.cssSelector(".draggable"));
  WebElement WebElementDestination = driver.findElement(By.cssSelector(".droppable"));

  action.dragAndDrop(WebElementSource, WebElementDestination);



  driver.quit();



        
    };


    
    
    
}
