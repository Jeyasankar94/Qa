package org.pageclasspackage;

import java.util.List;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Note : In video , LockScreen , Volume slider and Mini player not able to automate
// hence it should be brought under the manual testing

public class ClassRoomDemoPage extends VisionBaseClass {

	WebDriver driver;
	public ClassRoomDemoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// classRoomDemo element in the header of home page

	@FindBy(xpath = "//*[@class='lg:space-x-2 xl:space-x-3 lg:px-4 lg:!flex !hidden navbar-nav']/a[4]")
	private WebElement classRoomDemo;

	// heading text in ClassRoomDemoPage

	@FindBy(xpath = "//*[@class='sm:!max-w-[60%] ']/h4")
	private WebElement classRoomDemoHeadingText;

	// buy course in Class demo page

	@FindBy(xpath = "//*[@class='sm:!max-w-[60%] ']/button")
	private WebElement buyCourse;

	// classRoom page heading text
	// this element is present in classRoom Page.
	// when the user clicks Buy Course in Classroom demo page ,
	// it will navigate to classroom page

	@FindBy(xpath = "//*[@class='sm:!max-w-[60%] ']/h4")
	private WebElement classroomPageHeadingText;

	// class room demo subjects

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]")
	private List<WebElement> subjectsInClassRoomDemo;

	// variou subjects elements in ClassRoomDemo Page

	// ancient and medievel

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[1]")
	private WebElement ancientAndMedeivelHistory;

	// ecology and environment

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[2]")
	private WebElement ecologyAndEnvironment;

	// economics

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[3]")
	private WebElement economics;

	// ethics

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[4]")
	private WebElement ethics;

	// geography

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[5]")
	private WebElement geography;

	// hiastory of modern india

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[6]")
	private WebElement historyOfModernIndia;

	// indian and art culture

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[7]")
	private WebElement indianAndArtCulture;

	// international relations

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[8]")
	private WebElement internationalRelations;

	// polity and governance

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[9]")
	private WebElement polityAndGovernance;

	// post india independence

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[10]")
	private WebElement postIndiaIndependence;

	// security

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[11]")
	private WebElement security;

	// social change in modern india

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[12]")
	private WebElement socialChangeInModernIndia;

	// world history

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[1]/span[13]")
	private WebElement worldHistory;

	// talk To Expert Message icon

	@FindBy(xpath = "//*[@class='fixed bottom-[2rem] right-[2rem]']/span")
	private WebElement messageIcon;

	// text input field in talk to expert

	@FindBy(xpath = "//*[@class='relative']/div[2]/div/div[2]/div[2]/form/input")
	private WebElement inputFieldInTalkToExpert;

	// submit button in talk to expert

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submitInTalkToExpert;

	// reply text from talk to expert

	@FindBy(xpath = "//*[@class='relative']/div[2]/div/div[2]/div[1]/div/p[2]")
	private WebElement replyFromTalkToExpert;

	// video

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[2]/button[1]")
	private WebElement video;

	// play / pause

	@FindBy(xpath = "//*[@class='video-controls']/li/button[1]")
	private WebElement playAndPause;

	// forward button

	@FindBy(xpath = "//*[@class='skip-forward ']/img")
	private WebElement forwardButton;

	// backward button

	@FindBy(xpath = "//*[@class='skip-backward ']/img")
	private WebElement backwardButton;

	// lock button

	@FindBy(xpath = "(//*[@class='video-controls']/li/button[1])[2]")
	private WebElement lockScreen;

	// unlock the screen button

	@FindBy(xpath = "//*[@class='vision-tooltip ']")
	private WebElement unlockScreen;

	// volume button

	@FindBy(xpath = "//*[@class='volume-container']/button")
	private WebElement volumeButton;

	// volume slider

	@FindBy(xpath = "//*[@type='range']")
	private WebElement volumeSlider;

	// playback button

	@FindBy(xpath = "//*[@class='playback-content vision-tooltip']")
	private WebElement playbackButton;

	// playback speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li")
	private List<WebElement> playbackSpeeds;

	// 0.5 speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[1]")
	private WebElement speed05;

	// 0.75

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[2]")
	private WebElement speed075;

	// normal speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[3]")
	private WebElement speedNormal;

	// 1.25 speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[4]")
	private WebElement speed125;

	// 1.5 speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[5]")
	private WebElement speed15;

	// 1.75 speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[6]")
	private WebElement speed175;

	// 2.00 speed

	@FindBy(xpath = "//*[@class='speed-options d-flex show']/ul/li[7]")
	private WebElement speed2;

	// video quality

	@FindBy(xpath = "//*[@class='video-quality-container ']")
	private WebElement videoQuality;

	// various video quality options

	@FindBy(xpath = "//*[@class='video-quality-container ']/div/ul/li")
	private List<WebElement> variousQuality;

	// full screen

	@FindBy(xpath = "//*[@class='video-controls']/li/button[3]")
	private WebElement fullScreen;

	// self Test

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[2]/button[2]")
	private WebElement selfTest;

	// questions for practise

	@FindBy(xpath = "//*[@class='py-2']/h6")
	private WebElement questionsForPractise;

	// assignment

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[2]/button[3]")
	private WebElement assignment;

	// submit in assignment

	@FindBy(xpath = "//*[@class='py-4']/div/div[2]/button")
	private WebElement submitInAssignment;

	// toast message when user click submit button in Assignment

	@FindBy(xpath = "//*[@class='relative ']/div/div[2]")
	private WebElement toastAssignmentSubmissionNotAllowed;

	// feedback

	@FindBy(xpath = "(//*[@class='sm:container mx-auto sm:px-4']/div/div/div/div)[2]/button[4]")
	private WebElement feedback;

	// stars element

	@FindBy(xpath = "(//*[@class='p-[0px_15px_15px_15px] ']/div/div/div)[1]/div/span")
	private List<WebElement> starsInFeedbackPopup;

	// one star

	@FindBy(xpath = "(//*[@class='p-[0px_15px_15px_15px] ']/div/div/div)[1]/div/span[1]")
	private WebElement oneStar;

	// two star

	@FindBy(xpath = "(//*[@class='p-[0px_15px_15px_15px] ']/div/div/div)[1]/div/span[2]")
	private WebElement twoStar;

	// three star

	@FindBy(xpath = "(//*[@class='p-[0px_15px_15px_15px] ']/div/div/div)[1]/div/span[3]")
	private WebElement threeStar;

	// four star

	@FindBy(xpath = "(//*[@class='p-[0px_15px_15px_15px] ']/div/div/div)[1]/div/span[4]")
	private WebElement fourStar;

	// five star

	@FindBy(xpath = "(//*[@class='p-[0px_15px_15px_15px] ']/div/div/div)[1]/div/span[5]")
	private WebElement fiveStar;

	// ask me later

	@FindBy(xpath = "//*[@class='block']/div[2]/button[1]")
	private WebElement askMeLater;

	// next button

	@FindBy(xpath = "//*[@class='block']/div[2]/button[2]")
	private WebElement nextButton;

	// previous button in Lecture easy to understand and Class Interactive

	@FindBy(xpath = "//*[@class='block']/div[2]/button[1]")
	private WebElement previousInLectureEasyAndClassInteractive;

	// previous button in "Give Your Feedback"

	@FindBy(xpath = "//*[@class='block']/div[3]/div/button[1]")
	private WebElement previousInGiveYourFeedback;

	// write feedback

	@FindBy(xpath = "//*[@class='block']/div[3]/textarea")
	private WebElement writeFeedback;

	// submit button in feedback

	@FindBy(xpath = "//*[@class='block']/div[3]/div/button[2]")
	private WebElement submitInFeedbackPopup;

	// emailId in login

	@FindBy(xpath = "//*[@id='formGridEmail']")
	private WebElement emailIdClassRoomDemo;

	// password in login field

	@FindBy(xpath = "//*[@id='formGridPassword']")
	private WebElement passwordCartPageClassRoomDemo;

	// submit login for credentials

	@FindBy(xpath = "(//*[text()='Login'])[2]")
	private WebElement loginSubmit;

	// feedback already submitted

	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/p[2]")
	private WebElement feedbackAlreadySubmitted;

	// done button in feedback already submitted

	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/button")
	private WebElement doneInFeedbackAlreadySubmitted;

	// click classRoomDemo in the

	public void clickClassRoomDemo() {
		classRoomDemo.click();

		String text = classRoomDemoHeadingText.getText();
		extentTest.info("The heading text in ClassRoomDemo Page : " + text);

	}

	// click Ancient and Medievel  subject in class room demo page

		public void clickAncientMedeivelHistory() {

			// click Ancient and Medievel

			ancientAndMedeivelHistory.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}



	// click Ecology and Environment subject in class room demo page

	public void clickEcologyANdEnvironment() {

		// click ecology and environment

		ecologyAndEnvironment.click();

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// click Economics subject in class room demo page

		public void clickEconomics() {

			// click Economics

			economics.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click ethics subject in class room demo page

		public void clickEthics() {

			// click ethics

			ethics.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click Geography subject in class room demo page

		public void clickGeography() {

			// click Geography

			geography.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click History Of Modern India subject in class room demo page

		public void clickHistpryOfModernIndia() {

			// click History Of Modern India

			historyOfModernIndia.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click Indian Art and Culture subject in class room demo page

		public void clickIndianArtAndCulture() {

			// click Indian Art and Culture

			indianAndArtCulture.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click International Relations subject in class room demo page

		public void clickIntyernaltionalRelation() {

			// click International Relations

			internationalRelations.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click polity and govertnance subject in class room demo page

		public void clickPolityAndGovernance() {

			// click polity and govertnance

			polityAndGovernance.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click Post Independance India subject in class room demo page

		public void clickPostIndependanceIndia() {

			// click Post Independance India

			postIndiaIndependence.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click security subject in class room demo page

		public void clickSecurity() {

			// click security subject

			security.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click Social Change In Modern India subject in class room demo page

		public void clickSocialChangeInModernIndia() {

			// click Social Change In Modern India

			socialChangeInModernIndia.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click World History subject in class room demo page

		public void clickWorldHistory() {

			// click World History

			worldHistory.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}




	// verify Buy Course in classRoomDemo Page

	public void verifyBuyCourse() {

		// click buy course in class room demo page

		buyCourse.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String classroomPageHeadingString = classroomPageHeadingText.getText();

		extentTest.info("Class Room heading text : " + classroomPageHeadingString);

		extentTest.info("Buy Course in classroom Demo Page is verified");

		backward(getDriver());

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// verify talk to expert

	public void verifyTalkToExpert() {

		// click talk to expert message icon
		messageIcon.click();

		// send key in input of talk to expert
		inputFieldInTalkToExpert.sendKeys(
				"The classes were understandable and I felt it met the standards of the UPSC. Need to contact to discuss the joining process");

	// click submit in the talk to expert
		submitInTalkToExpert.click();

		// time gap to get the reply

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// get the reply text in talk to expert
		String replyFromTalkToExpertText = replyFromTalkToExpert.getText();

		extentTest.info("Reply from the Talk To Expert is : "+replyFromTalkToExpertText);


	}

	// verify video

	public void verifyVideo() {
		// click video

		video.click();

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,300)");

		// two seconds wait for scrolling down

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click play button

		playAndPause.click();

		// playing the video for 5 seconds

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click full screen

		fullScreen.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// three seconds wait to check whether forward button is working

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// three seconds wait to check whether backward button is working

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click playback button

		playbackButton.click();

		// click various options in playback speed

		for (WebElement playbackSpeed : playbackSpeeds) {

			// clicking every playback speed button

			jk.executeScript("arguments[0].click();", playbackSpeed);

			// playbackSpeed.click();

			synchronized (driver) {
				try {
					driver.wait(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click video quality

		videoQuality.click();

		// click various video quality in video quality pop-up

		// in below for loop , We negelect first & last option in video quality pop-up
		// because first option is Qulaity & last option is Report option .
		// clicking these two will lead to exception so we're concentrating only on
		// various quality options in HD quality

		for (int i = 1; i < variousQuality.size() - 1; i++) {

			// clicking the various video quality option one by one

			variousQuality.get(i).click();

			synchronized (driver) {
				try {
					driver.wait(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		// click full screen

		fullScreen.click();

		// scroll up

		jk.executeScript("window.scroll(0,-300)");

		synchronized (driver) {
			try {
				driver.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// verify self Test

	public void verifySelfTest() {

		// clcik self Test

		selfTest.click();

		// to scroll down to get the element

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,200)");

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// get the text of Questions for practise

		String QuestionsForPracxtiseText = questionsForPractise.getText();

		extentTest.info("Questions for practise text : " + QuestionsForPracxtiseText);

		extentTest.info("Self Test option in class room demo page is verified ");

		// scrolling up to the starting point

		jk.executeScript("window.scroll(0,-100)");
	}

	// verify assignment

	public void verifyAssignment() {

		// click assignment

		assignment.click();

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click in submit button

		submitInAssignment.click();

		// get toast message

		String toastText = toastAssignmentSubmissionNotAllowed.getText();

		extentTest.info("Toast message when we click submit in Assignment :  " + toastText);

		extentTest.info("Assignment option in class room demo page is verified");

	}

	// verify feedback

	public void verifyFeedback() {

		// click feedback

		feedback.click();

		// click star one by one in was the class informative pop-up\

		for (WebElement star : starsInFeedbackPopup) {
			star.click();
		}


		// click next was the class informative pop-up

		nextButton.click();

		// click star one by one in was the lecture easy to understand

		for (WebElement star : starsInFeedbackPopup) {

			star.click();
		}

		// click next in was the lecture easy to understand pop-up

		nextButton.click();

		// click star one by one in was class interactive

		for (WebElement star : starsInFeedbackPopup) {
			star.click();
		}

		// click next in was class interactive

		nextButton.click();

		// send keys to write feedback

		writeFeedback
				.sendKeys("The classes were informative , understandable and matching the demands of UPSC standards");

		// click previous in write feedback

		previousInGiveYourFeedback.click();

		// click previous in was class interactive

		previousInLectureEasyAndClassInteractive.click();

		// click previous in lecture easy to understand

		previousInLectureEasyAndClassInteractive.click();

		// click stars one by one again to check whether it can be deselected or again
		// selected

		// click star one by one in was the class informative pop-up

		for (WebElement star : starsInFeedbackPopup) {
			star.click();
		}
		// click next was the class informative pop-up

		nextButton.click();

		// click star one by one in was the lecture easy to understand

		for (WebElement star : starsInFeedbackPopup) {

			star.click();
		}

		// click next in was the lecture easy to understand pop-up

		nextButton.click();

		// click star one by one in was class interactive

		for (WebElement star : starsInFeedbackPopup) {
			star.click();
		}

		// click next in was class interactive

		nextButton.click();

		// click submit button in write feedback

		submitInFeedbackPopup.click();

		// send email id

		emailIdClassRoomDemo.sendKeys(email);

		// send password

		passwordCartPageClassRoomDemo.sendKeys(password);

		// click login button

		// Create an Actions object
		Actions actions = new Actions(driver);

		// Click on the search button using the Actions object
		actions.doubleClick(loginSubmit).perform();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String feedbackSubmittedText = feedbackAlreadySubmitted.getText();
		extentTest.info("Successful verification of feedback submission : " + feedbackSubmittedText);

		doneInFeedbackAlreadySubmitted.click();
		extentTest.info("Feedback option in class room demo page is verified ");

	}

}
