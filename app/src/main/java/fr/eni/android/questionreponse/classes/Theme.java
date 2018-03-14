package fr.eni.android.questionreponse.classes;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class Theme{
    private String titre, couleur;

    public Theme(String titre, String couleur) {
        this.titre = titre;
        this.couleur = couleur;
    }

    public Theme() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
