package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class SignupRandomTest extends VisionBaseClass {

	@Test
	public void signupRanfomTestMethod() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click login button in home screen

		pom.getSignupRandomPage(getDriver()).clicLoginButtonHomeScreen();

		// click new user in sing up screen

		pom.getSignupRandomPage(getDriver()).clickNewUserButtonLoginScreen();


		// verification of first & last name text field

		pom.getSignupRandomPage(getDriver()).moreThan50Name();

		// password verification

		pom.getSignupRandomPage(getDriver()).autoCreatePasswordVerify();




	}
}
