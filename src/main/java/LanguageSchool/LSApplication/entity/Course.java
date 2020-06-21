package LanguageSchool.LSApplication.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "course")
public class Course {
    @Id
    //@GeneratedValue (generator = "uuid")
    //@GenericGenerator(name = "uuid",
    //strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

}

