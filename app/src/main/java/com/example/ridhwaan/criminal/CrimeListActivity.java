package com.example.ridhwaan.criminal;

import android.support.v4.app.Fragment;

/**
 * Created by Ridhwaan on 11/24/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
