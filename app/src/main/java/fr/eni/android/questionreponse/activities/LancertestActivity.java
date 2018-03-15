package fr.eni.android.questionreponse.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fr.eni.android.questionreponse.R;
import fr.eni.android.questionreponse.classes.User;

/**
 * Created by PavlikKi on 15/02/2018.
 */

public class LancertestActivity extends AppCompatActivity{

    private User userConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancertest);

        //on récupère l'utilisateur connecté
        Intent intent = getIntent();
        userConnect = (User) intent.getExtras().getSerializable("user");

    }


}
