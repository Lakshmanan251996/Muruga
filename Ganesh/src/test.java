import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
			//System.setProperty(key, value)	
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(500);
driver.findElement(By.id("src")).sendKeys("chennai");
//driver.findElement(By.className("clearfix")).sendKeys("chennai");
	Thread.sleep(500);
driver.findElement(By.xpath("//li[@data-no='14']")).click();
Thread.sleep(500);
driver.findElement(By.id("dest")).sendKeys("madura");
Thread.sleep(500);
driver.findElement(By.xpath("//li[@data-no='14']")).click();

driver.findElement(By.id("onward_cal")).click();
String month = "May 2024";
String date = "29";

while (true)
{

	String Lmonth = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	if (Lmonth.equals(month))
	{
		break;
}
	else
	
	driver.findElement(By.xpath("//td[@class='next']")).click();
	
	}

List <WebElement> dat =  driver.findElements(By.xpath("//tbody//tr//td"));

for (WebElement element:dat)
{
	String check = element.getText();
	if (check.equals(date))
	{
		element.click();
		break;
	}
}

}
	
	
	}




