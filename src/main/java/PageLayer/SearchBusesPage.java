package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.DatePicker;
import UtilsLayer.UtilsClass;

public class SearchBusesPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='src']")
	private WebElement from;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement to;
	
	@FindBy(xpath="(//i[@class='icon solr-icon icon-ic-area'])[1]")
	private WebElement pickuppoint;
	
	@FindBy(xpath="(//i[@class='icon solr-icon icon-ic-area'])[4]")
	private WebElement droppoint;
	
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement calender;
	
	@FindBy(xpath="//button[text()='Search Buses']")
	private WebElement search;
	
	public SearchBusesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterFrom(String source_city)
	{
		UtilsClass.enterData(from, source_city);
		UtilsClass.clickOnElement(pickuppoint);
	}
	
	public void enterTo(String dest_city)
	{
		UtilsClass.enterData(to, dest_city);;
		UtilsClass.clickOnElement(droppoint);
	}
	public void selectDate(String Month_Year,String date)
	{
		DatePicker datepicker=new DatePicker();
		datepicker.date_month_year(calender, Month_Year, date);
	}
	public void clickOnSearch() {
		UtilsClass.clickOnElement(search);
	}
	
	
	
	
	

}
