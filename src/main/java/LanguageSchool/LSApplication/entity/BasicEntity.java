package LanguageSchool.LSApplication.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Objects;


@MappedSuperclass
@Getter
@Setter
public abstract class BasicEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Access (AccessType.PROPERTY) // do I really need it?
    private Long id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicEntity that = (BasicEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
