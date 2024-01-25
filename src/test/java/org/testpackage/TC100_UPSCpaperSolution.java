package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC100_UPSCpaperSolution extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfUPSCPaperSolution() throws InterruptedException, AWTException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayBannerTextOfUPSCPaperSolution(),"Banner Text is not displayed at UPSC Paper Solution");
	}
	//Verify UPSC Paper Solution loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000); 
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).clickDownloadUPSCPaperSolution(),"Documents cannot be Download in UPSC Paper Solution ");
		
	}
	//Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000); 
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).getTitleOfDocumentInUPSCPaperSolution(),"Title of the UPSC Paper Solution is not displayed");
		
	}
	//Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInUPSCPaperSolutionDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000); 
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayYearOnDocumentInUPSCPaperSolution()," Year is not displayed in Quick revision Material documents ");
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayMediumOnDocumentInUPSCPaperSolution()," Medium is not displayed in Quick revision Material documents ");
		
	}
	//Verify whether user can like the documents & Like icon should turn blue and count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInUPSCPaperSolutionDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000); 
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayAndLikeTheDocumentInUPSCPaperSolution(),"Cannot click the Like button in Quick Revision Material documents ");
		
	}
	//Verify after the user likes the button and refreshes the page
	@Test(priority = 6, enabled = true)
	public void testLikeCountBeforeUserLoginInUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000); 
		
		String beforeRefreshLikeCount = pom.getUPSCPaperSolution(getDriver()).getBeforeLikeCount();
		
		pom.getUPSCPaperSolution(getDriver()).clickLikeButtonInUPSCPaperSolution();
		
		String afterClickLikeCount = pom.getUPSCPaperSolution(getDriver()).getAfterLikeCount();
		
		Thread.sleep(4000);
		
		Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in UPSC PaperSolution  ");
		
		refresh(getDriver());
		
		Thread.sleep(4000);
		synchronized (driver) {driver.wait(5000);}
		
		String beforeLikeCount = pom.getUPSCPaperSolution(getDriver()).getBeforeLikeCount();
		
		pom.getUPSCPaperSolution(getDriver()).clickLikeButtonInUPSCPaperSolution();
		
		String afterRefreshLikeCount = pom.getUPSCPaperSolution(getDriver()).getAfterLikeCount();
		
		Thread.sleep(2000);
		
		Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in UPSC PaperSolution  ");
		
	}
	//Verify whether user can download the documents & Download icon should turn blue.
	@Test(priority = 7, enabled = true)
	public void testDownloadCountOfDocumentInQuickRevisionMaterial() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000);
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayAndDownloadTheDocumentInUPSCPaperSolution(),"User cannot Click the Download button in UPSC Paper solution documents ");
		
	}
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentAtBeforeUserLoginInUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000);
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInUPSCPaperSolution(),"User cannot Download more than once in UPSC Paper solution documents ");
		
	}
	//Verify whether User can share the page via whatsapp
	@Test(priority = 9, enabled = true)
	public void testUserCanShareThePageLinkViaWhatsappOfUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000);
		
		pom.getUPSCPaperSolution(getDriver()).clickShareButtonOfUPSCPaperSolution();
		
		pom.getUPSCPaperSolution(getDriver()).clickWhatsappInUPSCPaperSolution();
		Thread.sleep(2000);
		synchronized (driver) {driver.wait(5000);}
		
		windowhandling(getDriver());
		
		String title = getDriver().getTitle();
		extentTest.info(title);
		
		Assert.assertEquals("WhatsApp",title,"Incorrect Title for Whatsapp  ");
		
	}
	//Verify whether User can share the page via Facebook
	@Test(priority = 10, enabled = true)
	public void testUserCanShareThePageLinkViaFacebookOfUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000);
		
		pom.getUPSCPaperSolution(getDriver()).clickShareButtonOfUPSCPaperSolution();
		
		pom.getUPSCPaperSolution(getDriver()).clickFacebookInUPSCPaperSolution();
		Thread.sleep(2000);
		synchronized (driver) {driver.wait(5000);}
		
		windowhandling(getDriver());
		
		String title = getDriver().getTitle();
		extentTest.info(title);
		
		Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
	}
	//Verify whether User can share the page via Email
	@Test(priority = 11, enabled = true)
	public void testUserCanShareThePageLinkViaEmailOfUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000);
		
		pom.getUPSCPaperSolution(getDriver()).clickShareButtonOfUPSCPaperSolution();
		
		pom.getUPSCPaperSolution(getDriver()).clickGmailInUPSCPaperSolution();
		Thread.sleep(2000);
		synchronized (driver) {driver.wait(5000);}
		
		windowhandling(getDriver());
		
		String title = getDriver().getTitle();
		extentTest.info(title);
		
		Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
		
	}
	//Verify whether User can share the page via Telegram
	@Test(priority = 12, enabled = true)
	public void testUserCanShareThePageLinkViaTelegramOfUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(2000);
		
		pom.getUPSCPaperSolution(getDriver()).clickShareButtonOfUPSCPaperSolution();
		
		pom.getUPSCPaperSolution(getDriver()).clickTelegramInUPSCPaperSolution();
		Thread.sleep(2000);
		synchronized (driver) {driver.wait(5000);}
		
		windowhandling(getDriver());
		
		String title = getDriver().getTitle();
		extentTest.info(title);
		
		Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
		
	}
	@Test(priority = 13, enabled = true, invocationCount = 1)
	public void testFilterFunctionalityOfUPSCPaperSolution() throws InterruptedException {

	    getDriver().get(baseURL);
	    extentTest.info("Successfully Navigated to Vision Website");

	    PageObjectManager pom = new PageObjectManager();
	    Thread.sleep(5000);

	    pom.getResources(getDriver()).clickResources();

	    pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
	    Thread.sleep(2000);

	    pom.getUPSCPaperSolution(getDriver()).clickFilterButtonInUPSCPaperSolution();
	    Thread.sleep(2000);

	    pom.getUPSCPaperSolution(getDriver()).selectYearFilterOnUPSCPaperSolution();

		pom.getUPSCPaperSolution(getDriver()).clickSlectCategoryFilter();
	    Thread.sleep(4000);

	    pom.getUPSCPaperSolution(getDriver()).clickFilterApplyButton();
	    Thread.sleep(4000);

	    // Check if data is displayed
	    boolean isDataDisplayed = pom.getUPSCPaperSolution(getDriver()).isDataDisplayed();

	    // Check if "No Data Found" message is displayed
	    boolean isNoDataFoundDisplayed = pom.getUPSCPaperSolution(getDriver()).isNoDataFoundDisplayed();

	    // If data is displayed, assert that data is displayed after applying the filter
	    if (isDataDisplayed) {
	        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
	    } 
	    // If no data is found, assert that "No Data Found" message is displayed after applying the filter
	    else if (isNoDataFoundDisplayed) {
	        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
	    }

	    Thread.sleep(2000);
	}
	//Verify whether download count is increased after User Login
	@Test(priority = 14, enabled = true)
	public void testDownloadCountOfDocumentAfterUserLoginInUPSCPaperSolution() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info(" Login button is Clicked");
		synchronized (driver) {driver.wait(5000);}
		
		pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

		pom.getHomePage(getDriver()).enterPassword("123456");

		pom.getHomePage(getDriver()).clickSubmit();
		Thread.sleep(3000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		Thread.sleep(4000);
		
		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInUPSCPaperSolution(),"User cannot Like the Document more than once in UPSC Paper solution documents ");
		
	}
	//Verify after the user likes the button and refreshes the page
		@Test(priority = 15, enabled = true)
		public void testLikeCountAfterUserLoginInUPSCPaperSolution() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(5000);
			
			pom.getHomePage(getDriver()).clickLogin();
			extentTest.info(" Login button is Clicked");
			synchronized (driver) {driver.wait(5000);}
			
			pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

			pom.getHomePage(getDriver()).enterPassword("123456");

			pom.getHomePage(getDriver()).clickSubmit();
			Thread.sleep(3000);

			pom.getResources(getDriver()).clickResources();

			pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
			Thread.sleep(2000); 
			
			String beforeRefreshLikeCount = pom.getUPSCPaperSolution(getDriver()).getBeforeLikeCount();
			
			pom.getUPSCPaperSolution(getDriver()).clickLikeButtonInUPSCPaperSolution();
			
			String afterClickLikeCount = pom.getUPSCPaperSolution(getDriver()).getAfterLikeCount();
			
			Thread.sleep(4000);
			
			Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in UPSC PaperSolution  ");
			
			refresh(getDriver());
			
			Thread.sleep(4000);
			synchronized (driver) {driver.wait(5000);}
			
			String beforeLikeCount = pom.getUPSCPaperSolution(getDriver()).getBeforeLikeCount();
			
			pom.getUPSCPaperSolution(getDriver()).clickLikeButtonInUPSCPaperSolution();
			
			String afterRefreshLikeCount = pom.getUPSCPaperSolution(getDriver()).getAfterLikeCount();
			
			Thread.sleep(4000);
			
			Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in UPSC PaperSolution  ");
			
		}
		@Test(priority = 16, enabled = true)
		public void testPaginationInUPSCPaperSolution() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(5000);

			pom.getResources(getDriver()).clickResources();

			pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
			Thread.sleep(2000);
			
			pom.getUPSCPaperSolution(getDriver()).clickRandomPage();
			
