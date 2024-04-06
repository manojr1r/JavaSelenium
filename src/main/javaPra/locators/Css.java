package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
      public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.close();

    /* '$' to check on chrome deveploper tools'Console'
        1)  Class Name    ->     "tagname.classname"    or  "".classname" (if there is space in between class name remove space and ".")
        2)  ID            ->     "tagname#id"           or   "#id"
        3)  "tagname[attribute='value']"
    //to limit the scope CSS <space> CSS
        4)with Index value :   "tagname[attribute='value']:nth-child(indexNo.)"
    for example "button" returns two or more if needed last value : last-of-type     
        
        5)with regular exp(partial value match) :   "tagname[type*='val']" 

    with tagname traverse
        tagname<space>tagname


        */
    }
    
}
