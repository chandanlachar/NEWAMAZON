package TestCases;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;


public class TestCase2_GetallLinks  extends BaseClass{
	
	@Test
    public void GetAllImages() {
        HomePage hp = new HomePage(driver);
        List<WebElement> allImages = hp.getAllImages();
        System.out.println("Number of images on the webpage: " + allImages.size());
        for (WebElement image : allImages) {
            System.out.println("Image Source: " + image.getAttribute("src"));
        }
	
	
}
}