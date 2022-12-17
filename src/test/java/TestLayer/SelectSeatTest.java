package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.SelectSeatPage;

public class SelectSeatTest extends BaseClass {
	public static SelectSeatPage selectseatpage;
	
	@Test(priority=1)
	public void click_on_view_seat()
	{
		selectseatpage=new SelectSeatPage();
		selectseatpage.clickOnViewSeat();
	}
	
	@Test(priority=2)
	public void click_on_select_seat()
	{
		selectseatpage.clickOnSelectSeat();
	}
	
	
}
