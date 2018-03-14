package fr.eni.android.questionreponse.classes;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class Question {

    //déclaration variables
    private int id;
    private String question_libelle;
    private String reponse_libelle;
    private int difficulte;

    //accesseurs
    //getter
    public int getId() {
        return id;
    }
    public String getQuestion_libelle() {
        return question_libelle;
    }
    public String getReponse_libelle() {
        return reponse_libelle;
    }
    public int getDifficulte() {
        return difficulte;
    }
    //setter
    public void setId(int id) {
        this.id = id;
    }
    public void setQuestion_libelle(String question_libelle) {
        this.question_libelle = question_libelle;
    }
    public void setReponse_libelle(String reponse_libelle) {
        this.reponse_libelle = reponse_libelle;
    }
    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }
    //constructeur
    public Question(){
    }
    public Question(int id, String question_libelle, String reponse_libelle, int difficulte) {
        this.id = id;
        this.question_libelle = question_libelle;
        this.reponse_libelle = reponse_libelle;
        this.difficulte = difficulte;
    }

}
