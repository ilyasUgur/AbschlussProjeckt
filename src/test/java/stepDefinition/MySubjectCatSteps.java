package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.DialogCont;
import pages.LeftNav;

public class MySubjectCatSteps {
    private static DialogCont dialogCont;
    private static LeftNav leftNav;

    public MySubjectCatSteps(DialogCont dialogCont, LeftNav leftNav) {
        this.dialogCont = dialogCont;
        this.leftNav= leftNav;
    }
    @When("^Click on SubjectCategory$")
    public void click_on_SubjectCategory() throws Throwable {
        leftNav.clickFunktion(leftNav.getSubjectCategories());
    }

    @When("^Click on addSubjectCategory$")
    public void click_on_addSubjectCategory() throws Throwable {
        dialogCont.clickFunktion(dialogCont.getAddSubjectCategory());
    }

    @When("^User a Subject Categories name as \"([^\"]*)\" Subject Categories code\"([^\"]*)\"$")
    public void user_a_Subject_Categories_name_as_Subject_Categories_code(String name, String code) throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getSubjectCategoriesName(),name);
        dialogCont.sendFunktionen(dialogCont.getSubjectCategoriesCode(),code);
        dialogCont.setSelect(dialogCont.getSubjectsCatagory(),"Human");
    }

    @When("^Click on MySubjectCat$")
    public void click_on_MySubjectCat() throws Throwable {
        dialogCont.scrollToElement(dialogCont.getMySubjectCat());
        dialogCont.clickFunktion(dialogCont.getMySubjectCat());
    }

    @When("^deletion actions \"([^\"]*)\"$")
    public void deletion_actions(String subjectCategory) throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getDeleteInputName2(),subjectCategory);
        dialogCont.clickFunktion(dialogCont.getDeleteSearch());
        dialogCont.waitUntilListLessThan(By.xpath("//ms-delete-button[@class='ng-star-inserted']//button"),3);
        dialogCont.clickFunktion(dialogCont.getDeleteButton());
        dialogCont.clickFunktion(dialogCont.getDeleteButton2());
    }

    @Then("^User should see error message$")
    public void user_should_see_error_message() throws Throwable {
        dialogCont.verifyElementText(dialogCont.getErrorMessage(),"because");
    }


}
