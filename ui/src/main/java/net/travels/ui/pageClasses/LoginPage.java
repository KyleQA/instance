package net.travels.ui.pageClasses;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Accessors(fluent = true)
public class LoginPage extends BasePage{

  SelenideElement loginTitle = $("a[class='collapse-link']");

  @Step("Check title on Login page")
  public void checkLoginTitle(String text) {
    loginTitle.shouldHave(Condition.exactValue(text));

  }

}
