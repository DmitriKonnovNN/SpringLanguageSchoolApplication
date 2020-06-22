package LanguageSchool.LSApplication.controller;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.Appointment.CourseDto;
import LanguageSchool.LSApplication.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping(value = "/{id}")
    public CourseDto findCourseById (@PathVariable("id") Long id){
        return courseService.findCourseById(id);
    }
    @GetMapping (value = "/{id}")
    public List getClientsOfGroup (@PathVariable("id") Long id){
        return courseService.getClientsById(id);
    }

    @GetMapping (value = "/{id}")
    public List getEmployeesOfGroup (@PathVariable("id") Long id){
        return courseService.getEmployeesById(id);
    }


    @GetMapping (value = "/{id}")
    public List <AppointmentDto> getAllAppointmentsOfCourseById (@PathVariable("id") Long id, @RequestHeader HttpHeaders httpHeaders)
    {return courseService.getAllAppointmentsOfCourse(id);}

    @GetMapping
    public List <CourseDto> getAllCourses ()
    {return courseService.getAll();}

    @GetMapping ("/map")
    public Map<Long, CourseDto> getMap () {
        return courseService.getAll().stream().collect(Collectors.toMap(CourseDto::getId, Function.identity() ));
    }

    @PostMapping // POST is used to create
    @ResponseStatus (HttpStatus.CREATED)
    public CourseDto createCourse (@RequestBody CourseDto courseDto)
    {
        return courseService.createCourse(courseDto);
    }

    @PutMapping (value = "/{id}") // PUT is used to create or update
    @ResponseStatus (HttpStatus.OK)
    public CourseDto updateCourse (@PathVariable ("id") Long id , @Valid @RequestBody CourseDto courseDto) {
        return courseService.updateCourse(id, courseDto);
    }

    @DeleteMapping (value = "/{id}")
    @ResponseStatus (HttpStatus.OK)
    public void deleteCourse (@PathVariable("id") Long id) { courseService.deleteCourse(id);
    }
}
