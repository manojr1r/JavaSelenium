package JavaSelenium.Projects;

import java.time.Month;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

    public static void main(String[] args) {    
    ChromeDriver driver=new ChromeDriver();

    driver.get("https://demo.automationtesting.in/Datepicker.html");
    
    driver.findElement(By.cssSelector("input[id='datepicker1']")).click();
    selectYear(driver, 2024);
    selectMonth(driver, "JUne");
    Integer currentYear = Integer.parseInt(driver.findElement(By.className("ui-datepicker-year")).getText());
    Month currentMonth = Month.valueOf(driver.findElement(By.className("ui-datepicker-month")).getText().toUpperCase());
    System.out.println("Selected Month and Year: "+currentMonth +" "+currentYear);
    driver.quit();    
}
static void selectYear(WebDriver driver,int year){

    Integer currentYear = Integer.parseInt(driver.findElement(By.className("ui-datepicker-year")).getText());
    // currentYear.spl
    while (!(currentYear== year)) {
        if (year < currentYear){
            driver.findElement(By.cssSelector("a[data-handler='prev'] span")).click();
            currentYear = Integer.parseInt(driver.findElement(By.className("ui-datepicker-year")).getText());
        }
        if (year > currentYear){
            driver.findElement(By.cssSelector("a[data-handler='next'] span")).click();
            currentYear = Integer.parseInt(driver.findElement(By.className("ui-datepicker-year")).getText());
        }   
    }
}

static void selectMonth(WebDriver driver, String month){
    
    Month requiredMonth =Month.valueOf(month.toUpperCase());
    Month currentMonth = Month.valueOf(driver.findElement(By.className("ui-datepicker-month")).getText().toUpperCase());

    int requiredValue =requiredMonth.getValue();
    int currentValue = currentMonth.getValue();

    while (!(currentValue== requiredValue)) {
        if (requiredValue < currentValue){
            driver.findElement(By.cssSelector("a[data-handler='prev'] span")).click();
            currentMonth = Month.valueOf(driver.findElement(By.className("ui-datepicker-month")).getText().toUpperCase());
            currentValue = currentMonth.getValue();
        }
        if (requiredValue > currentValue){
            driver.findElement(By.cssSelector("a[data-handler='next'] span")).click();
            currentMonth = Month.valueOf(driver.findElement(By.className("ui-datepicker-month")).getText().toUpperCase());
            currentValue = currentMonth.getValue();
        }   
    }
    


}
}
