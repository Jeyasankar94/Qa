package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Resources extends VisionBaseClass {

	WebDriver driver;
	public Resources(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='basic-navbar-nav']/div[1]/div[4]/div/a/p")
	private WebElement resources;

	@FindBy(xpath = "//*[@class='p-0 container']/div/div/div/p")
	private WebElement resourcePageText;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div/a[1]/div")
	private WebElement currentAffairs;
	
	@FindBy(xpath = "(//label[contains(@class,'text-darkBlack font-medium')])[1]")		
	private WebElement currentAffairsUnderResource;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div/div[2]/div[2]")
	private WebElement filterBtn;

	@FindBy(xpath = "//*[text()='Select Filters']")
	private WebElement popupTextAIRnews;

	@FindBy(xpath = "//*[@class='modal-body']/div/div/div/div/div/div[10]")
	private WebElement select10;

	@FindBy(xpath = "(//*[@class='modal-body']/div/div/div/div/button)[2]")
	private WebElement selectImportLevel;

	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/div/div/button")
	private WebElement chooseMedium;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement popupApplyBtn;

	@FindBy(xpath = "//*[@class='flex justify-end w-full mt-4 sm:justify-center']/ul/li[3]/a")
	private WebElement page2;

	@FindBy(xpath = "(//button[@class='ResourcesCard_button__6C6MK '])[1]")
	private WebElement playpauseAllindiaRadio1;

	@FindBy(xpath = "(//button[@class='ResourcesCard_button__6C6MK '])[2]")
	private WebElement playpauseAllindiaRadio2;

	@FindBy(xpath = "(//button[@class='ResourcesCard_button__6C6MK '])[3]")
	private WebElement playpauseAllindiaRadio3;

	@FindBy(xpath = "(//button[@class='ResourcesCard_button__6C6MK '])[4]")
	private WebElement playpauseAllindiaRadio4;

	@FindBy(xpath = "(//button[@class='ResourcesCard_button__6C6MK '])[5]")
	private WebElement playpauseAllindiaRadio5;

	@FindBy(xpath = "((//*[@class='relative'])[5]/div/div/div[2]/p[3]/i)[1]")
	private WebElement shareEconomics;

	@FindBy(xpath = "((//*[@class='relative'])[5]/div/div/div[2]/p[2]/i)[1]")
	private WebElement downloadEconomics;

	@FindBy(xpath = "((//*[@class='relative'])[5]/div/div/div[2]/p[1]/i)[1]")
	private WebElement likeEconomics;

	@FindBy(xpath = "//h4[text()='Quick Revision Material']")
	private WebElement quickRevision;

	@FindBy(xpath = "//h5[contains(text(),'à¤œà¤² à¤¸à¤‚à¤°à¤•à¥�à¤·à¤£')]")
	private WebElement allindiaRadioNews1;

	@FindBy(xpath = "//h5[contains(text(),'Women')]")
	private WebElement allindiaRadioNews2;

	@FindBy(xpath = "//h5[contains(text(),'à¤®à¤¹à¤¿à¤²à¤¾')]")
	private WebElement allindiaRadioNews3;

	@FindBy(xpath = "//h5[contains(text(),'Interview')]")
	private WebElement allindiaRadioNews4;

	@FindBy(xpath = "//h5[contains(text()")
	private WebElement allindiaRadioNews5;

	@FindBy(xpath = "//h5[text()='Nehru-Liaquat Ali Agreement']")
	private WebElement infographicsText1;

	@FindBy(xpath = "((//*[@class='relative'])[3]/div/div/div[2]/p[3]/i)[1]")
	private WebElement infographicsShare1;

	@FindBy(xpath = "//h4[text()='Infographics']")
	private WebElement infographicsLabel;

	@FindBy(xpath = "((//*[@class='relative'])[4]/div/div/div[2]/p[3]/i)[1]")
	private WebElement toppersAnscpy1;

	@FindBy(xpath = "//h4[text()='Toppers Answer Copy']")
	private WebElement toppersAnscpyLabel;

	@FindBy(xpath = "//main[contains(@class,'text-[20px] leading-[30px]')]")
	private WebElement currentAffairsBannerText;

	@FindBy(xpath = "//*[@class='cursor-pointer w-[20px] h-[20px] lg:h-[25px] lg:w-[25px] dark:text-white undefined']")
	private WebElement closepopup;

	@FindBy(xpath = "//*[@class='modal-body']/div/div/div/div/div/button")
	private WebElement filterselectCategory;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div/div/div/div[1]")
	private WebElement filterselectCat1;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div/div/div/div[2]")
	private WebElement filterselectCat2;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div/div/div/div[3]")
	private WebElement filterselectCat3;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div/div/div/div[10]")
	private WebElement filterselectCat10;

	@FindBy(xpath = "(//*[@class='modal-content']/div[2]/div/div/div/div/div)[2]")
	private WebElement filterselectimptLevel;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div[2]/div/div/div[1]")
	private WebElement filterselectimprtLevel1;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div[2]/div/div/div[2]")
	private WebElement filterselectimprtLevel2;

	@FindBy(xpath = "//*[@class='modal-content']/div[2]/div/div/div/div[2]/div/div/div[3]")
	private WebElement filterselectimprtLevel3;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[2]/a[2]/div")
	private WebElement newstodayHindi;

	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div/div/div/div)[1]")
	private WebElement newstodayHindiText;

	// This is used to click the play and Pause button at AIR
	public WebElement getPlayPausebutton2() {
		return playpauseAllindiaRadio2;
	}

	// This is used to click the play and Pause button at AIR
	public WebElement getPlayPausebutton3() {
		return playpauseAllindiaRadio3;
	}

	// This is used to click the play and Pause button at AIR
	public WebElement getPlayPausebutton4() {
		return playpauseAllindiaRadio4;
	}

	// This is used to click the play and Pause button at AIR
	public WebElement getPlayPausebutton5() {
		return playpauseAllindiaRadio5;
	}

	public Resources hoverOverResources() {
	    // Use WebDriverWait for waiting until the element is visible
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(resources));
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(resources).perform();

	    return this;
	}
	
	public Resources clickResources() throws InterruptedException {
		// Use WebDriverWait for waiting until the element is visible
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(resources));
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(resources).perform();

	    return this;
	}
	

    // This is used to click the Current Affairs under Resources Tab
    public Resources clickCurrentAffairsUnderResources() {
        // Use WebDriverWait for waiting until the element is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement currentAffairsElement = wait.until(ExpectedConditions.elementToBeClickable(currentAffairsUnderResource));

        // Perform the click after the element becomes clickable
        currentAffairsElement.click();

        String url = driver.getCurrentUrl();
        extentTest.info(url);

        return this;
    }
	
	
		// This is used to Display the Current Affairs Banner Text
		public boolean displayCurrentAffairsBannerText() throws InterruptedException {
			// Use WebDriverWait for waiting until the element is visible
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(currentAffairsBannerText));
		    
			String text = currentAffairsBannerText.getText();
			extentTest.info(text);
			return currentAffairsBannerText.isDisplayed();
		}

	// This is used to click the Current Affairs at Home page
	public Resources clickCurrentAffairs() throws InterruptedException {
		currentAffairs.click();
		synchronized (driver) {driver.wait(5000);}
		
		String url = driver.getCurrentUrl();
		extentTest.info(url);

		return this;
	}

	// This is used to click the Play button in News Today Hindi
	public Resources clickPlayButtonNewsTodayHindi() throws InterruptedException {
		newstodayHindi.click();
		synchronized (driver) {driver.wait(5000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		synchronized (driver) {driver.wait(5000);}
		String text = newstodayHindiText.getText();
		extentTest.info(text);
		return this;
	}


	// This is used to click the Resources at Home page
	public Resources playAllindiaRadio1() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1500)", "");
		synchronized (driver) {
			driver.wait(5000);
		}
		playpauseAllindiaRadio1.click();
		synchronized (driver) {
			driver.wait(5000);
		}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		String text = allindiaRadioNews1.getText();
		extentTest.info(text);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio played AIR List 1 ");
		extentTest.pass("Succesfully played Radio news 1");
		synchronized (driver) {
			driver.wait(5000);
		}
		return this;
	}

	public Resources pauseAllindiaRadio1() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1500)", "");
		synchronized (driver) {
			driver.wait(5000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio paused AIR List 1 ");
		extentTest.pass("Succesfully paused Radio news 1");
		return this;
	}

	public Resources playAllindiaRadio2() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1500)", "");
		synchronized (driver) {
			driver.wait(5000);
		}
		getPlayPausebutton2().click();
		synchronized (driver) {
			driver.wait(5000);
		}
		String text = allindiaRadioNews2.getText();
		extentTest.info(text);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio played AIR List 2 ");
		extentTest.pass("Succesfully played Radio news 2");
		return this;
	}

	public Resources pauseAllindiaRadio2() throws InterruptedException {
		getPlayPausebutton2().click();
		synchronized (driver) {driver.wait(5000);}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio paused AIR List 2  ");
		extentTest.pass("Succesfully paused Radio news 2");
		return this;
	}

	public Resources playAllindiaRadio3() throws InterruptedException {
		getPlayPausebutton3().click();
		synchronized (driver) {driver.wait(5000);}
		String text = allindiaRadioNews3.getText();
		extentTest.info(text);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio played AIR List 3 ");
		extentTest.pass("Succesfully played Radio news 3");
		return this;
	}

	public Resources pauseAllindiaRadio3() throws InterruptedException {
		getPlayPausebutton3().click();
		synchronized (driver) {driver.wait(5000);}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio paused AIR List 3  ");
		extentTest.pass("Succesfully paused Radio news 3");
		return this;
	}

	public Resources clickAIRarrow() throws InterruptedException {
		WebElement arrow = driver.findElement(By.xpath("(//img[@src='/icons/sliderIcon.svg'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(arrow).perform();
		synchronized (driver) {driver.wait(5000);}
		arrow.click();
		synchronized (driver) {driver.wait(5000);}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " AIR arrow ");
		return this;
	}

	public Resources playAllindiaRadio4() throws InterruptedException {
		getPlayPausebutton4().click();
		synchronized (driver) {driver.wait(5000);}
		String text = allindiaRadioNews4.getText();
		extentTest.info(text);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio played AIR List 4 ");
		extentTest.pass("Succesfully played Radio news 4");
		return this;
	}

	public Resources pauseAllindiaRadio4() throws InterruptedException {
		getPlayPausebutton4().click();
		synchronized (driver) {
			driver.wait(5000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio paused AIR List 4  ");
		extentTest.pass("Succesfully paused Radio news 4");
		return this;
	}

	public Resources playAllindiaRadio5() throws InterruptedException {
		getPlayPausebutton5().click();
		synchronized (driver) {driver.wait(5000);}
		String text = allindiaRadioNews5.getText();
		extentTest.info(text);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio played AIR List 5 ");
		extentTest.pass("Succesfully played Radio news 5");
		return this;
	}

	public Resources pauseAllindiaRadio5() throws InterruptedException {
		getPlayPausebutton5().click();
		synchronized (driver) {
			driver.wait(5000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " Audio paused AIR List 5  ");
		extentTest.pass("Succesfully paused Radio news 5");
		return this;
	}

	public Resources shareNehruLiaquat() throws InterruptedException {
		String info = infographicsText1.getText();
		synchronized (driver) {driver.wait(5000);}
		extentTest.info(info);
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,1600)", "");
		synchronized (driver) {driver.wait(5000);}
		infographicsShare1.click();
		synchronized (driver) {driver.wait(5000);}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Nehru-Liaquat Ali Agreement ");
		extentTest.pass("clicked share");
		return this;
	}

	public Resources shareInfographics() throws InterruptedException {
		String text = infographicsLabel.getText();
		extentTest.info(text);
		return this;
	}

	public Resources getSharewindowElem() {
		String text = driver.findElement(By.xpath("//h2[text()='Page Link']")).getText();
		extentTest.info(text);
		return this;
	}

	public Resources clickClosepopup() {
		WebElement closebut = driver.findElement(
				By.xpath("//*[@class='cursor-pointer w-[20px] h-[20px] lg:h-[25px] lg:w-[25px] dark:text-white']"));
		closebut.click();
		return this;
	}

	public Resources shareNewFindings() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement womenEmp = driver.findElement(By.xpath("((//*[@class='relative'])[3]/div/div/div[2]/p[3]/i)[2]"));
		jk.executeScript("window.scrollBy(0,1600)", "");
		synchronized (driver) {
			driver.wait(5000);
		}
		womenEmp.click();
		String info = driver.findElement(By.xpath("//h5[contains(text()='New Findings')]")).getText();
		synchronized (driver) {
			driver.wait(5000);
		}
		extentTest.info(info);
		synchronized (driver) {
			driver.wait(3000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "New Findings ");
		extentTest.pass("clicked share");
		return this;
	}

	public Resources shareNorthEast() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement womenEmp = driver.findElement(By.xpath("((//*[@class='relative'])[3]/div/div/div[2]/p[3]/i)[3]"));
		jk.executeScript("window.scrollBy(0,1600)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		womenEmp.click();
		String info = driver.findElement(By.xpath("//h5[contains(text()='North')]")).getText();
		synchronized (driver) {
			driver.wait(3000);
		}
		extentTest.info(info);
		synchronized (driver) {
			driver.wait(3000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "North-East ");
		extentTest.pass("clicked share");
		return this;
	}

	public Resources getToppersAnswer() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		String text = toppersAnscpyLabel.getText();
		jk.executeScript("window.scrollBy(0,1700)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		extentTest.info(text);
		return this;
	}

	public Resources clickShareTopperAns1() throws InterruptedException {
		toppersAnscpy1.click();
		synchronized (driver) {
			driver.wait(3000);
		}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Antriksh jain ");
		extentTest.pass("clicked share");
		return this;
	}

	public Resources getQuickRevision() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		String text = quickRevision.getText();
		jk.executeScript("window.scrollBy(0,2000)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		extentTest.info(text);
		return this;
	}

	// This is used to click the Share button at Quick RevisionMaterial
	public Resources clickShareEconomics() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,2000)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		shareEconomics.click();

		synchronized (driver) {
			driver.wait(5000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Economics for UPSC");
		extentTest.pass("clicked share");
		return this;
	}

	// This is used to click the Download button at Quick RevisionMaterial
	public Resources clickDownload() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,2000)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		downloadEconomics.click();

		synchronized (driver) {
			driver.wait(5000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Economics for UPSC");
		extentTest.pass("clicked Download");
		return this;
	}

	// This is used to click the Like button at Quick RevisionMaterial
	public Resources clickLike() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,2000)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		likeEconomics.click();

		synchronized (driver) {
			driver.wait(5000);
		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Economics for UPSC");
		extentTest.pass("clicked Like");
		return this;
	}
}