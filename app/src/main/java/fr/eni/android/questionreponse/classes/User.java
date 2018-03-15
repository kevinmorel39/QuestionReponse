package fr.eni.android.questionreponse.classes;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class User{

    //déclaration variables
    private String login, pwd;
    private Calendar date_creation;

    //accesseurs
    //getter
    public String getLogin() {
        return login;
    }
    public String getPwd() {
        return pwd;
    }
    public Calendar getDate_creation() {
        return date_creation;
    }
    //setter
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void setDate_creation(Calendar date_creation) {
        this.date_creation = date_creation;
    }

    //contructeur
    public User(){
    }
    public User(String login, String pwd, Calendar date_creation) {
        this.login = login;
        this.pwd = pwd;
        this.date_creation = date_creation;
    }
}
