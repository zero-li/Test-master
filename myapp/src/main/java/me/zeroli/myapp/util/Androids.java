package me.zeroli.myapp.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhh_li on 2016/9/29.
 */

public class Androids {

    public static void copyToClipBoard(Context context, String text, String success) {
        ClipData clipData = ClipData.newPlainText("meizi_copy",text);

        ClipboardManager manager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        manager.setPrimaryClip(clipData);;
        Toast.makeText(context,success,Toast.LENGTH_LONG).show();
    }
}
