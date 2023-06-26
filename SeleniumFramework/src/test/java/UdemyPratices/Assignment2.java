package UdemyPratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//name field
		driver.findElement(By.name("name")).sendKeys("rahul");
	//driver.findElement(By.cssSelector("input[class='form-control ng-touched ng-dirty ng-invalid']")).sendKeys("Rahul Shetty");
		//email id field
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("contact@rahulshettyacademy.com");
		//pwd field
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshettyacademy");
		//checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		//gender dropdown
		WebElement Genderdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(Genderdropdown);
		abc.selectByVisibleText("Female");
		//driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1'][1]")).click();
		//radio buttons
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		//calender UI
		//driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("19th-06-2023");
		Thread.sleep(3000);
		//submit button
	//	driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		//capture the sucess msg and print it on console
	//	System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
