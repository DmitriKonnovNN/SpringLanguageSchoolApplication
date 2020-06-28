package LanguageSchool.LSApplication.dto.Person;

import LanguageSchool.LSApplication.dto.BasicDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public abstract class PersonDto extends BasicDto {

    @NotBlank (message = "first name cannot be empty")
    @JsonProperty(value = "firstName")
    private String firstName;

    @NotBlank (message = "second name cannot be empty")
    @JsonProperty (value = "secondName")
    private String secondName;

    @JsonProperty (value = "lastName")
    private String lastName;

    @JsonProperty (value = "birthday")
    private Date birthday;

    @JsonProperty (value = "sex")
    private String sex;

    @JsonProperty (value = "e_mail")
    private String email;

    @JsonProperty (value = "phoneNumber")
    private String phoneNumber;

    @JsonProperty (value = "login")
    private String login;

    @JsonProperty (value = "password")
    private String password;
}
