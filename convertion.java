import java.math.BigInteger;

public class convertion {
    public static String byteToBin(byte[] byteArr) {
        BigInteger one;
        one = new BigInteger(byteArr);
        String strResult = one.toString(2);
        return strResult;
    }
}
