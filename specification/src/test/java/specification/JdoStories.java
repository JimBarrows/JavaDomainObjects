package specification;

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
import org.jbehave.web.selenium.FirefoxWebDriverProvider;
import org.jbehave.web.selenium.LocalFrameContextView;
import org.jbehave.web.selenium.PerStoryWebDriverSteps;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.jbehave.web.selenium.SeleniumContext;
import org.jbehave.web.selenium.SeleniumContextOutput;
import org.jbehave.web.selenium.SeleniumStepMonitor;

import specification.pages.PageFactory;
import specification.steps.CrmSteps;
import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;

public class JdoStories extends JUnitStories {

	PendingStepStrategy pendingStepStrategy = new FailingUponPendingStep();
	CrossReference crossReference = new CrossReference().withJsonOnly();
	ContextView contextView = new LocalFrameContextView().sized(640, 120);
	SeleniumContext seleniumContext = new SeleniumContext();
	SeleniumStepMonitor stepMonitor = new SeleniumStepMonitor(contextView,
			seleniumContext, crossReference.getStepMonitor());
	Format[] formats = new Format[] {
			new SeleniumContextOutput(seleniumContext), CONSOLE,
			WEB_DRIVER_HTML };
	StoryReporterBuilder reporterBuilder = new StoryReporterBuilder()
			.withCodeLocation(codeLocationFromClass(JdoStories.class))
			.withFailureTrace(true).withFailureTraceCompression(true)
			.withDefaultFormats().withFormats(formats)
			.withCrossReference(crossReference);

	@Override
	public Configuration configuration() {
		return new SeleniumConfiguration()
				.useSeleniumContext(seleniumContext)
				.usePendingStepStrategy(pendingStepStrategy)
				.useStoryControls(
						new StoryControls().doResetStateBeforeScenario(false))
				.useStepMonitor(stepMonitor)
				.useStoryLoader(new LoadFromClasspath(JdoStories.class))
				.useStoryReporterBuilder(reporterBuilder);
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		FirefoxWebDriverProvider driverProvider = new FirefoxWebDriverProvider();
		PerStoryWebDriverSteps webDriverProvider = new PerStoryWebDriverSteps(
				driverProvider);
		PageFactory pageFactory = new PageFactory(driverProvider);
		CrmSteps crmSteps = new CrmSteps(pageFactory);

		return new InstanceStepsFactory(configuration(), webDriverProvider,
				crmSteps);
	}

	@Override
	protected List<String> storyPaths() {
		return new StoryFinder().findPaths(
				codeLocationFromClass(this.getClass()).getFile(), asList("**/"
						+ System.getProperty("storyFilter", "*") + ".story"),
				null);
	}

}