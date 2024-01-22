package fr.eni.rcda032p.demospringi.bo;

import java.util.ArrayList;
import java.util.List;

public class Formateur {

    private String nom;

    private String prenom;
    private String email;

    private List<Cours> listeCours;

    {
        listeCours = new ArrayList<>();
    }

    public Formateur() {
    }

    public Formateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cours> getListeCours() {
        return listeCours;
    }

    public void setListeCours(List<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formateur{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
