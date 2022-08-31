package utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebDriver {


    // Her thread e özel driver olacak ve static olduğu için o thread deki bütün classlaar aynı DRİVER ı kullanmış olacak.
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();// WebDriver1  , WebDriver 2
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();// chrome , firefox

    public static WebDriver getDriver() {
        if (threadBrowserName.get() == null) {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) {
            switch (threadBrowserName.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;
            }

        }
        return threadDriver.get();
    }

    public static void driverQuit() {
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver webDriver = threadDriver.get();
            webDriver = null;
            threadDriver.set(webDriver);
        }

    }

}
