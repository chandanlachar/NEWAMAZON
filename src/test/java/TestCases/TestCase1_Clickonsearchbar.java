package TestCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;





public class TestCase1_Clickonsearchbar  extends BaseClass{
	
	@Test
	
	public void   Clickontextbar() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);

		hp.Searchformobile("MOBILE");
		Thread.sleep(3000);
		logger.info("searched for mobile");
		/*hp.presstextbar();
		Thread.sleep(5000);
		logger.info("clicked on mobile search");*/
		hp.ClickOnSearchgo();
		Thread.sleep(3000);
		logger.info("Clocked on Search go");
		
		
		ProductPage pp=new ProductPage(driver);
		pp.ClickonCheckbox();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
