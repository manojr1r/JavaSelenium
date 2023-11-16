package JavaSelenium.testNG;

import org.testng.annotations.Test;

public class PersonalLoan {
	
	
    @Test(enabled = true)
    public void creditCheck()
    {System.out.println("Eligible for apply");
     System.out.println("Enabled false");
    }
    
  @Test(dependsOnMethods={"test1"})
  public void applyLoan()
  {	System.out.println("");
	System.out.println("Is there a provision ");  
	  
  }
  @Test
  public void checkCreditCard() {
	  System.out.println("Will this run as test 2 depends on test which is disabled by flag");
  }
}

