package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScriptmethods extends BaseClass{
	
	protected static JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public static void enterData(WebElement wb,String value)
	{
		js.executeScript("arguments[0].value='"+value+"';", wb);
	}
	public static void alertPop(String argument)
	{
		js.executeScript("alert('"+argument+"');");
	}
	public static void confirmPop(String argument)
	{
		js.executeScript("confirm('"+argument+"');");
	}
	public static void promptPop(String argument)
	{
		js.executeScript("prompt('"+argument+"');");
	}
	public static void openBrowser(String url)
	{
		js.executeScript("window.location=('"+url+"');");
	}
	public static void navigateBack(int back)
	{
		js.executeScript("history.go(-"+back+");");
	}
	public static void navigateForward(int forward)
	{
		js.executeScript("history.go(+"+forward+");");
	}
	public static void refresh()
	{
		js.executeScript("history.go(0);");
	}
	public static String captureTitle()
	{
		return js.executeScript("return document.title;").toString();
	}
	public static String captureUrl()
	{
		return js.executeScript("return document.URL;").toString();
	}
	public static String captureSourceCode()
	{
		return js.executeScript("return document.documentElement.innerHTML;").toString();
	}
	public static String captureInnerText()
	{
		return js.executeScript("return document.documentElement.innerText;").toString();
	}

}
