package LanguageSchool.LSApplication.entity;

import LanguageSchool.LSApplication.dto.GroupDto;
import LanguageSchool.LSApplication.dto.PersonDto;
import LanguageSchool.LSApplication.dto.PlaceDto;


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

    @Column  (name  = "currentStudents")
    private List <PersonDto> CurrentStudents;

    @Column  (name  = "place")
    private PlaceDto place;

    @Column(name  = "equipment")
    private String equipment;
}
