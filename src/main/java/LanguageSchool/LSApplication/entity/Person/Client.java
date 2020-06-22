package LanguageSchool.LSApplication.entity.Person;

import LanguageSchool.LSApplication.entity.Address;

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
