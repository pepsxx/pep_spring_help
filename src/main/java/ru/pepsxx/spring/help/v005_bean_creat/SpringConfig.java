package ru.pepsxx.spring.help.v005_bean_creat;

import org.modelmapper.internal.bytebuddy.build.Plugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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


    @Bean(name = "testName1")
    TestDependencyBean doubleBean1() {
        return new TestDependencyBean("T1");
    }

    @Bean(name = "testName2")
    TestDependencyBean doubleBean2() {
        return new TestDependencyBean("T2");
    }

}
