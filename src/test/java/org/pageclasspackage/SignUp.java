package org.pageclasspackage;

import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class SignUp extends VisionBaseClass {

	WebDriver driver;
	public SignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Welcome!']")
	private WebElement welcometext;
	
	@FindBy(xpath = "//label[text()='First Name*']")
	private WebElement labelFirstname;
	
	@FindBy(xpath = "//label[text()='Last Name*']")
	private WebElement labelLastname;
	
	@FindBy(xpath = "//label[text()='Email address*']")
	private WebElement labelEmail;
	
	@FindBy(xpath = "//div[text()='Mobile Number*']")
	private WebElement labelMobileNumber;
	
	@FindBy(xpath = "//label[text()='Password*']")
	private WebElement labelPassword;

	@FindBy(xpath = "//input[@id='formGridFirstName']")
	private WebElement firstnametext;

	@FindBy(xpath = "//div[text()='First name is required']")
	public WebElement firstnameValidationMsg;

	@FindBy(xpath = "//input[@id='formGridLastName']")
	private WebElement lastnametext;

	@FindBy(xpath = "//div[text()='Last name is required']")
	public WebElement lastnameValidationMsg;

	@FindBy(xpath = "//input[@id='formGridEmail']")
	private WebElement emailtext;

	@FindBy(xpath = "//div[text()='Email Id is required']")		//*[text()='Email Id is required']
	public WebElement emailValidationMsg;

	@FindBy(xpath = "//*[text()='Please enter a valid email address.']")
	public WebElement emailInvalidMsg;

	@FindBy(xpath = "//*[@class='md:flex md:w-full ']/div/form/div[4]/div/div/div/input")
	private WebElement mobilenumbertext;

	@FindBy(xpath = "//div[text()='Mobile Number required']")
	public WebElement mobilenumValidationMsg;

	@FindBy(xpath = "//div[text()='Please enter a valid mobile number.']")
	public WebElement mobilenumInvalidMsg;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/div/div/div")
	public WebElement countryCodeAndFlag;

	@FindBy(xpath = "//*[@class='flag-dropdown open ']/ul/li/input")
	public WebElement searchCountryCode;
	
	@FindBy(xpath = "//*[text()='India']")
	public WebElement india;

	@FindBy(xpath = "//input[@id='formGridPassword']")
	private WebElement passWord;
	
	@FindBy(xpath = "//img[@src='/icons/hidepassword.svg']")
	private WebElement passWordEyeIcon;

	@FindBy(xpath = "//div[@class='row']/div/div/div/span")
	public WebElement passwordValidationMsg;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signupBtn;

	@FindBy(xpath = "//h4[text()='Enter the verification code']")
	public WebElement verificationOTPwindow;

	@FindBy(xpath = "(//*[@class='flex justify-center items-center']/div/input)[1]")
	private WebElement enterOTP1;
	@FindBy(xpath = "(//*[@class='flex justify-center items-center']/div/input)[2]")
	private WebElement enterOTP2;
	@FindBy(xpath = "(//*[@class='flex justify-center items-center']/div/input)[3]")
	private WebElement enterOTP3;
	@FindBy(xpath = "(//*[@class='flex justify-center items-center']/div/input)[4]")
	private WebElement enterOTP4;
	@FindBy(xpath = "(//*[@class='flex justify-center items-center']/div/input)[5]")
	private WebElement enterOTP5;
	@FindBy(xpath = "(//*[@class='flex justify-center items-center']/div/input)[6]")
	private WebElement enterOTP6;

	@FindBy(xpath = "//span[text()='Verify']")
	private WebElement verifyBtn;

	@FindBy(xpath = "//span[text()='Resend']")
	private WebElement resendBtn;

	@FindBy(xpath = "//span[text()='Change Email ID ?']")
	public WebElement changeEmail;

	@FindBy(xpath = "//span[text()='Limit Exceeded Please try again after sometime.']")
	private WebElement limitExceed;

	@FindBy(xpath = "//span[text()='Email address already exists. Please try a different one.']")
	private WebElement emailValidMsgForExistingUser;
	
	
	// Check Title of the Sign Up Window
	public SignUp checkTitleOfSignUpPage() throws InterruptedException {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(welcometext));
	    
		welcometext.click();
		extentTest.info(welcometext.getText());
		return this;
	}
	// Check Title of the Sign Up Window
		public String validateTitleOfSignUpPage() throws InterruptedException {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(welcometext));
		    
			return welcometext.getText();
		}
		// Check First name Label of the Sign Up Window
		public String validateLabelOfFirstnameTextboxInSignUpPage() throws InterruptedException {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(labelFirstname));
		    
			extentTest.info(labelFirstname.getText());
			return labelFirstname.getText();
		}
		// Check Last name Label of the Sign Up Window
		public String validateLabelOfLastnameTextboxInSignUpPage() throws InterruptedException {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(labelLastname));
		    
			extentTest.info(labelLastname.getText());
			return labelLastname.getText();
		}
		// Check Email Address Labels of the Sign Up Window
		public String validateLabelOfEmailTextboxInSignUpPage() throws InterruptedException {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(labelEmail));
		    
			extentTest.info(labelEmail.getText());
			return labelEmail.getText();
		}
		// Check Mobile Number Label of the Sign Up Window
		public String validateLabelOfMobileNumberTextboxInSignUpPage() throws InterruptedException {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(labelMobileNumber));
		    
			extentTest.info(labelMobileNumber.getText());
			return labelMobileNumber.getText();
		}
		// Check Password Label of the Sign Up Window
		public String validateLabelOfPasswordTextboxInSignUpPage() throws InterruptedException {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(labelPassword));
		    
			extentTest.info(labelPassword.getText());
			return labelPassword.getText();
		}
	// Entering First name in the text box
	public SignUp enterFirstName(String firstName) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(firstnametext));
		
		firstnametext.sendKeys(firstName);
		String val = firstnametext.getAttribute("value");
		// extentTest.info("Random generated First Name : " + firstName.length());
		extentTest.info("Entered First Name : " + val);
		extentTest.info("Entered First Name Length : " + val.length());
		return this;
	}
	// Getting First name in the text box
	public String getEnteredFirstName() {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(firstnametext));
	    
		return firstnametext.getAttribute("value");
	}

	// Entering last name in the text box
	public SignUp enterLastName(String lastName) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(lastnametext));
	    
		lastnametext.sendKeys(lastName);
		String val = lastnametext.getAttribute("value");
		extentTest.info("Entered Last Name : " + val);
		extentTest.info("Entered Last Name Length : " + val.length());
		return this;
	}
	// Getting Last name in the text box
		public String getEnteredLastName() {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(lastnametext));
		    
			return lastnametext.getAttribute("value");
		}

	// Entering Email in the text box
	public SignUp enterEmailAddress(String emailId) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(emailtext));
	    
		emailtext.sendKeys(emailId);
		String val = emailtext.getAttribute("value");
		extentTest.info("Entered Email Address : " + val);
		extentTest.info("Entered Email Id Length : " + val.length());
		return this;
	}

	// Entering mobile number in the text box
	public SignUp enterMobileNumber(String mobNum) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(mobilenumbertext));
	    
		mobilenumbertext.sendKeys(mobNum);
		String val = mobilenumbertext.getAttribute("value");
		extentTest.info("Entered Mobile Number : " + val);
		extentTest.info("Entered Mobile Number Length : " + val.length());
		return this;
	}

	// Entering Password in the text box
	public SignUp enterPassword(String pwd) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(passWord));
	    
		passWord.sendKeys(pwd);
		String val = passWord.getAttribute("value");
		extentTest.info("Entered Password : " + val);
		extentTest.info("Entered Password Length : " + val.length());
		return this;
	}
	// Displaying Error message in Mobile Number Text box - Singn Up (if Mobile Number field is 10 Zero)
		public boolean displayInvalidMessageInMobileNumber() {
			 // Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(mobilenumInvalidMsg));
		    
		    String val = mobilenumInvalidMsg.getText();;
			extentTest.info("Validation message at Mobile Number : " + val);
		    
			return mobilenumInvalidMsg.isDisplayed();
			}
	// Displaying Error message in Mobile Number Text box - Singn Up (if Mobile Number field is Special characters)
		public boolean displayErrorMessageInMobileNumber() {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(mobilenumValidationMsg));
		    
		    String val = mobilenumValidationMsg.getText();;
			extentTest.info("Validation message at Mobile Number : " + val);
		    
			return mobilenumValidationMsg.isDisplayed();
			}
		// Clicking on Eye Icon at Password
				public SignUp clickPassordEyeIcon() {
					 // Wait for a maximum of 10 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.elementToBeClickable(passWordEyeIcon));
				    
					passWordEyeIcon.click();
					return this;
				}
		// Clicking on Country code and Flag
		public SignUp clickCountryCode() {
			 // Wait for a maximum of 10 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(countryCodeAndFlag));
		    
			countryCodeAndFlag.click();
			return this;
		}
		// Search on Country code and Flag
		public SignUp clickCountryCodeSearchBox(String countryName) {
			 // Wait for a maximum of 10 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(searchCountryCode));
		    
			searchCountryCode.click();
			searchCountryCode.sendKeys(countryName);
			india.click();
			return this;
		}
	// Clicking on Singn Up (submit) button
	public SignUp clickSignup() {
		 // Wait for a maximum of 10 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(signupBtn));
	    
		signupBtn.click();
		return this;
	}
			// Displaying Error message in First name Text box - Singn Up (if Firstname field is Empty)
			public boolean displayValidationMessageInFirstname() {
				// Wait for a maximum of 10 seconds for the banner text to be displayed
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			    wait.until(ExpectedConditions.visibilityOf(firstnameValidationMsg));
			    
				extentTest.info("Validation Message at First name  : " + firstnameValidationMsg.getText());
				return firstnameValidationMsg.isDisplayed();
				}
	
				// Displaying Error message in Last name Text box - Singn Up (if Lastname field is Empty)
				public boolean displayValidationMessageInLastname() {
					// Wait for a maximum of 20 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(lastnameValidationMsg));
				    
					extentTest.info("Validation Message at Last name  : " +lastnameValidationMsg.getText());
					return lastnameValidationMsg.isDisplayed();
				}
				// Displaying Error message in Email Address Text box - Singn Up (if Email Address field is Empty)
				public boolean displayValidationMessageInEmail() {
					// Wait for a maximum of 20 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(emailValidationMsg));
				    
					extentTest.info("Validation Message at Email Address  : " +emailValidationMsg.getText());
					return emailValidationMsg.isDisplayed();
				}			
				
				// Displaying Error message in Email Address Text box - Singn Up (if Mobile Number field is Empty)
				public boolean displayValidationMessageInMobileNumber() {
					// Wait for a maximum of 20 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(mobilenumValidationMsg));
				    
					extentTest.info("Validation Message at Mobile Number  : " +mobilenumValidationMsg.getText());
					return mobilenumValidationMsg.isDisplayed();
				}			
				
				// Displaying Error message in Email Address Text box - Singn Up (if Password field is Empty)
				public boolean displayValidationMessageInPassword() {
					// Wait for a maximum of 20 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(passwordValidationMsg));
				    
					extentTest.info("Validation Message at Password   : " +passwordValidationMsg.getText());
					return passwordValidationMsg.isDisplayed();
				}			
				
				// Displaying Error message in Email Address Text box - Singn Up (if Email is Invalid)
				public boolean displayValidationMessageForInvalidEmailAddress() {
					// Wait for a maximum of 10 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(emailInvalidMsg));
				    
					extentTest.info("Validation message for Invalid Email : "+emailInvalidMsg.getText());
					return emailValidMsgForExistingUser.isDisplayed();
				}			
				
				// Displaying Error message in Email Address Text box - Singn Up (if Email is existing user)
				public boolean displayValidationMessageInEmailForExistingUser() {
					// Wait for a maximum of 10 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(emailValidMsgForExistingUser));
				    
					extentTest.info("Validation message for Old user : "+emailValidMsgForExistingUser.getText());
					return emailValidMsgForExistingUser.isDisplayed();
				}			
				// Displaying verification OTP window
				public boolean displayVerificationOTPwindow() {
					// Wait for a maximum of 20 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(verificationOTPwindow));
				    
					extentTest.info("Validation Message on OTP window  : " +verificationOTPwindow.getText());
					return verificationOTPwindow.isDisplayed();
				}
				// Displaying Error message in  - Singn Up 
				public boolean displayLimitExceededErrorMessage() {
					// Wait for a maximum of 10 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(limitExceed));
				    
					extentTest.info("Validation message for Old user : "+limitExceed.getText());
					return limitExceed.isDisplayed();
				}	
				
	// Check Title of the OTP Window
	public String checkOTPWindowTitle() throws InterruptedException {
		// Wait for a maximum of 10 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(verificationOTPwindow));
	    
		extentTest.info("Title of the window is : " +verificationOTPwindow.getText());
		return verificationOTPwindow.getText();
	}

	// Entering OTP in the Enter verification screen
	public SignUp enterOTP() {
		enterOTP1.sendKeys("1");
		enterOTP2.sendKeys("2");
		enterOTP3.sendKeys("3");
		enterOTP4.sendKeys("4");
		enterOTP5.sendKeys("1");
		enterOTP6.sendKeys("3");
		extentTest.info("OTP generated for Registered Email ID");
		return this;
	}

	// Clicking on Resend button
	public SignUp clickResend() {
		 // Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(resendBtn));
	    
		resendBtn.click();
		extentTest.info("Clicked Resend button");
		return this;
	}

	// Clicking on Change Email option
	public SignUp clickChangeEmail() {
		 // Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(changeEmail));
	    
		changeEmail.click();
		extentTest.info("Clicked Change Email option");
		return this;
	}

	public SignUp testMaximumCharacterLimitationInSignupFields() {

		// Generate a 50-character string for the first name
		String firstName = generateRandomString(50);

		// Generate a 50-character string for the last name
		String lastName = generateRandomString(50);

		// Generate a 88-character string for the Email address
		String emailId = generateRandomEmail(96);

		// Generate a 10-character string for the Mobile Number
		String mobileNumber = generateRandomMobileNumber(10);

		// Generate a 16-character string for the Password
		String password = generateRandomPassword(16);

		// Pass the generated first name and last name to the specific fields
		enterFirstName(firstName);
		enterLastName(lastName);
		enterEmailAddress(emailId);
		enterMobileNumber(mobileNumber);
		enterPassword(password);

		return this;
	}

	public SignUp testGreaterThanMaximumCharacterLimitationInSignupFields() {

		// Generate a 50-character string for the first name
		String firstName = generateRandomString(51);

		// Generate a 50-character string for the last name
		String lastName = generateRandomString(51);

		// Generate a 101-character string for the Email address
		String emailId = generateRandomEmail(97);

		// Generate a 10-character string for the Mobile Number
		String mobileNumber = generateRandomMobileNumber(11);

		// Generate a 17-character string for the Password
		String password = generateRandomPassword(17);

		// Pass the generated first name and last name to the specific fields
		enterFirstName(firstName);
		enterLastName(lastName);
		enterEmailAddress(emailId);
		enterMobileNumber(mobileNumber);
		enterPassword(password);

		return this;
	}

	public SignUp testMinimumCharacterLimitationInSignupFields() {

		// Generate a 50-character string for the first name
		String firstName = generateRandomString(1);

		// Generate a 50-character string for the last name
		String lastName = generateRandomString(1);

		// Generate a 1-character string for the Email address
		String emailId = generateRandomEmail(1);

		// Generate a 10-character string for the Mobile Number
		String mobileNumber = generateRandomMobileNumber(10);

		// Generate a 16-character string for the Password
		String password = generateRandomPassword(6);

		// Pass the generated first name and last name to the specific fields
		enterFirstName(firstName);
		enterLastName(lastName);
		enterEmailAddress(emailId);
		enterMobileNumber(mobileNumber);
		enterPassword(password);

		return this;
	}

	public SignUp testLessThanMinimumCharacterLimitationInSignupFields() {

		// Generate a 0-character string for the first name
		String firstName = generateRandomString(0);

		// Generate a 0-character string for the last name
		String lastName = generateRandomString(0);

		// Generate a 1-character string for the Email address
		String emailId = generateRandomEmail(0);

		// Generate a 9-character string for the Mobile Number
		String mobileNumber = generateRandomMobileNumber(9);

		// Generate a 5-character string for the Password
		String password = generateRandomPassword(5);

		// Pass the generated first name and last name to the specific fields
		enterFirstName(firstName);
		enterLastName(lastName);
		enterEmailAddress(emailId);
		enterMobileNumber(mobileNumber);
		enterPassword(password);

		return this;
	}

	// Helper method to generate a random string of given length
	// Implement your random string generation logic here
	// For simplicity, we'll use a placeholder implementation
	private String generateRandomString(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

	public String generateRandomEmail(int length) {
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			char randomChar = characters.charAt(index);
			sb.append(randomChar);
		}

		// String domain = "example.com"; // Replace with your desired domain
		String domain = "b.c";
		return sb.toString() + "@" + domain;
	}

	public String generateRandomPassword(int length) {
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+{}:.,/';.";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			char randomChar = characters.charAt(index);
			sb.append(randomChar);
		}

		return sb.toString();
	}

	public String generateRandomMobileNumber(int length) {
		String characters = "123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			char randomChar = characters.charAt(index);
			sb.append(randomChar);
		}

		return sb.toString();
	}

	public SignUp clickSubmit2() {
		signupBtn.click();

		// Wait for the sign-up process to complete (you may need to add a wait here)
		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		SoftAssert soft = new SoftAssert();
		// Verify the appropriate validation message is displayed for missing firstname
		soft.assertTrue(firstnameValidationMsg.isDisplayed(), "Validation message  First name is required  displayed");
		String validatFNMessage = firstnameValidationMsg.getText();
		extentTest.info("Validation message : " + validatFNMessage);

		// Verify the appropriate validation message is displayed for missing lastname
		soft.assertTrue(lastnameValidationMsg.isDisplayed(), "Validation message  Last name is required  displayed");
		String validatLNMessage = lastnameValidationMsg.getText();
		extentTest.info("Validation message : " + validatLNMessage);

		// Verify the appropriate validation message is displayed for missing lastname
		soft.assertTrue(emailInvalidMsg.isDisplayed(), "Validation message  Email is invalid  displayed");
		String validatEmailMessage = emailInvalidMsg.getText();
		extentTest.info("Validation message : " + validatEmailMessage);

		// Verify the appropriate validation message is displayed for missing lastname
		soft.assertTrue(mobilenumInvalidMsg.isDisplayed(), "Validation message  Mobile number is invalid  displayed");
		String invalidMobNumMessage = mobilenumInvalidMsg.getText();
		extentTest.info("Validation message : " + invalidMobNumMessage);

		// Verify the appropriate validation message is displayed for missing lastname
		soft.assertTrue(passwordValidationMsg.isDisplayed(), "Validation message  Passord is invalid  displayed");
		String passwordMinValidMessage = passwordValidationMsg.getText();
		extentTest.info("Validation message : " + passwordMinValidMessage);

		return this;

	}

	public SignUp getAllValidationMessage() throws InterruptedException {

		// Verify the appropriate validation message is displayed for missing firstname
		Assert.assertTrue(firstnameValidationMsg.isDisplayed(), "Validation message for missing First name  displayed");
		String val1 = firstnameValidationMsg.getText();
		extentTest.info("Validation Message at First name  : " + val1);

		// Verify the appropriate validation message is displayed for missing Lastname
		Assert.assertTrue(lastnameValidationMsg.isDisplayed(), "Validation message for missing Last name  displayed");
		String val2 = lastnameValidationMsg.getText();
		extentTest.info("Validation Message at Last name  : " + val2);

		// Verify the appropriate validation message is displayed for missing Email
		Assert.assertTrue(emailValidationMsg.isDisplayed(), "Validation message for missing Email is displayed");
		String val3 = emailValidationMsg.getText();
		extentTest.info("Validation Message at Email Address : " + val3);

		// Verify the appropriate validation message is displayed for missing Password
		Assert.assertTrue(passwordValidationMsg.isDisplayed(), "Validation message for missing Password is displayed");
		String val4 = passwordValidationMsg.getText();
		extentTest.info("Validation Message at Password  : " + val4);

		// Verify the appropriate validation message is displayed for missing Mobile
		Assert.assertTrue(mobilenumValidationMsg.isDisplayed(),"Validation for missing Mobile number is displayed");
		String val5 = mobilenumValidationMsg.getText();
		extentTest.info("Validation Message at Mobile number  : " + val5);

		return this;

	}

}
