package TestLayer;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ResultBusesPage;

public class ResultBusesTest extends BaseClass {
	public static ResultBusesPage resultbusespage;
	
	@Test(priority=1)
	public void countOfAllBuses() throws InterruptedException
	{
		resultbusespage=new ResultBusesPage();
		System.out.println(resultbusespage.AllBuses());
	}
	
	@Test(priority=2)
	public void nameofallbuses() throws InterruptedException
	{
		System.out.println(resultbusespage.nameOfAllBuses());
	}

}
