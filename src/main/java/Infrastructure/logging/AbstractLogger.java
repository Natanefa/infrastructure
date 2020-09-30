package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractLogger {
    public static int counter = 0;

    public abstract void log(String msg);


    public String getEntry(String operation) {
        counter++;
        Date curDate = new Date();
        String formateDate = new SimpleDateFormat("HH:mm:ss:SS").format(curDate.getTime());

        return counter + ")" + formateDate + "[" + Thread.currentThread().getName() + "]" + operation;
    }
}
