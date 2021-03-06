package com.example.ridhwaan.criminal;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Ridhwaan on 11/24/16.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;


    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return  sCrimeLab;

    }
    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            Crime crime = new Crime();
            crime.setmTitle("Crime#" + i);
            crime.setmSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }


    public Crime getCrime(UUID id){

        for(Crime crime: mCrimes){
            if(crime.getmID().equals(id))
            {
                return  crime;
            }
        }
        return null;
    }

    public List<Crime> getmCrimes(){
        return mCrimes;
    }



}
