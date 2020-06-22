package LanguageSchool.LSApplication.entity.Appointment;




import javax.persistence.Column;
import java.util.List;

public class Exam extends Appointment {

    @Column(name= "subject_to_examination")
    private SubjectDto subjectToExamination;

    @Column (name = "exam_type")
    private String examType;

    @Column (name = "exam_name")
    private String examName;

    @Column (name = "examiners")
    private List<PersonDto> examiners;

    @Column (name = "examination_supervisors")
    private List <PersonDto> examinationSupervisors;

    @Column(name = "results")
    private ResultsOfExamDto results;
}
