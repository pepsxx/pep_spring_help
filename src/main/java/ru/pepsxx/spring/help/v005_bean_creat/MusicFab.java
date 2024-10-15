package ru.pepsxx.spring.help.v005_bean_creat;

public class MusicFab {

    private String name;

    private MusicFab(){}

    private MusicFab(String name){
        this.name = name;
    }

    private void setName(String name) {
        this.name = name;
    }

    static MusicFab getMusicFabCon() {
        return new MusicFab("FabricConstructorName");
    }

    static MusicFab getMusicFabSet() {
        MusicFab musicFab = new MusicFab();
        musicFab.setName("FabricSetName");
        return musicFab;
    }

    public String getName() {
        return name;
    }

}
