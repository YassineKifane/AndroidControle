package com.example.controleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView nav;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.myDrawer);
        nav = findViewById(R.id.myNav);
        toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();





        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myFrameLayout,new HomeFragment()).commit();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.calc:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myFrameLayout,new Calculerfragment()).commit();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.blg:
                        getSupportFragmentManager().beginTransaction().replace(R.id.myFrameLayout,new Blogfragment()).commit();
                        drawer.closeDrawer(GravityCompat.START);
                        break;

                }
                return true;
            }
        });

    }
}