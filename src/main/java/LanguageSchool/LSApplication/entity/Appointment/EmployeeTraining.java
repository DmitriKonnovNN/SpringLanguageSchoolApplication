package LanguageSchool.LSApplication.entity.Appointment;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "employee_training")
public class EmployeeTraining extends Appointment {

    @Column(name = "duration_in_unities")
    private Integer durationInUnities;
}
