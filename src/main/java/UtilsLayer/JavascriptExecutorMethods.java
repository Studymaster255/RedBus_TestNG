package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavascriptExecutorMethods extends BaseClass{
	protected static JavascriptExecutor js;
	public static void scrollDownUpToElement(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
	}
	public static void clickOnElement(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", wb);
	}
	public static void sendData(WebElement wb,String value)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+value+"';", wb);
	}
	
	
	
		
	}


