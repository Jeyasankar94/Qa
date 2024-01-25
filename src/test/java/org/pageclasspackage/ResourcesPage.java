package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage extends VisionBaseClass {

	WebDriver driver;
	public ResourcesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text() = 'Resources'])[1]")
	private WebElement resources;

	@FindBy(xpath = "(//*[@class='card-title h5'])[1]")
	private WebElement currentAffairs;

	//(//*[@class='contents'])[1]/div[1]

	@FindBy(xpath = "(//*[@class='card-title h5'])[2]")
	private WebElement smartQuiz;

	@FindBy(xpath = "(//*[@class='card-title h5'])[3]")
	private WebElement quickRevisionMaterial;

	@FindBy(xpath = "(//*[@class='card-title h5'])[4]")
	private WebElement infographics;

	@FindBy(xpath = "(//*[@class='card-title h5'])[5]")
	private WebElement airNewsAnalysis;

	@FindBy(xpath = "(//*[@class='card-title h5'])[6]")
	private WebElement upscPaperSolution;

	@FindBy(xpath = "(//*[@class='card-title h5'])[7]")
	private WebElement talksAndInterview;

	@FindBy(xpath = "(//*[@class='card-title h5'])[8]")
	private WebElement toppersAnswerCopy;

	@FindBy(xpath = "(//*[@class='card-title h5'])[9]")
	private WebElement researchAndAnalysis;

	public void ClickResources() {
		resources.click();
	}

	public void clickCurrentAffairs() {

		// JavaScript to scrolldown to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Clicks the current affairs module in Resource page

		currentAffairs.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// getting the url of current affairs resource page

		String url = driver.getCurrentUrl();

		extentTest.info("Url of Current Affairs Page" +url);

	}

	public void clickSmartQuiz() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//clicking the smart quiz module

		smartQuiz.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//getting the url of navigated page

		String url2 = driver.getCurrentUrl();

		extentTest.info("Url of Smart Quiz Page : "+url2);


	}

	public void quickRevisionMaterial() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//clicking the Quick Revision Material module
		quickRevisionMaterial.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//getting the url of navigated page

		String url3 = driver.getCurrentUrl();

		extentTest.info("Url of Quick Revision Material Page :" +url3);


	}

	public void clickInfographics() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//to click the infographics module

		infographics.click();


		String url4 = driver.getCurrentUrl();

		extentTest.info("Url of Infographics Page  : "+url4);


	}

	public void airNewAnalysis() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//to click the AIR News Analysis

		airNewsAnalysis.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String url4 = driver.getCurrentUrl();

		extentTest.info("Url of AIR News Analysis" +url4);


	}

	public void upscPaperSolution() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// to click UPSC Paper Solution

		upscPaperSolution.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String url4 = driver.getCurrentUrl();

		extentTest.info("Url of UPSC Paper Solution :"+url4);

		}

	public void talksAndInterviews() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//to click the Talks and Interview module

		talksAndInterview.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String url4 = driver.getCurrentUrl();

		extentTest.info("Url of Talks And Interviews "+url4);


	}

	public void clickToppersAnswerCopy() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//to click Toppers Answer Copy

		toppersAnswerCopy.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String url4 = driver.getCurrentUrl();

		extentTest.info("Url of Toppers Answers Copy : "+url4);


	}

	public void clickResearchAndAnalysis() {

		//to scroll down to locate the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//to click the Research and Analysis

		researchAndAnalysis.click();


		String url4 = driver.getCurrentUrl();

		extentTest.info("Url of Research and Analysis : " +url4);



	}

}
