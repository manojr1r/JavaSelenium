package JavaSelenium.Synchronization;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    driver.findElement(By.xpath("//div[@id='start']/button")).click();

    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);

        //below didn't work
    // .ignoring(ElementNotVisibleException.class);
    // .ignoring(StaleElementReferenceException.class)

    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
      public WebElement apply(WebDriver driver) {
        if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()){
          return driver.findElement(By.cssSelector("div[id='finish'] h4"));
        }
        else{
          return null;
        }
      }
    });

    // using lambda expressions

    WebElement foo1 = wait.until(driver1 -> {//forced to use driver"1"
    WebElement element = driver.findElement(By.cssSelector("div[id='finish'] h4"));
    return element.isDisplayed() ? element : null;
});



  System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
  System.out.println(" ///////////");
  System.out.println(foo.getText());
  System.out.println(" Below using lambda expression");
  System.out.println(foo1.getText());

  }

}
