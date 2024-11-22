package com.juaracoding.admin;

import com.juaracoding.Hooks;
import com.juaracoding.pages.admin.LoginPage;
import com.juaracoding.pages.admin.ManagementUserPage;
import com.juaracoding.utlis.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManagementUserTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static ManagementUserPage managementUserPage = new ManagementUserPage();

    public ManagementUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("I went to the management user page")
    public void i_went_to_the_management_user_page(){
        managementUserPage.setManagementMenuBar();
        managementUserPage.setUserManagementList();
        Utils.delay(3);
        Assert.assertEquals(managementUserPage.getTxtUser(), "User");
    }

    @Then("I view list of user data by name")
    public void i_view_list_of_user_data_by_name(){
        Assert.assertEquals(managementUserPage.getTxtUser(), "User");
        Assert.assertEquals(managementUserPage.getTxtNamaKaryawan(), "testerjuara");
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/user?fullname%5B%24like%5D=%25testerjuara%25");
    }

    @Then("I view list of user data by punctuation input")
    public void i_view_list_of_user_data_by_punctuation_input(){
        Assert.assertEquals(managementUserPage.getTxtUser(), "User");
    }
}
