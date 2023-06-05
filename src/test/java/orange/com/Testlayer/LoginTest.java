package orange.com.Testlayer;

import org.testng.annotations.Test;

import orange.com.Testbase.Testbase;

public class LoginTest extends Testbase{
	
	@Test
	public void verifyLogin() throws InterruptedException {
		login.setUsername();
		Thread.sleep(3000);
		login.setPassword();
	}

}
