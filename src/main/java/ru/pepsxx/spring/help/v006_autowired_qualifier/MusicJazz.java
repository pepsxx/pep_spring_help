package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicJazz implements Music {

    @Value("${yml.name}")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String song() {
        return "MusicJazz";
    }
}
