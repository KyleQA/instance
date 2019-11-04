package net.travels.ui.pageClasses;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Accessors(fluent = true)
public class BasePage {

  SelenideElement myAccountDropdown = $("i[class='bx bx-user']");
  SelenideElement myAccountSignUp = $("a[class='dropdown-item tr']");

}
