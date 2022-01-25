package steps;

import actions.EmployeesActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmployeesSteps {

    @Steps
    private EmployeesActions employeesActions;

    @Given("^Open all employees$")
    public void enter_Web() throws InterruptedException{
        employeesActions.openEmployees();
        //employeesActions.andrewDownButton();
        employeesActions.stevenDownButton();
        Thread.sleep(1000);
    }
    @When("^User click on all employees$")
    public void click_all_employees(){
        employeesActions.andrewButton();
        employeesActions.nancyButton();
        employeesActions.janetButton();
        employeesActions.margaretButton();
        employeesActions.stevenButton();
        employeesActions.michaelButton();
        employeesActions.robertButton();
        employeesActions.anneButton();
        employeesActions.lauraButton();
    }
    @When("^User clicks on the women to remove them from the list$")
    public void click_women_employees(){
        employeesActions.nancyButtonOff();
        employeesActions.janetButtonOff();
        employeesActions.margaretButtonOff();
        employeesActions.anneButtonOff();
        employeesActions.lauraButtonOff();
    }
    @Then("Show the list$")
    public void show_list(){
        employeesActions.showListButton();
    }
    @Then("Show male list$")
    public void show_male_list(){
        employeesActions.showMaleListButton();
    }
}

