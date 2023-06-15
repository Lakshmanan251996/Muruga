import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class booking {

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.agscinemas.com/");
driver.findElement(By.linkText("Show Times")).click();

//selecting movie
driver.findElement(By.id("all_movies_name")).click();
WebElement movieselect = driver.findElement(By.xpath("//select[@name='noof_seats']"));
Select dr = new Select(movieselect);
dr.selectByVisibleText("Veetla Vishesham-Tamil");

Thread.sleep(3000);
//selecting location
driver.findElement(By.xpath("//select[@class='form-control' and @id='theater_locations']")).click();
Thread.sleep(3000);
WebElement Location = driver.findElement(By.id("theater_locations"));
Select L =new Select (Location);
L.selectByVisibleText("AGS NAVALUR");

Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(@onclick,'29-06-2022')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[@class='time_click'])[3]")).click();

//selecting number of seat
driver.findElement(By.xpath("//select [@name='noof_seats']")).click();
WebElement seat = driver.findElement(By.xpath("//select [@name='noof_seats']"));
Select S = new Select(seat);
S.selectByVisibleText("4");

//selecting seat number
driver.findElement(By.id("E4//E6//5//5")).click();
Thread.sleep(300);
driver.findElement(By.id("proceedto_pay")).click();

		}

}
