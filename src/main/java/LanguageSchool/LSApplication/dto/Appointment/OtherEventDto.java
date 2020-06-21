package LanguageSchool.LSApplication.dto.Appointment;

import LanguageSchool.LSApplication.dto.PersonDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true) // почему только здесь возникает предупреждение?!?
public class OtherEventDto extends AppointmentDto {

    @JsonProperty (value = "invitedPersons")
    private List <PersonDto> InvitedPersons;

}
