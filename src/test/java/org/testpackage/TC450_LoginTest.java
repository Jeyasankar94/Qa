package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC450_LoginTest extends VisionBaseClass {
	
	// verify login screen contains  image, welcome back text, email, password, forgot password, login submit, google, facebook, new user, signup for free
		@Test(priority = 1, enabled = true)
		public void testLabels() throws InterruptedException {

			getDriver().get(baseURL);
			PageObjectManager pom = new PageObjectManager();

			pom.getHomePage(getDriver()).clickLogin();

			pom.getHomePage(getDriver()).clickSignUpButton();

			pom.getSignUp(getDriver()).checkTitleOfSignUpPage();
			
			Assert.assertEquals("Welcome!", pom.getSignUp(getDriver()).validateTitleOfSignUpPage());
			
			Assert.assertEquals("First Name*", pom.getSignUp(getDriver()).validateLabelOfFirstnameTextboxInSignUpPage(), "Incorrect Label for Firstname");
			Assert.assertEquals("Last Name*", pom.getSignUp(getDriver()).validateLabelOfLastnameTextboxInSignUpPage(), "Incorrect Label for Lastname");
			Assert.assertEquals("Email address*", pom.getSignUp(getDriver()).validateLabelOfEmailTextboxInSignUpPage(), "Incorrect Label for Email");
			Assert.assertEquals("Mobile Number*", pom.getSignUp(getDriver()).validateLabelOfMobileNumberTextboxInSignUpPage(), "Incorrect Label for Mobile Number");
			Assert.assertEquals("Password*", pom.getSignUp(getDriver()).validateLabelOfPasswordTextboxInSignUpPage(), "Incorrect Label for Password");

			pom.getSignUp(getDriver()).clickSignup();

		}
		
		
		
}