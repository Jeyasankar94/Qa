package org.pageclasspackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Centers extends VisionBaseClass{

	WebDriver driver;
	public Centers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='relative lg:py-3 w-full lg:w-auto'][2]/div/span")
	   private  WebElement centers;

	@FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[1]/a/p")
	   private  WebElement ahmedabad;

	  @FindBy(xpath = "//button[@href='/counseling/ahmedabad']")
	  private WebElement freeCounselingAhmedabad;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[2]/a/p")
	   private  WebElement bhopal;

	  @FindBy(xpath = "//button[@href='/counseling/bhopal']")
	  private WebElement freeCounselingBhopal;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[3]/a/p")
	   private  WebElement chandigarh;

	  @FindBy(xpath = "//button[@href='/counseling/chandigarh']")
	  private WebElement freeCounselingChandigarh;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[4]/a/p")
	  private WebElement  delhi;

	  @FindBy(xpath = "//*[@class='flex flex-col']/div[2]/div[1]/button")
	   private  WebElement buyCourse;

	  @FindBy(xpath = "//*[@class='modal-content sm:!rounded-t-xl']/div/div[2]/button")
	  private List<WebElement> regFoundCourseDate ;

	  @FindBy(xpath = "(//*[@class='flex flex-col']/div[2]/div/button)[2]")
	   private  WebElement buyCourse2;

	  @FindBy(xpath = " //button[@href='/counseling/delhi']")
	  private WebElement freeCounseling;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[5]/a/p")
	   private  WebElement guwahati;

	  @FindBy(xpath = "//button[@href='/counseling/guwahati']")
	  private WebElement freeCounselingGuwahati;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[6]/a/p")
	   private  WebElement hyderabad;

	  @FindBy(xpath = "//button[@href='/counseling/hyderabad']")
	  private WebElement freeCounselingHyderabad;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[7]/a/p")
	   private  WebElement jaipur;

	  @FindBy(xpath = "//button[@href='/counseling/jaipur']")
	  private WebElement freeCounselingJaipur;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[8]/a/p")
	   private  WebElement jodhpur;

	  @FindBy(xpath = "//button[@href='/counseling/jodhpur']")
	  private WebElement freeCounselingJodhpur;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[9]/a/p")
	   private  WebElement lucknow;

	  @FindBy(xpath = "//button[@href='/counseling/lucknow']")
	  private WebElement freeCounselingLucknow;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[10]/a/p")
	   private  WebElement prayagraj;

	  @FindBy(xpath = "//button[@href='/counseling/prayagraj']")
	  private WebElement freeCounselingPrayagraj;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[11]/a/p")
	   private  WebElement pune;

	  @FindBy(xpath = "//button[@href='/counseling/pune']")
	  private WebElement freeCounselingPune;

	  @FindBy(xpath = "//*[@class='lg:block hidden']/ul/li[12]/a/p")
	   private  WebElement sikar;

	  @FindBy(xpath = "//button[@href='/counseling/sikar']")
	  private WebElement freeCounselingSikar;


	public Centers clickCenters() {
		Actions act = new Actions(driver);
		act.moveToElement(centers).perform();
		 centers.click();
		return this;
	}
	//Click on  Ahmedabad
	public Centers clickAhmedabad() throws InterruptedException {
		Actions act = new Actions(driver);
	    act.moveToElement(ahmedabad).perform();
		synchronized (driver) {driver.wait(2000);}

		ahmedabad.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Ahmedabad ");
		extentTest.info("Clicked Ahmedabad");
		extentTest.pass("Successfully clicked Ahmedabad ");

		return this;
	}
	//Click on the button -  Ahmedabad - Click here for Free Counseling
	public Centers ahmedabadClickhereforFreeCounseling() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,3500)", "");
			synchronized (driver) {driver.wait(2000);}

			freeCounselingAhmedabad.click();

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, "Ahmedabad -  Click here for Free Counseling  ");
			extentTest.info("Clicked Ahmedabad- Click here for Free Counseling");
			extentTest.pass("Successfully clicked Ahmedabad- Click here for Free Counseling ");

			synchronized (driver) {driver.wait(4000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url)			;

					return this;
				}
	//Click on  Bhopal
		public Centers clickBhopal() throws InterruptedException {
			Actions act = new Actions(driver);
		    act.moveToElement(bhopal).perform();
			synchronized (driver) {driver.wait(2000);}

			bhopal.click();
			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);
			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Bhopal ");
			extentTest.info("Clicked Bhopal");
			extentTest.pass("Successfully clicked Bhopal ");

			return this;
		}
		//Click on the button -  Bhopal - Click here for Free Counseling
		public Centers bhopalClickhereforFreeCounseling() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,3500)", "");
			synchronized (driver) {driver.wait(2000);}

			freeCounselingBhopal.click();

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, "Bhopal -  Click here for Free Counseling  ");
			extentTest.info("Clicked Bhopal- Click here for Free Counseling");
			extentTest.pass("Successfully clicked Bhopal- Click here for Free Counseling ");

			synchronized (driver) {driver.wait(4000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			return this;
		}
	public Centers clickChandigarh() throws InterruptedException {
		Actions act = new Actions(driver);
	    act.moveToElement(chandigarh).perform();
 	    synchronized (driver) {driver.wait(2000);}

 	   chandigarh.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " chandigarh ");
		extentTest.info("Clicked chandigarh");
		extentTest.pass("Successfully clicked chandigarh ");

	return this;
}
	// Click on the button -  Click here for Free Counseling
	public Centers chandigarhClickhereforFreeCounseling() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,3500)", "");
				synchronized (driver) {driver.wait(2000);}

				freeCounselingChandigarh.click();

				String path = captureScreenShotBase64(getDriver());
				extentTest.addScreenCaptureFromBase64String(path, "Chandigarh -  Click here for Free Counseling  ");
				extentTest.info("Clicked Chandigarh- Click here for Free Counseling");
				extentTest.pass("Successfully clicked Chandigarh- Click here for Free Counseling ");

				synchronized (driver) {driver.wait(4000);}
				String url = driver.getCurrentUrl();
				extentTest.info(url);

				return this;
			}

	public Centers clickDelhi() throws InterruptedException {
		Actions act = new Actions(driver);
	    act.moveToElement(delhi).perform();
 	    synchronized (driver) {driver.wait(2000);}

		delhi.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Delhi ");
		extentTest.info("Clicked Delhi");
		extentTest.pass("Successfully clicked Delhi ");

		return this;
	}
	// Click on the button - Buy course - Online class
	public Centers clickOnlineBuycourse() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1500)", "");
		synchronized (driver) {driver.wait(5000);}

		buyCourse.click();
		synchronized (driver) {driver.wait(2000);}

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Buy course ");
		extentTest.info("Clicked - Buy course");
		extentTest.pass("Successfully clicked Buy course ");

		return this;
			}


	// Select the page Randomly
	public Centers selectRandomDate() throws InterruptedException, AWTException {

			//Dynamic selection using Random class
			for (WebElement option : regFoundCourseDate) {
				String optionDate = option.getText();
				System.out.println(optionDate);
			}
			// Getting size of options available
			int size = regFoundCourseDate.size();

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
			regFoundCourseDate.get(randnMumber).click();

			Thread.sleep(2000);

			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			driver.navigate().back();
			synchronized (driver) {driver.wait(5000);}

			return this;

	}

	// Click on the button - Buy course - Offline class
	public Centers clickOfflineBuycourse() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1500)", "");
		synchronized (driver) {driver.wait(2000);}

			buyCourse2.click();
			synchronized (driver) {driver.wait(2000);}

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Offline - Buy course  ");
			extentTest.info("Clicked Offline - Buy course");
			extentTest.pass("Successfully clicked Buy course - Offline ");

			return this;
	}


	// Click on the button -  Delhi - Click here for Free Counseling
		public Centers clickhereforFreeCounseling() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,3500)", "");
			synchronized (driver) {driver.wait(2000);}

			freeCounseling.click();

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Click here for Free Counseling  ");
			extentTest.info("Clicked - Click here for Free Counseling");
			extentTest.pass("Successfully clicked - Click here for Free Counseling ");

			synchronized (driver) {driver.wait(4000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			return this;
		}
// Click on Hyderabad
public Centers clickHyderabad() throws InterruptedException {
	Actions act = new Actions(driver);
    act.moveToElement(hyderabad).perform();
	synchronized (driver) {driver.wait(2000);}

	 hyderabad.click();
	synchronized (driver) {driver.wait(2000);}
	String url = driver.getCurrentUrl();
	extentTest.info(url);
	String path = captureScreenShotBase64(getDriver());
	extentTest.addScreenCaptureFromBase64String(path, " Hyderabad ");
	extentTest.info("Clicked Hyderabad");
	extentTest.pass("Successfully clicked Hyderabad ");
	return this;
}

//Click on the button -  Hyderabad - Click here for Free Counseling
		public Centers hyderabadClickhereforFreeCounseling() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,3500)", "");
			synchronized (driver) {driver.wait(2000);}

			freeCounselingHyderabad.click();

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, "Hyderabad -  Click here for Free Counseling  ");
			extentTest.info("Clicked hyderabad- Click here for Free Counseling");
			extentTest.pass("Successfully clicked hyderabad- Click here for Free Counseling ");

			synchronized (driver) {driver.wait(4000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			return this;
		}

	//Click on Guwahati
	public Centers clickGuwahati() throws InterruptedException {
	Actions act = new Actions(driver);
    act.moveToElement(guwahati).perform();
	 synchronized (driver) {driver.wait(2000);}

	guwahati.click();
	synchronized (driver) {driver.wait(2000);}
	String url = driver.getCurrentUrl();
	extentTest.info(url);

	String path = captureScreenShotBase64(getDriver());
	extentTest.addScreenCaptureFromBase64String(path, " Guwahati ");
	extentTest.info("Clicked Guwahati");
	extentTest.pass("Successfully clicked Guwahati ");
	return this;
}

	    //Click on the button -  Guwahati - Click here for Free Counseling
		public Centers guwahatiClickhereforFreeCounseling() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,6000)", "");
			synchronized (driver) {driver.wait(2000);}

			freeCounselingGuwahati.click();

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, "Guwahati -  Click here for Free Counseling  ");
			extentTest.info("Clicked Guwahati- Click here for Free Counseling");
			extentTest.pass("Successfully clicked Guwahati- Click here for Free Counseling ");

			synchronized (driver) {driver.wait(4000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			return this;
		}
		// Click on Jaipur
		public Centers clickJaipur() throws InterruptedException {
			Actions act = new Actions(driver);
		    act.moveToElement(jaipur).perform();
			 synchronized (driver) {driver.wait(2000);}

			 jaipur.click();
			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Jaipur ");
			extentTest.info("Clicked Jaipur");
			extentTest.pass("Successfully clicked Jaipur ");
			return this;
		}
	//Click on the button -  Jaipur - Click here for Free Counseling
	public Centers jaipurClickhereforFreeCounseling() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,3500)", "");
					synchronized (driver) {driver.wait(2000);}

					freeCounselingJaipur.click();

					String path = captureScreenShotBase64(getDriver());
					extentTest.addScreenCaptureFromBase64String(path, "Jaipur -  Click here for Free Counseling  ");
					extentTest.info("Clicked Jaipur- Click here for Free Counseling");
					extentTest.pass("Successfully clicked Jaipur- Click here for Free Counseling ");

					synchronized (driver) {driver.wait(4000);}
					String url = driver.getCurrentUrl();
					extentTest.info(url);

					return this;
				}
	// Click on Jodhpur
	public Centers clickJodhpur() throws InterruptedException {
		Actions act = new Actions(driver);
	    act.moveToElement(jodhpur).perform();
		 synchronized (driver) {driver.wait(2000);}

		 jodhpur.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Jodhpur ");
		extentTest.info("Clicked Jodhpur");
		extentTest.pass("Successfully clicked Jodhpur ");
		return this;
	}
	//Click on the button -  Jodhpur - Click here for Free Counseling
	public Centers jodhpurClickhereforFreeCounseling() throws InterruptedException {
						JavascriptExecutor jk = (JavascriptExecutor) driver;
						jk.executeScript("window.scrollBy(0,3500)", "");
						synchronized (driver) {driver.wait(2000);}

						freeCounselingJodhpur.click();

						String path = captureScreenShotBase64(getDriver());
						extentTest.addScreenCaptureFromBase64String(path, "Jodhpur -  Click here for Free Counseling  ");
						extentTest.info("Clicked Jodhpur- Click here for Free Counseling");
						extentTest.pass("Successfully clicked Jodhpur- Click here for Free Counseling ");

						synchronized (driver) {driver.wait(4000);}
						String url = driver.getCurrentUrl();
						extentTest.info(url);

						return this;
					}
	//Click on Lucknow
	public Centers clickLucknow() throws InterruptedException {
		Actions act = new Actions(driver);
	    act.moveToElement(lucknow).perform();
		 synchronized (driver) {driver.wait(2000);}

		 lucknow.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Lucknow ");
		extentTest.info("Clicked Lucknow");
		extentTest.pass("Successfully clicked Lucknow ");
		return this;
}
	//Click on the button -  Lucknow - Click here for Free Counseling
	public Centers lucknowClickhereforFreeCounseling() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,3500)", "");
		synchronized (driver) {driver.wait(2000);}

		freeCounselingLucknow.click();

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Lucknow -  Click here for Free Counseling  ");
		extentTest.info("Clicked Lucknow- Click here for Free Counseling");
		extentTest.pass("Successfully clicked Lucknow- Click here for Free Counseling ");

		synchronized (driver) {driver.wait(4000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);

		return this;
}
	//Click on Pune
		public Centers clickPrayagraj() throws InterruptedException {
			Actions act = new Actions(driver);
		    act.moveToElement(prayagraj).perform();
			 synchronized (driver) {driver.wait(2000);}

			 prayagraj.click();
			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Prayagraj ");
			extentTest.info("Clicked Prayagraj");
			extentTest.pass("Successfully clicked Prayagraj ");
			return this;
	}
		//Click on the button -  Pune - Click here for Free Counseling
			public Centers prayagrajClickhereforFreeCounseling() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,6000)", "");
				synchronized (driver) {driver.wait(2000);}

				freeCounselingPrayagraj.click();

				String path = captureScreenShotBase64(getDriver());
				extentTest.addScreenCaptureFromBase64String(path, "Prayagraj -  Click here for Free Counseling  ");
				extentTest.info("Clicked Prayagraj- Click here for Free Counseling");
				extentTest.pass("Successfully clicked Prayagraj- Click here for Free Counseling ");

				synchronized (driver) {driver.wait(4000);}
				String url = driver.getCurrentUrl();
				extentTest.info(url);

				return this;
		}


