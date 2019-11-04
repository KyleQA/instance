package net.travels.ui.dataGenerator;

import com.github.javafaker.Faker;

public class UserDataGenerator {

  private static Faker faker = new Faker();

  public static String getFakerFirstName(){
    return faker.name().firstName();
  }

  public static String getFakerLastName(){
    return faker.name().lastName();
  }

  public static String getFakerEmailAddress(){ return faker.internet().emailAddress(); }

  public static String getFakerRandomNumber(int length){
    return faker.number().digits(length);
  }
}
