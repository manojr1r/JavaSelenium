package navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formstone.it/components/dropdown/demo/");

        WebElement StaticDropdownElement = driver.findElement(By.xpath("//div[@id='demo_basic-dropdown']/select"));

        Select dropdown = getSelect( StaticDropdownElement);
        // dropdown tag should be "select"
        dropdown.getOptions().size();
        dropdown.selectByVisibleText("Two");
        System.out.println(dropdown.getFirstSelectedOption()); //get value of xpath
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.quit();
    }

    static Select getSelect ( WebElement element) {
        return new Select(element);
    }
}