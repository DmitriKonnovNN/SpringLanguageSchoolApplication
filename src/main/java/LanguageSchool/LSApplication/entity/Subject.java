package LanguageSchool.LSApplication.entity;


import LanguageSchool.LSApplication.entity.Appointment.Appointment;
import LanguageSchool.LSApplication.entity.Appointment.Exam;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "subject")
public class Subject extends BasicEntity {

    @OneToMany (mappedBy = "subject")
    private Set<Appointment> appointments;

    @Column (name="subject_name")
    private String subjectName;

    @Column(name = "current_language")
    private String currentLanguage;

    @Column (name = "language_level")
    private CEFRLevel languageLevel;
}
