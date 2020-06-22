package LanguageSchool.LSApplication.controller;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.Person.ClientDto;
import LanguageSchool.LSApplication.dto.ClientRoleDto;
import LanguageSchool.LSApplication.dto.Person.PersonDto;
import LanguageSchool.LSApplication.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping (value = "/{id}")
    public ClientDto findClientById (@PathVariable ("id") Long id){
        return clientService.findClientById(id);
    }
    @GetMapping (value = "/{id}")
    public List getGroupsOfClientById (@PathVariable("id") Long id){
        return clientService.getGroupsOfClientById(id);
    }

    @GetMapping (value = "/{id}")
    public ClientRoleDto getClientRoleById (@PathVariable("id") Long id){
        return clientService.getClientRoleById(id);
    }

    @GetMapping (value = "/{id}")
    public List <AppointmentDto> getAllAppointmentsOfClientById (@PathVariable("id") Long id)
    {return clientService.getAllAppointmentsOfClientById(id);}

    @GetMapping (value = "/{id}")
    public String getClientLanguageLevelBy (@PathVariable("id") Long id)
    {return clientService.getClientLanguageLevelById(id);}

    @PostMapping // POST is used to create
    @ResponseStatus (HttpStatus.CREATED)
    public ClientDto createClient (@RequestBody PersonDto personDto)
    {
        return clientService.createClient(personDto);
    }

    @PutMapping (value = "/{id}")// PUT is used to create or update
    @ResponseStatus (HttpStatus.OK)
    public ClientDto updateClient (@PathVariable("id") Long id, @Valid @RequestBody PersonDto personDto) {

        return clientService.updateClient(id, personDto);
    }

    @DeleteMapping (value = "/{id}")
    @ResponseStatus (HttpStatus.OK)
    public void deleteClient (@PathVariable("id") Long id) {
        clientService.deleteClient(id);
    }


}
