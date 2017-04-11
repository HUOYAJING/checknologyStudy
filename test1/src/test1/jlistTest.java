package test1;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * User: huoyajing
 * Date: 2016/12/16
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class jlistTest {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Integer year = Calendar.getInstance().get(Calendar.YEAR) - 1;
        System.out.println(Calendar.getInstance().get(Calendar.YEAR) - 1);
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();

        Format f2 = new DecimalFormat("00");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(sdf.format(currYearLast));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        int weekOfMonth = calendar1.get(Calendar.WEEK_OF_YEAR);
        System.out.println(weekOfMonth);

        /*//获取当前日期对应的第几周，全部注释啊
		//测试添加的功能
        Format f2 = new DecimalFormat("00");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(new Date());
        Date date = df.parse(today);
        System.out.println(today);
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        String todayWeek = f2.format(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(todayWeek);*/

        System.out.println();
    }


}
