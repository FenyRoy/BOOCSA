package com.boocsa.efcorp.boocsa;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView =(BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.action_add:
                        Toast.makeText(MainActivity.this,"Action ADD",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_search:
                        Toast.makeText(MainActivity.this,"Action Search",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_people:
                        Toast.makeText(MainActivity.this,"Action people",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
