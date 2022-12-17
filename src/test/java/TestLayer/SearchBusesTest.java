package TestLayer;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.SearchBusesPage;
import UtilsLayer.JavascriptExecutorMethods;


@Test(groups= {"searchbuses","endtoend"})
public class SearchBusesTest extends BaseClass {
	public static SearchBusesPage searchbusespage;
	
	
	@Test(priority=1)
	public void setup() throws InterruptedException
	{
		BaseClass.initilization();
		//Thread.sleep(5000);
	}
	@Test(priority=2)
	public void searchBuses()
	{
		searchbusespage=new SearchBusesPage();
		searchbusespage.enterFrom(prop.getProperty("FROM"));
		searchbusespage.enterTo(prop.getProperty("TO"));
	}
	
	@Test(priority=3)
	public void selectDate()
	{
		searchbusespage.selectDate(prop.getProperty("Month_Year"), prop.getProperty("date"));
	}
	
	@Test(priority=4)
	public void search()
	{
		searchbusespage.clickOnSearch();
	}
	
//	@Test(priority=5)
//	public void buses()
//	{
//		System.out.println("total buses="+driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
//	}
//	@Test(priority=6)
//	public void busesName() throws InterruptedException
//	{
//		JavascriptExecutorMethods jsm=new JavascriptExecutorMethods();
//		for(int i=1;i<=97;i++)
//		{
//			Thread.sleep(500);
//			WebElement buses=driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])["+i+"]"));
//			JavascriptExecutorMethods.scrollDownUpToElement(buses);
//			System.out.println("Bus Name "+buses.getText());
//		}
//	}

}
