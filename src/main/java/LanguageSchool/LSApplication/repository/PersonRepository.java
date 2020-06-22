package LanguageSchool.LSApplication.repository;

import LanguageSchool.LSApplication.entity.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
