package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PlayerField {

    @Autowired
    @Qualifier("musicJazz")
    private Music music;

    public void playMusic() {
        System.out.println("Играет Field " + music.song());
    }

}
