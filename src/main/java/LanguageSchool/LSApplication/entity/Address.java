package LanguageSchool.LSApplication.entity;



import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Address {

    @Column(name = "postcode")
    private String postcode;

    @Column (name = "country")
    private String country;

    @Column (name = "city")
    private String city;

    @Column (name = "street")
    private String street;

    @Column (name = "building")
    private String building;

    @Column (name = "room")
    private String room;
}
