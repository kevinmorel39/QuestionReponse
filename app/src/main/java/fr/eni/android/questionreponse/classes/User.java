package fr.eni.android.questionreponse.classes;

import java.util.Date;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class User{
    private String login, pwd;
    private Date date_creation;

    public User(String login, String pwd, Date date_creation) {
        this.login = login;
        this.pwd = pwd;
        this.date_creation = date_creation;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
}
