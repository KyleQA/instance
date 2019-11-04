package net.travels.ui.pageClasses;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Accessors(fluent = true)
public class AccountPage extends BasePage {

  SelenideElement myProfileTab = $("a[class='nav-link go-text-right']");
  SelenideElement textEmail = $("input[type='email']");
  SelenideElement logoutButton = $("a[class='dropdown-item tr']");


  @Step("Check email")
  public AccountPage checkEmail(String text){
    myProfileTab.click();
    textEmail.shouldHave(Condition.exactValue(text));
    return this;
  }

  @Step("Logout")
    public AccountPage logout(){
    myAccountDropdown.click();
    logoutButton.click();
    return this;
  }

}
