package Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
	
	//selectChoiceValues(driver,"//body/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]");
	//selectChoiceValues(driver,"choices 2", "choices 2 2", "choices 6", "choices 6 1", "choices 6 2 2");
	//selectChoiceValues(driver,"all");
	}	
	public static void selectChoiceValues(WebDriver driver,String...value) {
		List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle comboTreeItemHover']"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item:choiceList) {
				String text=item.getText();
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
						}
				}
			}
		}
		else {
			for(WebElement item:choiceList) {
				item.click();
			}
		}
	}
	
}
