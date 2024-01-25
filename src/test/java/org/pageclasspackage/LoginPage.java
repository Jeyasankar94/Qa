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

public class LoginPage extends VisionBaseClass {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Welcome Back!']")
	private WebElement welcomebacktext;
	
	@FindBy(xpath = "//label[text()='Email address*']")
	private WebElement labelEmailaddress;
	
	@FindBy(xpath = "//label[text()='Password*']")
	private WebElement labelPassword;
	
	@FindBy(xpath = "//main[text()='Forgot password?']")
	private WebElement labelEmail;
	
	@FindBy(xpath = "//div[text()='Mobile Number*']")
	private WebElement labelMobileNumber;
	


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
	
	
	
	
	
}
	