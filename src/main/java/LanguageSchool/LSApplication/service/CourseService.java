package LanguageSchool.LSApplication.service;


import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.Appointment.CourseDto;
import LanguageSchool.LSApplication.dto.PersonDto;

import java.util.List;

public interface CourseService {
    CourseDto createCourse (CourseDto courseDto);
    CourseDto findCourseById (Long id);
    List <PersonDto> getClientsById (Long id);
    List <PersonDto> getEmployeesById (Long id);
    CourseDto updateCourse (Long id, CourseDto courseDto);
    List <AppointmentDto> getAllAppointmentsOfCourse (Long id);
    List <CourseDto> getAll ();
    void deleteCourse (Long id);

}
