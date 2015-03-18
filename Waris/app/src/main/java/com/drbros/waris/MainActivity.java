package com.drbros.waris;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button nextbtn1;
    RadioGroup jekel_group;
    RadioButton jekel_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbtn1 = (Button) findViewById(R.id.button_next);


        jekel_group = (RadioGroup) findViewById(R.id.jekel_radio);

        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nominal;
                nominal = (EditText) findViewById(R.id.nominal);
                int nom = Integer.parseInt(nominal.getText().toString());
                //Intent intent_family = new Intent(MainActivity.this , FamilyActivity.class);
                //intent_family.putExtra("NOMINAL", nom);
                //startActivity(intent_family);

                int selectedId = jekel_group.getCheckedRadioButtonId();
                jekel_button = (RadioButton) findViewById(selectedId);

                Toast.makeText(MainActivity.this, jekel_button.getText(), Toast.LENGTH_SHORT).show();
            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
