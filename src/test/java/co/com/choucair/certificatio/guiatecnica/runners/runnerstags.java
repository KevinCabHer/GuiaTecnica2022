package co.com.choucair.certificatio.guiatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academychoucair.feature",
        tags = "@Stories",
        glue = "co.com.choucair.certificatio.guiatecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class runnerstags {
}
