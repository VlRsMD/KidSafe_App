import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class SHA256 {
    public static String sha(String message)
    {
        try {
            MessageDigest mD = MessageDigest.getInstance("SHA-256");
            byte[] messDig = mD.digest(message.getBytes());
            BigInteger signumRepr = new BigInteger(1, messDig);
            String hashText = signumRepr.toString(16);
            return hashText;
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("Incorrect algorithm: " + e);
            return null;
        }
    }
}
