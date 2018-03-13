package specification;

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
import org.jbehave.web.selenium.*;
import specification.steps.api.CrmSteps;
import specification.steps.api.resources.CustomerDtoResource;

import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;

/**
 * Specifications tests for the json api.
 *
 * @author Jim
 *
 */
@SuppressWarnings("classdataabstractioncoupling")
public class ApiSpecificationTests extends JUnitStories {

	/**
	 * Height of screen in pixels.
	 */
	private static final int			SCREENHEIGHT		= 120;
	/**
	 * Width of Screen in pixels.
	 */
	private static final int			SCREENWIDTH			= 640;
	/**
	 * Pending strategy.
	 */
	private final PendingStepStrategy	pendingStepStrategy	= new FailingUponPendingStep();
	/**
	 * Cross Reference.
	 */
	private final CrossReference		crossReference		= new CrossReference().withJsonOnly();
	/**
	 * Context View.
	 */
	private final ContextView			contextView			= new LocalFrameContextView().sized(SCREENWIDTH,
			SCREENHEIGHT);
	/**
	 * Selenium context.
	 */
	private final SeleniumContext		seleniumContext		= new SeleniumContext();
	/**
	 * Step monitor.
	 */
	@SuppressWarnings("deprecation")
	private final SeleniumStepMonitor	stepMonitor			= new SeleniumStepMonitor(contextView, seleniumContext,
			crossReference.getStepMonitor());

	/**
	 * Formats.
	 */
	private final Format[] formats = new Format[] { new SeleniumContextOutput(seleniumContext), CONSOLE,
			WEB_DRIVER_HTML };

	/**
	 * Story reporter builder.
	 */
	private final StoryReporterBuilder reporterBuilder = new StoryReporterBuilder()
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

		final CrmSteps crmSteps = new CrmSteps(new CustomerDtoResource());

		return new InstanceStepsFactory(configuration(), crmSteps);
	}

	@Override
	protected final List<String> storyPaths() {
		return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),
				asList("**/" + System.getProperty("storyFilter", "*") + ".story"), null);
	}

}
