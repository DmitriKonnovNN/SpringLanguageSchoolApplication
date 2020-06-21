package LanguageSchool.LSApplication.entity;

import LanguageSchool.LSApplication.dto.PersonDto;
import LanguageSchool.LSApplication.dto.ResultsOfExamDto;
import LanguageSchool.LSApplication.dto.SubjectDto;


import javax.persistence.Column;
import java.util.List;

public class Exam extends Appointment{

    @Column(name= "subjectToExamination")
    private SubjectDto subjectToExamination;

    @Column (name = "examType")
    private String examType;

    @Column (name = "examName")
    private String examName;

    @Column (name = "examiners")
    private List<PersonDto> examiners;

    @Column (name = "examinationSupervisors")
    private List <PersonDto> examinationSupervisors;

    @Column(name = "results")
    private ResultsOfExamDto results;
}
