package LanguageSchool.LSApplication.entity.Person;

import LanguageSchool.LSApplication.entity.Address;
import LanguageSchool.LSApplication.entity.Appointment.Exam;
import LanguageSchool.LSApplication.entity.Appointment.Lesson;
import LanguageSchool.LSApplication.entity.Appointment.OtherEvent;
import LanguageSchool.LSApplication.entity.ClientRole;
import LanguageSchool.LSApplication.entity.Group;
import LanguageSchool.LSApplication.enums.CEFRLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "client")
//@DiscriminatorValue (value = "client")
//@PrimaryKeyJoinColumn (name = "id")
public class Client extends Person {

    @ManyToOne
    @JoinColumn(name= "group_id")
    private Group groups;

    @ManyToOne
    @JoinColumn (name = "exam_id")
    private Exam exams;

    @OneToMany (mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List <Lesson> lessons;

    @OneToMany (mappedBy = "client", cascade = CascadeType.ALL)
    private List <OtherEvent> otherEvents;


    @NotBlank(message = "client role cannot be empty")
    @Embedded
    @JoinColumn (name = "client_role_id")
    private ClientRole ClientRole;

    @Column (name = "currentLanguageLevel")
    private CEFRLevel currentLanguageLevel;

    @Embedded
    @JoinColumn (name = "address_id")
    private Address address;


}
