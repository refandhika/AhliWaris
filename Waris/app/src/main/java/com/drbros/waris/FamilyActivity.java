package com.drbros.waris;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Refa on 3/18/2015.
 */
public class FamilyActivity extends ActionBarActivity{

    Button nextbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_activity);

        String value = new String();

        Bundle nom_bundle = getIntent().getExtras();
        if(nom_bundle != null){
            value = String.valueOf(nom_bundle.getInt("NOMINAL"));
        }

        TextView nominal;
        nominal = (TextView) findViewById(R.id.nom_view);
        nominal.setText(value);
    }

}
