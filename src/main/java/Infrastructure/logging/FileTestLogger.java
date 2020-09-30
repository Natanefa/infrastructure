package Infrastructure.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTestLogger extends AbstractLogger {
    public static int counter = 0;

    private Object FileWriter;

    @Override
    public void log(String operation) {
         try {
            FileWriter fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter.write(getEntry(operation) + "\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


