package PageLayer;

import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.JavascriptExecutorMethods;



public class ResultBusesPage extends BaseClass {
	public static int i;
	JavascriptExecutorMethods jse=new JavascriptExecutorMethods();
	@FindBy(xpath="//span[@class='f-bold busFound']")
	private WebElement totalbuses;
	protected int buscount;
	protected LinkedList totalAvalableBusName;
	
	
//	@FindBy(xpath="(//div[@class='travels lh-24 f-bold d-color'])["+i+"]")
//	private WebElement nameofbuses;
	
	public ResultBusesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String AllBuses() throws InterruptedException
	{
//		JavascriptExecutorMethods jse=new JavascriptExecutorMethods();
//		jse.scrollDownUpToElement(nameofbuses);
		Thread.sleep(1000);
		String a=totalbuses.getText();
		char ch[]=a.toCharArray();
	       
		for(int i=0 ;i<ch.length-1;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				buscount=ch[i];
			}
		}
		System.out.println(buscount);
		return totalbuses.getText();
	}
	
//	public String nameOfAllBuses()
//	{
//		for(i=0;i<=100;i++)
//		{
//			JavascriptExecutorMethods.scrollDownUpToElement(nameofbuses);
//			return nameofbuses.getText();
//		}
//		return null;
//	}
	
	public String nameOfAllBuses() throws InterruptedException
	{JavascriptExecutorMethods jsm=new JavascriptExecutorMethods();
	totalAvalableBusName=new LinkedList();
	for(int i=1;i<=buscount;i++)
	{
		//Thread.sleep(500);
		WebElement buses=driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])["+i+"]"));
		JavascriptExecutorMethods.scrollDownUpToElement(buses);
		
		totalAvalableBusName.add(buses.getText());
		System.out.println("Bus Name "+i+"="+buses.getText());
	}
		//System.out.println(ls);
		return null;
	}
	
	
	
}
