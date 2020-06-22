package LanguageSchool.LSApplication.dto.Person;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.EmployeePositionDto;
import LanguageSchool.LSApplication.dto.GroupDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class EmployeeDto extends PersonDto {

    @NotBlank (message = "position cannot be empty")
    @JsonProperty (value = "position")
    private EmployeePositionDto position;

    @JsonProperty(value = "salary")
    private Float Salary;

    @JsonProperty(value = "employeeTrainings")
    private List <AppointmentDto> employeeTrainings;

    @JsonProperty(value = "otherEvents")
    private List <AppointmentDto> otherEvents;

    @JsonProperty(value = "groups")
    private List <GroupDto> groups;


}
