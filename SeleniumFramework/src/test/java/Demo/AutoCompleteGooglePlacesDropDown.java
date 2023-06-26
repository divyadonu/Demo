package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AutoCompleteGooglePlacesDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver= new ChromeDriver();
		driver.get("https://uat.corsair.com/us/en/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//String username = "root";
		//Thread.sleep(2000);
		//String password = "testtesttest";
		//Thread.sleep(2000);
		//String URL= "https://" +username +":" +password +"@"+ ("uat.corsair.com/us/en/");
		//driver.switchTo().alert().sendKeys("root"+"testtesttest");
		String Username="root";
		String Password="testtesttest";
		String MyURL="https://"+"uat.corsair.com/us/en/";
		String URL = "https://" +Username +":" +Password +"@"+ "uat.corsair.com/us/en/";
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		}
		
	}

