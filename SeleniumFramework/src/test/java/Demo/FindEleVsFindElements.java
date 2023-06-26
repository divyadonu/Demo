package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindEleVsFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		/*//findElement() returns single web ele
		//1 capture single web ele
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("Clothing");
		//2 capture multiple web elements ex: if selected footer links out of 22 links selected using findElement() then it captures 22links at a time using 'a'anchor tag and also it points to single web element of 22 links
		WebElement ele= driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());//to get the link text of the web
		//3 trying to find an ele using findEle() and it shows noeleexception
		WebElement searchbutton= driver.findElement(By.xpath("//button[normalize-space()='Register']"));*/
		
		//findElements() returns web elements
		//1 if findElements() used then it captures multiple web elements
	    /* List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of links captured:"+links.size());//22
		//whenever having multiple web elements we needs to write looping statements
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}*/
		//2 if findElements() used but it internally captures single web element= we cant define in single web ele as if it returns multiple web elements
		/*List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size());*/
		
		//3 in findElements() if any element is not matching, then it doesn't throws nosuchelement exception instead it results in 0 elements
	List<WebElement>elements=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
		System.out.println(elements.size());
		
		
		
		
	}

}
