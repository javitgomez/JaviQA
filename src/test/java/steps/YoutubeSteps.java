package steps;

import actions.YoutubeActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class YoutubeSteps {

    @Steps
    private YoutubeActions youtubeActions;

    @Given("^the user access youtube$")
    public void user_access_youtube(){
        youtubeActions.openYoutube();
        youtubeActions.acceptConditions();

    }
    @When("^Search Hello World")
    public void search_wisconsin(){
        youtubeActions.search();
    }
    @Then("^Click the video$")
    public void click() throws InterruptedException {
        youtubeActions.searchButton();
        Thread.sleep(5000);
    }

}

