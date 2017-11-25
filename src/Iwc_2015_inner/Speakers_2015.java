package Iwc_2015_inner;

import generics.Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Speakers_2015 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.get("http://iwc.artofliving.org/_iwc/speakers-2015.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/2015-day-1.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/a-dialogue-with-sri-sri.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/2015-day-2.html");
		
		driver.get("http://iwc.artofliving.org/_iwc/breakout-session.html");
		
		
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
