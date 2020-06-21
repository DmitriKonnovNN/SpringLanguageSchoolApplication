package LanguageSchool.LSApplication.service;

import LanguageSchool.LSApplication.dto.Appointment.AppointmentDto;
import LanguageSchool.LSApplication.dto.ClientDto;
import LanguageSchool.LSApplication.dto.ClientRoleDto;
import LanguageSchool.LSApplication.dto.GroupDto;
import LanguageSchool.LSApplication.dto.PersonDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {

    public ClientDto findClientById (Long id) {return null;};
    public ClientDto createClient(PersonDto personDto) {return null;}
    public ClientDto updateClient(Long id, PersonDto personDto){return null;};
    public List<GroupDto> getGroupsOfClientById (Long id) {return null;};
    public ClientRoleDto getClientRoleById (Long id) {return null;};
    public List <AppointmentDto> getAllAppointmentsOfClientById (Long Id){return null;};
    public String getClientLanguageLevelById(Long Id) { return null; }

    public void deleteClient (Long id){};
}
