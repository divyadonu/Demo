package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//WebDriverManager.chromedriver().setup();
		System.out.println("Title of the web page is"+driver.getTitle());
		System.out.println("Title of the web page is"+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}

