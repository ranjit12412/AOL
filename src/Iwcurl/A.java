package Iwcurl;

import generics.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://iwc.artofliving.org/");

		// List<WebElement> alllink = driver.findElements(By.xpath("//a"));

		//List<WebElement> alllink = driver.findElements(By.xpath("//img"));

		//List<WebElement> alllink = driver.findElements(By.xpath("//a[@class='item']"));

		List<WebElement> alllink = driver.findElements(By.xpath("//li//a[@class='item subtext']"));

		System.out.println(alllink.size());

		for (int i = 0; i < alllink.size(); i++)
		{
			String link = alllink.get(i).getAttribute("href");

			//String link = alllink.get(i).getAttribute("src");

			System.out.println(link);

			Excel.updateValue(link, i);

		}
		driver.getCurrentUrl();
		Thread.sleep(2000);

		driver.quit();

	}

}
