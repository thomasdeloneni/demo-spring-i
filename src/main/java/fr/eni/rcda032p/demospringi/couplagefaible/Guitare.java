package fr.eni.rcda032p.demospringi.couplagefaible;

public class Guitare implements Instrument {
    @Override
    public void afficher() {
        System.out.println("Je suis une guitare");
    }

    @Override
    public void jouer() {
        System.out.println("Zing Zing Zing");
    }

}
