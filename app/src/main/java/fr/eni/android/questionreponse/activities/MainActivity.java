package fr.eni.android.questionreponse.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

import fr.eni.android.questionreponse.R;
import fr.eni.android.questionreponse.classes.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------création -en dur- d'utilisateurs----------
        //date de creation utilisateur kevin
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2018,01,01);
        //date de creation utilisateur mickael
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2018,02,01);
        //date de creation utilisateur killian
        Calendar cal3 = Calendar.getInstance();
        cal3.set(2018,03,01);

        User kevin = new User("kevin","test",cal1);
        User mickael = new User("mickael","test",cal2);
        User killian = new User("killian","test",cal3);

        //création liste d'utilisateurs
        final ArrayList<User> listeUtilisateur = new ArrayList<>();
        listeUtilisateur.add(kevin);
        listeUtilisateur.add(mickael);
        listeUtilisateur.add(killian);
        //--------------fin création utilisateur--------------

        //déclaration des champs de saisie de la vue
        final Button connexion = (Button)findViewById(R.id.connexion);
        final EditText saisieLogin = (EditText)findViewById(R.id.login);
        final EditText saisiePwd = (EditText)findViewById(R.id.pwd);

        //actions sur le bouton connexion
        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            //on vérifie que l'utilisateur existe et que le couple login/mdp est bon
            public void onClick(View view) {
                if (saisieLogin.getText().toString().trim().equals("") || saisiePwd.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Veuillez vous connecter", Toast.LENGTH_SHORT).show();
                }else {
                    for (User u : listeUtilisateur){

                        String email = u.getLogin();
                        String mdp = u.getPwd();

                        if (email.equals(saisieLogin.getText().toString()) && mdp.equals(saisiePwd.getText().toString())){
                            Toast.makeText(MainActivity.this, "Connecté", Toast.LENGTH_SHORT).show();
                            //redirige l'utilisateur sur la page de lancement d'un test
                            //Intent intent = new Intent(getApplicationContext(),CompteActivity.class);
                            //intent.putExtra("user", u);
                            //startActivity(intent);
                            //break;
                        }else {
                            Toast.makeText(MainActivity.this, "Login ou mot de passe incorrects", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });


    }
}
