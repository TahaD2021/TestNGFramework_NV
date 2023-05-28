import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tekschoolofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.close();
		
		String title = "TEK School – Knowledge is power";
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text()='Test Environment']")).click();;;
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("input-email")).sendKeys("mashooq.dowlati@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Keepitsafe");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		WebElement tekLogo = driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
	    System.out.println(tekLogo.getText());
	    System.out.println(tekLogo.isDisplayed());
		//driver.close();
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    
	    for(WebElement webLinks: links) {
	    	//to perform the avove loop we can use both of the bellow methods
	    	String elementtext = webLinks.getText();
	    	System.out.println(elementtext);
	    	//System.out.println(webLinks.getText());
	    	
	    	if(elementtext.equals("Phones & PDAs")) {
	    		webLinks.click();
	    		//break;
	    		
	    	}
	    	
	    WebElement Phones_PDAs = driver.findElement(By.xpath("//a[text()='Phones & PDAs']"));
	    Phones_PDAs.click();
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	
	    WebElement sortByElement = driver.findElement(By.xpath("//select[@id='input-sort']"));
	    Select select = new Select(sortByElement);
	    select.selectByVisibleText("Name (Z - A)");
	    //select.selectByValue();
	   // select.selectByVisibleText("Rating (Highest)");
	    //select.selectByVisibleText("Rating (Lowest)");
	    select.selectByIndex(4);
	    //driver.navigate().refresh();
	    driver.close();
	    driver.quit();
	    
	    }
	    
		
	}

}
