package LanguageSchool.LSApplication.dto.Appointment;

import LanguageSchool.LSApplication.dto.BasicDto;
import LanguageSchool.LSApplication.dto.GroupDto;
import LanguageSchool.LSApplication.dto.PersonDto;
import LanguageSchool.LSApplication.dto.PlaceDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public abstract class AppointmentDto extends BasicDto {


    @JsonProperty(value = "date")
    private Date date;

    @JsonProperty(value = "group")
    private GroupDto group;

    @JsonProperty(value = "comment")
    private String comment;

    @JsonProperty (value = "employees")
    private List<PersonDto> CurrentEmployees;

    @JsonProperty (value = "currentStudents")
    private List <PersonDto> CurrentStudents;

    @JsonProperty (value = "place")
    private PlaceDto place;

    @JsonProperty (value = "equipment")
    private String equipment;


}
