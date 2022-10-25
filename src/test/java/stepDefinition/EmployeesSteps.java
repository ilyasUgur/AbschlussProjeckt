package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogCont;
import pages.LeftNav;

public class EmployeesSteps {
    private static DialogCont dialogCont;
    private static LeftNav leftNav;

    public EmployeesSteps(DialogCont dialogCont, LeftNav leftNav) {
        this.dialogCont = dialogCont;
        this.leftNav = leftNav;
    }

    @When("^click Human Resources then Employees$")
    public void click_Human_Resources_then_Employees() throws Throwable {
        leftNav.clickFunktion(leftNav.getHumanRsrcClick());
        leftNav.clickFunktion(leftNav.getEmployees());
    }



    @Then("^click Delete button and confirm deleting$")
    public void clickDeleteButtonAndConfirmDeleting() {

    }

    @Then("^click Add Button and fill the  from fields \"([^\"]*)\", \"([^\"]*)\"$")
    public void clickAddButtonAndFillTheFromFields(String firstName, String lastName) throws Throwable {
        dialogCont.clickFunktion(dialogCont.getAddButton());
        dialogCont.sendFunktionen(dialogCont.getEmployeeFirstName(), firstName);
        dialogCont.sendFunktionen(dialogCont.getEmployeeLastName(), lastName);
        dialogCont.selectByListFunktionen(dialogCont.getEmployeeGender(),"Male");
        dialogCont.selectByListFunktionen(dialogCont.getEmployeeType(),"Teacher");



    }

    @Then("^click Add Button and fill firstName and lastName$")
    public void clickAddButtonAndFillFirstNameAndLastName() {
        dialogCont.clickFunktion(dialogCont.getAddButton());
        dialogCont.sendFunktionen(dialogCont.getEmployeeFirstName(), "ali");
        dialogCont.sendFunktionen(dialogCont.getEmployeeLastName(), "yazar");

    }

    @Then("^click add Employee ID$")
    public void clickAddEmployeeID() {
        dialogCont.sendFunktionen(dialogCont.getEmployeeID(),"12");
    }

    @And("^click DocumentTye and select$")
    public void clickDocumentTyeAndSelect() {
dialogCont.setSelect(dialogCont.getEmployeeDocumentType(),"Passport");
    }

    @And("^add Document Nummer$")
    public void addDocumentNummer() {
dialogCont.sendFunktionen(dialogCont.getEmployeeDocumentNummer(),"45");
    }

    @And("^click Contact and Adress$")
    public void clickContactAndAdress() {
        dialogCont.clickFunktion(dialogCont.getEmployeeContactAdress());
    }

    @And("^add Country$")
    public void addCountry() {
        dialogCont.sendFunktionen(dialogCont.getEmployeeCountry(), "Izmir");
    }
}
