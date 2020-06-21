package LanguageSchool.LSApplication.dto;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.util.List;

@Data
public class GroupDto extends BasicDto{

    @JsonProperty (value = "lessons")
    private List <AppointmentDto> lessons;

    @JsonProperty (value = "exams")
    private List <AppointmentDto> exams;

    @JsonProperty (value = "otherEvents")
    private List <AppointmentDto> otherEvents;

    @JsonProperty (value = "employeeTrainings")
    private List <AppointmentDto> employeeTrainings;

    @JsonProperty (value = "subject")
    private SubjectDto subject;

    @JsonProperty (value = "targetLanguageLevel")
    private CEFRLevel targetLanguageLevel;


}
