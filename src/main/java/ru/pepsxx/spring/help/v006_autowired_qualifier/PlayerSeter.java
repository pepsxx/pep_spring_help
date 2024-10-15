package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PlayerSeter {

    private Music music;

    @Autowired
    public void setMusic(@Qualifier("musicRock") Music music) {
        this.music = music;
    }

    void playMusic() {
        System.out.println("Играет Setter " + music.song());
    }

}
