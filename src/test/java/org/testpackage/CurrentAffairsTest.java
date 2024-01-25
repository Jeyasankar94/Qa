package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class CurrentAffairsTest extends VisionBaseClass {

	@Test
	public void testCurrentAffairs() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// clicking the Resources module in homepage
		pom.getHomePageRag(getDriver()).clickResources();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Clicking current affairs module in Resources Page
		pom.getResourcesPage(getDriver()).clickCurrentAffairs();

		synchronized (driver) {
			try {
				driver.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		pom.getResourcesPage(getDriver()).clickCurrentAffairs();

		// clicking the News Today English module in current affairs page

		//pom.getCurrentAffairsPage().clickCANewsTodayEnglish();

		// clicking the News Today Hindi module in current affairs page

		//pom.getCurrentAffairsPage().clickCANewsTodayHindi();

		// clicking the Weekly Focus module in current affairs page

		//pom.getCurrentAffairsPage().clickCAWeeklyFocus();

		// clicking the Monthly Current Affairs module in current affairs page

		//pom.getCurrentAffairsPage().clickCAMonthlyCurrentAffairs();

		// clicking the Hindi Magazine module in current affairs page

		//pom.getCurrentAffairsPage().clickCAHindiMagazine();

		// clicking the PT365 module in current affairs page

		//pom.getCurrentAffairsPage().clickCAPt365();

		// clicking the Mains365 module in current affairs page

		//pom.getCurrentAffairsPage().clickCAMains365();

		// clicking the Economic Surevy module in current affairs page

		//pom.getCurrentAffairsPage().clickCAEconomicSurvey();

		// clicking the Union Budget module in current affairs page

		//pom.getCurrentAffairsPage().clickCAUnionBudget();

		// clicking the Interview module in current affairs page

		//pom.getCurrentAffairsPage().clickCAInterview();

		// clicking the Value added material module in current affairs page

		//pom.getCurrentAffairsPage().clickCAValueAddedMaterial();

		synchronized (driver) {
			try {
				driver.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//clicking the back button

		pom.getCurrentAffairsPage(getDriver()).clickCABackBButton();

	}

}
