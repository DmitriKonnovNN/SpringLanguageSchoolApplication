package LanguageSchool.LSApplication.service;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.Appointment.CourseDto;
import LanguageSchool.LSApplication.dto.Person.PersonDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseServiceImpl implements CourseService {
    @Override
    public CourseDto createCourse(CourseDto courseDto) { return null; }

    @Override
    public CourseDto findCourseById(Long id) {return null; }

    @Override
    public List<PersonDto> getClientsById(Long id) {return null; }

    @Override
    public List<PersonDto> getEmployeesById(Long id) {return null; }

    @Override
    public CourseDto updateCourse(Long id, CourseDto courseDto) {return null; }

    @Override
    public List<AppointmentDto> getAllAppointmentsOfCourse(Long id) {
        return null;
    }

    @Override
    public List<CourseDto> getAll() {
        return null;
    }

    @Override
    public void deleteCourse(Long id) { }
}
