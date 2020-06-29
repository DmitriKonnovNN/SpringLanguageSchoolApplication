package LanguageSchool.LSApplication.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@MappedSuperclass
@Getter
public abstract class BasicEntity {

    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator(name = "uuid",
    strategy = "org.hibernate.id.UUIDGenerator")

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
