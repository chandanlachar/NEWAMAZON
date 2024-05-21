package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
	//web elements
	@FindBy(tagName = "a") private List<WebElement> allLinks;
	
	@FindBy(tagName="img") private List<WebElement> allImages;
	
	//@FindBy(xpath="//form[@id='nav-search-bar-form']//div[@class='nav-left']") @CacheLookup private WebElement dd_all;
	@FindBy(xpath="//select[@id='searchDropdownBox']") @CacheLookup private WebElement dd_all;
	//Action
/*	public void presstextbar() {
		Clickontextbar.click();
			
	} */
/*(	
	public void Searchformobile(String Mobile) {
		textbar.sendKeys(Mobile);
		
	}
	public void ClickOnSearchgo() {
		go_bar.click();
	}
	
	public List<WebElement> getAllLinks() {
        return allLinks;	
}
	public List<WebElement> getAllImages() {
        return allImages;	
}  */
  public String ClickOnDropDown() {	
	 Select s=new Select(dd_all);
	 s.selectByVisibleText("Baby");
	return null;
	
	
	 
	 
  }

	

	
}
