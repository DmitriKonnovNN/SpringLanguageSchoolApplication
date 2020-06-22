package LanguageSchool.LSApplication.entity;


import javax.persistence.Column;
import java.util.Map;

public class ResultsOfExam extends BasicEntity{
    @Column(name = "current_exam")
    private ExamDto currentExam;

    @Column(name = "results_map")
    private Map <PersonDto, Map<String, String>> resultsMap;
}
