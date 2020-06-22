package LanguageSchool.LSApplication.entity.Appointment;


import LanguageSchool.LSApplication.converter.LearningGroupTypeConverter;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import LanguageSchool.LSApplication.enums.LearningGroupType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "course")
public class Course extends Appointment {

    //@GeneratedValue (generator = "uuid")
    //@GenericGenerator(name = "uuid",
    //strategy = "org.hibernate.id.UUIDGenerator")


    @Convert (converter = LearningGroupTypeConverter.class)
    private LearningGroupType groupType;

    @Column(name = "duration_in_unities")
    private Integer durationInUnities;

    @Column (name  = "teaching_material")
    private String teachingMaterial;

    @Column (name  = "target_language_level")
    private CEFRLevel targetLanguageLevel;

    @Column (name  = "lessons_and_trainings")
    private List<AppointmentDto> lessonsAndTrainings;

    @Column (name  = "exams")
    private List<ExamDto> exams;

}

