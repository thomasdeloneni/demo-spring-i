package fr.eni.rcda032p.demospringi.couplagefort;

public class Violoniste {

    private String morceau;

    private Violon violon;

    public Violoniste(String morceau) {
        this.morceau = morceau;
        violon = new Violon();
    }

    public void jouerMorceau(){
        violon.afficher();
        System.out.printf("Je joue le morceau : %s%n", morceau);
        violon.jouer();
    }
}
