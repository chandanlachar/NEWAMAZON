package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
//calling the constructor 
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//WebElement
	//@FindBy (xpath="//input[@id='twotabsearchtextbox']") WebElement Clickontextbar;
	@FindBy (xpath="//input[@id='twotabsearchtextbox']") @CacheLookup WebElement textbar;
	@FindBy(id="nav-search-submit-button")  @CacheLookup WebElement go_bar;
		
	//Action
/*	public void presstextbar() {
		Clickontextbar.click();
			
	} */
	
	public void Searchformobile(String Mobile) {
		textbar.sendKeys(Mobile);
		
	}
	public void ClickOnSearchgo() {
		go_bar.click();
	}
	
}
