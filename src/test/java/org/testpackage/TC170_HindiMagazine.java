package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC170_HindiMagazine extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).displayBannerTextOfHindiMagazine(),"Banner Text is not displayed at Hindi Magazine");
	}
	
	//Verify Hindi Magazine loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();

		Assert.assertTrue(pom.getHindiMagazine(getDriver()).clickDownloadRandomlyOnHindiMagazine(),"Documents cannot be Download in Hindi Magazine");
		
	}
	
	
	//Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).getTitleOfDocumentInHindiMagazine(),"Title of the Hindi Magazine is not displayed");
		
	}
	//Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInHindiMagazineDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).displayYearOnDocumentInHindiMagazine()," Year is not displayed in Hindi magazine documents ");
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).displayMediumOnDocumentInHindiMagazine()," Medium is not displayed in Hindi magazine documents ");
		
	}
	
	//Verify whether user can like the documents & Like icon should turn blue and count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInHindiMagazineDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).displayAndLikeTheDocumentInHindiMagazine(),"Cannot click the Like button in Hindi Magazine documents ");
		
	}
	
	//Verify whether user can Like the documents & like icon should turn blue and count should be increased (Random methohd)
	@Test(priority = 6, enabled = true)
	public void testLikeCountOfDocumentAtBeforeUserLoginInHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInHindiMagazine(),"User cannot Like the Document more than once in News Today Hindi documents ");
		
	}
	
	//Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 7, enabled = true)
	public void testLikeCountBeforeUserLoginInHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		 
		String beforeRefreshLikeCount = pom.getHindiMagazine(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);
		
		pom.getHindiMagazine(getDriver()).clickLikeHindiMagazine();
		
		String afterClickLikeCount = pom.getHindiMagazine(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);
		Thread.sleep(4000);
		
		Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Hindi Magazine ");
		
		refresh(getDriver());
		
		Thread.sleep(4000);
		synchronized (driver) {driver.wait(5000);}
		
		String beforeLikeCount = pom.getHindiMagazine(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getHindiMagazine(getDriver()).clickLikeHindiMagazine();
		
		String afterRefreshLikeCount = pom.getHindiMagazine(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);
		Thread.sleep(2000);
		
		Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Hindi Magazine  ");
		
	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentBeforeUserLoginInHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		Assert.assertTrue(pom.getHindiMagazine(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInHindiMagazine(),"User cannot Download more than once in Hindi Magazine documents ");
		
	}
	
	//To share the page link to Whatsapp
	@Test(priority=9,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaWhatsappOfHindiMagazine() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		 pom.getHindiMagazine(getDriver()).clickShareHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		 
		 pom.getHindiMagazine(getDriver()).clickWhatsapp();
		   synchronized (driver) { driver.wait(5000); }
		   
		 Thread.sleep(2000);
		 synchronized (driver) {driver.wait(5000);}
			
		 windowhandling(getDriver());
			
		String title = getDriver().getTitle();
		extentTest.info(title);
		  
		Assert.assertEquals("WhatsApp",title,"Incorrect Title for Whatsapp  ");

}
	
	//To share the page link to Facebook
	@Test(priority=10,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaFacebookOfHindiMagazine() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		 pom.getHindiMagazine(getDriver()).clickShareHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		 
		   pom.getHindiMagazine(getDriver()).clickFacebook();
		   Thread.sleep(2000);
			synchronized (driver) {driver.wait(5000);}
			
			windowhandling(getDriver());
			
			String title = getDriver().getTitle();
			extentTest.info(title);
			
			Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
		

}

	//To share the page link to Gmail
	@Test(priority=11,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaGmailOfHindiMagazine() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		 pom.getHindiMagazine(getDriver()).clickShareHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }

	   pom.getHindiMagazine(getDriver()).clickGmail();
   	   synchronized (driver) { driver.wait(5000); }

   	   Thread.sleep(2000);
   	   synchronized (driver) {driver.wait(5000);}
	
   	   windowhandling(getDriver());
	
   	   String title = getDriver().getTitle();
   	   extentTest.info(title);
	
   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
	

}

	//To share the page link to Telegram
	@Test(priority=12,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaTelegramOfHindiMagazine() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		 pom.getHindiMagazine(getDriver()).clickShareHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }

		pom.getHindiMagazine(getDriver()).clickTelegram();
		synchronized (driver) { driver.wait(5000); }

		Thread.sleep(2000);
		synchronized (driver) {driver.wait(5000);}
	
		windowhandling(getDriver());
	
		String title = getDriver().getTitle();
		extentTest.info(title);
	
		Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
	

}	

	@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testFilterFunctionalityOfHindiMagazine() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }

		 pom.getHindiMagazine(getDriver()).clickFilter();
		 synchronized (driver) { driver.wait(2000); }

		 pom.getHindiMagazine(getDriver()).clickSelectYear();
		 synchronized (driver) { driver.wait(2000); }

		 pom.getHindiMagazine(getDriver()).clickApplyFilter();
		 synchronized (driver) { driver.wait(2000); }


	}
	@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testClearFilterOptionInHindiMagazine() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }

		 pom.getHindiMagazine(getDriver()).clickFilter();
		 synchronized (driver) { driver.wait(2000); }

		 pom.getHindiMagazine(getDriver()).clickSelectYear();
		 synchronized (driver) { driver.wait(2000); }

		 pom.getHindiMagazine(getDriver()).clickApplyFilter();
		 synchronized (driver) { driver.wait(2000); }

		 pom.getHindiMagazine(getDriver()).clickClearFilter();

	}
	
	//Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 15, enabled = true)
	public void testLikeCountAfterUserLoginInHindiMagazine() throws InterruptedException		{

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
		Thread.sleep(6000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		String beforeRefreshLikeCount = pom.getHindiMagazine(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);
		
		pom.getHindiMagazine(getDriver()).clickLikeHindiMagazine();
		
		String afterClickLikeCount = pom.getHindiMagazine(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);
		Thread.sleep(4000);
		
		Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Hindi Magazine ");
		
		refresh(getDriver());
		
		Thread.sleep(4000);
		synchronized (driver) {driver.wait(5000);}
		
		String beforeLikeCount = pom.getHindiMagazine(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getHindiMagazine(getDriver()).clickLikeHindiMagazine();
		
		String afterRefreshLikeCount = pom.getHindiMagazine(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);
		Thread.sleep(2000);
		
		Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Hindi Magazine  ");
		
	}
	@Test(priority = 16, enabled = true)
	public void testPaginationInHindiMagazine() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		Thread.sleep(5000);
		
		pom.getHindiMagazine(getDriver()).clickHindiMagazine();
		 synchronized (driver) { driver.wait(5000); }
		
		pom.getNewsTodayHindi(getDriver()).clickRandomPage();
		
//		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInUPSCPaperSolution(),"User cannot Like the Document more than once in UPSC Paper solution documents ");
		
	}
	
}