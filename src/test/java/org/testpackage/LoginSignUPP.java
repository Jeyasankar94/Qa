package org.testpackage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSignUPP {

	// latest code

	public String createAutoPassword() {

		final String charactersAllowedPassword = "Abc";

		// Creating instance for random object
		Random random = new Random();

		// stating length of the the passwor dto be created

		int passwordLimits = random.nextInt(11) + 6;

		// creatng instance for StringBuilder to store and append the created password
		// character

		StringBuilder sb = new StringBuilder();

		// creating for loop to iterate with passwordLimit int as condition

		for (int i = 0; i < passwordLimits; i++) {

			// creating instance for Character

			char autoPasswordCharacter;

			/*
			 * creating do while loop to check the given condition of 1st and last (16th) //
			 * character should not be neither Space nor emoji's
			 *
			 */

			do {
				autoPasswordCharacter = charactersAllowedPassword
						.charAt(random.nextInt(charactersAllowedPassword.length()));
			} while ((i == 0) || (i == 15) && (autoPasswordCharacter == 'A' || autoPasswordCharacter == 'b'
					|| Character.isSurrogate(autoPasswordCharacter)));

			sb.append(autoPasswordCharacter);

		}

		return sb.toString();

	}

	// Verify boundary value for email field text

	public String verifyBoundaryValue1(int minimumLength, int maximumLength) {

		// Creating insatnce for Random class

		Random random = new Random();

		// Last 10 digits are fixed for "@gmail.com"

		int last10Char = 10;

		// creating random length

		int randomlength = random.nextInt(maximumLength - minimumLength + 1) + minimumLength;

		// maximum character

		int maximumLengthLessLast10Characters = randomlength - last10Char;

		// Stringbuilder to store the values

		StringBuilder sb = new StringBuilder();

		// Auto generating Alphanumeric string

		for (int i = 0; i < maximumLengthLessLast10Characters; i++) {

			// random number bound is 62 because 0-9 digits, 26 LowerCase alphabets, 26
			// upper case alphabets
			int randomNumber = random.nextInt(62);

			// creating char instance

			char autoChar;
			// if random number is 1 to 9 it will return numrical digit
			if (randomNumber < 10) {
				// typcasting from int to character

				autoChar = (char) (randomNumber + '0');
			}
			// if random number is between 10 to 35 it will return Upper Case Alphabets
			// character
			else if (randomNumber < 36) {
				// typcasting from int to character
				autoChar = (char) (randomNumber + 'a');
			}
			// when the random number is nbetween 36 to 62 , it will return lower case
			// Alphabets
			else {
				// typcasting from int to character
				autoChar = (char) (randomNumber + 'A');
			}

			sb.append(autoChar);
		}
		sb.append("@gmail.com");

		return sb.toString();

	}

	// 255 Character to test upper limit in email text field

	public String verify255UpperBoundary(int maximumLength, String last10Charcater) {

		// creating instance for String builder

		StringBuilder sb = new StringBuilder();

		// creating instance for random class

		Random random = new Random();

		// Auto creation of Alphanumeric String

		for (int i = 0; i < maximumLength; i++) {
			if (i < maximumLength - 10) {
				// getting all 62 character including 10 digits, 26 lower case , 26 upper case
				// alphabets
				int randomNumber = random.nextInt(62);
				if (randomNumber < 10) {
					sb.append((char) (randomNumber + 48));
				} else if (randomNumber < 36) {
					// upper case letter

					sb.append((char) (randomNumber + 55));
				} else {
					sb.append((char) (randomNumber + 61));
				}
			} else {
				// append the last10 digits
				sb.append(last10Charcater.charAt(i - (maximumLength - 10)));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws InterruptedException {
		LoginSignUPP ls = new LoginSignUPP();

			String firstTest = ls.verifyBoundaryValue1(11, 254);

		System.out.println(firstTest);

		int firstTestCount = firstTest.length();

		System.out.println("Number of characters in first test string : " + firstTestCount);

		String secondTest = ls.verify255UpperBoundary(255, "@gmail.com");

		int secondTestCount = secondTest.length();

		System.out.println(secondTest);

		System.out.println("Number of charcaters in second test string : " + secondTestCount);

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://qa-new.visionias.in/home");

		driver.manage().window().maximize();

		Thread.sleep(9000);

		// click login button

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/nav/div/div/div[1]/div[2]")).click();

		Thread.sleep(5000);

		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));

		// WebElement email1 = driver.findElement(By.xpath("//*[@name='email']"));

		email.sendKeys(secondTest);

		Thread.sleep(5000);

		// email.clear();

		Thread.sleep(2000);

		JavascriptExecutor jk = (JavascriptExecutor) driver;

		String firstVerifyString = (String) jk.executeScript("return document.getElementById('formGridEmail').value");

		// email.sendKeys(secondTest);

		// String firstVerifyString = email.getAttribute("Value");

		// String firstVerifyString = email.getText();

		System.out.println("First Verifying string : " + firstVerifyString);

		int firstVerifyCount = firstVerifyString.length();

		System.out.println("First Verify Count : " + firstVerifyCount);

	}

}
