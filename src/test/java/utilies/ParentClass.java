package utilies;

import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import java.util.List;

public class ParentClass {
    Actions actions;
    WebDriverWait wait;
    JavascriptExecutor jse;
    WebDriver driver;
    Select select;
    Assertion assertion;

    public ParentClass() {
        actions = new Actions(BasicWebDriver.getDriver());
        wait = new WebDriverWait(BasicWebDriver.getDriver(), 20);
        jse = (JavascriptExecutor) BasicWebDriver.getDriver();
        assertion= new Assertion();
        driver=BasicWebDriver.getDriver();
    }

    public void sendFunktionen(WebElement webElement, String value) {
        waitBisVisible(webElement);
        scrollToElement(webElement);
        webElement.sendKeys(value);
    }

    public void clickFunktion(WebElement webElement) {
        waitBisClickable(webElement);
        scrollUpToElement(webElement);
        webElement.click();
    }


    public void waitBisVisible(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();

    }

    public void waitBisClickable(WebElement WebElement) {
        wait.until(ExpectedConditions.elementToBeClickable(WebElement));
    }

    public void waitBisInvisible(WebElement WebElement) {
        wait.until(ExpectedConditions.invisibilityOf(WebElement));
    }

    public void scrollToElement(WebElement element) {
        jse.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public void scrollUpToElement(WebElement webElement) {
        jse.executeScript("arguments[0].setAttribute('style','top:0px');", webElement);
        jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void actionDragDrop(WebElement resourceelement, WebElement targetelement) {
        Action action = actions.dragAndDrop(resourceelement, targetelement).build();
        action.perform();
    }

    public void actionenHoweOver(WebElement webElement) {
        Action action = actions.moveToElement(webElement).build();
        action.perform();
    }

    public void selectByListFunktionen(List<WebElement> userList, String usertype) {
        for (WebElement user : userList) {
            if (user.getText().contains(usertype)) {
                clickFunktion(user);
            }
        }
    }

    public void verifyElementText(WebElement webElement,String value) {
        waitBisVisible(webElement);
        assertion.assertTrue(webElement.getText().toLowerCase().contains(value.toLowerCase()));
    }
        public void waitUntilListLessThan(By selector, int num) {
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, num));
        }

//todo parentdeki selectBylistFunktionen select method ve drive klassını yenıden yaz

    public void sendKeysMitActions(WebElement webElement, String value) {
        actions.sendKeys(webElement, value).build().perform();

    }

    public void setSelect(WebElement webElement,String value){
        waitBisVisible(webElement);
        select= new Select(webElement);
        select.selectByValue(value);

    }
    public void setSelectIndex(WebElement webElement,int value){
        waitBisVisible(webElement);
        select= new Select(webElement);
        select.selectByIndex(value);

    }
}

