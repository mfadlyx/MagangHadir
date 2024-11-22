package com.juaracoding.pages.admin;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utlis.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    //input[@id='password']

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//p[contains(@class, 'css-1kei35f')]")
    private WebElement txtDashboard;

    @FindBy(xpath = "//h5[contains(@class, 'css-5shv7u')]")
    private WebElement userProfile;

    @FindBy(xpath = "//button[contains(@class, 'css-uajqx8')]")
    private WebElement btnLogout;

    @FindBy(xpath = "//p[contains(@class, 'css-a97271')]")
    private WebElement txtLogin;

    @FindBy(xpath = "//p[contains(@class, 'css-1qamc72')]")
    private WebElement txtErrorMessage;

    @FindBy(xpath = "//button[contains(@class, 'css-1yhx7lq')]")
    private WebElement btnHiddenPassword;

    public void loginUser(String email, String password) {
        // remove username / password from last login in the field
        // need to remove first because in invalid login case, the field will not empty
        if (this.email.getText() != null || this.password.getText() != null) {
            Utils.delay(2);
            this.email.clear();
            this.password.clear();
        }

        this.email.sendKeys(email);
        this.password.sendKeys(password);
        Utils.delay(2);
    }

    public void setBtnLogin() {
        btnLogin.click();
    }

    public String getTxtDashboard() {
        return txtDashboard.getText();
    }

    public void userProfile() {
        userProfile.click();
    }

    public void setBtnLogout() {
        btnLogout.click();
    }

    public String getTxtLogin() {
        return txtLogin.getText();
    }

    public String getErrorMessage() {
        return txtErrorMessage.getText();
    }

    public String getEmailAttribute() {
        return email.getAttribute("value");
    }

    public String getPasswordType() {
        return password.getAttribute("type");
    }

    public void setBtnHiddenPassword() {
        btnHiddenPassword.click();
    }
}