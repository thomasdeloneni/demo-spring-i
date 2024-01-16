package fr.eni.rcda032p.demospringi.couplagefaible;

import fr.eni.rcda032p.demospringi.couplagefort.Orchestre;

public class App2 {

    public static void main(String[] args) {
        Musicien pianiste = new Musicien("La 9e de Beethoven", new Piano());
        pianiste.jouerMorceau();

        Musicien violoniste = new Musicien("La 9e de Beethoven", new Violon());
        violoniste.jouerMorceau();

        Musicien guitariste = new Musicien("La 9e de Beethoven", new Guitare());
        guitariste.jouerMorceau();

        Orchestre orchestre = new Orchestre();
        orchestre.addMusicien(pianiste);
        orchestre.addMusicien(violoniste);
        orchestre.addMusicien(guitariste);

        orchestre.jouer();
    }
}
