package ru.pepsxx.spring.help.v002_property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    @Value("${name}")
    String namePro;

    @Value("${yml.name}")
    String nameYml;

    public String getNamePro() {
        return namePro;
    }

    public String getNameYml() {
        return nameYml;
    }

}
