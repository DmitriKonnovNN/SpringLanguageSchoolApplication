package LanguageSchool.LSApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ClientRoleDto extends BasicDto{

    @NotBlank (message = "client role cannot be empty")
    @JsonProperty
    private String clientRole;

}
