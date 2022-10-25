package stepDefinition;

import cucumber.api.java.en.When;
import pages.DialogCont;
import pages.FormCont;
import pages.LeftNav;

public class HumanResourcesSteps {
    private static DialogCont dialogCont;
    private static LeftNav leftNav;


    public HumanResourcesSteps(DialogCont dialogCont, LeftNav leftNav) {
        this.dialogCont = dialogCont;
      this.leftNav=leftNav;
    }

    @When("^Click to Human Resources$")
    public void clickToHumanResources() {
        leftNav.clickFunktion(leftNav.getHumanRsrcClick());
        leftNav.clickFunktion(leftNav.getSetupClick());
    }


    @When("^Click to Positions$")
    public void click_to_Positions() throws Throwable {
        leftNav.clickFunktion(leftNav.getPositionsClick());
        dialogCont.clickFunktion(dialogCont.getAddpositionsClick());
    }

    @When("^Add position and Name and ShortName$")
    public void add_position_and_Name_and_ShortName() throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getInputPositionsName(), "Softwareenwicklungs");
        dialogCont.sendFunktionen(dialogCont.getInputPositionsShortName(), "IT");
    }

    @When("^Save and Delete to Positions$")
    public void save_and_Delete_to_Positions() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getSave());
        dialogCont.clickFunktion(dialogCont.getSearchButton());
        dialogCont.sendFunktionen(dialogCont.getInputPositionsNameSearch(), "Softwareenwicklungs");
        dialogCont.sendFunktionen(dialogCont.getInputPositionsShortNameSearch(), "IT");
        dialogCont.clickFunktion(dialogCont.getDeleteButton());
        dialogCont.clickFunktion(dialogCont.getDeleteButton2());
    }

    @When("^Then Success message should be displayed$")
    public void then_Success_message_should_be_displayed() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getSuccessMessage());
    }


}
