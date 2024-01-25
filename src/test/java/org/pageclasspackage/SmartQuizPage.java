package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartQuizPage extends VisionBaseClass {

	WebDriver driver;
	public SmartQuizPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Filter dropdown webelement

	@FindBy(xpath = "//*[@class='dropdown']")
	private WebElement filter;

	// Filter dropdown choices

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[1]")
	private WebElement filterAllQuiz;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[2]")
	private WebElement filterMonthlyCurrentAffairs;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[3]")
	private WebElement filterPT365;

	// clicking reading material of first document
	@FindBy(xpath = "(//*[@class='sm:pr-[3rem]'])[1]/a")
	private WebElement readingMaterial;

	// clicking start quiz of first
	@FindBy(xpath = "(//*[@class='flex flex-col p-3 space-y-2'])[1]/div[3]/button")
	private WebElement startQuiz;

	// Click Filter button
	public void clickSQFilter() {
		filter.click();
	}

	// clicking filter option

	public void clickSQAll() {
		filterAllQuiz.click();
	}

	public void clickSQMCA() {
		filterMonthlyCurrentAffairs.click();
	}

	public void clickSQPT365() {
		filterPT365.click();
	}

	// clicking reading material of first document

	public void clickSQReadingMaterial() {
		readingMaterial.click();
		extentTest.info("Reading material download of Smart QUiz Page is verified");
	}

	// clicking start quiz of first document

	public void clickSQStartQuiz() {
		startQuiz.click();
	}

	// scroll down
	public void scrollDownSQ() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,700)");
	}

	// first quiz instructions page functionality
	public void firstQuizInstruction() {

		String instructionQuiz = driver.findElement(By.xpath("//*[@class='Home_main__OVLM4']/div/div/div/h4"))
				.getText();
		extentTest.info("Instructions Page Heading for Quiz Page : " + instructionQuiz);

		// English medium

		WebElement englishMedium = driver.findElement(By.xpath("(//*[@class='dark:"
				+ "text-white flex space-x-3 sm:text-sm md:text-xs lg:text-sm text-[#686E70] ']/button)[1]"));
		englishMedium.click();

		extentTest.info("English Medium is selected in Instructions Page");

		// Hindi Medium

		WebElement hindiMedium = driver.findElement(By.xpath("//*[@class='dark:"
				+ "text-white flex space-x-3 sm:text-sm md:text-xs lg:text-sm text-[#686E70] ']/button[2]"));
		hindiMedium.click();
		extentTest.info("Hindi Medium is selected in Instructions Page");

		//Webelement for instructions Page Reading material

		WebElement instructionsPageReadingMaterial =  driver.findElement(By.xpath("//*[@class='no-underline']"));
		instructionsPageReadingMaterial.click();

		extentTest.info("Reading material download of Instructions Page of  Smart QUiz  is verified");



	}

}
