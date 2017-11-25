package Iwcurl;

import generics.Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class About_Inspiration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		//driver.get("http://iwc.artofliving.org/_iwc/about/inspiration.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/about/service-initiatives.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/about/partners.html");
		
		//driver.get("http://iwc.artofliving.org/_iwc/about/chairperson.html");
		
		driver.get("http://iwc.artofliving.org/_iwc/about/contact-us.html");
		
		
		
		
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
