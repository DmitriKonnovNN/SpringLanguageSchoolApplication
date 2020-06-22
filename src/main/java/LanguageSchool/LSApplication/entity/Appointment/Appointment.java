package LanguageSchool.LSApplication.entity.Appointment;

import LanguageSchool.LSApplication.entity.BasicEntity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Embeddable
@Table (name = "appointment")
public abstract class Appointment extends BasicEntity {

    @Column (name = "date")
    private Date date;

    @Column (name = "group")
    private GroupDto group;

    @Column (name = "comment")
    private String comment;

    @Column (name  = "employees")
    private List<PersonDto> CurrentEmployees;

    @Column (name  = "current_students")
    private List <PersonDto> CurrentStudents;

    @Column (name  = "place")
    private PlaceDto place;

    @Column(name  = "equipment")
    private String equipment;
}
