package JavaSelenium.testNg2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CreditCard {
	
	@Parameters("URL")
	@Test(groups = {"smoke" , "sanity"})
	public void Rupay(String URLName)
	{
		System.out.println("Added in Group of from another Package " + URLName);
	}
	
	@Test
	public void Visa()
	{
		System.out.println("Visa card is of SWIFT transactions");
	}
	

}
