package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class MainsTestSeriesTest extends VisionBaseClass {

	@Test(enabled = false)
	public void filterFuntionalityTest() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Test series Module in header of the home page
		pom.getMainsTestSeriesPage(getDriver()).clickTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Mains test series under Test series module in header
		pom.getMainsTestSeriesPage(getDriver()).clickMainsTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click filter button of Mains Test Series Page

		pom.getMainsTestSeriesPage(getDriver()).clickMainsFilter();

		// click select year dropdown

		// pom.getMainsTestSeriesPage().clickMainsSelectYearDropdown();

		// click various years in select year dropdown

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage(getDriver()).clickMiansSomewhere();

		// select tests in test dropdowmn

		pom.getMainsTestSeriesPage(getDriver()).selectTestInkMainsTestDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage(getDriver()).clickMiansSomewhere();

		// select subject in sibject dropdown

		pom.getMainsTestSeriesPage(getDriver()).selectSubjectInkMainsSubjectDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage(getDriver()).clickMiansSomewhere();

		// selectv medium in select medium dropdown

		pom.getMainsTestSeriesPage(getDriver()).selectMediumInMainsTestDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage(getDriver()).clickMiansSomewhere();

		// select year in select year dropdown

		pom.getMainsTestSeriesPage(getDriver()).selectYearInMainsSelectYearDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage(getDriver()).clickMiansSomewhere();

		// click apply filter in filter pop-up

		pom.getMainsTestSeriesPage(getDriver()).clickApplyFilterPopup();

	}

	@Test(enabled = true)
	public void functionaalityTest() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Test series Module in header of the home page
		pom.getMainsTestSeriesPage(getDriver()).clickTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Mains test series under Test series module in header
		pom.getMainsTestSeriesPage(getDriver()).clickMainsTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click a card in the page

		pom.getMainsTestSeriesPage(getDriver()).clickCard();




	}

}
