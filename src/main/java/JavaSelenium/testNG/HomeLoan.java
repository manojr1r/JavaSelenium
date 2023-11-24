package JavaSelenium.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	private String SuiteURL;
//** Can't use @DataProvider and @Parameters in one single method	
//	this example of a combination of @DataProvider and @Parameters and groups
//** @Before method,class,suite won't work with groups, until we add groups to that too..
	@DataProvider
	public Object[][] method2() {
		return new Object[][]
				{
			{"standard_user", "secret_sauce"},
			{"locked_out_user","secret_sauce"},
			};	
	}
	
//	The below has provided in Udemy course
	@DataProvider
	public Object[][] method1() {
		Object[][] data = new Object[2][2];
		
		data[0][0] ="standard_user";
		data[0][1] = "secret_sauce";
		//2nd set of data
		data[1][0] = "locked_out_user";
		data[1][1] = "secret_sauce";
					
		return data;
	}
	
	@Parameters({"URL"})
	@BeforeClass(groups = {"smoke","sanity"})
	public void setUp (String URL) {
		SuiteURL = URL;
		System.out.println(SuiteURL);
		System.out.println("URL = " +URL);
	}
	

	@Test(dataProvider = "method2" ,groups = {"smoke","sanity"})
	public void newHouseLoan(String uname, String password) {
		System.out.println("SuiteURL = "+SuiteURL);

		System.out.println("Parameter from HouseLoan " + SuiteURL);
		System.out.println("Data provider at House Loan " + uname+ " "+ password);
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/index.html");
//		driver.findElement(By.id("user-name")).sendKeys(uname);
//		driver.findElement(By.id("password")).sendKeys(password);		
	}
}
