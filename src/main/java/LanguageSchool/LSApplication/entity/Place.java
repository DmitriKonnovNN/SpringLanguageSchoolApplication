package LanguageSchool.LSApplication.entity;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.net.URL;

@Setter
@Getter
@Entity
public class Place extends BasicEntity {
    @Embedded
    @Column(name= "address")
    private Address address;

    @Column (name = "url")
    private URL url;

    @Column (name = "comment")
    private String comment;
}
