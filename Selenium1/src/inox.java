import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class inox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");

WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();


//Action class
WebElement mouse = driver.findElement(By.xpath("//div[@class='CXW8mj']//img[@alt='Electronics']"));
Actions m = new Actions(driver);
m.moveToElement(mouse).perform();

driver.findElement(By.linkText("Home Theatres")).click();
	
driver.findElement(By.cssSelector("input._3704LK")).sendKeys("mobiles");
driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
Thread.sleep(1000);
//driver.findElement(By.xpath("(//div[@class='_1YAKP4']")).click();
WebElement one = driver.findElement(By.xpath("//div[@class='_1YAKP4']/select"));
Select opt = new Select(one);
opt.selectByIndex(5);

WebElement max = driver.findElement(By.xpath("//div[@class='_3uDYxP']/select"));
Select maxprice = new Select(max);
maxprice.selectByIndex(2);

List <WebElement> brand = driver.findElements(By.xpath("//div[@class='_2d0we9']//div//div/label"));

for (WebElement a:brand)
{
	if (a.getText().contains("SAMSUNG"))
	{
		a.click();
	break;
	}
}

List <WebElement> mob = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

for (WebElement b:mob)
{
	if(b.getText().contains("Forest Green"))
		
	{
		b.click();
		break;
		
	}
}	
	}

}

