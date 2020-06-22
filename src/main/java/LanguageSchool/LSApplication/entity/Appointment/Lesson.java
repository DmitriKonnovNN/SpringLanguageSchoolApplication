package LanguageSchool.LSApplication.entity.Appointment;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Lesson extends Appointment {

    @Column (name = "duration_in_unities")
    private Integer durationInUnities;
}
