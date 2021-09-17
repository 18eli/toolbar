package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= findViewById(R.id.mitoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflador= getMenuInflater();
        inflador.inflate(R.menu.mimenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id;
        id = item.getItemId();
        if (id == R.id.item3 )
        {
            Toast.makeText(this,"Opcion 3", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item4){
            Toast.makeText(this,"Opcion 4", Toast.LENGTH_SHORT).show();
        } else if (id ==R.id.item1){
            Intent search = new Intent(this,search.class);
            startActivity(search);
        } else if (id == R.id.item2){
            Intent folder = new Intent(this,folder.class);
            startActivity(folder);
        }


        return super.onOptionsItemSelected(item);
    }
}