package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends VisionBaseClass {

	WebDriver driver;
	public Register(WebDriver driver) {
		this.driver=driver;
	}
	public Register() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "(//*[@class='relative']/div/div/div/div[2]/a/span)[1]")
	private WebElement classroomSeeAllCourses;

	@FindBy(xpath = "(//*[@class='relative']/div/div/div/div[2]/a/span)[2]")
	private WebElement prelimsTestSeeAllCourses;

	@FindBy(xpath = "(//*[@class='relative']/div/div/div/div[2]/a/span)[3]")
	private WebElement mainsTestSeeAllCourses;

	@FindBy(xpath = "(//*[@class=' sm:px-4']/div/div)[1]")
	private WebElement InterviewVisionStudent;

	@FindBy(xpath = "(//*[@class=' sm:px-4']/div/div)[2]")
	private WebElement InterviewNewStudent;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/div/div/p")
	private WebElement bannerText;

	// Clicking on Register button and Getting banner text
		public Register clickRegister() throws InterruptedException {
			register.click();
			synchronized (driver) {
				driver.wait(3000);
			}
			String text = bannerText.getText();
			synchronized (driver) {
				driver.wait(3000);
			}
			extentTest.info(text);
			return this;
		}
		// Clicking on See All courses in Classroom section
		public Register clickClassroomSeeAllCourses() throws InterruptedException {
			classroomSeeAllCourses.click();
			synchronized (driver) {
				driver.wait(3000);
			}
			String URL = driver.getCurrentUrl();
			synchronized (driver) {
				driver.wait(3000);
			}
			extentTest.info(URL);
			driver.navigate().back();
			return this;
		}

		// Clicking on See All courses in Prelims Test series section
		public Register clickPrelimsSeeAllCourses() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,500)", "");
			synchronized (driver) {
				driver.wait(5000);
			}
			prelimsTestSeeAllCourses.click();
			synchronized (driver) {
				driver.wait(3000);
			}
			String URL = driver.getCurrentUrl();
			synchronized (driver) {
				driver.wait(3000);
			}
			extentTest.info(URL);
			driver.navigate().back();
			return this;
		}

		// Clicking on See All courses in Mains Test series section
		public Register clickMainsSeeAllCourses() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,1000)", "");
			synchronized (driver) {
				driver.wait(5000);
			}
			mainsTestSeeAllCourses.click();
			synchronized (driver) {
				driver.wait(3000);
			}
			String URL = driver.getCurrentUrl();
			synchronized (driver) {
				driver.wait(3000);
			}
			extentTest.info(URL);
			driver.navigate().back();
			return this;
		}
		// Clicking on Interview VisionIAS student module
			public Register clickInterviewVisionStudent() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,1200)", "");
				synchronized (driver) {
					driver.wait(5000);
				}
				InterviewVisionStudent.click();
				synchronized (driver) {
					driver.wait(3000);
				}
				String URL = driver.getCurrentUrl();
				synchronized (driver) {
					driver.wait(3000);
				}
				extentTest.info(URL);
				driver.navigate().back();
				return this;
			}
			// Clicking on Interview VisionIAS student module
					public Register clickInterviewNewStudent() throws InterruptedException {
						JavascriptExecutor jk = (JavascriptExecutor) driver;
						jk.executeScript("window.scrollBy(0,1200)", "");
						synchronized (driver) {
							driver.wait(5000);
						}
						InterviewNewStudent.click();
						synchronized (driver) {
							driver.wait(3000);
						}
						String URL = driver.getCurrentUrl();
						synchronized (driver) {
							driver.wait(3000);
						}
						extentTest.info(URL);
						driver.navigate().back();
						return this;
					}
}
