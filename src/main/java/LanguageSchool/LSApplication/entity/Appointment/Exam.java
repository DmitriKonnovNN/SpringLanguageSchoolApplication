package LanguageSchool.LSApplication.entity.Appointment;




import LanguageSchool.LSApplication.entity.Person.Client;
import LanguageSchool.LSApplication.entity.Person.Person;
import LanguageSchool.LSApplication.entity.ResultsOfExam;
import LanguageSchool.LSApplication.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam extends Appointment {

    @ManyToOne
    @JoinColumn(name= "subject_id")
    private Subject subjectToExamination;

    @Column (name = "exam_type")
    private String examType;

    @Column (name = "exam_name")
    private String examName;


    @OneToMany (mappedBy = "exam", cascade = CascadeType.ALL)
    private List<Client> examiners;

    @OneToMany (mappedBy = "exam", cascade = CascadeType.ALL)
    private List <Client> examinationSupervisors;

    /*@Column(name = "results")
    @OneToMany
    private ResultsOfExam results;*/
}
