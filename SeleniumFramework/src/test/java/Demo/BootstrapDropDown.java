package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		// Select Product type DD
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("Number of options:"+productTypes.size());
		// needs to select any of the options frm DD for that we cant directly fetch that value instead we can use for loop and compares with expected one
		for(WebElement ptype:productTypes) {
			if(ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
				}
			}
			// Products DD
			driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
			List<WebElement> Products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
			System.out.println("No of options:"+Products.size());
			for(WebElement product:Products) {
				if(product.getText().equals("Salary Accounts")) {
					product.click();
					break;
					}
				}
	}

}
