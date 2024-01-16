package fr.eni.rcda032p.demospringi.couplagefort;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {

    private List<Object> musiciens;

    public Orchestre() {
        musiciens = new ArrayList<>();
    }

    public void addMusicien(Object object) {
        musiciens.add(object);
    }

    public void jouer() {
        for (Object item : musiciens) {
            if (item instanceof Pianiste) {
                ((Pianiste) item).jouerMorceau();
            } else if (item instanceof Violoniste) {
                ((Violoniste) item).jouerMorceau();
            }
        }
    }
}
