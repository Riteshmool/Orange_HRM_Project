package orange.com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import orange.com.Testbase.Testbase;

public class ScreenshotCode extends Testbase {

	public ScreenshotCode() {
		PageFactory.initElements(driver, this);
	}

	public static void getScreenshot(String nameofscreenshot) {
		String path = "C:\\Ritesh all eclipse data\\Ritesh_ vclasses_data\\Set up\\eclipse_ide_2021_12\\eclipse_Workspace_2021_12\\Orange_HRM_Project\\Screenshots\\";
		TakesScreenshot take = (TakesScreenshot) driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File ff= new File(path+nameofscreenshot+".png"+System.currentTimeMillis());
		try {
			FileHandler.copy(src, ff);
		} catch (IOException e) {
			System.out.println("Page Not Found");
		}

	}
}
