package org.ak.test.selenium;

import org.openqa.selenium.server.SeleniumServer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.thoughtworks.selenium.SeleneseTestCase;

public class NewTest extends SeleneseTestCase {
	// We create our Selenium test case

	SeleniumServer sr;
	@BeforeClass
	public void startSelenium() {
		
		try {
			sr = new SeleniumServer();
			sr.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void setUp() throws Exception {
		setUp("http://www.google.com/", "*firefox");
		// We instantiate and start the browser
	}

	public void testNew() throws Exception {
		selenium.open("/");
		selenium.type("q", "selenium rc");
		selenium.click("btnG");
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent("Results * for selenium rc"));
		// These are the real test steps
	}

	@AfterClass(alwaysRun = true)
	public void stopSelenium() {
		sr.stop();
	}
}
