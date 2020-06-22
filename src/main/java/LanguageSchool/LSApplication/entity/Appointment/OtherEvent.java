package LanguageSchool.LSApplication.entity.Appointment;




import javax.persistence.Column;
import java.util.List;

public class OtherEvent extends Appointment {

    @Column(name = "invited_persons")
    private List<PersonDto> InvitedPersons;
}
