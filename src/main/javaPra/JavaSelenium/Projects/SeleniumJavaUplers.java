package JavaSelenium.Projects;

import static org.testng.Assert.assertTrue;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SeleniumJavaUplers {
	WebDriver webDriver = new ChromeDriver();
	
	
	@Test
	public void searc() {
        assertTrue(webDriver.findElement(By.id("search-input")).isDisplayed());
        assertTrue(webDriver.findElement(By.id("search-button")).isDisplayed());
	}
	
	@Test
	public void emptySearch() {
		webDriver.findElement(By.id("search-button")).click();
		 
		assertTrue(webDriver.findElement(By.id("error-empty-query")).isDisplayed());
	    int numberOfResults = webDriver.findElements(By.xpath("//ul[@id='search-results']/li")).size();
	    assertTrue(numberOfResults == 0);

	}
	
	@Test
	public void searchResults() {
	webDriver.findElement(By.id("search-input")).sendKeys("isla");
	webDriver.findElement(By.id("search-button")).click();
	webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    int numberOfResults = webDriver.findElements(By.xpath("//ul[@id='search-results']/li")).size();
    assertTrue(numberOfResults > 0);	
	}
	
	@Test
	public void noResults() {
		webDriver.findElement(By.id("search-input")).sendKeys("castle");
		webDriver.findElement(By.id("search-button")).click();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		assertTrue(webDriver.findElement(By.id("search-button")).isDisplayed());
	}
	@Test
	public void Oneresult() {
		webDriver.findElement(By.id("search-input")).sendKeys("port");
		webDriver.findElement(By.id("search-button")).click();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		int numberOfResults = webDriver.findElements(By.xpath("//ul[@id='search-results']/li")).size();
	    assertTrue(numberOfResults == 1);
	}

}
