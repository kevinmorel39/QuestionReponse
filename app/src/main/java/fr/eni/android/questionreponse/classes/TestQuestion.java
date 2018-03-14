package fr.eni.android.questionreponse.classes;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class TestQuestion {

    //déclaration variables
    private int FK_test_id;
    private int FK_question_id;
    private boolean juste;

    //accesseurs
    //getter
    public int getFK_test_id() {
        return FK_test_id;
    }
    public int getFK_question_id() {
        return FK_question_id;
    }
    public boolean isJuste() {
        return juste;
    }
    //setter
    public void setFK_test_id(int FK_test_id) {
        this.FK_test_id = FK_test_id;
    }
    public void setFK_question_id(int FK_question_id) {
        this.FK_question_id = FK_question_id;
    }
    public void setJuste(boolean juste) {
        this.juste = juste;
    }

    //constructeur
    public TestQuestion(){
    }
    public TestQuestion(int FK_test_id, int FK_question_id, boolean juste) {
        this.FK_test_id = FK_test_id;
        this.FK_question_id = FK_question_id;
        this.juste = juste;
    }
}
