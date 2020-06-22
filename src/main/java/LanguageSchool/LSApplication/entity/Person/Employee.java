package LanguageSchool.LSApplication.entity.Person;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "employee")
public class Employee extends Person {
}
