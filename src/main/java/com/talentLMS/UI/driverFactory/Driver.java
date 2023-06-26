package com.talentLMS.UI.driverFactory;

import com.talentLMS.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

/**
 * @author Kayrat Japarbek
 */
public class Driver {

    private Driver() {
        // Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver();
                    break;
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e) {
            System.out.println("Error while closing driver!");
        }
    }





}
