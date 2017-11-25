package iwc_2012;

import generics.Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inaugural_address_2012 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		//driver.get("http://iwc.artofliving.org/_iwc/inaugural-address.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/welcome-address.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/speakers-2012.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/performance-2012.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/exhibition-2012.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/outcomes-2012.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/inaugural-address-2010.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/welcome-address-2010.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/speakers-2010.html");
		
		driver.get("http://iwc.artofliving.org/_iwc/highlights-outcomes-2010.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/highlights-outcomes-2010.html");
		
		
		
	    List<WebElement> alllink = driver.findElements(By.xpath("//a"));
	    
	    
	    System.out.println(alllink.size());

		for (int i = 0; i < alllink.size(); i++)
		{
			String link = alllink.get(i).getAttribute("href");

			

			System.out.println(link);

			Excel.updateValue(link, i);

		}
		driver.getCurrentUrl();
		Thread.sleep(2000);

		driver.quit();


	}

}
