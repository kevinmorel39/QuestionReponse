package fr.eni.android.questionreponse.classes;

import java.util.Date;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class Test {

    //déclaration variables
    private int id;
    private  String libelle;
    private Date date_creation;
    private int niveau;
    private  int nb_question;

    //accesseurs
    //getter
    public int getId() {
        return id;
    }
    public String getLibelle() {
        return libelle;
    }
    public Date getDate_creation() {
        return date_creation;
    }
    public int getNiveau() {
        return niveau;
    }
    public int getNb_question() {
        return nb_question;
    }
    //setter
    public void setId(int id) {
        this.id = id;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    public void setNb_question(int nb_question) {
        this.nb_question = nb_question;
    }

    //constructeur
    public Test(){
    }
    public Test(int id, String libelle, Date date_creation, int niveau, int nb_question) {
        this.id = id;
        this.libelle = libelle;
        this.date_creation = date_creation;
        this.niveau = niveau;
        this.nb_question = nb_question;
    }
}
