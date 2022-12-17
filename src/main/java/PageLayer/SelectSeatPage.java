package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.ActionClassMethods;
import UtilsLayer.UtilsClass;

public class SelectSeatPage extends BaseClass {
	
	@FindBy(xpath="(//div[text()='View Seats'])[1]")
	private WebElement viewseat;
	
	@FindBy(xpath="(//canvas[@width='419'])[1]")
	private WebElement lower;
	
	public SelectSeatPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnViewSeat()
	{
		UtilsClass.clickOnElement(viewseat);
	}
	
	public void clickOnSelectSeat()
	{
	//	ActionClassMethods act=new ActionClassMethods();
		ActionClassMethods.moveToElementByOffset(lower, -50, -45);
//		  String ToolTipText = lower.getText();
//		   System.out.println("Tooltip value is: " + ToolTipText);
	}
	
	

}
