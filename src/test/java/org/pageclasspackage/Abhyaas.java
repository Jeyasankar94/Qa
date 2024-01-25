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

public class Abhyaas extends VisionBaseClass {
	

	WebDriver driver;
	public Abhyaas(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='/abhyaas'])[1]")
	private WebElement abhyaas;

	@FindBy(xpath = "//*[@class='space-y-20 sm:space-y-10']/div/div[2]/div[2]/button")
	private WebElement register;

	@FindBy(xpath = "(//*[@id='dropdown-basic'])[1]")	//*[@class='row mb-4']/div/div/button
	private WebElement btnTestCenter;

	 @FindBy(xpath = "//*[@class='row mb-4']/div/div/div/a")
	  private List<WebElement> selectTestCenterName ;

	 @FindBy(xpath = "(//*[@id='dropdown-basic'])[2]")
		private WebElement btnMedium;

	 @FindBy(xpath = "//*[@class='col-xl-4 col-md-6 ']/div/div/div/a")
	  private List<WebElement> selectMedium ;

	 @FindBy(xpath = "(//*[@id='dropdown-basic'])[3]")
		private WebElement btnPlatform;

	 @FindBy(xpath = "//*[@class='col-xl-4 col-md-6'][2]/div/div/div/a")
	  private List<WebElement> selectPlatform;

	 @FindBy(xpath = "//button[@type='submit']")
		private WebElement buynowBtn;




//Click on Abhyaas
	public Abhyaas clickAbhyaas() throws InterruptedException {
		abhyaas.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		return this;
	}
	//Click on Register
	public Abhyaas clickRegister() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,2500)", "");
				synchronized (driver) {driver.wait(2000);}

				register.click();
				synchronized (driver) {driver.wait(2000);}

				String path = captureScreenShotBase64(getDriver());
				extentTest.addScreenCaptureFromBase64String(path, "Register ");
				extentTest.info("Clicked Register in Abhyaas");

				return this;
					}
	//Click on Test Center
		public Abhyaas clickTestCenter() throws InterruptedException {
			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			btnTestCenter.click();

			return this;
		}
	// Select the Test Center Randomly
		public Abhyaas selectTestCenter() throws InterruptedException, AWTException {

				//Dynamic selection using Random class
				for (WebElement option : selectTestCenterName) {

					String optionCenter = option.getText();
					System.out.println(optionCenter);

				}
				// Getting size of options available
				int size = selectTestCenterName.size();

				// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

				// Selecting random value
				selectTestCenterName.get(randnMumber).click();


				return this;

		}

		//Click on Medium
				public Abhyaas clickMedium() {
					btnMedium.click();
					return this;
		}
			// Select the Test Center Randomly
				public Abhyaas selectMedium() throws InterruptedException, AWTException {

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
				//Click on Platform
				public Abhyaas clickPlatform() {
					btnPlatform.click();
					return this;
				}
			// Select the Test Center Randomly
				public Abhyaas selectPlatform() throws InterruptedException, AWTException {

						//Dynamic selection using Random class
						for (WebElement option : selectPlatform) {

							String optionCenter = option.getText();
							System.out.println(optionCenter);

						}
						// Getting size of options available
						int size = selectPlatform.size();

						// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

						// Selecting random value
						selectPlatform.get(randnMumber).click();


						return this;

				}
				//Click on Buy Now Button
				public Abhyaas clickBuyNow() {
					buynowBtn.click();
					return this;
				}
}