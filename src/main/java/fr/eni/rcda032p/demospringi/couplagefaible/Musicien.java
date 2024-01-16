package fr.eni.rcda032p.demospringi.couplagefaible;

public class Musicien {

    private String morceau;
    private Instrument instrument;

    public Musicien(String morceau, Instrument instrument) {
        this.morceau = morceau;
        this.instrument = instrument;
    }

    public void jouerMorceau(){
        instrument.afficher();
        System.out.printf("Je joue le morceau : %s%n", morceau);
        instrument.jouer();
    }
}
