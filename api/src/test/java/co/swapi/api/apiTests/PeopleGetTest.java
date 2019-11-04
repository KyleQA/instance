package co.swapi.api.apiTests;

import co.swapi.api.models.peopleModels.PeopleResponse;
import co.swapi.api.services.peopleApiService.PeopleApiService;
import org.testng.annotations.Test;

import static co.swapi.api.conditions.Conditions.bodyField;
import static co.swapi.api.conditions.Conditions.statusCode;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertEquals;

public class PeopleGetTest {

  PeopleApiService peopleApiService = new PeopleApiService();

  @Test(description = "Get list of people")
  public void getListOfPeople(){
    PeopleResponse peopleResponse = peopleApiService
            .getListOfPeople(1)
            .shouldHave(statusCode(200))
            .responseAs(PeopleResponse.class);

    assertEquals(peopleResponse.getCount(), 87, "The count don`t equal to 87");
  }

  @Test(description = "Get list of people with nonexistent number page")
  public void getListOfPeopleWithNonexistentNumberPage(){
    peopleApiService
            .getListOfPeople(15)
            .shouldHave(statusCode(404),
                  bodyField("detail", containsString("Not found")));
  }
}
