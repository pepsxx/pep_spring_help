package ru.pepsxx.spring.help.v005_bean_creat;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myProperties.yml")
@ComponentScan("ru.pepsxx.spring.help.v005_bean_creat")
public class SpringConfig {

    @Bean
    MusicCon musicCon() {
        return new MusicCon("ConstructorName");
    }

    @Bean
    MusicSet musicSet() {
        MusicSet musicSet = new MusicSet();
        musicSet.setName("SetName");
        return musicSet;
    }

    @Bean
    MusicFab muFabCon() {
        return MusicFab.getMusicFabCon();
    }

    @Bean
    MusicFab muFabSet() {
        return MusicFab.getMusicFabSet();
    }

}
