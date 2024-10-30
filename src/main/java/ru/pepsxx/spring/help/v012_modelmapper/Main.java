package ru.pepsxx.spring.help.v012_modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("""
                Для использования modelmapper требуются зависимость:
                1: modelmapper.
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        ModelMapper modelMapper = context.getBean("modelMapper", ModelMapper.class);

        Person person = new Person("TestPerson", 41);

        PersonDto personDto = modelMapper.map(person, PersonDto.class);

        System.out.println("personDto = " + personDto);

    }
}
