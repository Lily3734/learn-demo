package com.itheima.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";

        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startTime = s.parse(start);
        Date endTime = s.parse(end);
        Date xjDt = s.parse(xj);
        Date xpDt = s.parse(xp);

        long starDt = startTime.getTime();
        long endDt = endTime.getTime();
        long xjTime = xjDt.getTime();
        long xpTime = xpDt.getTime();

        if(xjTime >= starDt && xjTime <= endDt){
            System.out.println("小贾秒杀成功");
        }
        else {
            System.out.println("秒杀失败");
        }

    }
}
