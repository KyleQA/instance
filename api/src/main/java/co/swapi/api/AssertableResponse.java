package co.swapi.api;

import co.swapi.api.conditions.Condition;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class AssertableResponse {

  private Response response;

  @Step("api response shouldHave {condition}")
  public AssertableResponse shouldHave(Condition condition) {
    log.info("About to check condition {}", condition);
    condition.check(response);
    return this;
  }

  @Step
  public AssertableResponse shouldHave(Condition... condition) {
    for (Condition cond : condition) {
      cond.check(response);
    }
    return this;
  }

  public <T> T responseAs(Class<T> tClass) {
    return response.as(tClass);
  }
}
