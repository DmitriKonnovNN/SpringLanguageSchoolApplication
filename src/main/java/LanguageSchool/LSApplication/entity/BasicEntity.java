package LanguageSchool.LSApplication.entity;


import javax.persistence.*;


@MappedSuperclass
public abstract class BasicEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Access (AccessType.PROPERTY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
