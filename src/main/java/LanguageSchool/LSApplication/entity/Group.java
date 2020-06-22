package LanguageSchool.LSApplication.entity;


import LanguageSchool.LSApplication.enums.CEFRLevel;


import javax.persistence.Column;
import java.util.List;

public class Group extends BasicEntity {
    @Column(name= "lessons")
    private List<AppointmentDto> lessons;

    @Column (name = "exams")
    private List <AppointmentDto> exams;

    @Column (name = "other_events")
    private List <AppointmentDto> otherEvents;

    @Column (name = "employee_trainings")
    private List <AppointmentDto> employeeTrainings;

    @Column (name = "subject")
    private SubjectDto subject;

    @Column (name = "target_language_level")
    private CEFRLevel targetLanguageLevel;
}
