package LanguageSchool.LSApplication.entity;


import LanguageSchool.LSApplication.converter.LearningGroupTypeConverter;
import LanguageSchool.LSApplication.entity.Appointment.Appointment;
import LanguageSchool.LSApplication.entity.Appointment.Lesson;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table (name = "group")
@Entity
public class Group extends BasicEntity {
    @OneToMany (mappedBy = "group", cascade = CascadeType.ALL)
    private List<Lesson> lessons;

    @OneToMany (mappedBy = "group", cascade = CascadeType.ALL)
    private List <Appointment> exams;

    @OneToMany (mappedBy = "group", cascade = CascadeType.ALL)
    private List <Appointment> otherEvents;

    @OneToMany (mappedBy = "group", cascade = CascadeType.ALL)
    private List <Appointment> employeeTrainings;

    @OneToOne
    @JoinColumn (name = "subject_id")
    private Subject subject;


    @Column (name = "target_language_level")
    @Convert(converter = LearningGroupTypeConverter.class)
    private CEFRLevel targetLanguageLevel;
}
