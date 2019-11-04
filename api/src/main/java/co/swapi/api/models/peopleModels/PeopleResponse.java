package co.swapi.api.models.peopleModels;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class PeopleResponse{

	@JsonProperty("next")
	private String next;

	@JsonProperty("previous")
	private Object previous;

	@JsonProperty("count")
	private int count;

	@JsonProperty("results")
	private List<ResultsItem> results;
}