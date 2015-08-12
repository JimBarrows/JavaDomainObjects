package specification;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.failures.PendingStepStrategy;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.web.selenium.ContextView;
import org.jbehave.web.selenium.LocalFrameContextView;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.jbehave.web.selenium.SeleniumContext;
import org.jbehave.web.selenium.SeleniumContextOutput;
import org.jbehave.web.selenium.SeleniumStepMonitor;

import specification.pages.PageFactory;
import specification.steps.ui.CrmSteps;

/**
 * Test the specifications against the UI.
 * 
 * @author Jim
 *
 */
@SuppressWarnings("classdataabstractioncoupling")
public class UiSpecificationTests extends JUnitStories {

    /**
     * Height of screen in pixels.
     */
    private static final int SCREENHEIGHT = 120;
    /**
     * Width of Screen in pixels.
     */
    private static final int SCREENWIDTH = 640;
    /**
     * Pending strategy.
     */
    private PendingStepStrategy pendingStepStrategy = new FailingUponPendingStep();
    /**
     * Cross Reference.
     */
    private CrossReference crossReference = new CrossReference().withJsonOnly();
    /**
     * Context View.
     */
    private ContextView contextView = new LocalFrameContextView().sized(SCREENWIDTH, SCREENHEIGHT);
    /**
     * Selenium context.
     */
    private SeleniumContext seleniumContext = new SeleniumContext();
    /**
     * Step monitor.
     */
    @SuppressWarnings("deprecation")
    private SeleniumStepMonitor stepMonitor = new SeleniumStepMonitor(contextView, seleniumContext,
	    crossReference.getStepMonitor());

    /**
     * Formats.
     */
    private Format[] formats = new Format[] { new SeleniumContextOutput(seleniumContext), CONSOLE, WEB_DRIVER_HTML };

    /**
     * Story reporter builder.
     */
    private StoryReporterBuilder reporterBuilder = new StoryReporterBuilder()
	    .withCodeLocation(codeLocationFromClass(ApiSpecificationTests.class)).withFailureTrace(true)
	    .withFailureTraceCompression(true).withDefaultFormats().withFormats(formats)
	    .withCrossReference(crossReference);

    @Override
    public final Configuration configuration() {
	return new SeleniumConfiguration().useSeleniumContext(seleniumContext)
		.usePendingStepStrategy(pendingStepStrategy)
		.useStoryControls(new StoryControls().doResetStateBeforeScenario(false)).useStepMonitor(stepMonitor)
		.useStoryLoader(new LoadFromClasspath(ApiSpecificationTests.class))
		.useStoryReporterBuilder(reporterBuilder);
    }

    @Override
    public final InjectableStepsFactory stepsFactory() {

	PageFactory pageFactory = null;
	CrmSteps crmSteps = new CrmSteps(pageFactory);

	return new InstanceStepsFactory(configuration(), crmSteps);
    }

    @Override
    protected final List<String> storyPaths() {
	return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),
		asList("**/" + System.getProperty("storyFilter", "*") + ".story"), null);
    }

}
