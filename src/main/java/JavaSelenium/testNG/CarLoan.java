package JavaSelenium.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	@Test
	public void aAA() {
		System.out.println("aA method from CarLoan");
	}
	
	@BeforeGroups (groups = {"smoke"})//to make sure that the critical functionalities of the program are working fine
	@BeforeSuite
	@BeforeTest (groups = "sanity")//newly added functionalities, bugs, etc., have been fixed
	@BeforeClass  //This and above method scope depends on TestNg.xml file
	@BeforeMethod //this will execute before each and every method which means depends on the class file
	(enabled = true)
    public void newCarLoan()
    {System.out.println("Congratulaions!! on new car");
    }
    
  @Test
  public void usedCarLoan() {
	  System.out.println("usedCarLoan");
  }

}
