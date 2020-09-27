package Infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {
    public static int counter = 0;

    public String log(String operation){
        counter++;
        Date curDate = new Date();
        String formateDate = new SimpleDateFormat("HH:mm:ss:SS").format(curDate.getTime());

        return counter + ")" + formateDate + "[" + Thread.currentThread().getName() + "]" + operation;
    }
}
