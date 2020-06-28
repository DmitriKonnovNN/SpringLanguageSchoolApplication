package LanguageSchool.LSApplication.entity.Appointment;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table (name ="lesson")
public class Lesson extends Appointment {


    @Column (name = "duration_in_unities")
    private Integer durationInUnities;
}
