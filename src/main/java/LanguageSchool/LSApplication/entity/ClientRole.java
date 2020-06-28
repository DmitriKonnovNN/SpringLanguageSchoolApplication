package LanguageSchool.LSApplication.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

@Embeddable
public class ClientRole extends BasicEntity {

    @Column (name = "client_role")
    private String clientRole;
}
