package net.travels.ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import static net.travels.ui.helpers.properties.UrlLinksProp.MAIN_URL;

public class BaseTest {

  public String baseUrl = MAIN_URL;

  @BeforeTest
  public void setup(){
    Configuration.browser =  "chrome";
    Configuration.browserSize = "1920x1080";
    Configuration.timeout =  5000;
  }
}
