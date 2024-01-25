package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_Signup extends VisionBaseClass {
	
	// Entering the values upto maximum limit
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
		// Validate by Entering same Name in  First name and Last name text fields
				@Test(priority = 2, enabled = true)
				public void testByEnteringSameNameInFirstAndLastnameFields() throws InterruptedException {

					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Jeya");
					pom.getSignUp(getDriver()).enterEmailAddress("jey12@vis.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");

				}
		
		// Validate by Entering same Name in  First name and Last name text fields
		@Test(priority = 3, enabled = true)
		 public void testByEnteringNumbersInFirstAndLastnameFields() throws InterruptedException {

			getDriver().get(baseURL);	
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("123456789");
					pom.getSignUp(getDriver()).enterLastName("74102589");
					pom.getSignUp(getDriver()).enterEmailAddress("del@vis.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInFirstname(), "Firstname accepts Numeric characters");
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInLastname(), "Lastname accepts Numeric characters");

			}		
		// Validate by Entering Dit(.) operator between Name in  First name and Last name text fields
		@Test(priority = 4, enabled = true)
		 public void testByEnteringDotOperatorBetweenNameInFirstAndLastnameFields() throws InterruptedException {

			getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya.sankar");
					pom.getSignUp(getDriver()).enterLastName("Jeya.vision");
					pom.getSignUp(getDriver()).enterEmailAddress("jey@vis.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
					
					pom.getSignUp(getDriver()).clickChangeEmail();
					Assert.assertNotEquals("Jeya.sankar", pom.getSignUp(getDriver()).getEnteredFirstName(), "First name accepts Dot(.) operators");
					Assert.assertNotEquals("Jeya.vision", pom.getSignUp(getDriver()).getEnteredFirstName(), "Last name accepts Dot(.) operators");


				}
		// Validate by Entering Only Special characters in  First name and Last name text fields
		@Test(priority = 5, enabled = true)
		 public void testByEnteringOnlySpecialCharactersInFirstAndLastnameFields() throws InterruptedException {

			getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("!@#$%^&*()_");
					pom.getSignUp(getDriver()).enterLastName(":{}+_/.,;''");
					pom.getSignUp(getDriver()).enterEmailAddress("special@chars.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc#$%123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInFirstname(), "Firstname accepts Special characters");
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInLastname(), "Lastname accepts Special characters");

				}
		// Validate by Entering Alpha Numeric Characters in  First name and Last name text fields
		@Test(priority = 6, enabled = true)
		public void testByEnteringAlphaNumericCharacterInFirstAndLastnameFields() throws InterruptedException {
			getDriver().get(baseURL);
			PageObjectManager pom = new PageObjectManager();

			pom.getHomePage(getDriver()).clickLogin();

			pom.getHomePage(getDriver()).clickSignUpButton();

			pom.getSignUp(getDriver()).enterFirstName("Jeya123");
			pom.getSignUp(getDriver()).enterLastName("Sankar789");
			pom.getSignUp(getDriver()).enterEmailAddress("jeya8@vis.com");
			pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
			pom.getSignUp(getDriver()).enterPassword("abc123");

			pom.getSignUp(getDriver()).clickSignup();
			Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
			
			pom.getSignUp(getDriver()).clickChangeEmail();
			Assert.assertNotEquals("Jeya123", pom.getSignUp(getDriver()).getEnteredFirstName(), "The First name accepts alpha numeric characters");
			Assert.assertNotEquals("Sankar789", pom.getSignUp(getDriver()).getEnteredLastName(), "The Last name accepts alpha numeric characters");
		}
		// Validate by Entering spaces between each aphabets in  First name and Last name text fields
				@Test(priority = 7, enabled = true)
				public void testByEnteringSpaceBetweenEachAlphabetsInFirstAndLastnameFields() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("J e y a ");
					pom.getSignUp(getDriver()).enterLastName("S a n k a r");
					pom.getSignUp(getDriver()).enterEmailAddress("jey96@vis.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
					
					pom.getSignUp(getDriver()).clickChangeEmail();
					Assert.assertEquals("J e y a ", pom.getSignUp(getDriver()).getEnteredFirstName(), "The First name does not accept spaces between each alphabet ");
					Assert.assertEquals("S a n k a r", pom.getSignUp(getDriver()).getEnteredLastName(), "The last name does not accept spaces between each alphabet");
			}
				// Validate by Entering an Email address without @ symbol
				@Test(priority = 8, enabled = true)
				public void testByEnteringEmailAddressWithoutAtSymbol() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeyvis.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(), "Email address is valid");
				}			
				// Validate by Entering an Email address without Dot(.) operator
				@Test(priority = 9, enabled = true)
				public void testByEnteringEmailAddressWithoutDotOperator() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jey@viscom");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(), "Email address is valid");
				}			
				// Validate by Entering an Email address without Domain name
				@Test(priority = 10, enabled = true)
				public void testByEnteringEmailAddressWithoutDomainName() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jey@.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(), "Email address is valid");
				}		
				// Validate by Entering only numbers in Email address 
				@Test(priority = 11, enabled = true)
				public void testByEnteringOnlyNumbersInEmailAddressField() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("784512033669@4125.7845");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(), "Email address is valid");
				}		
				// Validate by Entering Alpha numeric characters Before Domain name in Email address 
				@Test(priority = 12, enabled = true)
				public void testByEnteringAlphaNumericBeforeDomainInEmailAddressField() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya34@gmail.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					synchronized (driver) {driver.wait(5000);}
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
			   }
				// Validate by Entering Email address with Two @ symbol
				@Test(priority = 13, enabled = true)
				public void testByEnteringEmailAddressWithTwoAtSymbols() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();
					synchronized (driver) {driver.wait(5000);}

					pom.getHomePage(getDriver()).clickLogin();
					synchronized (driver) {driver.wait(2000);}

					pom.getHomePage(getDriver()).clickSignUpButton();
					synchronized (driver) {driver.wait(2000);}

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya34@@gmail.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					synchronized (driver) {driver.wait(5000);}
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(), "Email address is valid");
				}
				// Validate by Entering  Email address with Leading and TailingDot(...) operators 
				@Test(priority = 14, enabled = true)
				public void testByEnteringEmailAddressWithTailingDotOperators() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya34@gmail...com");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(), "Email address is valid");
				}
				// Check the email id text box With the other domains (.com/.net/.org/.in)
				@Test(priority = 15, enabled = true)
				public void testByEnteringTheEmailidWithDomainNameDotNet() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya94@gmail.net");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				// Check the email id text box With the other domains (.com/.net/.org/.in)
				@Test(priority = 16, enabled = true)
				public void testByEnteringTheEmailidWithDomainNameDotOrg() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya96@govt.org");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				// Check the email id text box With the other domains (.com/.net/.org/.in)
				@Test(priority = 17, enabled = true)
				public void testByEnteringTheEmailidWithDomainNameDotIn() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya96@air.in");
					pom.getSignUp(getDriver()).enterMobileNumber("9025133078");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				// Check the mobile number field by entering the blank space between the number
				@Test(priority = 18, enabled = true)
				public void testByEnteringTheBlankSpaceBetweenMobileNumber() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya77@req.org");
					pom.getSignUp(getDriver()).enterMobileNumber("9 0 2 5 1 3 3 0 7 8");
					Assert.assertNotEquals("9025133078", "9 0 2 5 1 3 3 0 7 8", "Blank space accepted between number");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				// Check the mobile number field by entering the 10 "Zero" in the text box
				@Test(priority = 19, enabled = true)
				public void testByEnteringtenZerosInMobileNumberField() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jeya");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya77@req.org");
					pom.getSignUp(getDriver()).enterMobileNumber("0000000000");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayInvalidMessageInMobileNumber(),"Mobile Number accepts 10 Zeros");
				}			
				// Check the mobile number field by entering the special character
				@Test(priority = 20, enabled = true)
				public void testByEnteringSpecialCharactersInMobileNumberField() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya66@req.org");
					pom.getSignUp(getDriver()).enterMobileNumber("!@#$%^&*(]");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayErrorMessageInMobileNumber(),"Mobile Number accepts Special characters");
				}			
				// Check the mobile number field by entering the "0" at the initial place.
				@Test(priority = 21, enabled = true)
				public void testByEnteringZeroAtInitialPlaceInMobileNumberField() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya55@req.com");
					pom.getSignUp(getDriver()).enterMobileNumber("0698745123");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertTrue(pom.getSignUp(getDriver()).displayInvalidMessageInMobileNumber(),"Mobile Number accepts Zero at the initial Place");
				}			
				// Check whether search textfield allows user to type country name
				@Test(priority = 22, enabled = true)
				public void testByEnteringCountryName() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya42@gov.com");
					pom.getSignUp(getDriver()).enterMobileNumber("7698745123");
					pom.getSignUp(getDriver()).clickCountryCode();
					pom.getSignUp(getDriver()).clickCountryCodeSearchBox("India");
					pom.getSignUp(getDriver()).enterPassword("abc123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				
				
				
				// Check whether it accepts only special characters
				@Test(priority = 23, enabled = true)
				public void testByEnteringOnlySpecialCharactersInPassword() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya632@gov.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9998745123");
					pom.getSignUp(getDriver()).clickCountryCode();
					pom.getSignUp(getDriver()).clickCountryCodeSearchBox("India");
					pom.getSignUp(getDriver()).enterPassword("!@#$%^&*)<>?}{");
					pom.getSignUp(getDriver()).clickPassordEyeIcon();

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				// Check whether password textbox accepts only alphabet
				@Test(priority = 24, enabled = true)
				public void testByEnteringOnlyAlphabetsInPassword() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya812@gov.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9998745123");
					pom.getSignUp(getDriver()).enterPassword("ASDFHJK");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				//Check whether password accepts only numbers
				@Test(priority = 25, enabled = true)
				public void testByEnteringOnlyNumbersInPassword() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya963@gov.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9998745123");
					pom.getSignUp(getDriver()).enterPassword("789456123");

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				//Check whether it accepts combination of special characters/numbers/alphabet
				@Test(priority = 26, enabled = true)
				public void testByEnteringCobinationOfAllCharactersInPassword() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya105@gov.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9998745123");
					pom.getSignUp(getDriver()).enterPassword("Qwer@*456");
					pom.getSignUp(getDriver()).clickPassordEyeIcon();

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
				//Check whether space is counted as a character but not at the beginning and end of the password
				@Test(priority = 27, enabled = true)
				public void testSpaceCountedAsACharacterButNotAtTheBeginningAndEndofThePassword() throws InterruptedException {
					getDriver().get(baseURL);
					PageObjectManager pom = new PageObjectManager();

					pom.getHomePage(getDriver()).clickLogin();

					pom.getHomePage(getDriver()).clickSignUpButton();

					pom.getSignUp(getDriver()).enterFirstName("Jey");
					pom.getSignUp(getDriver()).enterLastName("Sankar");
					pom.getSignUp(getDriver()).enterEmailAddress("jeya105@gov.com");
					pom.getSignUp(getDriver()).enterMobileNumber("9998745123");
					pom.getSignUp(getDriver()).enterPassword("B o e r@ 45 6");
					pom.getSignUp(getDriver()).clickPassordEyeIcon();

					pom.getSignUp(getDriver()).clickSignup();
					Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");
				}			
	// Entering the values upto maximum limit
	@Test(priority = 28, enabled = true)
	public void testMaximumCharacterLimitationInSignupFields() throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		pom.getSignUp(getDriver()).testMaximumCharacterLimitationInSignupFields();

		pom.getSignUp(getDriver()).clickSignup();

	}

	// Entering the values minimum limit
	@Test(priority = 29, enabled = true)
	public void testMinimumCharacterLimitationInSignupFields() throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		pom.getSignUp(getDriver()).testMinimumCharacterLimitationInSignupFields();

		pom.getSignUp(getDriver()).clickSignup();

	}

	// Entering the values lesser than minimum limit
	@Test(priority = 30, enabled = true)
	public void testLessThanMinimumCharacterLimitationInSignupFields() throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		pom.getSignUp(getDriver()).testLessThanMinimumCharacterLimitationInSignupFields();

		pom.getSignUp(getDriver()).clickSubmit2();

	}

	// Entering the values greater than maximum limit
	@Test(priority = 31, enabled = true)
	public void testGreaterThanMaximumCharacterLimitationInSignupFields() throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		pom.getSignUp(getDriver()).testGreaterThanMaximumCharacterLimitationInSignupFields();

		pom.getSignUp(getDriver()).clickSignup();

	}

	@Test(dataProvider = "SignUpWithExistingUsertData", priority = 32, enabled = true)
	public void signUpWithExistingUserEmailAddress(String firstName, String lastName, String email, String mobileNumber,String password) throws InterruptedException {


		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		// Find the input fields and enter the data
		pom.getSignUp(getDriver()).enterFirstName(firstName);

		pom.getSignUp(getDriver()).enterLastName(lastName);

		pom.getSignUp(getDriver()).enterEmailAddress(email);

		pom.getSignUp(getDriver()).enterMobileNumber(mobileNumber);

		pom.getSignUp(getDriver()).enterPassword(password);

		pom.getSignUp(getDriver()).clickSignup();

		Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmailForExistingUser());

	}

	@Test(dataProvider = "SignUpWithSameEmailData", priority = 33, invocationCount = 5, enabled = true)  // invocationTimeOut = 10000,  threadPoolSize = 2,
	public void signUpWithSameEmailForFiveTimes(String firstName, String lastName, String email,String mobileNumber, String password) throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		// Find the input fields and enter the data
		pom.getSignUp(getDriver()).enterFirstName(firstName);

		pom.getSignUp(getDriver()).enterLastName(lastName);

		pom.getSignUp(getDriver()).enterEmailAddress(email);

		pom.getSignUp(getDriver()).enterMobileNumber(mobileNumber);

		pom.getSignUp(getDriver()).enterPassword(password);

		pom.getSignUp(getDriver()).clickSignup();

		Assert.assertEquals("Enter the verification code",pom.getSignUp(getDriver()).checkOTPWindowTitle(),"Sign up button not clicked");

		pom.getSignUp(getDriver()).clickChangeEmail();

		}

	@Test(dataProvider = "SignUpWithSameEmailData",invocationCount = 2, priority = 34, enabled = true)
	public void signUpAfterFifthTimeWithSameEmail(String firstName, String lastName, String email,String mobileNumber, String password) throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		// Find the input fields and enter the data
		pom.getSignUp(getDriver()).enterFirstName(firstName);

		pom.getSignUp(getDriver()).enterLastName(lastName);

		pom.getSignUp(getDriver()).enterEmailAddress(email);

		pom.getSignUp(getDriver()).enterMobileNumber(mobileNumber);

		pom.getSignUp(getDriver()).enterPassword(password);

		pom.getSignUp(getDriver()).clickSignup();

		Assert.assertTrue(pom.getSignUp(getDriver()).displayLimitExceededErrorMessage());


	}

	/*
	 * Testing on sign up without firstname, lastname, email, mobile number and password
	 * Sign up with valid data
	 */

	@Test(dataProvider = "SignUpWithDataAndWithoutData", priority = 35, enabled = true)
	public void signUpForMissingFieldAndValidData(String firstName, String lastName, String email, String mobileNumber,String password) throws InterruptedException {

		getDriver().get(baseURL);
		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();

		pom.getHomePage(getDriver()).clickSignUpButton();

		// Find the input fields and enter the data
		pom.getSignUp(getDriver()).enterFirstName(firstName);

		pom.getSignUp(getDriver()).enterLastName(lastName);

		pom.getSignUp(getDriver()).enterEmailAddress(email);

		pom.getSignUp(getDriver()).enterMobileNumber(mobileNumber);

		pom.getSignUp(getDriver()).enterPassword(password);

		pom.getSignUp(getDriver()).clickSignup();

		// Perform assertions based on the test case
		if (!firstName.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !mobileNumber.isEmpty() && !password.isEmpty()) {
			// Verify that the sign-up was successful
			Assert.assertTrue(pom.getSignUp(getDriver()).displayVerificationOTPwindow(), "OTP verification Window is not displayed");
			
		} else if (firstName.isEmpty() && lastName.isEmpty() && email.isEmpty() && mobileNumber.isEmpty() && password.isEmpty()) {
			pom.getSignUp(getDriver()).getAllValidationMessage();

		} else if (firstName.isEmpty()) {
			// Verify the appropriate validation message is displayed for missing firstname
			Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInFirstname(),"Validation message for missing First name is not displayed");

		} else if (lastName.isEmpty()) {
			// Verify the appropriate validation message is displayed for missing lastname
			Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInLastname(),"Validation message for missing Last name  is not displayed");

		} else if (email.isEmpty()) {
			// Verify the appropriate validation message is displayed for missing Email
			Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInEmail(),"Validation message for missing Email Address is not  displayed");

		} else if (mobileNumber.isEmpty()) {
			// Verify the appropriate validation message is displayed for missing Mobile number
			Assert.assertTrue(pom.getSignUp(getDriver()).displayValidationMessageInMobileNumber(),"Validation message for missing Mobile number  is not displayed");

		} else if (password.isEmpty()) {
			// Verify the appropriate validation message is displayed for missing password
			Assert.assertTrue(pom.getSignUp(getDriver()).passwordValidationMsg.isDisplayed(),"Validation message for missing Password is not displayed");

		}
	}
}