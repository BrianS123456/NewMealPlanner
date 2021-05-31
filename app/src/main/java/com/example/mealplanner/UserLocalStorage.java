package com.example.mealplanner;

import android.content.Context;
import android.content.SharedPreferences;

public class UserLocalStorage {
    public static final String sp_name = "UserDetails";
    SharedPreferences userLocal;

    public UserLocalStorage(Context context){
        userLocal = context.getSharedPreferences(sp_name, 0);
    }

    public void StoreUserData(User user){

    }
}
