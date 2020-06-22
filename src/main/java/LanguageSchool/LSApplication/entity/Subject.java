package LanguageSchool.LSApplication.entity;

import LanguageSchool.LSApplication.enums.CEFRLevel;


import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class Subject extends BasicEntity {

    @Column (name="subject_name")
    private String subjectName;

    @Column(name = "current_language")
    private String currentLanguage;

    @Column (name = "language_level")
    private CEFRLevel languageLevel;
}
