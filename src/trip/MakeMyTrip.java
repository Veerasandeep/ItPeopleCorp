package trip;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTrip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Project\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "F:\\Project\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromCity")).click();
		//Select city = new Select(driver.findElement(By.id("fromCity")));
		//city.selectByVisibleText("HYD");
		driver.findElement(By.id("react-autowhatever-1-section-0-item-5")).click();
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
		driver.findElement(By.cssSelector("div.DayPicker-Month:nth-child(2) > div:nth-child(3) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > p:nth-child(1)")).click();
		driver.findElement(By.cssSelector("a.primaryBtn.font24.latoBold.widgetSearchBtn")).click();
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(By.cssSelector("div.fli-list-body-section"));
		System.out.println(elements.size()); 
	   
		for(WebElement flightdetails : elements) { 
			 System.out.println(flightdetails.getText()); 
			 } 
		
	}

}
