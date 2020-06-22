package LanguageSchool.LSApplication.converter;

import LanguageSchool.LSApplication.enums.LearningGroupType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class LearningGroupTypeConverter implements AttributeConverter <LearningGroupType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(LearningGroupType attribute) {
        return attribute.ordinal();
    }

    @Override
    public LearningGroupType convertToEntityAttribute(Integer dbData) {
        return LearningGroupType.values()[dbData];
    }
}
