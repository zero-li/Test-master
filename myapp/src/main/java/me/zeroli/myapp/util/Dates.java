package me.zeroli.myapp.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhh_li on 2016/9/29.
 */

public class Dates {
    public static String toDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return dateFormat.format(date);
    }

    public static String toDate(Date date, int add){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, add);
        return toDate(calendar.getTime());
    }

    public static boolean isTheSameDay(Date one, Date another){
        Calendar _one = Calendar.getInstance();
        _one.setTime(one);

        Calendar _another = Calendar.getInstance();
        _another.setTime(another);

        int oneDay = _one.get(Calendar.DAY_OF_YEAR);
        int anotherDay = _another.get(Calendar.DAY_OF_YEAR);

        return  oneDay == anotherDay;
    }

}
