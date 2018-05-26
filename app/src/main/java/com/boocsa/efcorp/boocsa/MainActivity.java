package com.boocsa.efcorp.boocsa;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To display Fragment 1 on beginning of app
        setTitle("Fragment Title One");
        Fragment1 fragment1=new Fragment1();
        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.frame,fragment1,"FragmentName");
        fragmentTransaction1.commit();

        //Navigation bar and fragments
        BottomNavigationView bottomNavigationView =(BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.action_search:
                        setTitle("Fragment Title One");
                        Fragment1 fragment1=new Fragment1();
                        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.frame,fragment1,"FragmentName");
                        fragmentTransaction1.commit();
                        break;

                    case R.id.action_add:
                        setTitle("Fragment Title Two");
                        Fragment2 fragment2=new Fragment2();
                        FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.frame,fragment2,"FragmentName");
                        fragmentTransaction2.commit();
                        break;

                    case R.id.action_people:
                        setTitle("Fragment Title Three");
                        Fragment3 fragment3=new Fragment3();
                        FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.frame,fragment3,"FragmentName");
                        fragmentTransaction3.commit();
                        break;
                }
                return true;
            }
        });
    }
}
