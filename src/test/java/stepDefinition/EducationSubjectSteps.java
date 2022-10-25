package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.DialogCont;
import pages.LeftNav;

public class EducationSubjectSteps {
    private static DialogCont dialogCont;
    private static LeftNav leftNav;

    public EducationSubjectSteps(DialogCont dialogCont,LeftNav leftNav){
        this.dialogCont=dialogCont;
        this.leftNav=leftNav;
    }
    @When("^Click on education$")
    public void click_on_education() throws Throwable {
        leftNav.clickFunktion(leftNav.getEducation());
    }

    @When("^Click on Setup$")
    public void click_on_Setup() throws Throwable {
        leftNav.clickFunktion(leftNav.getEducationSetup());
    }

    @When("^Click on Subjects$")
    public void click_on_Subjects() throws Throwable {
        leftNav.clickFunktion(leftNav.getSubjects());
        dialogCont.waitBisVisible(dialogCont.getSubjetText());
    }

    @When("^Click on addSubjects$")
    public void click_on_addSubjects() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getSubjectsAddButton());
    }

    @When("^Add a Subjects  name as \"([^\"]*)\" Subjects code\"([^\"]*)\"$")
    public void add_a_Subjects_name_as_Subjects_code(String name, String code) throws Throwable {
        dialogCont.waitBisClickable(dialogCont.getSubjectsName());
        dialogCont.sendFunktionen(dialogCont.getSubjectsName(), name);
        dialogCont.sendFunktionen(dialogCont.getSubjectsCode(), code);
    }

    @When("^Click on Subjects category$")
    public void click_on_Subjects_category() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getSubjectsCatagory());
    }

    @When("^Click on InformationTechnology$")
    public void click_on_InformationTechnology() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getInformationTechnology());
    }

    @When("^Click on Save Button$")
    public void click_on_Save_Button() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getSubjectCategoriesSave());
    }

    @When("^delete inputName \"([^\"]*)\"$")
    public void delete_inputName(String name) throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getDeleteInputName2(), name);
    }

    @When("^click search button$")
    public void click_search_button() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getDeleteSearch());
    }

    @When("^click  on delete buttons$")
    public void click_on_delete_buttons() throws Throwable {
        dialogCont.waitUntilListLessThan(By.xpath("//ms-delete-button[@table='true']//button"), 3);
        dialogCont.clickFunktion(dialogCont.getDelete1());
        dialogCont.clickFunktion(dialogCont.getDelete2());
        dialogCont.verifyElementText(dialogCont.getSuccessMessage(), "success");
        dialogCont.waitBisInvisible(dialogCont.getSuccessMessage());
    }

    @Then("^User should see success message$")
    public void userShouldSeeSuccessMessage() {
        dialogCont.clickFunktion(dialogCont.getSuccessMessage());
    }
}
