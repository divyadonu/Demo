package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDowns {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		//first method
		/*Select noOfdaysdrp= new Select(driver.findElement(By.name("DateOfBirthDay")));
		noOfdaysdrp.selectByValue("5");
		Select noOfmonthdrp= new Select(driver.findElement(By.name("DateOfBirthMonth")));
		noOfmonthdrp.selectByVisibleText("September");
		Select noOfyeardrp= new Select(driver.findElement(By.name("DateOfBirthYear")));
		noOfyeardrp.selectByValue("1914");*/
		//logic method instead of writing every times select class for multiple DD
		WebElement noOfdaysEle=driver.findElement(By.name("DateOfBirthDay"));
		selectOptionFromDropDown(noOfdaysEle, "5");	
		WebElement noOfmonthEle= driver.findElement(By.name("DateOfBirthMonth"));
		selectOptionFromDropDown(noOfmonthEle,"September");
		WebElement noOfyearEle=driver.findElement(By.name("DateOfBirthYear"));
		selectOptionFromDropDown(noOfyearEle, "1914");
	
	}
		public static void selectOptionFromDropDown(WebElement ele, String value) {
			Select drpDD= new Select(ele);
			List<WebElement> alloptions=drpDD.getOptions();
			for(WebElement option:alloptions) {
				 if(option.getText().equals(value))
				 {
					 option.click();
					 break;
				 }
			}
		}

}
