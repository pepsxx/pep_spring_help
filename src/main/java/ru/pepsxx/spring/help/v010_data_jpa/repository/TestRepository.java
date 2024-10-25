package ru.pepsxx.spring.help.v010_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.pepsxx.spring.help.v010_data_jpa.entity.Person;

import java.util.List;

@Repository

public interface TestRepository extends JpaRepository<Person, Long> {

    Person findById(long id);

//    @Query("FROM Person p WHERE p.name = :name OR p.id = 1") // Есть с таким-же именем в entity
    List<Person> findByName(@Param("name") String name);

    @Query("FROM Person p WHERE p.id = 10") // Есть с таким-же именем в entity
    List<Person> findAllBy();

}
