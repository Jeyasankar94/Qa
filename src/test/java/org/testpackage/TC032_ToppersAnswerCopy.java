package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC032_ToppersAnswerCopy extends VisionBaseClass {

	@Test
	public void testToppersAnswer() throws InterruptedException {

	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	synchronized (driver) {
		driver.wait(3000);
	}

	pom.getResources(getDriver()).clickResources();
	synchronized (driver) {
		driver.wait(5000);
	}

	pom.getResources(getDriver()).getToppersAnswer();
	pom.getResources(getDriver()).clickShareTopperAns1();

	pom.getResources(getDriver()).getSharewindowElem();
	pom.getResources(getDriver()).clickClosepopup();
	Thread.sleep(3000);


}
}