package steps;

import actions.GeneralActions;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class GoogleSteps {


    @Steps
    private GeneralActions generalActions;

    @Given("^A user access to google$")
    public void accessToGoogle(){
        generalActions.openBrowser();
    }
}
