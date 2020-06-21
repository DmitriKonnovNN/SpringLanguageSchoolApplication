package LanguageSchool.LSApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public abstract class PersonDto extends BasicDto {

    @NotBlank (message = "first name cannot be empty")
    @JsonProperty(value = "first_name")
    private String firstName;

    @NotBlank (message = "second name cannot be empty")
    @JsonProperty (value = "second_name")
    private String secondName;

    @JsonProperty (value = "last_name")
    private String lastName;

    @JsonProperty (value = "birthday")
    private Date birthday;

    @JsonProperty (value = "sex")
    private String sex;

    @JsonProperty (value = "e_mail")
    private String email;

    @JsonProperty (value = "phone_number")
    private String phoneNumber;

    @JsonProperty (value = "login")
    private String login;

    @JsonProperty (value = "password")
    private String password;
}
