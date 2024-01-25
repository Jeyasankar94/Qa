package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentAffairsPage extends VisionBaseClass{

	WebDriver driver;
	public CurrentAffairsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[1]")
	private WebElement newsTodayEnglish;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[2]")
	private WebElement newsTodayHindi;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[3]")
	private WebElement weeklyFocus;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[4]")
	private WebElement monthlyCurrentAffairs;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[5]")
	private WebElement hindiMagazine;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[6]")
	private WebElement pt365;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[7]")
	private WebElement mains365;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[8]")
	private WebElement economicSurvey;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[9]")
	private WebElement unionBudget;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[10]")
	private WebElement interview;

	@FindBy (xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[11]")
	private WebElement valueAddedMaterial;

	// back button in current affairs page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement backButton;

	//(//*[@role='button'])[3]/div/span

	// CA  refers to ---> Current Affairs Page

	// clicking the News Today English module in current affairs page

	public void clickCANewsTodayEnglish() {

		newsTodayEnglish.click();

	}

	// clicking the News Today Hindi module in current affairs page

	public void clickCANewsTodayHindi() {

		newsTodayHindi.click();

	}

	// clicking the Weekly Focus module in current affairs page

	public void clickCAWeeklyFocus() {

		weeklyFocus.click();

	}

	// clicking the Monthly Current Affairs module in current affairs page

	public void clickCAMonthlyCurrentAffairs() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		monthlyCurrentAffairs.click();

	}

	// clicking the Hindi Magazine module in current affairs page

	public void clickCAHindiMagazine() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		hindiMagazine.click();

	}

	// clicking the PT365 module in current affairs page

	public void clickCAPt365() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		pt365.click();

	}

	// clicking the Mains365 module in current affairs page

	public void clickCAMains365() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		mains365.click();

	}

	// clicking the Economic survey module in current affairs page

	public void clickCAEconomicSurvey() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		economicSurvey.click();

	}

	// clicking the Union Budget module in current affairs page

	public void clickCAUnionBudget() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		unionBudget.click();

	}

	// clicking the Interview module in current affairs page

	public void clickCAInterview() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		interview.click();

	}

	// clicking the Value added material module in current affairs page

	public void clickCAValueAddedMaterial() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		valueAddedMaterial.click();

	}


	// clicking back button

	public void clickCABackBButton() {


		backButton.click();
	}
}
