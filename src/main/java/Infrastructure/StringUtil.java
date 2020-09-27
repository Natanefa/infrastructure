package Infrastructure;

import java.util.Random;

public class StringUtil {
    public static String alphabet = "abcdefghijklmnopqrstu";
    public static String nums = "0123456789";


    public static String stringGenerator(String mode, int length) {
        Random random = new Random();
        String tempString = " ";
        StringBuilder builder = new StringBuilder();

        if (mode.equals("alpha")) {
            tempString = alphabet;
        }
        else if (mode.equals("alphanumeric")) {
            tempString = alphabet + nums;
        }
        else if(mode.equals("numeric")) {
            tempString = nums;
        }
        System.out.println(tempString);
        for (int i = 0; i < length; i++) {
            builder.append(tempString.charAt(random.nextInt(tempString.length())));
        }
        return builder.toString();

    }
}
