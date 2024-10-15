package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PlayerConst {

    private Music music;

    @Autowired
    public PlayerConst(@Qualifier("musicKpop") Music music) {
        this.music = music;
    }

    void playMusic() {
        System.out.println("Играет Constructor " + music.song());
    }
}
