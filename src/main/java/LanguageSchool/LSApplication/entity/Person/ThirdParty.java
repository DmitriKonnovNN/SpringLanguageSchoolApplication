package LanguageSchool.LSApplication.entity.Person;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "third_party")
public class ThirdParty extends Person {
    @Column(name= "company")
    private String company;

    @Column(name= "position")
    private String position;

    @Column (name = "responsibilities")
    private String responsibilities;
}
