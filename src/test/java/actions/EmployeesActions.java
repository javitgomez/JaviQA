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
}
