package generics;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Utility {
	
	public static String getFormatedDateTime(){
		SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sd.format(new Date());
	}
	
	public static String getPageScreenShot(WebDriver driver, String imageFolderPath){
		String imagePath=imageFolderPath+"/"+getFormatedDateTime()+".png";
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		try{
			FileUtils.copyFile(edriver.getScreenshotAs(OutputType.FILE), new File(imagePath));
		}catch(Exception e){
			
		}
		return imagePath;
		
	}
	
	public static String cropImage(String imagePath,int x,int y,int width,int height,String OutputImgFolder)
	{
		String newImagePath=OutputImgFolder+"/"+getFormatedDateTime()+".png";
		try{
			BufferedImage originalImgage = ImageIO.read(new File(imagePath));
	        BufferedImage subImgage = originalImgage.getSubimage(x,y,width,height);
	        ImageIO.write(subImgage,"png", new File(newImagePath));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return newImagePath;
	}
	
	public static boolean compareImage( String actualImage,String expectedImage) {        
		try {
		        DataBuffer eImg = ImageIO.read(new File(expectedImage)).getData().getDataBuffer();        
		        DataBuffer aImg = ImageIO.read(new File(actualImage)).getData().getDataBuffer();
		        int size=eImg.getSize(),matchCount=0;
		            for(int i=0; i<size; i++) 
		                if(eImg.getElem(i) == aImg.getElem(i))
		                {
		                	matchCount++;
		                }
		            	int percentage=matchCount*100/size;
		            	System.out.println("ImageSize:"+size);
		            	System.out.println("Match:"+matchCount);
		            	System.out.println("percentage"+percentage);
		            	if(percentage>90){
		            		return true;
		            	}
		            	else{
		            		return false;
		            	}
		    } 
		
		 catch (Exception e){
			 return  false;
			}
		}
	public static void getDesktopScreenShot()
	{
		String timeStamp=getFormatedDateTime();
		try{
			
			
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectRect=new Rectangle(d);
			
			Robot r=new Robot();
			BufferedImage img = r.createScreenCapture(rectRect);
			
			//File output=new File(AutomationConstants.SNAP_PATH+timeStamp+".png");
			
			//ImageIO.write(img, "png", output);
			}
			catch(Exception e)
			{
				
			}
	}
}
