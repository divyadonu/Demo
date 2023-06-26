package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		//backward from amazon page to snapdeal page
		driver.navigate().back();
		//forward from snapdeal to amazon page
		driver.navigate().forward();
		//refresh/reloads the page
		driver.navigate().refresh();
		
		/*WebElement searchstore= driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		System.out.println("Display Status"+searchstore.isDisplayed());
		System.out.println("Enable Status"+searchstore.isEnabled()); */
		
	}

}
