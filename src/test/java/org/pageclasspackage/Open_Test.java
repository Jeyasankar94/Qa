package org.pageclasspackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_Test extends VisionBaseClass{

	WebDriver driver;
	public Open_Test(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='/opentest'])[1]")
	   private  WebElement open_Test;

	@FindBy(xpath = "//button[text()='Apply for Open Test']")
	   private  WebElement applyBtn_open_Test;

	@FindBy(xpath = "(//button[@id='dropdown-basic'])[1]")
	  private  WebElement buttonSelectPlatform;

	@FindBy(xpath = "//*[@name='platform']/div/a")
	  private  List<WebElement> selectPlatformOptions;

	@FindBy(xpath = "(//button[@id='dropdown-basic'])[2]")
	  private  WebElement buttonSelectState;

	@FindBy(xpath = "//*[@name='state']/div/a/span")
	  private  List<WebElement> selectStateOptions;

	@FindBy(xpath = "(//*[@id='dropdown-basic'])[3]")
	private WebElement btnMedium;

	 @FindBy(xpath = "//*[@name='medium']/div/a")
	  private List<WebElement> selectMedium ;

	 @FindBy(xpath = "//input[@name='city']")
		private WebElement enterCityName;

	 @FindBy(xpath = "//button[@type='submit']")
		private WebElement applyButton;

	//Click on Open Test
	public Open_Test clickOpen_Test() throws InterruptedException {
		open_Test.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		return this;
	}
	//Click on Apply for Open Test
	public Open_Test clickApplyButtonOpen_Test() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1500)", "");
		synchronized (driver) {driver.wait(2000);}

		applyBtn_open_Test.click();

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Apply for Open Test  ");
		extentTest.info("Clicked  Apply for Open Test");
		extentTest.pass("Successfully clicked  Apply for Open Test ");

		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);

		return this;
		}
	//Click on Select Platform
		public Open_Test clickSelectPlatform() throws InterruptedException {
			buttonSelectPlatform.click();
			return this;
		}

		// Select the Platform Randomly
		public Open_Test selectAnyPlatformOption() throws InterruptedException, AWTException {

				//Dynamic selection using Random class
				for (WebElement option : selectPlatformOptions) {

					String optionPlatform = option.getText();
					System.out.println(optionPlatform);

				}
				// Getting size of options available
				int size = selectPlatformOptions.size();

				// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

				// Selecting random value
				selectPlatformOptions.get(randnMumber).click();

				return this;

}
		//Click on Select State
				public Open_Test clickSelectState() throws InterruptedException {
					buttonSelectState.click();
					return this;
				}

				// Select the State Randomly
				public Open_Test selectAnyStateOption() throws InterruptedException, AWTException {

						//Dynamic selection using Random class
						for (WebElement option : selectStateOptions) {

							String optionState = option.getText();
							System.out.println(optionState);

						}
						// Getting size of options available
						int size = selectStateOptions.size();

						// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

						// Selecting random value
						selectStateOptions.get(randnMumber).click();

						return this;

		}
	//Click on Medium
	public Open_Test clickMedium() {
		btnMedium.click();
		return this;
		}
			// Select the Test Center Randomly
				public Open_Test selectMedium() throws InterruptedException, AWTException {

						//Dynamic selection using Random class
						for (WebElement option : selectMedium) {

							String optionCenter = option.getText();
							System.out.println(optionCenter);

						}
						// Getting size of options available
						int size = selectMedium.size();

						// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

						// Selecting random value
						selectMedium.get(randnMumber).click();

						return this;

		}

	//Click on Medium
	public Open_Test enterCityName() {
		enterCityName.sendKeys("Chennai");
		return this;
}

	//Click on Apply button
	public Open_Test clickApplyButton() {
			applyButton.click();
			return this;
	}
}
