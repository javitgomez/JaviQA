package actions;

import elements.EmployeesElements;
import static com.codeborne.selenide.Selenide.open;
import static elements.EmployeesElements.*;

public class EmployeesActions {

    EmployeesElements employeesElements = new EmployeesElements();

    public void openEmployees() {
        open("C:\\Users\\javier.toribio\\IdeaProjects\\JaviQA\\EmployeesWeb\\ui-test-assessment\\employees.html");

    }
    public void andrewButton(){
        ANDREW_BUTTON.click();
    }
    public void andrewDownButton(){
        ANDREW_DOWN_BUTTON.click();
    }
    public void nancyButton(){
        NANCY_BUTTON.click();
    }
    public void janetButton(){
        JANET_BUTTON.click();
    }
    public void margaretButton(){
        MARGARET_BUTTON.click();
    }
    public void stevenButton(){
        STEVEN_BUTTON.click();
    }
    public void stevenDownButton(){
        STEVEN_DOWN_BUTTON.click();
    }
    public void michaelButton(){
        MICHAEL_BUTTON.click();
    }
    public void robertButton(){
        ROBERT_BUTTON.click();
    }
    public void anneButton(){
        ANNE_BUTTON.click();
    }
    public void lauraButton(){
        LAURA_BUTTON.click();
    }
    public void showListButton(){
        SHOW_LIST_BUTTON.click();
        String allEmployees = SHOW_LIST_TEXT.getText();
        System.out.println("List of all employees: ");
        System.out.println("-----------------------------------------");
        System.out.println(allEmployees);
        System.out.println("-----------------------------------------");

    }
    public void showMaleListButton(){
        SHOW_LIST_BUTTON.click();
        String maleEmployees = SHOW_LIST_TEXT.getText();
        System.out.println("List of male employees: ");
        System.out.println("-----------------------------------------");
        System.out.println(maleEmployees);
        System.out.println("-----------------------------------------");


    }
    public void nancyButtonOff(){
        NANCY_BUTTON_OFF.click();
    }
    public void janetButtonOff(){
        JANET_BUTTON_OFF.click();
    }
    public void margaretButtonOff(){
        MARGARET_BUTTON_OFF.click();
    }
    public void anneButtonOff(){
        ANNE_BUTTON_OFF.click();
    }
    public void lauraButtonOff(){
        LAURA_BUTTON_OFF.click();
    }

     /*
    public void buttonCookies(){
        COOKIES_BUTTON.click();
    }
    public void buttonLoginZara(){
        LOGON_BUTTON.click();
    }
    public void enterUser(){
        USER_BAR.sendKeys("ldd39847@qopow.com");
    }
    public void enterPass(){
        PASSWORD_BAR.sendKeys("8xh#qL#n");
    }
    public void buttonLoginConfirm(){ CONFIRM_lOGON_BUTTON.click(); }
    public void buttonSearch(){ SEARCH_BUTTON.click(); }
    public void enterSearch(){
        SEARCH_BARR.sendKeys("ENERGETICALLY NEW YORK");
    }
  public void buttonPerfume(){ SEARCH_BUTTON_PERFUME.click(); }
    public void buttonAddCart(){
        BUTTON_ADD_CART.click();
    }
    public void buttonGoCart(){
        BUTTON_GO_CART.click();
    }
    public void buttonLess1(){
        BUTTON_LESS_1.click();
    }
    public void buttonEditOrder(){
        BUTTON_EDIT_ORDER.click();
    }
    public void buttonGiftCard(){
        BUTTON_GIFT_CARD.click();
    }
    public void enterFrom(){
        FROM_BAR.sendKeys("Manuel Martinez");
    }
    public void enterMessage(){
        MESSAGE_BAR.sendKeys("Con mucho cariño");
    }
    public void buttonSaveEdit(){
        BUTTON_SAVE_EDIT.click();
    }
    public void buttonContinue1(){
        BUTTON_CONTINUE_1.click();
    }
    public void buttonContinue2(){
        BUTTON_CONTINUE_2.click();
    }
    public void buttoncard(){
        CARD_BUTTON.click();
    }
    public void buttonContinue3(){
        BUTTON_CONTINUE_3.click();
    }
    public void buttonBack(){
        BUTTON_BACK.click();
    }
    public void buttonAccount(){
        BUTTON_ACCOUNT.click();
    }
    public void buttonLogout(){
        BUTTON_LOGOUT.click();
    }
    public void buttonOpenMenu(){
        BUTTON_OPEN_MENU.click();
    }
    public void buttonBag(){
        BUTTON_BAG.click();
    }
    public void buttonNewCollection(){
        BUTTON_NEW_COLLECTION.click();
    }
    public void buttonWomen(){
        BUTTON_WOMEN.click();
    }
    public void buttonSelectBag(){
        BUTTON_SELECT_BAG.click();
    }
    public void buttonColor(){
        BUTTON_COLOR.click();
    }
    public void buttonAddCart2(){
        BUTTON_ADD_CART2.click();
    }
    /*public void buttonSize(){
        BUTTON_SIZE.click();
    }*/
}
