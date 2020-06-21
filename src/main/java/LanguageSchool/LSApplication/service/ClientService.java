package LanguageSchool.LSApplication.service;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.ClientDto;
import LanguageSchool.LSApplication.dto.ClientRoleDto;
import LanguageSchool.LSApplication.dto.GroupDto;
import LanguageSchool.LSApplication.dto.PersonDto;

import java.util.List;

public interface ClientService {

    ClientDto findClientById (Long id);
    ClientDto createClient(PersonDto personDto);
    ClientDto updateClient(Long id, PersonDto personDto);
    List <GroupDto> getGroupsOfClientById (Long id);
    ClientRoleDto getClientRoleById (Long id);
    List <AppointmentDto> getAllAppointmentsOfClientById (Long Id);
    String getClientLanguageLevelById (Long Id);
    void deleteClient (Long id);
    // List <ClientDto> getAll(); // is it any use of it in Client's Service?

}
