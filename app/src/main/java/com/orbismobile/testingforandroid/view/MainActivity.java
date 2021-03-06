package com.orbismobile.testingforandroid.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.orbismobile.testingforandroid.R;
import com.orbismobile.testingforandroid.view.contact.ContactsActivity;
import com.orbismobile.testingforandroid.view.login.LoginActivity;
import com.orbismobile.testingforandroid.view.food.FoodActivity;
import com.orbismobile.testingforandroid.view.pet.PetSectionsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnEspresso1 = findViewById(R.id.btnEspresso1);
        Button btnEspresso2 = findViewById(R.id.btnEspresso2);
        Button btnEspresso3 = findViewById(R.id.btnEspresso3);

        Button btnIdlingResource = findViewById(R.id.btnIdlingResource);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnEspresso1.setOnClickListener(this);
        btnEspresso2.setOnClickListener(this);
        btnEspresso3.setOnClickListener(this);
        btnIdlingResource.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnEspresso1:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.btnEspresso2:
                startActivity(new Intent(this, ContactsActivity.class));
                break;
            case R.id.btnEspresso3:
                startActivity(new Intent(this, PetSectionsActivity.class));
                break;
            case R.id.btnIdlingResource:
                startActivity(new Intent(this, FoodActivity.class));
                break;
        }
    }
}
