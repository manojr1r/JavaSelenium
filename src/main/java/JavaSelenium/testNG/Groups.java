package JavaSelenium.testNG;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"smoke","sanity"})
	public void groupEx() {
		System.out.println("This method is added in two grops");
	}

}
