package fr.eni.rcda032p.demospringi.couplagefort;

public class Pianiste {

    private String morceau;
    private Piano piano;

    public Pianiste(String morceau) {
        this.morceau = morceau;
        piano = new Piano();
    }

    public void jouerMorceau(){
        piano.afficher();
        System.out.printf("Je joue le morceau : %s%n", morceau);
        piano.jouer();
    }
}
