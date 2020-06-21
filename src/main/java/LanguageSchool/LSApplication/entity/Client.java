package LanguageSchool.LSApplication.entity;

import javax.persistence.*;


@Entity
@Table(name = "client")
@DiscriminatorValue (value = "client")
//@PrimaryKeyJoinColumn (name = "id")
public class Client extends Person {
    public Client (){};

    @Embedded
    private Address address;


}
