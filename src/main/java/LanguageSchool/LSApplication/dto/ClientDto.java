package LanguageSchool.LSApplication.dto;

import LanguageSchool.LSApplication.dto.Appointment.ExamDto;
import LanguageSchool.LSApplication.dto.Appointment.LessonDto;
import LanguageSchool.LSApplication.dto.Appointment.OtherEventDto;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude (JsonInclude.Include.NON_NULL)
@Data
public class ClientDto extends PersonDto {

    @JsonProperty (value = "groups")
    private List <GroupDto> groups;

    @JsonProperty (value = "exams")
    private List <ExamDto> exams;

    @JsonProperty (value = "lessons")
    private List <LessonDto> lessons;

    @JsonProperty (value = "otherEvents")
    private List <OtherEventDto> otherEvents;


    @NotBlank (message = "client role cannot be empty")
    @JsonProperty (value = "clientRole")
    private ClientRoleDto ClientRole;

    @JsonProperty (value = "currentLanguageLevel")
    private CEFRLevel currentLanguageLevel;




}
