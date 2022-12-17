package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClassMethods extends BaseClass {
	
	protected static Actions act=new Actions(driver);
	
	public static void clickOnElement(WebElement wb)
	{
		act.click(wb).build().perform();
	}
	public static void doubleClickOnElement(WebElement wb)
	{
		act.doubleClick(wb).build().perform();
	}
	public static void contextClickOnElement(WebElement wb)
	{
		act.contextClick(wb).build().perform();
	}
	public static void clickAndHold(WebElement wb)
	{
		act.clickAndHold(wb).build().perform();
	}
	public void dragAndDrop(WebElement src,WebElement dest)
	{
		act.dragAndDrop(src,dest).build().perform();
	}
	public static void moveToElement(WebElement wb)
	{
		act.moveToElement(wb).build().perform();
	}
	public static void releseElementAtLocation(WebElement wb)
	{
		act.release(wb).build().perform();
	}
	public static void relese()
	{
		act.release().build().perform();
	}
	public static void moveToElementByOffset(WebElement wb,int width,int hight)
	{
		act.moveToElement(wb).moveByOffset(width, hight).click().build().perform();
	}
	
	
	
}
