package UtilsLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DatePicker extends BaseClass {
	
	public void date_month_year(WebElement _calender,String month_year_,String date)
	{
		_calender.click();
		while(true)
		{
			String b =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			//System.out.println(b);
			if(b.equals(month_year_))
			{
				break;
			}else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}	
		}
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[text()='"+date+"']")).click();
	}

}
