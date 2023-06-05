package orange.com.Testlayer;

import org.testng.annotations.Test;

import orange.com.Testbase.Testbase;

public class AdminTest extends Testbase{
	
	@Test
	public void verifyAdminPage() throws InterruptedException {
		login.setUsername();
		logger.info("set username successfully");
		Thread.sleep(3000);
		login.setPassword();
		logger.info("set password successfully");
		Thread.sleep(3000);
		login.clickLogin();
		logger.info("login successfully");
		Thread.sleep(5000);
		admin.clickAdmin();
		logger.info("click on admin successfully");
		Thread.sleep(3000);
		admin.setAdmUsername();
		logger.info("set admin username successfully");
		Thread.sleep(3000);
		admin.clickUserRole();
		logger.info("click on user role successfully");
		Thread.sleep(10000);
		admin.setAdmin();
		logger.info("select admin successfully");
		Thread.sleep(6000);
		admin.setEmployee();
		logger.info("set employeename successfully");
		Thread.sleep(5000);
		admin.clickStatus();
		logger.info("click on status successfully");
		Thread.sleep(5000);
		admin.selectstatus();
		logger.info("select status  successfully");
		Thread.sleep(5000);
		admin.clickSearch();
		logger.info("click on search successfully");
		Thread.sleep(5000);
		
	}

}
