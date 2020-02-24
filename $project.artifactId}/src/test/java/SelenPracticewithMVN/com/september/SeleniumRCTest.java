package SelenPracticewithMVN;

import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.thoughtworks.selenium.DefaultSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


import java.net.URL;

import static org.junit.Assert.assertEquals;

/**
 * Simple {@link DefaultSelenium} test that demonstrates how to run your Selenium tests with <a href="http://saucelabs.com/ondemand">Sauce OnDemand</a>.
 * *
 * @author Ross Rowe
 */
public class SeleniumRCTest {

    private DefaultSelenium selenium;

    @Before
    public void setUp() throws Exception {

        DefaultSelenium selenium = new DefaultSelenium(
                "ondemand.saucelabs.com",
                80,
                "{\"username\": \"september\"," +
                        "\"access-key\": \"12\"," +
                        "\"os\": \"Windows 2003\"," +
                        "\"browser\": \"firefox\"," +
                        "\"browser-version\": \"17\"," +
                        "\"name\": \"Testing Selenium 1 with Java on Sauce\"}",
                "http://saucelabs.com/");
        selenium.start();
        this.selenium = selenium;

    }

    @Test
    public void selenumRC() throws Exception {
        this.selenium.open("https://saucelabs.com/test/guinea-pig");
        assertEquals("I am a page title - Sauce Labs", this.selenium.getTitle());
    }

    @After
    public void tearDown() throws Exception {
        this.selenium.stop();
    }

}
