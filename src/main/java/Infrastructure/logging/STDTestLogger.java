package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class STDTestLogger implements AbstractLogger {
    public static int counter = 0;

    @Override
    public void log(String operation) {
        System.out.println(getEntry(operation));
    }

    private String getEntry(String operation) {
        counter++;
        Date curDate = new Date();
        String formateDate = new SimpleDateFormat("HH:mm:ss:SS").format(curDate.getTime());

        return counter + ")" + formateDate + "[" + Thread.currentThread().getName() + "]" + operation;
    }

    public void atFinish() {

    }

    public void atStart() {


    }
}