//Click on Pune
	public Centers clickPune() throws InterruptedException {
		Actions act = new Actions(driver);
	    act.moveToElement(pune).perform();
		 synchronized (driver) {driver.wait(2000);}

		 pune.click();
		synchronized (driver) {driver.wait(2000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Pune ");
		extentTest.info("Clicked Pune");
		extentTest.pass("Successfully clicked Pune ");
		return this;
}
	//Click on the button -  Pune - Click here for Free Counseling
		public Centers puneClickhereforFreeCounseling() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,3500)", "");
			synchronized (driver) {driver.wait(2000);}

			freeCounselingPune.click();

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, "Pune -  Click here for Free Counseling  ");
			extentTest.info("Clicked Pune- Click here for Free Counseling");
			extentTest.pass("Successfully clicked Pune- Click here for Free Counseling ");

			synchronized (driver) {driver.wait(4000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			return this;
	}

		//Click on Sikar
		public Centers clickSikar() throws InterruptedException {
			Actions act = new Actions(driver);
		    act.moveToElement(sikar).perform();
			 synchronized (driver) {driver.wait(2000);}

			 sikar.click();
			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);

			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Sikar ");
			extentTest.info("Clicked Sikar");
			extentTest.pass("Successfully clicked Sikar ");
			return this;
	}
		//Click on the button -  Sikar - Click here for Free Counseling
			public Centers sikarClickhereforFreeCounseling() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,3500)", "");
				synchronized (driver) {driver.wait(2000);}

				freeCounselingSikar.click();

				String path = captureScreenShotBase64(getDriver());
				extentTest.addScreenCaptureFromBase64String(path, "Sikar -  Click here for Free Counseling  ");
				extentTest.info("Clicked Sikar- Click here for Free Counseling");
				extentTest.pass("Successfully clicked Sikar- Click here for Free Counseling ");

				synchronized (driver) {driver.wait(4000);}
				String url = driver.getCurrentUrl();
				extentTest.info(url);

				return this;
		}

}
