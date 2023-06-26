package com.talentLMS.UI.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

/**
 * @author Kayrat Japarbek
 */
public class EdgeWebDriver {


    public static WebDriver loadEdgeDriver() {

        System.setProperty("webdriver.edge.driver", "src/main/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }
}

