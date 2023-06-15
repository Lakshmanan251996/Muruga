import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("location")).sendKeys("navalur eb office");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'EB Office')]")).click();
		/*driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.xpath("//input[@class='_2FkHZ']")).sendKeys("dindigul");*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A2B");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Dish')])[1]")).click();
		Thread.sleep(3000L);
		List <WebElement> items=driver.findElements(By.xpath("//div[@class='_3L1X9 _2IhbV']//ancestor::div[@class='styles_item__3_NEA styles_hasImage__3OsYt']//div[@class='styles_itemName__hLfgz']"));
		
		for(int i=0;i<items.size();i++)
		{
			System.out.println(items.get(i).getText());
			List <WebElement> a=driver.findElements(By.xpath("//div[@class='_3L1X9 _2IhbV']"));
			if(items.get(i).getText().contains("Chicken"))
			{
				a.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		/*		
		
List <WebElement> menu = driver.findElements(By.xpath("//button[@class='styles_itemImage__3CsDL']"));

for (WebElement out:menu)
{
	if(out.getText().contains("Kitchadi"))
		driver.findElement(By.xpath("//div[@class='_3L1X9 _2IhbV _1F0RC']")).click();
{
		//div[@class='_1J_la']//div//div//div//div//div//div//div/h3[contains(text(),'Sprite Can 300ml')]
}
}
*/
	}

}
