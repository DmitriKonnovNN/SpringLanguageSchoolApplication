package LanguageSchool.LSApplication.converter;


import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter (autoApply = true)
public class CEFRLevelConverter implements AttributeConverter <CEFRLevelConverter, Integer> {

    @Override
    public Integer convertToDatabaseColumn(CEFRLevelConverter attribute) {
        return attribute.ordinal();
    }

    @Override
    public CEFRLevelConverter convertToEntityAttribute(Integer dbData) {
        return CEFRLevelConverter.val
    }


}
