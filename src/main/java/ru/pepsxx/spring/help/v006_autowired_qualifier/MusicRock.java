package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicRock implements Music {

    @Override
    public String song() {
        return "MusicRock";
    }

}
