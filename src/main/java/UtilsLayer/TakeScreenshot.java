package UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakeScreenshot extends BaseClass {

	protected static TakesScreenshot ts = (TakesScreenshot)driver;
	
	protected static CurruntDateAndTime cdat=new CurruntDateAndTime();
	protected static String a=cdat.curruntdatetime();
	public static void passedscreenshot()
	{
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\Itsme\\eclipse-workspace\\RedBus_TestNG\\PassedScreenshot\\"+a+".png");
		try {
			FileUtils.copyFile(src, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void failedscreenshot()
	{
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\Itsme\\eclipse-workspace\\RedBus_TestNG\\FailedScreenshot\\"+a+".png");
		try {
			FileUtils.copyFile(src, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void screenshot()
	{
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\Itsme\\eclipse-workspace\\RedBus_TestNG\\PassedScreenshot\\ss"+a+".png");
		try {
			FileUtils.copyFile(src, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String takeScreenshot(String methodname)
	{
	File src=ts.getScreenshotAs(OutputType.FILE);
	String path="C:\\Users\\Itsme\\eclipse-workspace\\RedBus_TestNG\\PassedScreenshot\\ss"+methodname+a+".png";
	File dist=new File(path);
	try {
		FileUtils.copyFile(src, dist);
	} catch (IOException e) {
		e.printStackTrace();
	}
		return path;
	}
	
	
	
}
