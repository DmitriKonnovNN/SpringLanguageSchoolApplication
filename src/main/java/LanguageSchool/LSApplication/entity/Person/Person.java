package LanguageSchool.LSApplication.entity.Person;


import LanguageSchool.LSApplication.entity.BasicEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table (name = "person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "person_type")
@DiscriminatorValue (value = "person")
public abstract class Person extends BasicEntity {

    @Column (name = "first_name")
    private String firstName;

    @NotBlank(message = "second name cannot be empty")
    @Column (name = "second_name")
    private String secondName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "date")
    private Date birthday;

    @Column (name = "sex")
    private String sex;

    @Column (name = "email")
    private String email;
    @Column (name = "phone number")
    private String phoneNumber;

    @Column (name = "login")
    private String login;

    @Column (name = "password")
    private String password;
}
