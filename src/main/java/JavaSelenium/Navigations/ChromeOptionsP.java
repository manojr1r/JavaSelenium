package JavaSelenium.Navigations;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsP {
    //To learn More
//  https://chromedriver.chromium.org/capabilities
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        // FirefoxOptions options1 = new FirefoxOptions();
        // EdgeOptions options2 = new EdgeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("start-maximized");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("ipaddress:4444");
        options.setCapability("proxy", proxy);

        //To set default directory for downloads
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        options.setExperimentalOption("prefs", prefs);
        
        WebDriver driver = new ChromeDriver(options);
        driver.get(null);
    }
}
