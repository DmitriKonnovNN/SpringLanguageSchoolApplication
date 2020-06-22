package LanguageSchool.LSApplication.dto.Person;

import LanguageSchool.LSApplication.dto.Person.PersonDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ThirdPartyDto extends PersonDto {

    @JsonProperty (value = "company")
    private String company;

    @JsonProperty(value = "position")
    private String position;

    @JsonProperty (value = "responsibilities")
    private String responsibilities;
}
