package LanguageSchool.LSApplication.entity.Person;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ThirdParty extends Person {
    @Column(name= "company")
    private String company;

    @Column(name= "position")
    private String position;

    @Column (name = "responsibilities")
    private String responsibilities;
}
