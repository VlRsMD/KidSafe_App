import com.google.zxing.WriterException;

import java.io.IOException;

public class generateQRCode {
    public static void main(String[] args) {
        try {
            String QRCodeLocation = "C:\\Users\\vladi\\QRCodeDAS\\QRCode.jpg";
            String randString = randomStringGenerator.randStr();
            String randStringHash = SHA256.sha(randString);
            String randStringHashEncr = RSA.RSAEncrypted(randStringHash);
            QRCode.QRCodeGeneration(randStringHashEncr, 350, 350, QRCodeLocation);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
