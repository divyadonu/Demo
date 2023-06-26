package UdemyPratices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();// as chennai is on From and To places so while
		//automating we get error as which to pick so use Index after xpath as shown above:		
		//Parent to child relationship locator -writing in different ways
		//for FROM dropdown can use like: parent and BLR xpath as below
	//	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"));
		//for TO dropdown can use like: parent and MAA xpath as below
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//handling dropdown UI writing the code for present date 19th June 2023
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	}
	

}
