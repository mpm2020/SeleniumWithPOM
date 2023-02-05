package pruebas;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	 public static WebDriver driver = null;
	  
	    @BeforeSuite
	    public void initialize() throws IOException {
	  
	        System.setProperty("webdriver.chrome.driver","..\\Project_POM_Example\\Drivers\\chromedriver.exe");
	    
	        driver = new ChromeDriver();
	    
	        // To maximize browser
	        driver.manage().window().maximize();
	    
	        // To open  site
	        driver.get("https://demo.guru99.com/test/newtours/index.php");
	    }
	  
	    @AfterSuite
	    // Test cleanup
	    public void TeardownTest() {
	        TestBase.driver.quit();
	    }
}