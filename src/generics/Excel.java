package generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static int getRowCount(String path,String sheet)
	{
		int r=0;
		try{
			
			r=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return r;
	}
	
	public static String getCellValue(String path,String sheet,int r,int c)
	{
		String v="";
		try{
			
			v=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return v;
	}
	
	public static void updateValue(String lv,int k)
	{
		try{
		FileInputStream fis = new FileInputStream("./scenario/updatevalue.xlsx/");
		Workbook wb = WorkbookFactory.create(fis);
		

		Cell d = wb.getSheet("Acharya_ratnananda_awards_2012").createRow(k).createCell(0);
		d.setCellValue(lv);

		FileOutputStream fos = new FileOutputStream("./scenario/updatevalue.xlsx");
		wb.write(fos);
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	
}
