package synchronization;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoadTimeout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//	will wait for page to load instead of waiting forever
		//	should use before driver.get if not doesn't make any sense
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		

		
		

	}

}
