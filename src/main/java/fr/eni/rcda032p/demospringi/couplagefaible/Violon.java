package fr.eni.rcda032p.demospringi.couplagefaible;

public class Violon implements Instrument {
    @Override
    public void afficher() {
        System.out.println("Je suis un violon");
    }

    @Override
    public void jouer() {
        System.out.println("LA LA LA");
    }
}
