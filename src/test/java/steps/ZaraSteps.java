package steps;

import actions.YoutubeActions;
import actions.ZaraActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ZaraSteps {

    @Steps
    private ZaraActions zaraActions;

    @Given("^User enter and click on login$")
    public void enter_and_user_access_zara(){
        zaraActions.openZara();
        zaraActions.buttonCookies();
        zaraActions.buttonLoginZara();
        zaraActions.enterUser();
        zaraActions.enterPass();
        zaraActions.buttonLoginConfirm();
    }

    @When("^User goes to perfum$")
    public void goes_search(){
        zaraActions.buttonSearch();
        zaraActions.enterSearch();
        zaraActions.buttonTrousers();
    }
    @When("^User goes to the last purchase screen$")
    public void goes_last_screen(){
        zaraActions.buttonAddCart();
        zaraActions.buttonGoCart();
        zaraActions.buttonAdd1();
        zaraActions.buttonContinue1();
        zaraActions.buttonContinue2();
        zaraActions.buttoncard();
        zaraActions.buttonContinue3();
    }

    /*@When("^Select color and size$")
    public void click_color_size(){
        zaraActions.buttonColor();
        zaraActions.buttonSize();
    }
     */
    /*
      @When("^Click on edit order adding gift card$")
    public void button_edit_order(){
        zaraActions.buttonEditOrder();
        zaraActions.enterFrom();
        zaraActions.enterMessage();
        zaraActions.buttonSaveEdit();
    }
    */

    @When("^User logout$")
    public void button_Logout(){
        zaraActions.buttonBack();
        zaraActions.buttonAccount();
        zaraActions.buttonLogout();
    }
}

