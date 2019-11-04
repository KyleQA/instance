package net.travels.ui.dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderLanguage {

  @DataProvider(name = "Language")
  public static Object[][] language() {
    return new Object[][]{
            {"a[id='en']"},
            {"a[id='ru']"},
            {"a[id='fa']"},
            {"a[id='de']"},
            {"a[id='vi']"},
            {"a[id='fr']"},
            {"a[id='tr']"},
            {"a[id='ar']"},
            {"a[id='es']"},
    };
  }
}
