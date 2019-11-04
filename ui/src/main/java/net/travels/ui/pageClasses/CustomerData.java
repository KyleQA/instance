package net.travels.ui.pageClasses;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.travels.ui.dataGenerator.UserDataGenerator;

@Getter
@Setter
@Accessors(chain = true)
public class CustomerData {

  String firstName;
  String lastName;
  String mobileNumber;
  String email;
  String password;
  String confirmPassword;

  public CustomerData() {
    this.firstName = UserDataGenerator.getFakerFirstName();
    this.lastName = UserDataGenerator.getFakerLastName();
    this.mobileNumber = UserDataGenerator.getFakerRandomNumber(8);
    this.email = UserDataGenerator.getFakerEmailAddress();
    this.password = UserDataGenerator.getFakerEmailAddress();
    this.confirmPassword = password;
  }
}
