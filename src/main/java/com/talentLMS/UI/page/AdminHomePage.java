package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kayrat Japarbek
 */
public class AdminHomePage extends BasePage{


    @FindBy(xpath = "//img[@class='avatar-square']")
    public WebElement logo;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[1]")
    public WebElement homeText;

    @FindBy(xpath = "//*[@id=\"tl-admin-users\"]/div[1]/a")
    public WebElement usersBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard\"]/div[3]/div/div[1]/a")
    public WebElement categoriesBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard\"]/div[5]/div/div[1]/a")
    public WebElement branchesBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard\"]/div[7]/div/div[1]/a")
    public WebElement userTypesBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard-reports\"]/div/div[1]/a")
    public WebElement reportsBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-courses\"]/div/div[1]/a")
    public WebElement coursesBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard\"]/div[4]/div/div[1]/a")
    public WebElement groupsBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-events-engine\"]/div/div[1]/a")
    public WebElement eventsEngineBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard\"]/div[8]/div/div[1]/a")
    public WebElement importAndExportBtn;

    @FindBy(xpath = "//*[@id=\"tl-admin-settings\"]/div[1]/a")
    public WebElement accountAndSettingsBtn;




}
