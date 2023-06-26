package Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropDown_BingSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("Size of Auto suggestions:"+ list.size());
		//needs to compare the suggestions
		for(WebElement Listitem:list) 
		{
			if(Listitem.getText().contains("download")) 
			{
				Listitem.click();
				break;
			}
		}
	}

}
