package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class STDTestLogger extends AbstractLogger{
    public static int counter = 0;

    @Override
    public void log(String operation) {
        System.out.println(getEntry(operation));

    }
}
