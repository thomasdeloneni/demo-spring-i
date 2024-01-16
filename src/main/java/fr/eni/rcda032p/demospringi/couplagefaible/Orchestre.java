package fr.eni.rcda032p.demospringi.couplagefaible;

import fr.eni.rcda032p.demospringi.couplagefort.Pianiste;
import fr.eni.rcda032p.demospringi.couplagefort.Violoniste;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {

    private List<Musicien> musiciens;

    public Orchestre() {
        musiciens = new ArrayList<>();
    }

    public void addMusicien(Musicien object) {
        musiciens.add(object);
    }

    public void jouer() {
        for (Musicien item : musiciens) {
            item.jouerMorceau();
        }
    }
}
