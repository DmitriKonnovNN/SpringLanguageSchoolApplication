package LanguageSchool.LSApplication.dto.Appointment;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LessonDto extends AppointmentDto {

    @JsonProperty (value = "durationInUnities")
    private Integer durationInUnities;

}
