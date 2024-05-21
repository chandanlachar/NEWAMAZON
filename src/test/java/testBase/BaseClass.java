package testBase;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	//setup and tear down
	@BeforeClass
	public void setup() {
		//logger
		rb=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHANDAN\\eclipse-workspace2\\NEWAMAZON\\driver\\chromedriver.exe");
		 driver = new ChromeDriver(options);
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 logger.info("ChromeBrowser Succesfully launched");
		 
	}
	@AfterClass
	public void TearDown() {
		driver.close();
		logger.info("ChromeBrowser closed succesfully");
	}
	
	 public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (Exception e) {
				e.getMessage();
			}
			return destination;
	   }
	
	

}
