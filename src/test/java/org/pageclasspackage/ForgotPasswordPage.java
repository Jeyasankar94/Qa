package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class ForgotPasswordPage extends VisionBaseClass {
	
	WebDriver driver;
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Forgot password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//*[text()='Please Verify Your Email ID']")	
	private WebElement titleOfForgotPwdWindow;
	
	@FindBy(xpath = "//*[text()='Please enter a valid email address.']")	
	private WebElement validationMessageAtEmail;
	
	@FindBy(xpath = "//*[text()='Email is required']")	
	private WebElement validationMessageEmailRequired;
	
	@FindBy(xpath = "//input[@id='formGridEmail']")
	private WebElement emailAddressField;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']") // button[text()='Continue']
	private WebElement continueButton;
	
	@FindBy(xpath = "//*[@class='md:flex md:w-full ']/div/section/section/div/p")	
	private WebElement updatePasswordScreen;
	
	@FindBy(xpath = "//*[text()='Resend']")
	private WebElement resendButton;
	
	@FindBy(xpath = "//input[@name='otp1']")
	private WebElement otpButton;
	
	@FindBy(xpath = "//button[normalize-space()='Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath = "(//input[@id='formGridPassword'])[1]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//button[text()='Update']")	//span[text()='Entered verification code is incorrect.']
	private WebElement updateButton;
	
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
	
	@FindBy(xpath = "//span[text()='Entered verification code is incorrect.']")	
	private WebElement OTPvaldationMessage;
	
	

	public ForgotPasswordPage clickForgotPassword() {
		 // Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(forgotPassword));
	    
		forgotPassword.click();
		return this;
	}
	public boolean displayForgotPasswordTitle() {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(titleOfForgotPwdWindow));
	    
		return titleOfForgotPwdWindow.isDisplayed();
	}

	public ForgotPasswordPage enterEmail(String emailid) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(emailAddressField));
		
		emailAddressField.sendKeys(emailid);
		return this;
	}
	//Validation Message at Email address
	public boolean displayValidationMessageAtEmail() {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(validationMessageAtEmail));
		
		String validationMEssage = validationMessageAtEmail.getText();
		extentTest.info("Error Message Email Address : " + validationMEssage);
		return validationMessageAtEmail.isDisplayed();
	}
	//Validation Message at Email address
		public boolean displayValidationMessageForEmailRequired() {
			// Wait for a maximum of 20 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOf(validationMessageEmailRequired));
			
			String validationMEssage = validationMessageEmailRequired.getText();
			extentTest.info("Error Message Email Address : " + validationMEssage);
			return validationMessageEmailRequired.isDisplayed();
		}
	public ForgotPasswordPage clickContinue() { 
		 // Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		
		continueButton.click();
		return this;
	}
	public boolean displayTextofUpdatePasswordScreen() {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(updatePasswordScreen));
		
		String text = updatePasswordScreen.getText();
		extentTest.info("Text of Update Password Screen: " + text);
		return updatePasswordScreen.isDisplayed();
	}
	public ForgotPasswordPage clickResendPassword() {
		 // Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(resendButton));
		
		resendButton.click();
		return this;
	}

	public boolean displayOTPValidationMessage() {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(OTPvaldationMessage));
		
		String validationMessage = OTPvaldationMessage.getText();
		extentTest.info("Validation message for OTP: " + validationMessage);
		return OTPvaldationMessage.isDisplayed();
	}
	public ForgotPasswordPage enterOTP(String num) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(otpButton));
		
		otpButton.sendKeys(num);
		return this;
	}
	// Entering OTP in the Enter verification screen
		public ForgotPasswordPage enterOTP() {
			// Wait for a maximum of 30 seconds before interacting with the download button
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfAllElements(enterOTP1));
			enterOTP1.sendKeys("1");
			wait.until(ExpectedConditions.visibilityOfAllElements(enterOTP2));
			enterOTP2.sendKeys("2");
			wait.until(ExpectedConditions.visibilityOfAllElements(enterOTP3));
			enterOTP3.sendKeys("3");
			wait.until(ExpectedConditions.visibilityOfAllElements(enterOTP4));
			enterOTP4.sendKeys("4");
			wait.until(ExpectedConditions.visibilityOfAllElements(enterOTP5));
			enterOTP5.sendKeys("1");
			wait.until(ExpectedConditions.visibilityOfAllElements(enterOTP6));
			enterOTP6.sendKeys("3");
			extentTest.info("OTP generated for Registered Email ID");
			return this;
		}

	public ForgotPasswordPage enterPassword(String pwd) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(passwordfield));
		
		passwordfield.sendKeys(pwd);
		return this;
	}

	public ForgotPasswordPage enterConfirmPassword(String confirmpwd) {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(confirmPassword));
		
		confirmPassword.sendKeys(confirmpwd);
		return this;
	}

	public ForgotPasswordPage clickUpdate() {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(updateButton));
	    
		updateButton.click();
		return this;
	}


}
