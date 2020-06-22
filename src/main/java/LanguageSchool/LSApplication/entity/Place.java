package LanguageSchool.LSApplication.entity;




import javax.persistence.Column;
import java.net.URL;

public class Place extends BasicEntity {
    @Column(name= "address")
    private AddressDto address;

    @Column (name = "url")
    private URL url;

    @Column (name = "comment")
    private String comment;
}
