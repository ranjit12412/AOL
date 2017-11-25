package Iwcurl;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import generics.Excel;



public class B {

	public static void main(String[] args) {
		
		
		  
		 
		 
		

	/*	// String[] name1 = { "A", "B", "C", "D", "A" };

		    String[] name2 = { "A", "B", "D", "C", "Z" };

		    String[] name3 = { "Y", "K", "K", "L", "M" };*/
		    
		    Set<String> letter = new HashSet<String>();
		    
		    int l = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Sheet1");
		   
			  for(int i=0;i<=l;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Sheet1", i, 0));
			}
			  
			  int s3 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Sheet3");
			   
			  for(int i=0;i<=s3;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Sheet3", i, 0));
			}

			  int s4 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Sheet4");
			   
			  for(int i=0;i<=s4;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Sheet4", i, 0));
			}
	
			  int k = Excel.getRowCount("./scenario/updatevalue.xlsx/", "About_Vision");
			   
			  for(int i=0;i<=k;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "About_Vision", i, 0));
			}

			  int m = Excel.getRowCount("./scenario/updatevalue.xlsx/", "About_Inspiration ");
			   
			  for(int i=0;i<=m;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "About_Inspiration ", i, 0));
			}
			  
			  int n = Excel.getRowCount("./scenario/updatevalue.xlsx/", "About_Chairpersion");
			   
			  for(int i=0;i<=n;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "About_Chairpersion", i, 0));
			}
			  int o = Excel.getRowCount("./scenario/updatevalue.xlsx/", "service-initiatives");
			   
			  for(int i=0;i<=o;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "service-initiatives", i, 0));
			}
			  int p = Excel.getRowCount("./scenario/updatevalue.xlsx/", "About_Partners");
			   
			  for(int i=0;i<=p;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "About_Partners", i, 0));
			}
			  
			  int q = Excel.getRowCount("./scenario/updatevalue.xlsx/", "About_Contact");
			   
			  for(int i=0;i<=q;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "About_Contact", i, 0));
			}
			  
			  int r = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Conferences");
			   
			  for(int i=0;i<=r;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Conferences", i, 0));
			}
			  
			  int t = Excel.getRowCount("./scenario/updatevalue.xlsx/", "RegionalConferences");
			   
			  for(int i=0;i<=t;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "RegionalConferences", i, 0));
			}
			  
			  int t15 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2015");
			   
			  for(int i=0;i<=t15;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2015", i, 0));
			}
			  
			  int t14 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2014");
			   
			  for(int i=0;i<=t14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2014", i, 0));
			}
			  
			  int t12 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2012");
			   
			  for(int i=0;i<=t12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2012", i, 0));
			}
			  
			  int t10 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2010");
			   
			  for(int i=0;i<=t10;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2010", i, 0));
			}
			  
			  int t09 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2009");
			   
			  for(int i=0;i<=t09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2009", i, 0));
			}
			  
			  int t07 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2007");
			   
			  for(int i=0;i<=t07;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2007", i, 0));
			}
			  
			  int t05 = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Iwc_2005");
			   
			  for(int i=0;i<=t05;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Iwc_2005", i, 0));
			}
			  
			  int va = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Vishalakshi_Award");
			   
			  for(int i=0;i<=va;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Vishalakshi_Award", i, 0));
			}
			  
			  int aa = Excel.getRowCount("./scenario/updatevalue.xlsx/", "Acharya_Award");
			   
			  for(int i=0;i<=aa;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Acharya_Award", i, 0));
			}
			  
			  int ia= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Inaugural_address");
			   
			  for(int i=0;i<=ia;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Inaugural_address", i, 0));
			}
			  
			  int wa= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Welcome_address");
			   
			  for(int i=0;i<=wa;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Welcome_address", i, 0));
			}
			  
			  int s15= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Speakers_2015");
			   
			  for(int i=0;i<=s15;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speakers_2015", i, 0));
			}
			  
			  
			 
			  int day1= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Sp_Day1");
			   
			  for(int i=0;i<=day1;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Sp_Day1", i, 0));
			}
			  
			  int dw= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Dialogue_with");
			   
			  for(int i=0;i<=dw;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Dialogue_with", i, 0));
			} 
			  
			  int day2= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Sp_Day2");
			   
			  for(int i=0;i<=day2;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Sp_Day2", i, 0));
			} 
			  
			  int brs= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Breakout_session");
			   
			  for(int i=0;i<=brs;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Breakout_session", i, 0));
			} 
			  
			  int outc= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Outcomes");
			   
			  for(int i=0;i<=outc;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Outcomes", i, 0));
			} 
			  int ia14= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Inaugural_address_2014");
			   
			  for(int i=0;i<=ia14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Inaugural_address_2014", i, 0));
			} 
			  
			  int wa14= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Welcome_Address_2014");
			   
			  for(int i=0;i<=wa14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Welcome_Address_2014", i, 0));
			} 
			  
			  int sp14= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Speakers_2014");
			   
			  for(int i=0;i<=sp14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speakers_2014", i, 0));
			} 
			  
			  
			  int p14= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Performance_2014");
			   
			  for(int i=0;i<=p14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Performance_2014", i, 0));
			} 
			  
			  int o14= Excel.getRowCount("./scenario/updatevalue.xlsx/", "outcomes_2014");
			   
			  for(int i=0;i<=o14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "outcomes_2014", i, 0));
			} 


			  int exp14= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Experiences_2014");
			   
			  for(int i=0;i<=exp14;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Experiences_2014", i, 0));
			} 
			  
			  int ia12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Inaugural_address_2012");
			   
			  for(int i=0;i<=ia12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Inaugural_address_2012", i, 0));
			} 
			  
			  int wa12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Welcome_address_2012");
			   
			  for(int i=0;i<=wa12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Welcome_address_2012", i, 0));
			}
			  
			  int sp12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Speaker_12");
			   
			  for(int i=0;i<=sp12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speaker_12", i, 0));
			}
			  int pf12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Performance_2012");
			   
			  for(int i=0;i<=pf12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Performance_2012", i, 0));
			}
			  
			  int exb12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Exhibition_2012");
			   
			  for(int i=0;i<=exb12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Exhibition_2012", i, 0));
			}
			  
			 int ot12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Outcomes_2012");
			   
			  for(int i=0;i<=ot12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Outcomes_2012", i, 0));
			}
			  
			  int ia10= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Inaugural_address_2010");
			   
			  for(int i=0;i<=ia10;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Inaugural_address_2010", i, 0));
			}
			  
			  int wa10= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Welcome_address_2010");
			   
			  for(int i=0;i<=wa10;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Welcome_address_2010", i, 0));
			}
			  
			  int sp10= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Speakers_2010");
			   
			  for(int i=0;i<=sp10;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speakers_2010", i, 0));
			}
			  //Performance_2010
			  
			  int pf10= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Performance_2010");
			   
			  for(int i=0;i<=pf10;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Performance_2010", i, 0));
			}
			  
			  int ho10= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Highlights_outcomes_2010");
			   
			  for(int i=0;i<=ho10;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Highlights_outcomes_2010", i, 0));
			}
			  
			  int ia09= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Inaugural_address_2009");
			   
			  for(int i=0;i<=ia09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Inaugural_address_2009", i, 0));
			}
			  
			  int wa09= Excel.getRowCount("./scenario/updatevalue.xlsx/", "welcome_address_2009");
			   
			  for(int i=0;i<=wa09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "welcome_address_2009", i, 0));
			}
			  
			  int sp09= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Speakers_2009");
			   
			  for(int i=0;i<=sp09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speakers_2009", i, 0));
			}
			  
			  int pf09= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Performance_2009");
			   
			  for(int i=0;i<=pf09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speakers_2009", i, 0));
			}
	  
	  
			  int ex09= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Exhibition_2009");
			   
			  for(int i=0;i<=ex09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Exhibition_2009", i, 0));
			}
			  
			  int ot09= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Outcomes_2009");
			   
			  for(int i=0;i<=ot09;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Outcomes_2009", i, 0));
			}
			  
			  int ia05= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Inaugural_address_2005");
			   
			  for(int i=0;i<=ia05;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Inaugural_address_2005", i, 0));
			}
			  
			  int wa05= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Welcome_address_2005");
			   
			  for(int i=0;i<=wa05;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Welcome_address_2005", i, 0));
			}
			  
			  int sp05= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Speakers_2005");
			   
			  for(int i=0;i<=sp05;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Speakers_2005", i, 0));
			}
			  
			  int pf05= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Performance_2005");
			   
			  for(int i=0;i<=pf05;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Performance_2005", i, 0));
			}
			  
			  int ex05= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Exhibition_2005");
			  
			  for(int i=0;i<=ex05;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Exhibition_2005", i, 0));
			}
			  
            int a15= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Awards_2015");
			  
			  for(int i=0;i<=a15;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Awards_2015", i, 0));
			}
			  
             int ara12= Excel.getRowCount("./scenario/updatevalue.xlsx/", "Acharya_ratnananda_awards_2012");
			  
			  for(int i=0;i<=ara12;i++)
			  {
				 letter.add(Excel.getCellValue("./scenario/updatevalue.xlsx/", "Acharya_ratnananda_awards_2012", i, 0));
			}
			  
			  //Acharya_ratnananda_awards_2012
			  System.out.println(letter.size());
			  for(String one:letter)
			  {
				  System.out.println(one);
				  
				 // Excel.updateValue(one, letter.size());
			  }
	}

}
