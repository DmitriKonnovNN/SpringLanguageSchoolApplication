package LanguageSchool.LSApplication.dto.Appointment;

import LanguageSchool.LSApplication.enums.CEFRLevel;
import LanguageSchool.LSApplication.enums.LearningGroupType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class CourseDto extends AppointmentDto {

    @NotBlank (message = "name cannot be empty")
    @JsonProperty (value = "name")
    private String name;

    @JsonProperty (value = "groupType")
    private LearningGroupType groupType;

    @JsonProperty (value = "durationInUnities")
    private Integer durationInUnities;

    @JsonProperty (value = "teachingMaterial")
    private String teachingMaterial;

    @JsonProperty (value = "targetLanguageLevel")
    private CEFRLevel targetLanguageLevel;

    @JsonProperty (value = "lessonsAndTrainings")
    private List <AppointmentDto> lessonsAndTrainings;

    @JsonProperty (value = "exams")
    private List<ExamDto> exams;


}
