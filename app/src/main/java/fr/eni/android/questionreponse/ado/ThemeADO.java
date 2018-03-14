package fr.eni.android.questionreponse.ado;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by PavlikKi on 12/03/2018.
 */

public class ThemeADO {
    private static final int VERSION = 1;
    private static final String NOM_BDD = "QR.db";

    private static final String TABLE_THEMES = "table_themes";

    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_NAME = "TITRE";
    private static final int NUM_COL_NAME = 1;
    private static final String COL_DESC = "COULEUR";
    private static final int NUM_COL_DESC = 2;

    private SQLiteDatabase bdd;
}
