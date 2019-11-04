package co.swapi.api.services.peopleApiService;

import co.swapi.api.AssertableResponse;
import co.swapi.api.services.SetupApiService;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeopleApiService extends SetupApiService {

  @Step("Send GET api/people")
  public AssertableResponse getListOfPeople(int pageNumber) {
    log.info("Get list of people");
    Response response =
            setup()
                    .given()
                    .param("page", pageNumber)
                    .when()
                    .get("api/people/")
                    .then().extract().response();
    return new AssertableResponse(response);
  }
}
