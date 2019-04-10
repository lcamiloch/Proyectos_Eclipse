package co.com.google.screenplayone.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;


@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "co.com.google.screenplayone.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )

public class busquedagooglescreenplayrunner {
	

}
