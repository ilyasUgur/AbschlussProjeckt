package utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


public class BasicWebDriver {

    // Her thread e özel driver olacak ve static olduğu için o thread deki bütün classlaar aynı DRİVER ı kullanmış olacak.
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();//WebDriver1  , WebDriver 2
    public static ThreadLocal<String> browserName = new ThreadLocal<>();// chrome , firefox

    public static WebDriver getDriver() {
        if (browserName.get() == null) {
            browserName.set("chrome".toLowerCase());
        }


        if (driver.get() == null) {
            switch (browserName.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;

                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
            }

        }
        return driver.get();
    }
    @AfterTest
    public static void quitDriver() {
//        if (driver.get() != null) {
//            driver.get().quit();
//            WebDriver webDriver = driver.get();
//            webDriver = null;
//            driver.set(webDriver);
//        }

driver.get().quit();
    }
}