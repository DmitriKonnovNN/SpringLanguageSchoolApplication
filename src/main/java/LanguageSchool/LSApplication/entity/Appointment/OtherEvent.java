package LanguageSchool.LSApplication.entity.Appointment;




import LanguageSchool.LSApplication.entity.Person.Person;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "other_event")
public class OtherEvent extends Appointment {


    //@CollectionTable(name = "invited_persons", joinColumns = @JoinColumn (name = "user_id"))
    @OneToMany (mappedBy = "other_event", cascade = CascadeType.ALL)
    private List<Person> InvitedPersons;
}
