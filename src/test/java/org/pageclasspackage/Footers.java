package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Footers extends VisionBaseClass {
	
	WebDriver driver;
	public Footers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public boolean getCoursesLabel() {
		return driver.findElement(By.xpath("//*[@class='xl:flex ']/section[2]/div/div/h2/button")).isDisplayed();
	}


	public WebElement clickHome() throws InterruptedException { 	//	(//*[@class='accordion-collapse collapse'])[1]/div/ul/li[1]
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement home = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[1])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", home);
		Thread.sleep(5000);
		home.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
//		jk.executeScript("arguments[0].click()", home);
		return home;
	}
	public WebElement clickPrelimsTestSeries() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement prelims = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[2])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", prelims);
		Thread.sleep(5000);
		prelims.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
//		jk.executeScript("arguments[0].click()", prelims);
		return prelims;
	}
	public WebElement clickMainsTestSeries() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement mains = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[3])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", mains);
		Thread.sleep(5000);
		mains.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
//		jk.executeScript("arguments[0].click()", mains);
		return mains;
	}
	public WebElement clickClassRoom() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement classRoom = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[4])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", classRoom);
		Thread.sleep(5000);
		classRoom.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
//		jk.executeScript("arguments[0].click()", classRoom);
		return classRoom;
	}
	public WebElement clickInterview() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement interview = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[5])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", interview);
		Thread.sleep(5000);
		interview.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
//		jk.executeScript("arguments[0].click()", interview);
		return interview;
	}

	public boolean getServices() {
		return driver.findElement(By.xpath("//*[@class='xl:flex ']/section[2]/div/div[2]/h2/button")).isDisplayed();
	}

	public WebElement clickAbhyaas() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement abhyaas = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[1])[2]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", abhyaas);
		Thread.sleep(2000);
		abhyaas.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
		return abhyaas;
	}
	public WebElement clickClassroomDemo() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement classRoomDemo = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[2])[2]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", classRoomDemo);
		Thread.sleep(2000);
		classRoomDemo.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
		return classRoomDemo;
	}
	public WebElement clickOpenTest() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement openTest = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[3])[2]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", openTest);
		Thread.sleep(2000);
		openTest.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
		return openTest;
	}
	public WebElement clickResources() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement resources = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[4])[2]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", resources);
		Thread.sleep(2000);
		resources.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
		return resources;
	}
	public WebElement clickOurCenters() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement ourCenters = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[5])[2]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", ourCenters);
		Thread.sleep(2000);
		ourCenters.click();
		Thread.sleep(2000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " screenshot ");
		return ourCenters;
	}

	public boolean getCompany() {
		return driver.findElement(By.xpath("//*[@class='xl:flex ']/section[2]/div/div[3]/h2/button")).isDisplayed();
	}
	public WebElement clickTermsofUse() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement termsOfUse = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[1])[3]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", termsOfUse);
		Thread.sleep(2000);
		termsOfUse.click();
		Thread.sleep(3000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Terms of Use ");
		return termsOfUse;
	}
	public String getTermsofUse() throws InterruptedException {
		WebElement termsOfUse = driver.findElement(By.xpath("//h4[contains(text(),'Terms of Use')]"));
		Thread.sleep(2000);
		String text = termsOfUse.getText();
		return text;
	}


	public WebElement clickPrivacyPolicy() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement privacyPolicy = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[2])[3]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", privacyPolicy);
		Thread.sleep(2000);
		privacyPolicy.click();
		Thread.sleep(3000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Privacy Policy ");
		return privacyPolicy;
	}
	public WebElement clickRefundPolicy() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement refundPolicy = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[3])[3]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", refundPolicy);
		Thread.sleep(2000);
		refundPolicy.click();
		Thread.sleep(3000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Refund Policy ");
		return refundPolicy;
	}
	public WebElement clickCareers() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement careers = driver.findElement(By.xpath("(//*[@class='xl:flex ']/section[2]/div/div/div/div/ul/li[4])[3]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", careers);
		Thread.sleep(2000);
		careers.click();
		Thread.sleep(3000);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Careers ");
		return careers;
	}
}
