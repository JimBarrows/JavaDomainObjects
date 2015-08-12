package specification.pages;

import static org.seleniumhq.selenium.fluent.Period.secs;

import java.util.List;
import java.util.stream.Collectors;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.TestableString;

/**
 * Represents the index page, and everything you can do to it.
 * 
 * @author Jim
 *
 */
public class CrmIndex extends CrmTemplate {

    /**
     * Create the index page api using the provided driver.
     * 
     * @param driverProvider
     *            The driver
     */
    public CrmIndex(final WebDriverProvider driverProvider) {
	super(driverProvider, "/#/");
    }

    /**
     * @return Return the title.
     */
    public final TestableString title() {
	return within(secs(2)).title();
    }

    /**
     * Find all the tags with the css class "page-header", and return the text
     * of the first one.
     * 
     * @return the text of the first tag with a page-header css class.
     */
    public final TestableString pageHeader() {
	return within(secs(2)).div(By.className("page-header")).h1s().get(0).getText();
    }

    /**
     * Find the link by it's text "add", and click it.
     * 
     */
    public final void clickAddButton() {
	link(By.linkText("Add")).click();
    }

    /**
     * 
     * @return Find the list with the id "customerList", and return all the text
     *         from it.
     */
    public final List<TestableString> customerList() {
	return (List<TestableString>) ul(By.id("customerList")).lis().stream().map(li -> li.getText()).collect(Collectors.toList());

    }
}
