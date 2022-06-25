package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
  
public class demo {
	public static WebDriver driver;

	public static void main(String[] args) {
		String browser="Edge";
		if(browser.equalsIgnoreCase("firefox")){
	        WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        }

	        else if(browser.equalsIgnoreCase("chrome")){
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();

	        }

	                else if(browser.equalsIgnoreCase("Edge")){


	                    WebDriverManager.edgedriver().setup();

	                    driver = new EdgeDriver();
	                }
	        else{

	         System.out.println("browser not found");
	        }


	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    
		
		

	}

}
