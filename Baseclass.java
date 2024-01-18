package Sources;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	protected static ExtentReports report;
	public	static WebDriver driver;
	public static ExtentTest test;

	@BeforeTest
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "Extentreport.html");
	}

	public static String takeSnapShot() throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedScreenshots/" + dateName + "qwerty.png";
		File DestFile = new File(destination);
		FileUtils.copyFile(source, DestFile);
		return destination;
	}

	public static void invoke() throws Throwable {

		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			Thread.sleep(5000);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DE-LT\\eclipse-workspace\\indiaplay2\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(options);
			System.out.println("Browser is launched !");
			driver.manage().window().maximize();
			System.out.println("Url is passed!");
			driver.get("https://www.indiaplays.com/");
			Thread.sleep(5000);

			Thread.sleep(3000);
		} catch (Exception e)

		{
			e.getMessage();
		}
	}

	@AfterTest
	public static void endTest() {

		report.endTest(test);
		report.flush();
	}

}
	
	
	
