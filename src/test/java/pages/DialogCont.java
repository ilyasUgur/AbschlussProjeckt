package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.BasicWebDriver;
import utilies.ParentClass;

import java.util.List;


public class DialogCont extends ParentClass {
    private WebDriver driver;

    public DialogCont() {
        driver = BasicWebDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement cookies;

    @FindBy(css = "div[class='hot-toast-message']")
    private WebElement loginErrorMsg;

    @FindBy(xpath = "(//*[contains(text(),'Dashboard')])[2] ")
    private WebElement Dashboard;
    @FindBy(xpath = "//ms-add-button[@table='true']//button")
    private WebElement SubjectsAddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement SubjectsName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement SubjectsCode;

    @FindBy(xpath = "(//mat-select//span)[4]")
    private WebElement SubjectsCatagory;


    @FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[3]")
    private WebElement InformationTechnology;

    @FindBy(xpath = " //ms-text-field//input")
    private WebElement deleteInputName2;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement deleteSearch;


    @FindBy(xpath = "//ms-delete-button[@table='true']//button")
    private WebElement delete1;


    @FindBy(xpath = "//button[@type='submit']//span[@class='mat-button-wrapper']")
    private WebElement delete2;

    @FindBy(xpath = "//span[contains(text(),' Delete ')]")
    private WebElement deleteButton2;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement save;

    @FindBy(xpath = "//hot-toast-container//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    @FindBy(xpath = "//ms-add-button[@tooltip='SUBJECT_CATEGORIES.TITLE.ADD']")
    private WebElement addSubjectCategory;

    @FindBy(xpath = "( //ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement SubjectCategoriesName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement SubjectCategoriesCode;

    @FindBy(xpath = "(//ms-save-button//button//span)[2]")
    private WebElement SubjectCategoriesSave;

    @FindBy(xpath = "(//mat-option//span)[7]")
    private WebElement MySubjectCat;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[contains(text(),'Subject Category')]")
    private WebElement subjetText;

    @FindBy(xpath = "//div[contains(text(),'because')]")
    private WebElement errorMessage;


    @FindBy(xpath = "// ms-add-button[contains(@tooltip,'POSITIONS.TITLE.ADD')]")
    private WebElement addButtonSalary;

    @FindBy(xpath = "(//input[@id='ms-text-field-0'])[1]")
    private WebElement newSalary;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(css = "input#mat-input-2")
    private WebElement searchInput;

    @FindBy(xpath = "// ms-add-button[contains(@tooltip,'EMPLOYEE_POSITION.TITLE.ADD')]")
    private WebElement addpositionsClick;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement inputPositionsName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input)[2]")
    private WebElement inputPositionsShortName;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputPositionsNameSearch;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement inputPositionsShortNameSearch;

    @FindBy(xpath = "//ms-text-field[@name='description']")
    private WebElement description;

    @FindBy(xpath = "//mat-form-field/div/div/div/input[@id='mat-input-6']")
    private WebElement budgetInfoStartDate;

    @FindBy(xpath = "//mat-form-field/div/div/div/input[@id='mat-input-7']")
    private WebElement budgetInfoEndDate;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//input[@data-placeholder='First Name']")
    private WebElement employeeFirstName;

    @FindBy(xpath = "//input[@data-placeholder='Last Name']")
    private WebElement employeeLastName;

    @FindBy(xpath = "//div/span[contains(text(),'Gender')]")
    private List<WebElement> employeeGender;

    @FindBy(xpath = "//div/span[contains(text(),'Employee Type')]")
    private List<WebElement> employeeType;

    @FindBy(xpath = "//input[@data-placeholder='Employee ID']")
    private WebElement employeeID;

    @FindBy(xpath = "//div/span[text()='Document Type']")
    private WebElement employeeDocumentType;

    @FindBy(xpath = "//div/input[@data-placeholder='Document Number']")
    private WebElement employeeDocumentNummer;

    @FindBy(xpath = "//div[text()='Contact & Address']")
    private WebElement employeeContactAdress;

    @FindBy(xpath = "//input[@data-placeholder='Country']")
    private WebElement employeeCountry;


    @FindBy(xpath = " (//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")
    private WebElement date;

    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[28]")
    private WebElement date2;

    @FindBy(css = "button[class='mat-focus-indicator mat-icon-button mat-button-base']")
    private WebElement btnDate;

    @FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
    private WebElement btndate2;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement cookiesaccept;

    @FindBy(css = "ms-edit-button>button")
    private WebElement btnEdit;

    @FindBy(id = " #mat-input-1")
    private WebElement comment;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteConfirmBtn;

    @FindBy(css = "ms-text-field[name='description']>input")
    private WebElement descriptionBtn2;

    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[24]")
    private WebElement date3;

    @FindBy(xpath = "(//div[@fxlayout='column'])[1]/span[1]")
    private WebElement schoolName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editBtn;

    @FindBy(css = "[data-placeholder='Description']")
    private WebElement findDescription;

    @FindBy(id = "mat-select-value-23")
    private WebElement subjectStyle;


    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteConfirmButton;

    @FindBy(css = "div#mat-select-value-107")
    private WebElement academicPeriod;

    @FindBy(xpath = "//div/mat-select[@formcontrolname='source']")
    private WebElement paymentSource;

    @FindBy(xpath = "//textarea[@id='mat-input-32']")
    private WebElement commentPayment;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCookies() {
        return cookies;
    }

    public WebElement getLoginErrorMsg() {
        return loginErrorMsg;
    }

    public WebElement getDashboard() {
        return Dashboard;
    }

    public WebElement getSubjectsAddButton() {
        return SubjectsAddButton;
    }

    public WebElement getSubjectsName() {
        return SubjectsName;
    }

    public WebElement getSubjectsCode() {
        return SubjectsCode;
    }

    public WebElement getSubjectsCatagory() {
        return SubjectsCatagory;
    }

    public WebElement getInformationTechnology() {
        return InformationTechnology;
    }

    public WebElement getDeleteInputName2() {
        return deleteInputName2;
    }

    public WebElement getDeleteSearch() {
        return deleteSearch;
    }

    public WebElement getDelete1() {
        return delete1;
    }

    public WebElement getDelete2() {
        return delete2;
    }

    public WebElement getDeleteButton2() {
        return deleteButton2;
    }

    public WebElement getSave() {
        return save;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getAddSubjectCategory() {
        return addSubjectCategory;
    }

    public WebElement getSubjectCategoriesName() {
        return SubjectCategoriesName;
    }

    public WebElement getSubjectCategoriesCode() {
        return SubjectCategoriesCode;
    }

    public WebElement getSubjectCategoriesSave() {
        return SubjectCategoriesSave;
    }

    public WebElement getMySubjectCat() {
        return MySubjectCat;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getSubjetText() {
        return subjetText;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getAddButtonSalary() {
        return addButtonSalary;
    }

    public WebElement getNewSalary() {
        return newSalary;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getAddpositionsClick() {
        return addpositionsClick;
    }

    public WebElement getInputPositionsName() {
        return inputPositionsName;
    }

    public WebElement getInputPositionsShortName() {
        return inputPositionsShortName;
    }

    public WebElement getInputPositionsNameSearch() {
        return inputPositionsNameSearch;
    }

    public WebElement getInputPositionsShortNameSearch() {
        return inputPositionsShortNameSearch;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getBudgetInfoStartDate() {
        return budgetInfoStartDate;
    }

    public WebElement getBudgetInfoEndDate() {
        return budgetInfoEndDate;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getDate() {
        return date;
    }

    public WebElement getDate2() {
        return date2;
    }

    public WebElement getBtnDate() {
        return btnDate;
    }

    public WebElement getBtndate2() {
        return btndate2;
    }

    public WebElement getCookiesaccept() {
        return cookiesaccept;
    }

    public WebElement getBtnEdit() {
        return btnEdit;
    }

    public WebElement getComment() {
        return comment;
    }

    public WebElement getDeleteConfirmBtn() {
        return deleteConfirmBtn;
    }

    public WebElement getDescriptionBtn2() {
        return descriptionBtn2;
    }

    public WebElement getDate3() {
        return date3;
    }

    public WebElement getSchoolName() {
        return schoolName;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getFindDescription() {
        return findDescription;
    }

    public WebElement getDeleteConfirmButton() {
        return deleteConfirmButton;
    }

    public WebElement getSubjectStyle() {
        return subjectStyle;
    }

    public WebElement getAcademicPeriod() {
        return academicPeriod;
    }

    public WebElement getPaymentSource() {
        return paymentSource;
    }

    public WebElement getCommentPayment() {
        return commentPayment;
    }

    public WebElement getEmployeeFirstName() {
        return employeeFirstName;
    }

    public WebElement getEmployeeLastName() {
        return employeeLastName;
    }

    public List<WebElement> getEmployeeGender() {
        return employeeGender;
    }

    public List<WebElement> getEmployeeType() {
        return employeeType;
    }

    public WebElement getEmployeeID() {
        return employeeID;
    }

    public WebElement getEmployeeDocumentType() {
        return employeeDocumentType;
    }

    public WebElement getEmployeeDocumentNummer() {
        return employeeDocumentNummer;
    }

    public WebElement getEmployeeContactAdress() {
        return employeeContactAdress;
    }

    public WebElement getEmployeeCountry() {
        return employeeCountry;
    }
}
