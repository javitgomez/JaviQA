package actions;

import elements.YoutubeElements;
import elements.ZaraElements;

import static com.codeborne.selenide.Selenide.open;
import static elements.YoutubeElements.*;
import static elements.ZaraElements.*;

public class ZaraActions {


    ZaraElements zaraElements = new ZaraElements();
    public void openZara(){
        open("https://www.zara.com/es/");
    }
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
    public void buttonTrousers(){ SEARCH_BUTTON_TROUSERS.click(); }
    /*public void buttonColor(){
        BUTTON_COLOR.click();
    }*/
    /*public void buttonSize(){
        BUTTON_SIZE.click();
    }*/
    public void buttonAddCart(){
        BUTTON_ADD_CART.click();
    }
    public void buttonGoCart(){
        BUTTON_GO_CART.click();
    }
    public void buttonEditOrder(){
        BUTTON_EDIT_ORDER.click();
    }
    public void buttonAdd1(){
        BUTTON_ADD_1_MORE.click();
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

}
