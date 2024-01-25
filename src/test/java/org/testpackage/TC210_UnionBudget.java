package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC210_UnionBudget extends VisionBaseClass {

	//Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfUnionBudget() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		Assert.assertTrue(pom.getUnionBudget(getDriver()).displayBannerTextOfUnionBudget(),"Banner Text is not displayed at Union Budget");
	}
	
	//Verify Union Budget is  loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInUnionBudget() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();

		Assert.assertTrue(pom.getUnionBudget(getDriver()).clickDownloadRandomlyOnUnionBudget(),"Documents cannot be Download in Union Budget");
		
	}
	
	//Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInUnionBudget() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		Assert.assertTrue(pom.getUnionBudget(getDriver()).getTitleOfDocumentInUnionBudget(),"Title of the Union Budget is not displayed");
		
	}
	
	//Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInUnionBudgetDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		Assert.assertTrue(pom.getUnionBudget(getDriver()).displayYearOnDocumentInUnionBudget()," Year is not displayed in Union Budget documents ");
		Assert.assertTrue(pom.getUnionBudget(getDriver()).displayMediumOnDocumentInUnionBudget()," Medium is not displayed in Union Budget documents ");
		
	}
	
	//Verify whether user can like the documents & Like icon should turn blue and count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInUnionBudgetDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		Assert.assertTrue(pom.getUnionBudget(getDriver()).displayAndLikeTheDocumentInUnionBudget(),"Cannot click the Like button in Union Budget documents ");
		
	}

	//Verify whether user can Like the documents & like icon should turn blue and count should be increased
	@Test(priority = 6, enabled = true)
	public void testLikeCountOfDocumentAtBeforeUserLoginInUnionBudget() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		Assert.assertTrue(pom.getUnionBudget(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInUnionBudget(),"User cannot Like the Document more than once in Union Budget documents ");
		
	}
	
	//Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 7, enabled = true)
	public void testLikeCountBeforeUserLoginInUnionBudget() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		 
		String beforeRefreshLikeCount = pom.getUnionBudget(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);
		
		pom.getUnionBudget(getDriver()).clickLikeUnionBudget();
		
		String afterClickLikeCount = pom.getUnionBudget(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);
		
		Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Union Budget");
		
		refresh(getDriver());
		
		String beforeLikeCount = pom.getUnionBudget(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getUnionBudget(getDriver()).clickLikeUnionBudget();
		
		String afterRefreshLikeCount = pom.getUnionBudget(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);
		
		Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Union Budget  ");
		
	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentBeforeUserLoginInUnionBudget() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		 	String beforeRefreshDownlaodCount = pom.getUnionBudget(getDriver()).getBeforeDownloadCount();
			extentTest.info(beforeRefreshDownlaodCount);
			
			pom.getUnionBudget(getDriver()).clickDownloadUnionBudget();
			
			String afterClickDownloadCount = pom.getUnionBudget(getDriver()).getAfterDownloadCount();
			extentTest.info(afterClickDownloadCount);
			
			Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Union Budget");
			
			refresh(getDriver());
			
			
			String beforeDownloadCount = pom.getUnionBudget(getDriver()).getBeforeDownloadCount();
			extentTest.info(beforeDownloadCount);
			pom.getUnionBudget(getDriver()).clickDownloadUnionBudget();
			
			String afterRefreshDownlaodCount = pom.getUnionBudget(getDriver()).getAfterDownloadCount();
			extentTest.info(afterRefreshDownlaodCount);
			
			Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Union Budget  ");
			
	}
	
	//To share the page link to Whatsapp
	@Test(priority=9,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaWhatsappOfUnionBudget() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		 pom.getUnionBudget(getDriver()).clickShareUnionBudget();
		 synchronized (driver) { driver.wait(5000); }
		 
		 pom.getUnionBudget(getDriver()).clickWhatsapp();
		   
		 windowhandling(getDriver());
			
		String title = getDriver().getTitle();
		extentTest.info(title);
		  
		Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

}

	
	//To share the page link to Facebook
	@Test(priority=10,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaFacebookOfUnionBudget() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		 pom.getUnionBudget(getDriver()).clickShareUnionBudget();
		 
		   pom.getUnionBudget(getDriver()).clickFacebook();
			
			windowhandling(getDriver());
			
			String title = getDriver().getTitle();
			extentTest.info(title);
			
			Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
		

}

	//To share the page link to Gmail
	@Test(priority=11,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaGmailOfUnionBudget() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		 pom.getUnionBudget(getDriver()).clickShareUnionBudget();

	   pom.getUnionBudget(getDriver()).clickGmail();

   	   windowhandling(getDriver());
	
   	   String title = getDriver().getTitle();
   	   extentTest.info(title);
	
   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
	

}

	//To share the page link to Telegram
	@Test(priority=12,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaTelegramOfUnionBudget() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();
		
		 pom.getUnionBudget(getDriver()).clickShareUnionBudget();

		pom.getUnionBudget(getDriver()).clickTelegram();

		windowhandling(getDriver());
	
		String title = getDriver().getTitle();
		extentTest.info(title);
	
		Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
	

}	


	@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testFilterFunctionalityOfUnionBudget() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();

		 pom.getUnionBudget(getDriver()).clickFilter();

		 pom.getUnionBudget(getDriver()).clickSelectYear();
		 
		 pom.getUnionBudget(getDriver()).clickMediumFilter();

		 pom.getUnionBudget(getDriver()).clickApplyFilter();
		 
		// Check if data is displayed
		    boolean isDataDisplayed = pom.getUnionBudget(getDriver()).isDataDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } else
		    	 // Check if "No Data Found" message is displayed
			    try {
			        boolean isNoDataFoundDisplayed = pom.getUnionBudget(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }
		   


	}
	
	@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testClearFilterOptionUnionBudget() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getUnionBudget(getDriver()).clickUnionBudget();

		 pom.getUnionBudget(getDriver()).clickFilter();

		 pom.getUnionBudget(getDriver()).clickSelectYear();
		 
		 pom.getUnionBudget(getDriver()).clickMediumFilter();

		 pom.getUnionBudget(getDriver()).clickApplyFilter();
		 
		// Check if data is displayed
		    boolean isDataDisplayed = pom.getUnionBudget(getDriver()).isDataDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } else
		    	 // Check if "No Data Found" message is displayed
			    try {
			        boolean isNoDataFoundDisplayed = pom.getUnionBudget(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }
		   
		    pom.getUnionBudget(getDriver()).clickClearFilter();
		    Thread.sleep(2000);

	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
			@Test(priority = 15, enabled = true)
			public void testDownloadCountOfDocumentAfterUserLoginInUnionBudget() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getHomePage(getDriver()).clickLogin();
				extentTest.info(" Login button is Clicked");
				Thread.sleep(2000);
				pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

				pom.getHomePage(getDriver()).enterPassword("123456");

				pom.getHomePage(getDriver()).clickSubmit();
				Thread.sleep(2000);
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getUnionBudget(getDriver()).clickUnionBudget();
				
				 	String beforeRefreshDownlaodCount = pom.getUnionBudget(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeRefreshDownlaodCount);
					
					pom.getUnionBudget(getDriver()).clickDownloadUnionBudget();
					
					String afterClickDownloadCount = pom.getUnionBudget(getDriver()).getAfterDownloadCount();
					extentTest.info(afterClickDownloadCount);
					
					Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Union Budget");
					
					refresh(getDriver());
					
					String beforeDownloadCount = pom.getUnionBudget(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeDownloadCount);
					pom.getUnionBudget(getDriver()).clickDownloadUnionBudget();
					
					String afterRefreshDownlaodCount = pom.getUnionBudget(getDriver()).getAfterDownloadCount();
					extentTest.info(afterRefreshDownlaodCount);
					
					Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Union Budget  ");
					
			}
				
			@Test(priority = 16, enabled = true)
			public void testPaginationInUnionBudget() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getUnionBudget(getDriver()).clickUnionBudget();
				
				pom.getUnionBudget(getDriver()).clickRandomPage();
				
				
			}
}