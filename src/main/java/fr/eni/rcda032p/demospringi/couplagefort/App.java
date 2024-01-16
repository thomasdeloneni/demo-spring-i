package fr.eni.rcda032p.demospringi.couplagefort;

public class App {

    public static void main(String[] args) {
        Pianiste pianiste = new Pianiste("La 9e de Beethoven");
        pianiste.jouerMorceau();

        Violoniste violoniste = new Violoniste("La 9e de Beethoven");
        violoniste.jouerMorceau();

        Orchestre orchestre = new Orchestre();
        orchestre.addMusicien(pianiste);
        orchestre.addMusicien(violoniste);

        orchestre.jouer();
    }
}
