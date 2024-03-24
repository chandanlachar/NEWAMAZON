package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/span[1]/span[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")  WebElement checkbox_getItByTomorrow ;

	public void ClickonCheckbox() {
		checkbox_getItByTomorrow.click();
	}
}