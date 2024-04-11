package ScreenShot;

import DriverFactory.GetDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;


public class Screen {

    public static void main(String[] args) throws IOException {


        WebDriver driver = GetDriver.driver(GetDriver.driverName.EDGE);

        driver.get("https://www.take-a-screenshot.org/");
        System.out.println( driver.getTitle());
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File((System.getProperty("user.dir"))+"\\Screenshot\\"+ LocalDate.now()+"//screenshot.png" ));

    }
}
