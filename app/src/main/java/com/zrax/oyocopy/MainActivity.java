package com.zrax.oyocopy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView navBar = findViewById(R.id.navBar);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.NavigationView);


        View HeaderView = navigationView.getHeaderView(0);

        ConstraintLayout constraintLayout = HeaderView.findViewById(R.id.drawer);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "drawer", Toast.LENGTH_SHORT).show();
                drawerLayout.close();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//item.setContentDescription("this is a button");
                if(item.getItemId()==R.id.Oyo_Wizard_Bl425ue){

                    Toast.makeText(MainActivity.this, "Oyo_Wizard_Bl425ue", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.Oyo_Wizard_Blue345){
                    Toast.makeText(MainActivity.this, "Oyo_Wizard_Blue345", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        navBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.open();
            }
        });
        Toast.makeText(this, "test test .. 365365365356356365365365365365365356356365356365", Toast.LENGTH_SHORT).show();
    }
}