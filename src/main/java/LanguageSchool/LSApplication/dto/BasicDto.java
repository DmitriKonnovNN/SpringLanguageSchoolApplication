package LanguageSchool.LSApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.File;
import java.io.Serializable;

@Data
public abstract class BasicDto implements Serializable {

    @JsonProperty (value = "id")
    private Long id;

    @JsonProperty (value = "profileImage")
    private File profileImage;

}
