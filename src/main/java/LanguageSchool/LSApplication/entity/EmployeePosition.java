package LanguageSchool.LSApplication.entity;


import javax.persistence.Column;

public class EmployeePosition extends BasicEntity{

    @Column(name= "position")
    private String position;

    @Column(name = "responsibilities")
    private String responsibilities;
}
