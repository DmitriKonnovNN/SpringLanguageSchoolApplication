package LanguageSchool.LSApplication.dto;

import LanguageSchool.LSApplication.enums.CEFRLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SubjectDto extends BasicDto {


    @NotBlank (message = "subject name cannot be empty")
    @JsonProperty (value ="subjectName")
    private String subjectName;

    @NotBlank (message = "current language cannot be empty")
    @JsonProperty (value = "currentLanguage")
    private String currentLanguage;

    @JsonProperty (value = "languageLevel")
    private CEFRLevel languageLevel;

}
