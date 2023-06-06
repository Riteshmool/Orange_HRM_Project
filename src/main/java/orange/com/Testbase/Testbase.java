package orange.com.Testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import orange.com.Pagelayer.AdminPage;
import orange.com.Pagelayer.LoginPage;

public class Testbase {

	public static WebDriver driver;
	public static Logger logger;
	public static Properties prop;
	public LoginPage login;
	public AdminPage admin;

	@BeforeClass
	public void started() {
		logger = Logger.getLogger("Orange HRM project");
		PropertyConfigurator.configure("Log4j");
		logger.info("FREAMWORK EXECUTION START");
	}

	@AfterClass
	public void stopped() {
		logger.info("FREAMWORK EXECUTION STOP");
	}

	@Parameters("Browser")
	@BeforeMethod
	public void setBrowser(String br) throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Ritesh all eclipse data\\Ritesh_ vclasses_data\\Set up\\eclipse_ide_2021_12\\eclipse_Workspace_2021_12\\Orange_HRM_Project\\GetData\\PropertiesFile.properties");
		prop.load(fis);

		if (br.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (br.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));

		login = new LoginPage();
		admin = new AdminPage();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
