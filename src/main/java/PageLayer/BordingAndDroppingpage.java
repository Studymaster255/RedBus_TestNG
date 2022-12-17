package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.JavascriptExecutorMethods;
import UtilsLayer.UtilsClass;

public class BordingAndDroppingpage extends BaseClass {
	@FindBy(xpath="//span[text()='BOARDING POINT']")
	private WebElement bordingpoint;
	
	@FindBy(xpath="//span[text()='CIDCO']")
	private WebElement bordingoption;
	
	@FindBy(xpath="//span[text()='DROPPING POINT']")
	private WebElement droppingpoint;
	
	@FindBy(xpath="//span[text()='Wagholi']")
	private WebElement droppingoption;

	public BordingAndDroppingpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void bordingPoint() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutorMethods.clickOnElement(bordingoption);
		JavascriptExecutorMethods.clickOnElement(bordingpoint);
		
	}
	public void droppingPoint() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutorMethods.clickOnElement(droppingoption);
		JavascriptExecutorMethods.clickOnElement(droppingpoint);
		
	}
	
}
