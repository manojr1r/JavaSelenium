package JavaSelenium.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	//timeout -- is like wait
	//enabled
	//dependsOnMethods
//	  @Optional
	
//	@DataProvider in HomeLoan


	@Parameters({"URL","UserName"})
/* Used Parameters but this value is shared from customMadeTestng.xml file.
 	but if this file directly from here this class should not failed so added @Optional 
 */
	@Test(timeOut = 4000)
	public void abA(@Optional("Optional Parameter") String URLName, String UserName){
		System.out.println("AAA will this execute before unSecuredLoan? " + URLName +"UsnameParamater"+ UserName);
	}
	
    @Test(enabled = false)
    public void cibilCheck(){
    	System.out.println("cibilCheck disabled");
    }
   /*
    Observation:- unSecuredLoan depends on cibilCheck which is disabled with flag 
    now even adding "alwaysRun" flag it is not executing "unSecuredLoan" 
    	and also the entire class not even aAA (As Executed as per alphabetical order, and observed this are not executing alphabetical order!!)
    This issue overcomes by adding "mortageLoan" to unSecuredLoan
    */
  @Test(dependsOnMethods={"cibilCheck", "mortageLoan"}, alwaysRun = true)
  public void unSecuredLoan(){
	  System.out.println("unSecuredLoan depends on cibilCheck method" );  
	  
  }
  @Test
  public void mortageLoan() {
	  System.out.println("mortageLoan");
  }
  
  @Test(groups = "smoke")
  public void weddingLoan() {
	  System.out.println("weddingLoan");
  }
  
  @Test()
  public void apiCibilCheck(){
  	System.out.println("apiCibilCheck");
  }
  
  @Test(groups = {"smoke","sanity"})
  public void apiUnSecuredLoan(){
	  System.out.println("apiUnSecureLoan" );  
	  
  }
}

