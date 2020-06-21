package LanguageSchool.LSApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressDto extends BasicDto {

    @JsonProperty (value = "postcode")
    private String postcode;

    @JsonProperty (value = "country")
    private String country;

    @JsonProperty (value = "city")
    private String city;

    @JsonProperty (value = "street")
    private String street;

    @JsonProperty (value = "building")
    private String building;

    @JsonProperty (value = "room")
    private String room;


}
