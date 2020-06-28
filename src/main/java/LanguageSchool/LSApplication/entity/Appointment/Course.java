package LanguageSchool.LSApplication.entity.Appointment;


import LanguageSchool.LSApplication.converter.LearningGroupTypeConverter;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import LanguageSchool.LSApplication.enums.LearningGroupType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "course")
public class Course extends Appointment {

    //@GeneratedValue (generator = "uuid")
    //@GenericGenerator(name = "uuid",
    //strategy = "org.hibernate.id.UUIDGenerator")


    //@Enumerated(EnumType.STRING)// тогда можно без конвертера
    @Convert (converter = LearningGroupTypeConverter.class)
    private LearningGroupType groupType;

    @Column(name = "duration_in_unities")
    private Integer durationInUnities;

    @Column (name  = "teaching_material")
    private String teachingMaterial;

    @Column (name  = "target_language_level")
    private CEFRLevel targetLanguageLevel;


    @OneToMany (mappedBy = "course", cascade = CascadeType.ALL)
    private List<Appointment> lessonsAndTrainings;


    @OneToMany (mappedBy = "course",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exam> exams;

}

