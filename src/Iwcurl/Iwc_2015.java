package Iwcurl;

import generics.Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iwc_2015 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		
		
		//driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2015.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2014.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2012.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2010.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2009.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2007.html");
		
		driver.get("http://iwc.artofliving.org/_iwc/conference/past-conferences/iwc-2005.html");
		
		
		
		
		
		
		
		
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));

		

		//List<WebElement> alllink = driver.findElements(By.xpath("//a[@class='item']"));

		//List<WebElement> alllink = driver.findElements(By.xpath("//li//a[@class='item subtext']"));

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
