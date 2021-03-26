package co.com.project.test.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (features = "src/test/resources/features/compra_de_cursos.feature",
        glue = "co.com.project.test.stepdefinitions",
        tags = "@tag1",
        snippets = SnippetType.CAMELCASE)

public class RetoTecnicoRunner {

}
