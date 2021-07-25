package package_1;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "../Youtube/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement googlelogin=driver.findElement(By.xpath("//div[@data-cy='googleLogin']"));
		//googlelogin.click();
		driver.findElement(By.id("fromCity")).click();
		WebElement text1=driver.findElement(By.xpath("//input[@type='text' and @aria-autocomplete='list']"));
		text1.sendKeys("Kolkata");
		//Thread.sleep(5000);
		List<WebElement>dynamiclist=(List<WebElement>) driver.findElement(By.cssSelector("//p[class='font14 appendBottom5 blackText']"));
		for (int i=0;i<dynamiclist.size();i++)
		{
			String text=dynamiclist.get(i).getText();
			System.out.println("text is"+text);
			if(text.contains("Kolkata"))
			{
				dynamiclist.get(i).click();
				break;
			}
		}
		
		
		
	}
}
