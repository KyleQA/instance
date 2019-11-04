package net.travels.ui;

import net.travels.ui.dataProvider.DataProviderLanguage;
import net.travels.ui.pageClasses.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static net.travels.ui.helpers.properties.UrlLinksProp.MAIN_URL;

public class UiTest extends BaseTest {

  private RegisterPage registerPage = new RegisterPage();
  private MainPage mainPage = new MainPage();
  private AccountPage accountPage = new AccountPage();

  @BeforeMethod
  public void openMainPage(){
    open(MAIN_URL);
    clearBrowserCookies();
  }

  @Test(description = "Register user with valid data with different languages",
           dataProvider = "Language", dataProviderClass = DataProviderLanguage.class)
  public void registerUserWithValidData(String lang){
    mainPage.clickToLanguageDropdown();
    mainPage.selectLanguage(lang);
    mainPage.navigateToSignUpPage();

    CustomerData customerData = new CustomerData();
    registerPage
       .setValuesInRegisterFields(customerData)
       .clickOnSignUpButton();

    // verify that user is registered by email in 'My Profile'
    accountPage.checkEmail(customerData.getEmail());
  }

  @Test(description = "Register user without first name",
           dataProvider = "Language", dataProviderClass = DataProviderLanguage.class)
  public void registerUserWithoutFirstName(String lang){
    mainPage.clickToLanguageDropdown();
    mainPage.selectLanguage(lang);
    mainPage.navigateToSignUpPage();

    CustomerData customerData = new CustomerData()
            .setFirstName(null);
    registerPage
            .setValuesInRegisterFields(customerData)
            .clickOnSignUpButton();
  }

  @Test(description = "Register user without last name",
          dataProvider = "Language", dataProviderClass = DataProviderLanguage.class)
  public void registerUserWithoutLastName(String lang){
    mainPage.clickToLanguageDropdown();
    mainPage.selectLanguage(lang);
    mainPage.navigateToSignUpPage();

    CustomerData customerData = new CustomerData()
            .setLastName(null);
    registerPage
            .setValuesInRegisterFields(customerData)
            .clickOnSignUpButton();
  }
}
