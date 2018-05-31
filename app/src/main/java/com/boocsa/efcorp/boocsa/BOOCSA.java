package com.boocsa.efcorp.boocsa;

import android.app.Application;
import android.view.View;

import com.google.firebase.database.FirebaseDatabase;

public class BOOCSA extends Application{

    public void onCreate(){
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
