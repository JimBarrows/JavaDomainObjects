package specification.pages;

import static org.seleniumhq.selenium.fluent.Period.secs;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.TestableString;

/**
 * All of the basic functionality all pages will need.
 * 
 * @author Jim
 *
 */
public class CrmTemplate extends FluentWebDriverPage {

    /**
     * The base url of the page.
     * 
     */
    private String baseUrl;
    /**
     * The actual page URL.
     */
    private String pageUrl;

    /**
     * Create the page with the driverProvider and the page url to be added to
     * the baseUrl.
     * 
     * @param driverProvider
     *            The driver to use for the web browser.
     * @param newPageUrl
     *            The url of the page.
     */
    public CrmTemplate(final WebDriverProvider driverProvider, final String newPageUrl) {
	super(driverProvider);
	this.pageUrl = newPageUrl;

	baseUrl = "http://localhost:8090/crm";

    }

    /**
     * Go to the page.
     */
    public final void go() {
	get(expectedUrl());
    }

    /**
     * 
     * @return The URL we expect to be at.
     */
    protected final String expectedUrl() {
	return baseUrl + pageUrl;
    }

    /**
     * Verify we're on the right page.
     */
    public final void onCorrectPage() {
	within(secs(2)).url().shouldBe(expectedUrl());
    }

    /**
     * 
     * @return Return the flash message, which is the text of the div with an id
     *         of flash.
     */
    @SuppressWarnings("magicnumber")
    public final TestableString flashMessage() {
	return within(secs(3)).div(By.id("flash")).span().getText();
    }
}
