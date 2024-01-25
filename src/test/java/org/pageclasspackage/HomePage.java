
package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends VisionBaseClass {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * public HomePage() { PageFactory.initElements(driver, this); }
	 */
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//span[text()='Sign up']")
	private WebElement signUp;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//input[@id='formGridEmail']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='formGridPassword']")
	private WebElement password;

	// Clicking on Login button
	public HomePage clickLogin() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
		return this;
	}

	// Clicking on Sign Up link
	public HomePage clickSignUpButton() {
		// Wait for a maximum of 10 seconds before interacting with the Sign up button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(signUp));
		signUp.click();
		return this;
	}

	// Enter user name
	public HomePage enterUsername(String emailId) {
		// Wait for a maximum of 10 seconds before interacting with the Username
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys(emailId);
		return this;
	}

	// Enter password
	public HomePage enterPassword(String pwd) {
		// Wait for a maximum of 10 seconds before interacting with the Password
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys(pwd);
		return this;
	}

	// Click submit button in the login page
	public HomePage clickSubmit() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();
		return this;
	}

	public HomePage clickRdmrAllTestSeries() throws InterruptedException { 
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement readmoreallTest = driver.findElement(By.xpath("(//button[text()='Read More  '])[1]"));
		jk.executeScript("window.scrollBy(0,1300)", "");
		Thread.sleep(3000);
		readmoreallTest.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		extentTest.info("Succesfully navigated to " + currentUrl);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Read more All Test Series  ");
		extentTest.pass("Succesfully Clicked Read more");
		return this;
	}

	public String getPrelimsTestSeries() {
		String text = driver.findElement(By.xpath("//*[@class='Home_main__OVLM4']/div/div[2]/div/span")).getText();
		extentTest.info("Succesfully navigated to " + text);
		return text;
	}

	public HomePage clickRdmrLiveAndOffline() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement readmoreallTest = driver.findElement(By.xpath("(//button[text()='Read More  '])[3]"));
		jk.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(3000);
		readmoreallTest.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		extentTest.info("Succesfully navigated to " + currentUrl);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Read more in Live and Offline  ");
		extentTest.pass("Succesfully Clicked Read more at live and offline");
		return this;
	}

	public String getLiveClassroom() {
		String text = driver.findElement(By.xpath("//h4[text()='Live Classroom']")).getText();
		extentTest.info("Succesfully navigated to " + text);
		return text;
	}

	public HomePage clickRdmrFreeResources() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement readmoreFreeRes = driver.findElement(By.xpath("(//button[text()='Read More  '])[4]"));
		jk.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);
		readmoreFreeRes.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		extentTest.info("Succesfully navigated to " + currentUrl);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Read more in Free Resources  ");
		extentTest.pass("Succesfully Clicked Read more at Free Resources");
		return this;
	}

	public String getResources() {
		String text = driver.findElement(By.xpath("//h4[text()='Resources']")).getText();
		extentTest.info("Succesfully navigated to " + text);
		return text;
	}

	public HomePage clickRdmrInterviewPrepartn() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement readmoreIntrvwPrep = driver.findElement(By.xpath("(//button[text()='Read More  '])[5]"));
		jk.executeScript("window.scrollBy(0,6000)", "");
		Thread.sleep(3000);
		readmoreIntrvwPrep.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		extentTest.info("Succesfully navigated to " + currentUrl);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Read more in Interview Preparation  ");
		extentTest.pass("Succesfully Clicked Read more at Interview Preparation");
		return this;
	}

	public String getPersonalityInterview() {
		String text = driver.findElement(By.xpath("//h4[text()='Personality Interviews']")).getText();
		extentTest.info("Succesfully navigated to " + text);
		return text;
	}

	public HomePage clickLatestCourses3() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement buyMainsGS = driver.findElement(By.xpath("(//button[normalize-space(text())='Buy Course'])[3]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", buyMainsGS);
		Thread.sleep(3000);
		buyMainsGS.click();
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Buy Courses  ");
		Thread.sleep(3000);
		return this;
	}

	public HomePage clickRegisterAtDelhi() {
		driver.findElement(By.xpath("//*[@class='Home_main__OVLM4']/div/section[6]/div/div[2]/button")).click();
		return this;
	}

	public HomePage clickFacbookInFooter() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
//		String facebookUrl = "https://www.facebook.com/pages/Vision-IAS/233212040049021";
//	     WebElement facebook = driver.findElement(By.xpath("//a[@href=\"" + facebookUrl// + "\"]"));
		WebElement facebook = driver.findElement(By.xpath("//*[@class='xl:flex ']/section[3]/ul/li[1]/a"));
		jk.executeScript("arguments[0].scrollIntoView(true)", facebook);
		Thread.sleep(3000);
		facebook.click();
		return this;
	}

	public HomePage clickYoutubeInFooter() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement youtube = driver.findElement(By.xpath("//*[@class='xl:flex ']/section[3]/ul/li[2]/a"));
		jk.executeScript("arguments[0].scrollIntoView(true)", youtube);
		Thread.sleep(3000);
		youtube.click();
		return this;
	}

	public HomePage clickTwitter() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement twitter = driver.findElement(By.xpath("//*[@class='xl:flex ']/section[3]/ul/li[3]/a"));
		jk.executeScript("arguments[0].scrollIntoView(true)", twitter);
		Thread.sleep(3000);
		twitter.click();
		return this;
	}

	public HomePage clickInstagram() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement instagram = driver.findElement(By.xpath("//*[@class='xl:flex ']/section[3]/ul/li[4]/a"));
		jk.executeScript("arguments[0].scrollIntoView(true)", instagram);
		Thread.sleep(3000);
		instagram.click();
		return this;
	}

	public HomePage clickTelegram() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement telegram = driver.findElement(By.xpath("//*[@class='xl:flex ']/section[3]/ul/li[5]/a"));
		jk.executeScript("arguments[0].scrollIntoView(true)", telegram);
		Thread.sleep(3000);
		telegram.click();
		return this;
	}

	public void switchingToLoginWindow() throws InterruptedException {
		windowhandling(getDriver());
		Thread.sleep(3000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");

	}

}
