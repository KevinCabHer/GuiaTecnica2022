package co.com.choucair.certificatio.guiatecnica.stepdefinitions;

import co.com.choucair.certificatio.guiatecnica.questions.Answer;
import co.com.choucair.certificatio.guiatecnica.tasks.Login;
import co.com.choucair.certificatio.guiatecnica.tasks.OpenUp;
import co.com.choucair.certificatio.guiatecnica.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ChoucairAcademyStepsDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        theActorCalled("brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }
    //Recursos Automatizacion Bancolombia
    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
        String course = "";
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }
    //Recursos Automatizacion Bancolombia
    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }



}
