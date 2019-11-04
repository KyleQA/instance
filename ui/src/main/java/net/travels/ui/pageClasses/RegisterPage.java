package net.travels.ui.pageClasses;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Accessors(fluent = true)
public class RegisterPage extends BasePage{

  SelenideElement firstNameField = $("input[name='firstname']");
  SelenideElement lastNameField = $("input[name='lastname']");
  SelenideElement mobileNumberField = $("input[name='phone']");
  SelenideElement emailField = $("input[name='email']");
  SelenideElement passwordField = $("input[name='password']");
  SelenideElement confirmPasswordField = $("input[name='confirmpassword']");
  SelenideElement signUpButton = $("button[class='signupbtn btn_full btn btn-success btn-block btn-lg']");

  @Step("Click on 'Sign Up' button")
  public RegisterPage clickOnSignUpButton(){
    signUpButton.click();
    return this;
  }

  @Step("Set all values at register fields")
  public RegisterPage setValuesInRegisterFields(CustomerData customerData) {
    firstNameField.click();
    firstNameField.setValue(customerData.getFirstName());
    lastNameField.click();
    lastNameField.setValue(customerData.getLastName());
    mobileNumberField.click();
    mobileNumberField.setValue(customerData.getMobileNumber());
    emailField.click();
    emailField.setValue(customerData.getEmail());
    passwordField.click();
    passwordField.setValue(customerData.getPassword());
    confirmPasswordField.click();
    confirmPasswordField.setValue(customerData.getConfirmPassword());
    return this;
  }
}
