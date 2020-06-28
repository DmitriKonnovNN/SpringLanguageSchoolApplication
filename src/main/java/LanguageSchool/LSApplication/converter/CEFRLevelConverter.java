package LanguageSchool.LSApplication.converter;


import LanguageSchool.LSApplication.enums.CEFRLevel;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter (autoApply = true) // применить ко всем аттрибутам
public class CEFRLevelConverter implements AttributeConverter <CEFRLevel, String> {

    @Override
    public String convertToDatabaseColumn(CEFRLevel cefrLevel) {
        return cefrLevel.toString();
    }
    @Override
    public CEFRLevel convertToEntityAttribute(String dbStringData) {
        return CEFRLevel.valueOf(dbStringData);
    }

}
