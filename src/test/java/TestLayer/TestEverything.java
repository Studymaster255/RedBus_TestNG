package TestLayer;

import BaseLayer.BaseClass;
import UtilsLayer.CurruntDateAndTime;
import UtilsLayer.TakeScreenshot;

public class TestEverything extends BaseClass {
	
	
	
//	public void test() {
//		BaseClass.initilization();
//	}
	
	public static void main(String[] args) throws InterruptedException {
		
		String a="556hjsadgff464 Buses";
		int b;
		String s="hjgu8$47f5&^%$";
		char ch[]=a.toCharArray();
       
		for(int i=0 ;i<ch.length-1;i++)
		
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]);

			}
			
		}	

		
		
	}

}
