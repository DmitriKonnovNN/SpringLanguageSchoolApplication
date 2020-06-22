package LanguageSchool.LSApplication.entity;

import javax.persistence.Column;

public class ClientRole extends BasicEntity {

    @Column(name = "client_role")
    private String clientRole;
}
