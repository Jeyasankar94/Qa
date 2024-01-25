package org.pageclasspackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrelimsTestSeries extends VisionBaseClass {

	WebDriver driver;
	public PrelimsTestSeries(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/div[1]/div[1]/div[1]/span")	//*[@id='basic-navbar-nav']/div/div/div/span)[1]
	private WebElement testSeries;

	@FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[1]/a/p") //		(//span[contains(text(),'Prelims Test Series')])[1]			//*[@id='basic-navbar-nav']/div/div/ul/li[1]
	private WebElement prelimsTestSeries;

	@FindBy(xpath = "//*[@class='flex justify-center items-center z-10']")
	private WebElement filterBtn;

	@FindBy(xpath = "(*//*[@class='modal-content']/div[2]/div/div/div/div)[1]")
	private WebElement chooseYear;

	@FindBy(xpath = "(*//*[@class='modal-content']/div[2]/div/div/div/div)[2]")
	private WebElement selectSubject;

	@FindBy(xpath = "(//*[@class='modal-content']/div[2]/div/div/div/div)[3]")
	private WebElement chooseMedium;

	@FindBy(xpath = "(*//*[@class='modal-content']/div[2]/div/div/div/div)[4]")
	private WebElement numberOfTests;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement applyBtn;

	// Click on Test series title
	public PrelimsTestSeries clickTestSeries() throws InterruptedException {
		synchronized (driver) {
			driver.wait(4000);
		}
		Actions act = new Actions(driver);
		act.moveToElement(testSeries).perform();
		testSeries.click();
		return this;
	}

	// Click on Prelims test series
	public PrelimsTestSeries clickPrelimsTestSeries() throws InterruptedException {
		synchronized (driver) {
			driver.wait(2000);
		}
		//		Actions act = new Actions(driver);
		//		act.moveToElement(prelimsTestSeries).perform();

		//		JavascriptExecutor js = (JavascriptExecutor)driver;
		//       js.executeScript("arguments[0].click();", testSeries);

		prelimsTestSeries.click();
		synchronized (driver) {
			driver.wait(3000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Prelims Test Series ");
		return this;
	}

	// Clicking on Filter button
	public PrelimsTestSeries clickFilter() throws InterruptedException {
		synchronized (driver) {
			driver.wait(4000);
		}
		filterBtn.click();
		return this;
	}

	// Select year
	public PrelimsTestSeries chooseYear() throws InterruptedException, AWTException {
		synchronized (driver) {
			driver.wait(1000);
		}
		chooseYear.click();

/*
		Robot cat = new Robot();
		for (int i = 0; i < 4; i++) {
			cat.keyPress(KeyEvent.VK_TAB);
			cat.keyRelease(KeyEvent.VK_TAB);
			cat.keyPress(KeyEvent.VK_SPACE);
			cat.keyRelease(KeyEvent.VK_SPACE);
			synchronized (driver) {
				driver.wait(2000);
			}
		}
	*/
		//Dynamic selection using Random class
		List<WebElement> numberOfYears =driver.findElements(By.xpath("//div[contains(@class,'show dropdown')]/div/div/div/input"));


		// Getting size of options available
					int size = numberOfYears.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


					// Selecting random value
					numberOfYears.get(randnMumber).click();

					Thread.sleep(2000);


					synchronized (driver) {
						driver.wait(2000);
					}
		return this;
	}

	// Select Subject
	public PrelimsTestSeries selectSubject() throws InterruptedException, AWTException {
		selectSubject.click();
		synchronized (driver) {
			driver.wait(1000);
		}

/*		Robot cat = new Robot();
		for (int i = 0; i < 3; i++) {
			cat.keyPress(KeyEvent.VK_TAB);
			cat.keyRelease(KeyEvent.VK_TAB);
			synchronized (driver) {
				driver.wait(1000);
			}
		}

		cat.keyPress(KeyEvent.VK_SPACE);
		cat.keyRelease(KeyEvent.VK_SPACE);
*/
		//Dynamic selection using Random class
				List<WebElement> numberOfYears =driver.findElements(By.xpath("//div[contains(@class,'show dropdown')]/div/button/div/p"));


				// Getting size of options available
							int size = numberOfYears.size();

							// Generate a random number with in range
							int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


							// Selecting random value
							numberOfYears.get(randnMumber).click();

							Thread.sleep(2000);


							selectSubject.click();
							synchronized (driver) {
								driver.wait(2000);
							}
		return this;
	}

	// Select Medium
	public PrelimsTestSeries chooseMedium() throws InterruptedException, AWTException {
		chooseMedium.click();
		synchronized (driver) {
			driver.wait(1000);
		}
/*		Robot cat = new Robot();
		cat.keyPress(KeyEvent.VK_TAB);
		cat.keyRelease(KeyEvent.VK_TAB);
		cat.keyPress(KeyEvent.VK_SPACE);
		cat.keyRelease(KeyEvent.VK_SPACE);
*/
		//Dynamic selection using Random class
		List<WebElement> numberOfYears =driver.findElements(By.xpath("//div[contains(@class,'show dropdown')]/div/button/div/p"));

		// Getting size of options available
					int size = numberOfYears.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


					// Selecting random value
					numberOfYears.get(randnMumber).click();

					Thread.sleep(2000);


					chooseMedium.click();
					synchronized (driver) {
						driver.wait(2000);
					}
		return this;
	}

	// Select Number of Tests
	public PrelimsTestSeries numberOfTests() throws InterruptedException, AWTException {
		numberOfTests.click();
		synchronized (driver) {
			driver.wait(1000);
		}
/*		Robot cat = new Robot();
		for (int i = 0; i < 4; i++) {
			cat.keyPress(KeyEvent.VK_TAB);
			cat.keyRelease(KeyEvent.VK_TAB);
			cat.keyPress(KeyEvent.VK_SPACE);
			cat.keyRelease(KeyEvent.VK_SPACE);
			synchronized (driver) {
				driver.wait(2000);
			}
		}
		*/
		//Dynamic selection using Random class
		List<WebElement> numberOfYears =driver.findElements(By.xpath("//div[contains(@class,'show dropdown')]/div/div/div/input"));

		// Getting size of options available
					int size = numberOfYears.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


					// Selecting random value
					numberOfYears.get(randnMumber).click();

					Thread.sleep(2000);


					numberOfTests.click();
					synchronized (driver) {
						driver.wait(2000);
					}
		return this;
	}
	// Clicking on Filter button
		public PrelimsTestSeries clickApply() throws InterruptedException {
			applyBtn.click();
			synchronized (driver) {driver.wait(5000);}


	//	WebElement Courses =driver.findElements(By.xpath("//*[@class='Home_main__OVLM4']/div/div[3]/div/div"));
		WebElement Courses = driver.findElement(By.xpath("//*[@class='Home_main__OVLM4']/div/div[3]/div/div"));


			if(Courses.isDisplayed()) {
				List<WebElement> noOfCourses =driver.findElements(By.xpath("//*[@class='Home_main__OVLM4']/div/div[3]/div/div"));
				for (WebElement courseModule : noOfCourses)
				{
					String detailsOfCourse = courseModule.getText();
					for(int i=0; i<noOfCourses.size(); i++)
						{
							System.out.println("************");
						}
					System.out.println(detailsOfCourse);
					synchronized (driver) {driver.wait(2000);}

					extentTest.info(detailsOfCourse);
					extentTest.info(detailsOfCourse);

					synchronized (driver) {driver.wait(2000);}

				}
			}

			else {
				boolean nodata = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[3]/div/div/span/img")).isDisplayed();
				synchronized (driver) {driver.wait(2000);}
				System.out.println(nodata);
				//	extentTest.info(nodata);
					String path = captureScreenShotBase64(getDriver());
					extentTest.addScreenCaptureFromBase64String(path, "No Data Found ");
					extentTest.pass("After Filter No data available");

				}
			return this;
		}

		//Selecting Random Page
		public PrelimsTestSeries clickPage() throws InterruptedException {

			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,400)", "");

			synchronized (driver) {
				driver.wait(2000);
			}

			List<WebElement> numberOfPages =driver.findElements(By.xpath("//div[contains(@class,'flex md:justify-end !items-center sm:flex-col md:flex-col lg:flex-row !p-0 ')]/ul/li"));

			for (WebElement option : numberOfPages) {
				String optionPage = option.getText();
		/*
		 * if(optionPage.equals("11")) { option.click(); }
		 */

				System.out.println(optionPage);
			}

			// Getting size of options available
						int size = numberOfPages.size();

						// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


						// Selecting random value
						numberOfPages.get(randnMumber).click();
						Thread.sleep(2000);

						synchronized (driver) {
							driver.wait(2000);
						}

			return this;
		}


}
