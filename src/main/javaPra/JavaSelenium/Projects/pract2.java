package JavaSelenium.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pract2 {
	@Test
    public void search(){
	  WebDriver driver = new ChromeDriver();
        WebElement searchInput = driver.findElement(By.id("search-input"));
        WebElement searchButton = driver.findElement(By.id("search-button"));
        Assert.assertTrue(searchInput.isDisplayed());
        Assert.assertTrue(searchButton.isDisplayed());
        
        
      driver.findElement(By.id("search-input")).sendKeys("isla");
     int listOfResults = driver.findElements(By.xpath("//ul[@id='search-results']/li")).size();
      Assert.assertTrue(listOfResults > 0);
}
  @Test
  public void emptySearch(){
        

}
}
