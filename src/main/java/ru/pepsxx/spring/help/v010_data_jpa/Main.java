package ru.pepsxx.spring.help.v010_data_jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.pepsxx.spring.help.pre_start.PreStartUtil;
import ru.pepsxx.spring.help.v010_data_jpa.config.SpringConfig;
import ru.pepsxx.spring.help.v010_data_jpa.entity.Person;
import ru.pepsxx.spring.help.v010_data_jpa.repository.TestRepository;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        PreStartUtil.go();
        System.out.println("""
                Для использования data jpa требуются зависимости:
                1: hibernate-core.
                2: spring-data-jpa.
                3: spring-orm.
                4: spring-tx.
                
                Из spring можно только - data-jpa
                    он зависим от - orm и от - tx
                следовательно зависимости подтянутся.
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TestRepository testRepository = context.getBean(TestRepository.class);

        Person person1 = testRepository.findById(1L);
        System.out.println("person1 = " + person1);
        System.out.println("--------------------------------------------------");

        List<Person> personList2 = testRepository.findByName("Billi");
        personList2.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        List<Person> personList3 = testRepository.findAllBy();
        personList3.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        System.out.println("""
                Spring Data
                порядок разрешения запросов
                
                1
                Аннотация @Query в репозитории
                @Query("FROM Person p WHERE p.id = 10")
                List<Person> findAllBy();
                
                2
                Аннотация @NamedQuery в классе-сущности
                Над entity:
                @NamedQuery(
                name = "Person.findAllBy",
                query = "FROM Person p WHERE p.id = 20")
                +
                В репозитории:
                List<Person> findAllBy();
                
                3
                Волшебные методы
                List<Person> findAllBy();""");

        context.close();

    }

}