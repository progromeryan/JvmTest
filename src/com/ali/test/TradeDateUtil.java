package com.ali.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by yqs on 2018/2/1.
 * 交易日计算工具
 */
public class TradeDateUtil {

    public  static SimpleDateFormat sdf = new  SimpleDateFormat("yyyyMMdd");

    private List<String> tradeDayList ;

    /**
     * 工具初始化
     * @param tradeDayList 包含一年内所有的交易日起，
     */
    public void init (List tradeDayList){
        this.tradeDayList = tradeDayList;
    }

    /** * * 给定任意时间，返回给定时间的T+n交易日
     * @param
     *            time 给定要计算的时间。
     * @param
     *            offsetDays 交易日便宜量
     * */
    public String getTradeDay(Date time, int offsetDays) throws Exception {
        String date = "";
        try {
            String nextDay = getNextDay(time);
            date = getDayAfter(nextDay, offsetDays);
        } catch (Exception e) {
            throw new Exception("ArgumentException is error", e);
        }
        return date;
    }


    public String getNextDay(Date time) {
        Calendar cal = Calendar.getInstance();
        // 待确认交易日：15点之前取当前日期，15点之后取下一交易日
        String nextDay = sdf.format(time);
        if (cal.get(Calendar.HOUR_OF_DAY) >= 15) {
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                cal.add(Calendar.DAY_OF_MONTH, 3);
                nextDay = sdf.format(cal.getTime());
            } else {
                nextDay = getNextDay(nextDay);
            }
        }
        return nextDay;
    }

    public String getDayAfter(String nextDay, int offsetDays) throws Exception {
        String date = "";
        if (null != tradeDayList) {
            for (int i = 0; i < tradeDayList.size(); i++) {
                if ((sdf.parse(nextDay)).before(sdf.parse(tradeDayList.get(i))) || nextDay.equals(tradeDayList.get(i))) {
                    if ((i + offsetDays) <= tradeDayList.size() - 1 && (i + offsetDays) >= 0) {
                        return tradeDayList.get(i + offsetDays);
                    } else {
                        throw new IllegalArgumentException("offsetDays is IllegalArgument");
                    }
                }
            }
        }
        return date;
    }

   /**
     * 获取下一天
     * @param day 当前日期yyyyMMdd
     */
    public   String getNextDay(String day) {
        Calendar cal = formatYYYYMMDD(day);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return  sdf.format(cal.getTime());
    }

    /**
     * 将字符串类型日期转换为Calendar
     * @param day 当前日期yyyyMMdd
     */
    public  Calendar formatYYYYMMDD(String day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(day.substring(0, 4)), (Integer.parseInt(day.substring(4, 6)) - 1), Integer.parseInt(day.substring(6)));
        return  cal;
    }

    public static void main(String[] args) throws Exception {
        // 时间必须要从小到大排序，否则会出问题
        String[] a = {"20160701", "20160704", "20160705", "20160710", "20161004", "20161005", "20161006", "20161007", "20161008", "20161009"};
        List<String> tradeDayList = Arrays.asList(a);
        TradeDateUtil tradeDateUtil = new TradeDateUtil();
        tradeDateUtil.init(tradeDayList);
        SimpleDateFormat simFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        try {
            //边界测试
            Date time = simFormat.parse("20181008 18:45:56");
            int offsetDays = 1;

//            Date time = simFormat.parse("20160605 18:45:56");
//            int offsetDays = 1;
            System.out.println("有效的最近交易日nextDay:" + tradeDateUtil.getTradeDay(time, offsetDays));
        } catch (ParseException e) {
            throw new Exception("输入的日期格式有误！", e);
        }
    }
}
