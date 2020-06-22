package LanguageSchool.LSApplication.entity.Appointment;

import LanguageSchool.LSApplication.entity.Appointment.Appointment;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EmployeeTraining extends Appointment {

    @Column(name = "duration_in_unities")
    private Integer durationInUnities;
}
