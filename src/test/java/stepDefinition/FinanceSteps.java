package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogCont;
import pages.LeftNav;

public class FinanceSteps {
    private static DialogCont dialogCont;
    private static LeftNav leftNav;


    public FinanceSteps(DialogCont dialogCont, LeftNav leftNav) {
        this.leftNav = leftNav;
        this.dialogCont = dialogCont;
    }

    @Given("^naviagete to finance page$")
    public void naviagete_to_finance_page() throws Throwable {
        leftNav.clickFunktion(leftNav.getFinance());
    }

//    @When("^click to Finance$")
//    public void click_to_Finance() throws Throwable {
//
//    }

    @Then("^click to Payments$")
    public void click_to_Payments() throws Throwable {
        leftNav.clickFunktion(leftNav.getPayments());
    }

    @Then("^select to Payments Source$")
    public void select_to_Payments_Source() throws Throwable {
       dialogCont.setSelect(dialogCont.getPaymentSource(),"Cash");
        //dialogCont.setSelectIndex(dialogCont.getPaymentSource(),2);
    }

    @Then("^write your Commnent$")
    public void write_your_Commnent() throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getCommentPayment(), "alles in Ordnung");
    }

    @Then("^click to save button$")
    public void click_to_save_button() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getSaveButton());
    }

    @Then("^user should Success message$")
    public void user_should_Success_message() throws Throwable {
        dialogCont.waitBisVisible(dialogCont.getSuccessMessage());
    }


}
