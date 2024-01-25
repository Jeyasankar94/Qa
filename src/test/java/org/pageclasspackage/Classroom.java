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

public class Classroom extends VisionBaseClass {

	WebDriver driver;
	public Classroom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[@class='Home_container__97eC3 ']/div/div/nav/div/div/div[2]/div/a/p)[1]")
	private WebElement classroom;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/div/div/main")
	private WebElement bannerText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div/div[3]/div/div/div")
	private List<WebElement> foundcourse;

	@FindBy(xpath = "//*[@class='flex justify-center items-center z-10']")
	private WebElement filterBtn;

	@FindBy(xpath = "(//*[@class='flex sm:flex-col items-start md:gap-4 ']/div/div/div)[1]")
	private WebElement selectYear;

	@FindBy(xpath = "(//*[@class='flex sm:flex-col items-start md:gap-4 ']/div/div/div)[2]")
	private WebElement selectSubject;

	@FindBy(xpath = "(//*[@class='flex sm:flex-col items-start md:gap-4 ']/div/div/div)[3]")
	private WebElement selectClassMode;

	@FindBy(xpath = "(//*[@class='flex sm:flex-col items-start md:gap-4 ']/div/div/div)[4]")
	private WebElement selectMedium;

	@FindBy(xpath = "(//*[@class='flex sm:flex-col items-start md:gap-4 ']/div/div/div)[5]")
	private WebElement selectCenter;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement ApplyBtn;

	@FindBy(xpath = "//div[contains(@class,'show dropdown')]/div/div/div/input")
	   private  List<WebElement> selectAnyYear;

	@FindBy(xpath = "(//*[@id=\"dropdown-basic\"]/p)[1]")
	private WebElement enteredYear;

	@FindBy(xpath = "//div[contains(@class,'show dropdown')]/div/button/div/p")
	   private  List<WebElement> selectAnySubject;

	@FindBy(xpath = "(//*[@id=\"dropdown-basic\"]/p)[2]")
	private WebElement enteredSubject;

	@FindBy(xpath = "//div[contains(@class,'show dropdown')]/div/button/div/p")
	private List<WebElement> classMode;

	@FindBy(xpath = "(//*[@id=\"dropdown-basic\"])[3]")
	private WebElement enteredMode;

	@FindBy(xpath = "//div[contains(@class,'show dropdown')]/div/button/div/p")
	private List<WebElement> selectAnyMedium;

	@FindBy(xpath = "(//*[@id=\"dropdown-basic\"])[4]")
	private WebElement enteredMedium;

	@FindBy(xpath = "//div[contains(@class,'show dropdown')]/div/div/div")
	private List<WebElement> selectAnyCenter;

	@FindBy(xpath = "(//*[@id=\"dropdown-basic\"]/p)[3]")
	private WebElement enteredCenter;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div/div[4]/div/ul/li/a")
	private List<WebElement> pagination;

	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div/div/div/a/button")
	private List<WebElement> courseDate;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div/div[1]/div[2]/div/div[3]/button")
	private WebElement buyNowButton;

	// Clicking on Class room title
		public Classroom clickClassroom() throws InterruptedException {
			classroom.click();
			synchronized (driver) {driver.wait(3000);}

			String banner = bannerText.getText();

			String url = driver.getCurrentUrl();
			extentTest.info(url);
			return this;
		}

		// Clicking on Foundation course English 2024
		public Classroom clickFoundationCourse() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,400)", "");

			synchronized (driver) {driver.wait(3000);}
			//Dynamic selection using Random class
			for (WebElement option : foundcourse) {

				String optionCourse = option.getText();
				System.out.println(optionCourse);

			}
			// Getting size of options available
				int size = foundcourse.size();

			// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
				foundcourse.get(randnMumber).click();

			return this;
		}

		// Select Date of courses
		public Classroom clickDate() throws InterruptedException {
					// Getting size of options available
					int size = courseDate.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					// Selecting random value
					courseDate.get(randnMumber).click();

					synchronized (driver) {driver.wait(5000);}
					String url = driver.getCurrentUrl();
					extentTest.info(url);

					return this;
			}

		// Clicking on Buy Now button
		public Classroom clickonBuyNowButton() throws InterruptedException {
			buyNowButton.click();
			synchronized (driver) {driver.wait(3000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);
			return this;
		}

		// Clicking on Filter button
		public Classroom clickFilter() throws InterruptedException {
			synchronized (driver) {driver.wait(3000);}
			filterBtn.click();
			return this;
		}

		// Clicking on Apply button
		public Classroom clickApply() throws InterruptedException {
				ApplyBtn.click();
				return this;
				}
		// Select year
		public Classroom selectYear() throws InterruptedException, AWTException {
			synchronized (driver) {driver.wait(2000);}
			selectYear.click();

/*			//Selecting static value from the dropdown
			Robot cat = new Robot();
			for (int i = 0; i < 4; i++) {
				cat.keyPress(KeyEvent.VK_TAB);
				cat.keyRelease(KeyEvent.VK_TAB);
				cat.keyPress(KeyEvent.VK_SPACE);
				cat.keyRelease(KeyEvent.VK_SPACE);
				synchronized (driver) {driver.wait(2000);}
			}
				selectYear.click();
*/
			//Dynamic selection using Random class
			for (WebElement option : selectAnyYear) {

				String optionYear = option.getText();
				System.out.println(optionYear);

			}
			// Getting size of options available
				int size = selectAnyYear.size();

			// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
				selectAnyYear.get(randnMumber).click();

				synchronized (driver) {driver.wait(2000);}
				String year = enteredYear.getText();
				extentTest.info("Selected Year "+year);
			return this;
		}

		// Select Subject
		public Classroom selectSubject() throws InterruptedException, AWTException {
			selectSubject.click();
			synchronized (driver) {driver.wait(2000);}
/*			Robot cat = new Robot();
			for (int i = 0; i < 3; i++) {
				cat.keyPress(KeyEvent.VK_TAB);
				cat.keyRelease(KeyEvent.VK_TAB);
			synchronized (driver) {driver.wait(2000);}
			}
			cat.keyPress(KeyEvent.VK_SPACE);
			cat.keyRelease(KeyEvent.VK_SPACE);
			//			selectSubject.click();
*/

			// Getting size of options available
			int size = selectAnySubject.size();

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
			selectAnySubject.get(randnMumber).click();

			synchronized (driver) {driver.wait(2000);}
			String sub = enteredSubject.getText();
			extentTest.info("Selected Subject "+sub);

			return this;
		}

		// Select Class mode
		public Classroom selectClassMode() throws InterruptedException, AWTException {
			selectClassMode.click();
			synchronized (driver) {driver.wait(2000);}
/*			Robot cat = new Robot();
			cat.keyPress(KeyEvent.VK_TAB);
			cat.keyRelease(KeyEvent.VK_TAB);
			cat.keyPress(KeyEvent.VK_SPACE);
			cat.keyRelease(KeyEvent.VK_SPACE);
			synchronized (driver) {driver.wait(2000);}
			//	 selectClassMode.click();
*/

			// Getting size of options available
			int size = classMode.size();

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
			classMode.get(randnMumber).click();

			synchronized (driver) {driver.wait(2000);}
			String subMode = enteredMode.getText();
			extentTest.info("Selected Class Mode "+subMode);

			return this;
		}

		// Select Medium
		public Classroom selectMedium() throws InterruptedException, AWTException {
			selectMedium.click();
			synchronized (driver) {driver.wait(2000);}
/*			Robot cat = new Robot();
			cat.keyPress(KeyEvent.VK_TAB);
			cat.keyRelease(KeyEvent.VK_TAB);
			cat.keyPress(KeyEvent.VK_SPACE);
			cat.keyRelease(KeyEvent.VK_SPACE);
			synchronized (driver) {driver.wait(2000);}
			selectMedium.click();
			synchronized (driver) {driver.wait(2000);}
*/

			// Getting size of options available
			int size = selectAnyMedium.size();

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
			selectAnyMedium.get(randnMumber).click();

			synchronized (driver) {driver.wait(2000);}
			String subMedium = enteredMedium.getText();
			extentTest.info("Selected Class Medium "+subMedium);

			return this;
		}

		// Select Center
		public Classroom selectCenter() throws InterruptedException, AWTException {
			selectCenter.click();

/*			Robot cat = new Robot();
			for (int i = 0; i < 4; i++) {
				cat.keyPress(KeyEvent.VK_TAB);
				cat.keyRelease(KeyEvent.VK_TAB);
				cat.keyPress(KeyEvent.VK_SPACE);
				cat.keyRelease(KeyEvent.VK_SPACE);
				synchronized (driver) {driver.wait(2000);}
			}
				selectCenter.click();
*/
			// Getting size of options available
				int size = selectAnyCenter.size();

			// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


			// Selecting random value
				selectAnyCenter.get(randnMumber).click();

				synchronized (driver) {driver.wait(2000);}
				String center = enteredCenter.getText();
				extentTest.info("Selected Center "+center);

			return this;
		}
		//Selecting Random Page
		public Classroom clickPage() throws InterruptedException {

			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,800)", "");

			synchronized (driver) {driver.wait(2000);}
			for (WebElement option : pagination) {
				String optionPage = option.getText();

		//  if(optionPage.equals("11")) {
		//		option.click(); }
			}

			// Getting size of options available
			int size = pagination.size();

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
			pagination.get(randnMumber).click();
			Thread.sleep(2000);

			synchronized (driver) {driver.wait(2000);}
			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Page ");
			extentTest.pass("Succesfully Clicked Pagination");


			return this;
		}


}
