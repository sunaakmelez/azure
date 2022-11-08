package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.Page;
import steps.SeleniumSteps;

public class PipelineTest {

    SeleniumSteps steps = new SeleniumSteps();
    Page page = new Page();

    @Before
    public void beforeScenario() {
        steps.setUpDriver();
        steps.openUrl(page.url);
    }

    @Test
    public void searchAccenture() {
        steps.enterTextOnElement(page.searchBar, "Accenture");
        steps.enterKeyboardEventOnElement(page.searchBar, Keys.ENTER);
        steps.clickOnElement(page.accentureLink);
    }

    @After
    public void afterScenario() {
        steps.quitDriver();
    }


}
