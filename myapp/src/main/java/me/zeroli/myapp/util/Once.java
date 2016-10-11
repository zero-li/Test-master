package me.zeroli.myapp.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zhh_li on 2016/9/29.
 */

public class Once {

    SharedPreferences mSharedPreferences;
    Context mContext;

    public Once(Context context) {

        mSharedPreferences = context.getSharedPreferences("once", Context.MODE_PRIVATE);//代表该文件是私有数据，只能被应用本身访问
        mContext = context;
    }

    public void show(String tagKey, OnceCallback callback) {

        boolean isSecondTime = mSharedPreferences.getBoolean(tagKey, false);
        if(!isSecondTime){
            callback.onOnce();// 执行
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(tagKey,true);//记录已执行过
            editor.apply();
        }
    }

    public void show(int tagKeyResId, OnceCallback callback){
        show(mContext.getString(tagKeyResId), callback);
    }

    public interface OnceCallback {
        void onOnce();
    }
}
