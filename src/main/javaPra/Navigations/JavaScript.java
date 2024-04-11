package Navigations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
//Two methods
//  executeScript and executeAsyncScript

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// Locator Syntax 
        // document.getElementBy..('')  ..canbe id, name, ClassName, tagName
//for CSS= document.querySelector('')

// for Xpath= document.evaluate(xpathExpression,        =   xPath
//                              contextNode,            =   document    //generally "document" where you want to Search (As total page reffered as document hence same is used)
//                              namespaceResolver,      =   null
//                              resultType,             =   XPathResult.FIRST_ORDERED_NODE_TYPE
//                              result)                 =   NULL
//                              .singleNodeValue        =   singleNodeValue
    

// TypeCasting
// As driver is implemented of WebDriver Typecasting JavascriptExecutor to driver
// If it is a ChromeDriver driver = new ChromeDriver(); no need to parse

    JavascriptExecutor jsE = (JavascriptExecutor) driver;

    jsE.executeScript("window.scrollBy(0,500)");     //will scroll entire window (Page)
    jsE.executeScript("document.querySelector('.tableFixHead').scrollTop=50"); // As CSS Selector querySelector if diff. locator different syntax look above
        
    }
}
