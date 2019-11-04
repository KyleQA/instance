package net.travels.ui.pageClasses;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.experimental.Accessors;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
@Accessors(fluent = true)
public class MainPage extends BasePage{

  SelenideElement languageDropdown = $("a[id='dropdownLangauge'");
  ElementsCollection languagesList = $$("div[class='dropdown-menu-inner'");
  SelenideElement language = $("a[id='en']");

  @Step("Click to language dropdown")
  public void clickToLanguageDropdown() {
    languageDropdown.click();
  }

  @Step("Select language")
  public void selectLanguage(String lang) {
    language.click();
  }

  @Step("Navigate to 'Sign Up' page")
  public void navigateToSignUpPage() {
    myAccountDropdown.click();
    myAccountSignUp.click();
  }



}
