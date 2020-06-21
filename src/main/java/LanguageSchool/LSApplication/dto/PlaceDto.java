package LanguageSchool.LSApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.net.URL;

@Data
public class PlaceDto extends BasicDto {

    @JsonProperty (value = "address")
    private AddressDto address;

    @JsonProperty (value = "url")
    private URL url;

    @JsonProperty (value = "comment")
    private String comment;


}
