import java.util.Random;

public class randomStringGenerator {
    public static String randStr() {
        int leftLimit = 97;
        int rightLimit = 122;
        int stringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
