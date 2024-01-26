package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC050_ForgotPassword extends VisionBaseClass {
	
	
	//Verify after pressing forgot button user should be redirected to the forget password page.
	@Test(priority = 1, enabled = true)
	public void testTitleOfForgotPasswordWindow() throws Exception {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info("clicked Login button in HomePage");

		pom.getForgotPasswordPage(getDriver()).clickForgotPassword();
		extentTest.info("clicked Forgot password");

		Assert.assertTrue(pom.getForgotPasswordPage(getDriver()).displayForgotPasswordTitle(), "Forgot password screen not displayed");
		
	}
	//Verify user enters the valid email and clicks on the continue button.
		@Test(priority = 2, enabled = true)
		public void testByEnteringValidEmailAddress() throws Exception {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();

			pom.getHomePage(getDriver()).clickLogin();
			extentTest.info("clicked Login button in HomePage");

			pom.getForgotPasswordPage(getDriver()).clickForgotPassword();
			extentTest.info("clicked Forgot password");
			
			pom.getForgotPasswordPage(getDriver()).enterEmail("jeyasankar88@habenwir.com");

			pom.getForgotPasswordPage(getDriver()).clickContinue();

			Assert.assertTrue(pom.getForgotPasswordPage(getDriver()).displayTextofUpdatePasswordScreen(), "Update password screen is not displayed");
			
		}
		//Verify user enters invalid email and clicks on the continue button.
				@Test(priority = 3, enabled = true)
				public void testByEnteringInValidEmailAddress() throws Exception {

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info("clicked Login button in HomePage");

					pom.getForgotPasswordPage(getDriver()).clickForgotPassword();
					extentTest.info("clicked Forgot password");
					
					pom.getForgotPasswordPage(getDriver()).enterEmail("jeyasankar20@habenwir.");

					pom.getForgotPasswordPage(getDriver()).clickContinue();

					Assert.assertTrue(pom.getForgotPasswordPage(getDriver()).displayValidationMessageAtEmail(), "Invalid Email  is Accepted");
					
				}
				//Verify user enters non registered email and it shows error message
				@Test(priority = 4, enabled = true)
				public void testByEnteringNonRegisteredEmailAddress() throws Exception {

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info("clicked Login button in HomePage");

					pom.getForgotPasswordPage(getDriver()).clickForgotPassword();
					extentTest.info("clicked Forgot password");
					
					pom.getForgotPasswordPage(getDriver()).enterEmail("jeyasankar123@visionias.in");

					pom.getForgotPasswordPage(getDriver()).clickContinue();

			//		Assert.assertFalse(pom.getForgotPasswordPage(getDriver()).displayTextofUpdatePasswordScreen(), "Update password screen is displayed");					
				}	
				//Verify without entering email , continue button should be disabled
				@Test(priority = 5, enabled = true)
				public void testWithoutEmailAddress() throws Exception {

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info("clicked Login button in HomePage");

					pom.getForgotPasswordPage(getDriver()).clickForgotPassword();
					extentTest.info("clicked Forgot password");
					
					pom.getForgotPasswordPage(getDriver()).enterEmail("");

					pom.getForgotPasswordPage(getDriver()).clickContinue();

					Assert.assertTrue(pom.getForgotPasswordPage(getDriver()).displayValidationMessageForEmailRequired(), "Without Email user can navigate to Update password page");
					
				}
	//Verify after clicking continue, OTP is sent to the given email			
	@Test(priority = 6, enabled = true)
	public void testOTP() throws Exception {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info("clicked Login button in HomePage");

		pom.getForgotPasswordPage(getDriver()).clickForgotPassword();
		extentTest.info("clicked Forgot password");

		pom.getForgotPasswordPage(getDriver()).enterEmail("jeyasankar20@habenwir.com");

		pom.getForgotPasswordPage(getDriver()).clickContinue();

		pom.getForgotPasswordPage(getDriver()).clickResendPassword();

		pom.getForgotPasswordPage(getDriver()).enterOTP();

		pom.getForgotPasswordPage(getDriver()).enterPassword("Jsankar123");

		pom.getForgotPasswordPage(getDriver()).enterConfirmPassword("Jsankar123");


		pom.getForgotPasswordPage(getDriver()).clickUpdate();
		
		Assert.assertTrue(pom.getForgotPasswordPage(getDriver()).displayOTPValidationMessage(), "Invalid OTP is  accepted");
}
}