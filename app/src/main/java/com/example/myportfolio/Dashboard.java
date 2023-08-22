package com.example.myportfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Dashboard extends AppCompatActivity {
    BottomNavigationView bnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bnView=findViewById(R.id.bnView);

        bnView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.nav_home) {
                    loadFragment(new homeFragment(), false);
                }
                else if(id==R.id.nav_cv) {
                    loadFragment(new cvFragment(),false);
                }
                else if(id==R.id.nav_profiles) {
                    loadFragment(new profileFragment(),false);
                }
                else if(id==R.id.nav_projects) {
                    loadFragment(new portfolioFragment(), false);
                }
                return true;
            }
        });
        bnView.setSelectedItemId(R.id.nav_home);
    }
    public void loadFragment(Fragment fragment, boolean flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag) ft.add(R.id.container, fragment);
        else ft.replace(R.id.container, fragment);
        ft.commit();
    }
}