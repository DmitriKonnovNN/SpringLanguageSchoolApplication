package LanguageSchool.LSApplication.entity.Person;


import LanguageSchool.LSApplication.entity.Appointment.Appointment;
import LanguageSchool.LSApplication.entity.EmployeePosition;
import LanguageSchool.LSApplication.entity.Group;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

//@DiscriminatorValue(value = "employee")
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends Person {

    @NotBlank(message = "position cannot be empty")
    @JoinColumn(name = "employee_position_id")
    @Embedded
    private EmployeePosition position;

    @Column(name = "salary")
    private Float Salary;

    @OneToMany (mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Appointment> employeeTrainings;

    @OneToMany (mappedBy = "employee", cascade = CascadeType.ALL)
    private List <Appointment> otherEvents;

    @OneToMany (mappedBy = "employee", cascade = CascadeType.ALL)
    private List <Group> groups;
}
