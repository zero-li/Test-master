package me.zeroli.myapp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by zhh_li on 2016/9/29.
 */

public class PreferencesLoader {

    Context mContext;
    SharedPreferences mSharedPreferences;

    public PreferencesLoader(Context context) {
        mContext =context;
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void saveBoolean(String tagKey, boolean value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(tagKey, value);
        editor.apply();
    }

    public void saveBoolean(int tagKeyResId, boolean value) {
        String key = mContext.getString(tagKeyResId);
        saveBoolean(key, value);
    }

    public Boolean getBoolean(int keyResId, boolean def) {
        String key = mContext.getString(keyResId);
        return mSharedPreferences.getBoolean(key, def);
    }
}
