package LanguageSchool.LSApplication.entity.Appointment;


import LanguageSchool.LSApplication.entity.BasicEntity;
import LanguageSchool.LSApplication.entity.Group;
import LanguageSchool.LSApplication.entity.Person.Person;
import LanguageSchool.LSApplication.entity.Place;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

//@Embeddable
@Getter
@Setter
@Entity
@Table (name = "appointment")
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Appointment extends BasicEntity {

    @Column (name = "date")
    private Date date;

    @JoinColumn (name = "group_id")
    @ManyToOne
    private Group group;

    @Column (name = "comment")
    private String comment;


    @OneToMany (mappedBy = "appointment", cascade = CascadeType.ALL)
    private List<Person> CurrentEmployees;

    @OneToMany(mappedBy = "appointment",cascade = CascadeType.ALL)
    private List <Person> CurrentStudents;

    @ManyToOne
    @JoinColumn (name  = "place_id")
    private Place place;

    @Column(name  = "equipment")
    private String equipment;
}
