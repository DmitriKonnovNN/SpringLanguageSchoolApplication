package LanguageSchool.LSApplication.entity;

import LanguageSchool.LSApplication.entity.Appointment.Exam;
import LanguageSchool.LSApplication.entity.Person.Person;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "results_of_exam")
public class ResultsOfExam extends BasicEntity{
    @OneToMany (mappedBy = "results_of_exam", cascade = CascadeType.ALL)
    private List<Exam> currentExam;

    /*@ElementCollection
    @CollectionTable (
            name = "results_map",
    joinColumns = @JoinColumns (name = ))
    @MapKeyColumn (name = "person")*/
   // @Column(name = "marks_by_skills" )
  //  private Map <Person, Map<String, String>> resultsMapPersonToSkillToMark;
}
