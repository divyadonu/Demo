package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		// isdisplayed() and isenabled()
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		WebElement searchstore= driver.findElement(By.xpath("//input[@id='small-searchterms']"));//for search button
		System.out.println("Display Status"+searchstore.isDisplayed());
		System.out.println("Enable Status"+searchstore.isEnabled());

		//isselected() radio buttons. checkboxes, and dropdowns
		WebElement male= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
	}

}
