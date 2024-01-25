package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC030_AllindiaRadio extends VisionBaseClass {

	@Test
	public void testResources() throws InterruptedException {

	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	Thread.sleep(3000);

	pom.getResources(getDriver()).clickResources();
	Thread.sleep(8000);

	pom.getResources(getDriver()).playAllindiaRadio1();
	Thread.sleep(3000);
	pom.getResources(getDriver()).pauseAllindiaRadio1();

	pom.getResources(getDriver()).playAllindiaRadio2();
	Thread.sleep(3000);
	pom.getResources(getDriver()).pauseAllindiaRadio2();

	pom.getResources(getDriver()).playAllindiaRadio3();
	Thread.sleep(3000);
	pom.getResources(getDriver()).pauseAllindiaRadio3();
	Thread.sleep(3000);

	pom.getResources(getDriver()).clickAIRarrow();
	Thread.sleep(3000);

	pom.getResources(getDriver()).playAllindiaRadio4();
	Thread.sleep(3000);
	pom.getResources(getDriver()).pauseAllindiaRadio4();

	pom.getResources(getDriver()).playAllindiaRadio5();
	Thread.sleep(3000);
	pom.getResources(getDriver()).pauseAllindiaRadio5();

}
}