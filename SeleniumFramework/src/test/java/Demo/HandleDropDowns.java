package Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//selecting country DD xpath
		WebElement dropCountryEle=driver.findElement(By.id("input-country"));
		// we cant directly select the DD from the page instead we can use select class: SelectByVisibleText(), selectByValue, SelectByIndex
		Select drpCountry= new Select(dropCountryEle);
		//drpCountry.selectByVisibleText("Denmark");
		//drpCountry.selectByValue("5"); //Andorra
		//drpCountry.selectByIndex(19);
		
		//without using select class we can handle DD by that we needs to write the logic
		List<WebElement> alloptions=drpCountry.getOptions();
		for(WebElement option:alloptions) {
			 if(option.getText().equals("Cyprus"))
			 {
				 option.click();
				 break;
			 }
		}
	
		
		
	}

}
