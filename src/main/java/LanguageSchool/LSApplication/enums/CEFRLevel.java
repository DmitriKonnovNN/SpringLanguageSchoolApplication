package LanguageSchool.LSApplication.enums;


import java.util.Arrays;
import java.util.List;

public enum CEFRLevel {

    A0(Arrays.asList("A0", "Starter")),
    A1(Arrays.asList("A1", "Beginner")),
    A2(Arrays.asList("A2", "Elementary")),
    B1(Arrays.asList("B1", "Pre-Intermediate")),
    B1plus (Arrays.asList("B1+", "Intermediate")),
    B2 (Arrays.asList("B2", "Upper Intermediate")),
    C1 (Arrays.asList("C1", "Advanced")),
    C2 (Arrays.asList("C2", "Proficiency", "Mastery"));

    private List <String> name;

    CEFRLevel(List name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
