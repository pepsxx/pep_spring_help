package ru.pepsxx.spring.help.v005_bean_creat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Music {

    @Value("${yml.name}")
    private String name;

    public String getName() {
        return name;
    }

}
