package com.example.ridhwaan.criminal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Ridhwaan on 11/24/16.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {


    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_fragment_generic);


        FragmentManager fm = getSupportFragmentManager();// first instantiate the frag manag
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);//Check if a fragment
        //with fragment_container view exists.

        if(fragment == null){
            fragment = createFragment();
            fm.beginTransaction()//configures a new FragmentTransaction and returns it
                    .add(R.id.fragment_container, fragment) // add the container and add the fragment itself.
                    .commit();//finally commit it
        }
    }

}
