package co.com.choucair.certifications.proyectobase.stepdefinitions;


import co.com.choucair.certifications.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certifications.proyectobase.questions.Answer;
import co.com.choucair.certifications.proyectobase.tasks.Login;
import co.com.choucair.certifications.proyectobase.tasks.OpenUp;
import co.com.choucair.certifications.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {


    @Before
    public void setStage() {OnStage.setTheStage(new OnlineCast());}

    @Given("^than Rose want to learn automation at the Academy choucair$")
    public void thanRoseWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws  Exception{
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(),(Login
                .onthePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @When("^she search for the course on the choucair Academy platfrom$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlatfrom(List<AcademyChoucairData> academyChoucairData) throws  Exception {
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
            // E,K,V must be a scalar (String, Integer, Date, enum etc).
            // Field names for YourType must match the column names in
            // your feature file (except for spaces and capitalization).
        }

    @Then("^she find the course called$")
    public void sheFindTheCourseCalled(List<AcademyChoucairData> academyChoucairData) throws  Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
    }
}











