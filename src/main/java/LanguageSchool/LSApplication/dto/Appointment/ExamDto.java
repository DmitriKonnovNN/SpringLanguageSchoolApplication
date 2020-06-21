package LanguageSchool.LSApplication.dto.Appointment;

import LanguageSchool.LSApplication.dto.PersonDto;
import LanguageSchool.LSApplication.dto.ResultsOfExamDto;
import LanguageSchool.LSApplication.dto.SubjectDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ExamDto extends AppointmentDto {

    @JsonProperty (value = "subjectToExamination")
    private SubjectDto subjectToExamination;

    @JsonProperty (value = "examType")
    private String examType;

    @JsonProperty (value = "examName")
    private String examName;

    @JsonProperty (value = "examiners")
    private List<PersonDto> examiners;

    @JsonProperty (value = "examinationSupervisors")
    private List <PersonDto> examinationSupervisors;

    @JsonProperty (value = "results")
    private ResultsOfExamDto results;

}
