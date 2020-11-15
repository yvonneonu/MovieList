package com.example.mymovielist;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    NavigationView navigate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        navigate = findViewById(R.id.navigation_view);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.nav_open_drawer, R.string.nav_close_drawer);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        //drawer.closeDrawer(GravityCompat.START);
        Fragment fragment = new ActionFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragmentDom, fragment);
        ft.commit();

        navigate.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               int id = item.getItemId();
                //Fragment fragment = null;

                if (id == R.id.nav_action) {
                    Fragment fragment = new ActionFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.fragmentDom, fragment);
                    ft.commit();
                    drawer.closeDrawer(GravityCompat.START);
                }
                else if (id == R.id.nav_drama) {
                    Fragment fragment1= new DramaFragment();
                    FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
                    fr.replace(R.id.fragmentDom, fragment1);
                    fr.commit();
                    drawer.closeDrawer(GravityCompat.START);
                }
                else if (id == R.id.nav_comedy) {
                    Fragment fragment2= new  ComedyFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.fragmentDom, fragment2);
                    ft.commit();
                    drawer.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });
    }



}