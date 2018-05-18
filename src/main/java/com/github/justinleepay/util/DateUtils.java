package com.github.justinleepay.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateUtils {

    public final static SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final static SimpleDateFormat HaoMiaoDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    //    private final static SimpleDateFormat DateFormatYYYYMM = new SimpleDateFormat("yyyyMM");
    private final static SimpleDateFormat DateFormatYYYYMMDD = new SimpleDateFormat("yyyyMMdd");
    private final static SimpleDateFormat DateFormatYYMMDD = new SimpleDateFormat("yyMMdd");
    private final static SimpleDateFormat DateFormatYYYYMMDDHHmmssSSS = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static Date getNow() {
        return Date.from(Instant.now());
    }

    public static Timestamp getTimestamp() {
        return Timestamp.from(Instant.now());
    }

    public static String getYYMMDD() {
        return DateFormatYYMMDD.format(new Date());
    }

    public static String getYYYYMMDD() {
        return DateFormatYYYYMMDD.format(new Date());
    }

    public static String getYYYYMMDDHHmmss(Date date) {
        return DateFormat.format(new Date());
    }

    public static String getYYYYMMDDHHmmssSSS() {
        return DateFormatYYYYMMDDHHmmssSSS.format(new Date());
    }

    public static String getHaoMiaoDateString(Timestamp timestamp) {
        return HaoMiaoDateFormat.format(timestamp);
    }

}
