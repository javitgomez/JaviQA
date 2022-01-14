package steps;

import actions.RyanairActions;
import cucumber.api.java.en.Given;
import elements.RyanairElements;

public class RyanairSteps {



        RyanairActions ryanairActions = new RyanairActions();
    @Given("^The user accepts the privacy conditions and access to ryanair$")
    public void accessToRyanair(){

        ryanairActions.ClickAccpet();

    }
}
