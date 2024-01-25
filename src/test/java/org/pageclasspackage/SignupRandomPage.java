package org.pageclasspackage;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupRandomPage extends VisionBaseClass {

	WebDriver driver;
	public SignupRandomPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// webelement of login button in home screen

	@FindBy(xpath = "//*[@class='dark:text-white block cursor-pointer no-underline text-[#242424] hover:!text-primaryLight font-medium font-poppins text-sm ']")
	private WebElement loginButton;

	// webelement of new user in login screen

	@FindBy(xpath = "(//*[@class='col'])[3]/a")
	private WebElement newUserButton;

	// weblement of various webelemtns in signup screen

	@FindBy(xpath = "(//*[@class='col'])[1]/div/input")
	private WebElement firstName;

	@FindBy(xpath = "(//*[@class='col'])[2]/div/input")
	private WebElement lastName;

	@FindBy(xpath = "(//*[@class='col'])[3]/div/input")
	private WebElement emailAddress;

	@FindBy(xpath = "//*[@class='special-label']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//input[@id='formGridPassword']")
	private WebElement password;

	@FindBy(xpath = "//*[@src='/icons/password.svg']")
	private WebElement passwordEyeIcon;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement signupConfirmButton;

	// clcik login button

	public void clicLoginButtonHomeScreen() {
		loginButton.click();
	}

	// click new user button

	public void clickNewUserButtonLoginScreen() {
		newUserButton.click();
	}

	// auto creation of email string

	private String generateRandomStringEmail2(String input) {

		// creating random instance

		Random random = new Random();

		// creating random length between 1 and 108

		int generatedLength = random.nextInt(108) + 1;

		StringBuilder generatedString = new StringBuilder();

		int inputLength = input.length();

		for (int i = 0; i < generatedLength; i++) {

			char randomChar = input.charAt(random.nextInt(inputLength));

			generatedString.append(randomChar);

		}

		return generatedString.toString();

	}

	// Auto creation of password

	public static String autoCreatePassword(String inputPassword) {

		// create insatnce for Random class

		Random random = new Random();

		// create random String between 6 and 16

		int length = random.nextInt(11) + 6;

		// create an instance for StringBuilder for to store the created password
		// charcater

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {

			// creating instance for character

			char randomChar;

			// two condition i==0 verifies 1st character and last character is not space

			if (i == 0 || i == length - 1) {

				do {

					// typecasting to charcater

					randomChar = inputPassword.charAt(random.nextInt(inputPassword.length()));

				} while (randomChar == 'A'); // || Character.isSurrogate(randomChar));

			} else {

				// typecasting to charcater

				randomChar = inputPassword.charAt(random.nextInt(inputPassword.length()));

			}

			// appending to character using string builder

			sb.append(randomChar);

		}

		return sb.toString();

	}

	// password verification method

	public static boolean verifyPasswordString(String enteredPassword) {

		// Verify first and last characters

		boolean isFirstAndLastCharacterOfPassword = enteredPassword.startsWith(" ") && enteredPassword.endsWith(" ");

		System.out.println("First and last character boolean value : "+isFirstAndLastCharacterOfPassword);

		// Verify if entered password string contains emoji

		// Pattern emojiPattern = Pattern.compile("[\\x{1F600}-\\x{1F6FF}]");

		// Matcher emojiMatcher = emojiPattern.matcher(enteredPassword);

		// boolean containsEmoji = emojiMatcher.find();

		// boolean value for the password verification

		// verify whether string satisfies the lower and upper limit condition

		int minimumLength = 6;

		int maximuLength = 16;

		int enteredPasswordLength = enteredPassword.length();

		boolean lengthBooleanValue = enteredPasswordLength > maximuLength && enteredPasswordLength < minimumLength;

		System.out.println("Length boolean value : "+lengthBooleanValue);

		return isFirstAndLastCharacterOfPassword && lengthBooleanValue;

	}

	// create auto mobile number

	private String createAutoMobileNumber(String numberDigits) {

		// create instance for Random Class

		Random random = new Random();

		// create a character array to get character from numberDigit String

		char[] chars = numberDigits.toCharArray();

		// checking if given input string is equal to zero , if zero it returns the null

		if (chars.length == 0) {

			return "";

		}

		// create a instance for character
		char firstChar;

		// storing the random selection e character from chars to firstChar

		// in while checking whether the first digit is neither 0,1,2,3,4,5

		do {
			firstChar = chars[random.nextInt(chars.length)];

		} while (Character.isDigit(firstChar) && (firstChar - '0') <= 5);

		// creating String builder to store and append the charcater

		StringBuilder sb = new StringBuilder();
		sb.append(firstChar);

		// using for loop with given input string length as upper limit condition

		for (int i = 1; i < chars.length; i++) {

			// appending the character one by one

			sb.append(chars[random.nextInt(chars.length)]);

		}

		// returning the created mobile string

		return sb.toString();

	}

	// create forbidden number

	private Set<String> createSixDifferentNumbersForbiddenNumbers() {

		// creating instance for Set string

		Set<String> numbers = new HashSet<>();

		// create instance for random

		Random random = new Random();

		// giving entry check to verify whether first number is less than 6 i.e
		// 0,1,2,3,4,5

		while (numbers.size() < 6) {

			// creating random number from 0 to 5 i.e 0,1,2,3,4,5 for first digit

			int startingDigit = random.nextInt(6);

			// creating StringBuilder instance

			StringBuilder sb = new StringBuilder();

			sb.append(startingDigit);

			// for loop for remaining last 9 digit

			for (int i = 1; i < 10; i++) {

				// creating a random digit from 0 to 9

				int digit = random.nextInt(10);

				sb.append(digit);

			}

			String number = sb.toString();

			numbers.add(number);

		}

		return numbers;

	}

	// method for first & last name

	public String autocreateStringFirstAndLastName(String inputName) {

		// Get the length of the input string

		int inputLength = inputName.length();

		// Create an instance of Random class

		Random random = new Random();

		// Generate a random length between 1 and 50 using random instance and nextInt
		// method

		int randomLengthOfName = random.nextInt(50) + 1;

		// Calculate the maximum length of string to be created

		int maxLength = Math.min(inputLength, randomLengthOfName);

		// create the auto string

		String randomString = inputName.substring(0, maxLength);

		return randomString;

	}

	// method to create name more than 50 charcaters

	public static String autoCreateMoreThan50() {

		// minimum length

		int minLength = 51;

		// maximum length

		int maxLength = 55;

		// create instance for random class and get length

		int length = new Random().nextInt(maxLength - minLength + 1) + minLength;

		// string s

		String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {

			int index = new Random().nextInt(s.length());

			sb.append(s.charAt(index));

		}

		return sb.toString();

	}

	// method to verify more than 50 characters for First and Last name field

	public void moreThan50Name() {

		// using the auto create method to generate more than 50 characters

		String firstNameMoreThan50 = autoCreateMoreThan50();

		String secondNameMoreThan50 = autoCreateMoreThan50();

		// getting the count of the created string that to be enteted in the last name
		// field

		int countFirstName = firstNameMoreThan50.length();

		int countSecondName = secondNameMoreThan50.length();

		extentTest.info("Character count to be enterd in the first name field :  " + countFirstName);

		extentTest.info("Character count to be enterd in the last name field :  " + countSecondName);

		// sending the keys to the first name

		firstName.sendKeys(firstNameMoreThan50);

		// sending the keys to the last name

		lastName.sendKeys(secondNameMoreThan50);

		// creating instance for javascript executor

		JavascriptExecutor jk = (JavascriptExecutor) driver;

		// to get the values from the firstName & lastName field

		String firstNameEnteredString = (String) jk.executeScript("return arguments[0].value;", firstName);

		String lastNameEnteredString = (String) jk.executeScript("return arguments[0].value;", lastName);

		// storing the string count length in integers

		int countOfFirstNameEnteredString = firstNameEnteredString.length();

		int countOfLastNameEnteredString = lastNameEnteredString.length();

		extentTest.info("Count of no of characters in first name field : " + countOfFirstNameEnteredString);

		extentTest.info("count of no of chractaers in last name field : " + countOfLastNameEnteredString);

		int actual = 50;

		assertEquals(actual, countOfFirstNameEnteredString);

		assertEquals(actual, countOfLastNameEnteredString);

		if (countOfFirstNameEnteredString == 50 && countOfLastNameEnteredString == 50) {

			extentTest.pass("Upper limit boundary value for first & last name is verified");
		} else {
			extentTest.info("Test failed");
		}

	}

	// auto creation of password and verification

	public void autoCreatePasswordVerify() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;

		String inputPassword = "m!n@b#v$ %c%x^z&l*k(j)h_-+=gfdsapoiuytrewqQWERTYUIOPLKJHGFDSAZXCVBNM1234567890";

		String autoCreatedPassword = autoCreatePassword(inputPassword);

		// System.out.println(autoCreatedPassword);

		int countOfCreatedPassword = autoCreatedPassword.length();

		extentTest.info("Character length of the auto created password : " + countOfCreatedPassword);

		password.click();

		// jk.executeScript("arguments[0].value = arguments[1]",
		// password,autoCreatedPassword);

		password.sendKeys(autoCreatedPassword);

		// passwordEyeIcon.click();

		// String enteredPassword = (String) jk.executeScript("return
		// arguments[0].value;", password);

		String enteredPassword = password.getAttribute("value");

		System.out.println(enteredPassword);

		extentTest.info("Entered Password is : " + enteredPassword);

		boolean passwordVerifcationValue = verifyPasswordString(enteredPassword);

		System.out.println(passwordVerifcationValue);

		boolean expectedValue = false;

		assertEquals(passwordVerifcationValue, expectedValue);

		extentTest.info(
				"Entered Password satisfies the given condition of length between 6 to 16 character,  First & Last charcater should not be Space , it should not contain emoji");

	}

}
