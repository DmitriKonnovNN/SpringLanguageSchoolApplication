package LanguageSchool.LSApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmployeePositionDto extends BasicDto {

    @JsonProperty (value = "position")
    private String position;

    @JsonProperty (value = "responsibilities")
    private String responsibilities;


}
