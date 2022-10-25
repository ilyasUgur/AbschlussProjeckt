package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.DialogCont;
import utilies.BasicWebDriver;

public class LoginSteps {

    DialogCont dialogCont = new DialogCont();
    WebDriver driver;

    @Given("^Navigate to Basqar$")
    public void navigate_to_Basqar() throws Throwable {
        driver = BasicWebDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Then("^Enter valid username and password$")
    public void enter_valid_username_and_password() throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getUsername(), "richfield.edu");
        dialogCont.sendFunktionen(dialogCont.getPassword(), "Richfield2020!");
        dialogCont.clickFunktion(dialogCont.getCookies());
        dialogCont.clickFunktion(dialogCont.getLoginButton());
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() throws Throwable {
        dialogCont.verifyElementText(dialogCont.getDashboard(),"Dashboard");
    }

    @Then("^Enter invalid username and password$")
    public void enter_invalid_username_and_password() throws Throwable {
        dialogCont.sendFunktionen(dialogCont.getUsername(), "invalidName");
        dialogCont.sendFunktionen(dialogCont.getPassword(), "invalidPass");
        dialogCont.clickFunktion(dialogCont.getCookies());
        dialogCont.clickFunktion(dialogCont.getLoginButton());
    }

    @Then("^Error message should be diplayed$")
    public void errorMessageShouldBeDiplayed() {
        dialogCont.verifyElementText(dialogCont.getLoginErrorMsg(),"Invalid");

    }
}
