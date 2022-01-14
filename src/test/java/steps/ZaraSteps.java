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

    @Given("^The user enter and click on login$")
    public void enter_and_user_access_zara(){
        zaraActions.openZara();
        zaraActions.buttonCookies();
        zaraActions.buttonLoginZara();
    }
    @When("^Enter email and enter password")
    public void enter_email_password(){
        zaraActions.enterUser();
        zaraActions.enterPass();
    }
    @Then("^Click log in button$")
    public void click_confirm_login() throws InterruptedException {
        zaraActions.buttonLoginConfirm();
        Thread.sleep(1000);
    }
    @When("^Click on search$")
    public void click_search(){
        zaraActions.buttonSearch();
    }
    @Then("^Enter trousers")
    public void enter_trousers()throws InterruptedException {
        zaraActions.enterSearch();
        zaraActions.buttonTrousers();
        Thread.sleep(1000);
    }
    @When("^Select color and size$")
    public void click_color_size(){
        /*zaraActions.buttonColor();*/
        //zaraActions.buttonSize();
    }
    @When("^Click on add to cart$")
    public void click_add_cart(){
        zaraActions.buttonAddCart();

    }
    @When("^Go to card$")
    public void click_go_cart(){
        zaraActions.buttonGoCart();
    }
    @When("^Click on add 1 more$")
    public void button_add_1(){
        zaraActions.buttonAdd1();
    }
    @When("^Click on edit order adding gift card$")
    public void button_edit_order(){
        zaraActions.buttonEditOrder();
        zaraActions.enterFrom();
        zaraActions.enterMessage();
        zaraActions.buttonSaveEdit();
    }
    @When("^Click on Continue several times$")
    public void button_Continue(){
        zaraActions.buttonContinue1();
        zaraActions.buttonContinue2();
        zaraActions.buttoncard();
        zaraActions.buttonContinue3();
    }
    @When("^Click to account$")
    public void button_Account(){
        zaraActions.buttonBack();
        zaraActions.buttonAccount();
        zaraActions.buttonLogout();

    }
    @When("^Click to logout$")
    public void button_Logout(){
        zaraActions.buttonLogout();

    }


}

