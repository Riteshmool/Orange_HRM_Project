package orange.com.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import orange.com.Testbase.Testbase;

public class LoginTest extends Testbase{
	
	@Test
	public void verifyLogin() throws InterruptedException {
		login.setUsername();
		logger.info("set username successfully");
		Thread.sleep(5000);
		login.setPassword();
		logger.info("set password successfully");
		Thread.sleep(5000);
		login.clickLogin();
		logger.info("click login button successfully");
	    Thread.sleep(5000);
		String exp_st="Dashboard";
		Assert.assertEquals(login.verifyLoginStatus(), exp_st);
		logger.info("login successfully");
		Thread.sleep(5000);
	}

}
