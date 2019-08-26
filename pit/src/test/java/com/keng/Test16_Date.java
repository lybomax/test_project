package com.keng;

import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

/**
 * @class: Test16_Date
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月22日 15:27
 * @since: 1.0.0
 */
public class Test16_Date {

    @Test
    public void test01() {
        //获取当前日期是当前年的第几天
        long fragmentInDays = DateUtils.getFragmentInDays(new Date(), Calendar.YEAR);
        System.out.println("今天是今年的第几天？" + fragmentInDays);

        //按指定截取日期（截取到日,时分秒为0）
        Date truncate = DateUtils.truncate(new Date(), Calendar.DATE);
        //按yyyy-MM-dd格式化
        String dt = DateFormatUtils.ISO_DATE_FORMAT.format(truncate);
        // 以 HH:mm:ss 格式化
        String tm = DateFormatUtils.ISO_TIME_NO_T_FORMAT.format(truncate);
        System.out.println(dt + " " + tm);
        //格式化
        String now = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss:sss");
        System.out.println("now = " + now);

    }

}
