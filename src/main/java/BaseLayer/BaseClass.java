package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static Properties prop;
	protected static WebDriver driver;
	
	public BaseClass(){
		prop=new Properties();
		try
		{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")
				+"//src//main/java/ConfigLayer/config.properties");
		prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void initilization() {
		if(prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}else if(prop.getProperty("browser").equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		}
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
//	ChromeOptions opt =new ChromeOptions();
//	opt.addArguments("--headless");
	
	
	}
	}