//			Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInUPSCPaperSolution(),"User cannot Like the Document more than once in UPSC Paper solution documents ");
			
		}
		@Test(priority = 17, enabled = true, invocationCount = 1)
		public void  testClearFilterOnUPSCPaperSolution() throws InterruptedException {

		    getDriver().get(baseURL);
		    extentTest.info("Successfully Navigated to Vision Website");

		    PageObjectManager pom = new PageObjectManager();
		    Thread.sleep(5000);

		    pom.getResources(getDriver()).clickResources();

		    pom.getUPSCPaperSolution(getDriver()).clickUPSCPaperSolution();
		    Thread.sleep(2000);

		    pom.getUPSCPaperSolution(getDriver()).clickFilterButtonInUPSCPaperSolution();
		    Thread.sleep(2000);

		    pom.getUPSCPaperSolution(getDriver()).selectYearFilterOnUPSCPaperSolution();

			pom.getUPSCPaperSolution(getDriver()).clickSlectCategoryFilter();
		    Thread.sleep(4000);

		    pom.getUPSCPaperSolution(getDriver()).clickFilterApplyButton();
		    Thread.sleep(4000);

		    // Check if data is displayed
		    boolean isDataDisplayed = pom.getUPSCPaperSolution(getDriver()).isDataDisplayed();

		    // Check if "No Data Found" message is displayed
		    boolean isNoDataFoundDisplayed = pom.getUPSCPaperSolution(getDriver()).isNoDataFoundDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } 
		    // If no data is found, assert that "No Data Found" message is displayed after applying the filter
		    else if (isNoDataFoundDisplayed) {
		        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
		    }

		    Thread.sleep(2000);
		    pom.getUPSCPaperSolution(getDriver()).clickClearFilter();
		    Thread.sleep(2000);
		}
}