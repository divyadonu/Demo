package Demo;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class BootstrapDDGenericMethod {

			public static void main(String[] args) {
				WebDriver driver;
				
				WebDriverManager.chromedriver().setup();
				
				driver= new ChromeDriver();
				driver.get("https://www.hdfcbank.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
				
				List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
				System.out.println("Number of options:"+productTypes.size());
				selectOptionFromDropDown(productTypes,"Accounts");
				
				// needs to select any of the options frm DD for that we cant directly fetch that value instead we can use for loop and compares with expected one
				
					driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
					List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
					System.out.println("No of options:"+products.size());
					selectOptionFromDropDown(products,"Savings Accounts");	
		}
		
		//instead of writing for loop twice or many times if we have bootstrap DD as many then we can call this method-user defined method
		public static void selectOptionFromDropDown(List<WebElement> options, String value)
		{
			for(WebElement option:options) 
			{
				if(option.getText().equals(value)) 
				{
					option.click();
					break;
					}
			}
		}
}	



	

