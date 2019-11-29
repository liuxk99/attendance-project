package com.loonggg.lib.alarmmanager.clock;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    public static String genTimeStamp() {
        return new Date().getTime() + "";
    }

    public static String formatDay(long timestamp) {
        Format formatter = new SimpleDateFormat("yyyy/MM/dd");
        return formatter.format(new Date(timestamp));
    }

    public static String formatTime(long timestamp) {
        Format formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(new Date(timestamp));
    }

    public static String formatDateTime(long timestamp) {
        Format formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatter.format(new Date(timestamp));
    }

    public static String formatTimeSpan(long begin, long end) {
        Format formatter = new SimpleDateFormat("HH:mm:ss");
        String beginTime = formatter.format(begin);
        String endTime = formatter.format(end);
        return String.format("%s - %s", beginTime, endTime);
    }
}
