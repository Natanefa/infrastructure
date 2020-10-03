package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface AbstractLogger {
    public static final String Welcome_Message = "Test suite started";
    public static final String Finale_Message = "Test suite finished";

    void log(String msg);

    void atFinish();

    void atStart();


}
