package LanguageSchool.LSApplication.dto;

import LanguageSchool.LSApplication.dto.Appointment.ExamDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ResultsOfExamDto extends BasicDto{

    @JsonProperty (value = "currentExam")
    private ExamDto currentExam;

    @JsonProperty (value = "resultsMap")
    private Map <PersonDto,Map <String, String>> resultsMap;



}
