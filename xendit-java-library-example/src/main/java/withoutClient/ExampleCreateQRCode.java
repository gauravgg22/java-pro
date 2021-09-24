package withoutClient;

import com.xendit.exception.XenditException;
import com.xenditclient.Xendit;
import com.xenditclient.qrCode.QRCode;

public class ExampleCreateQRCode {
  public static void main(String[] args) {
    //access key with Option
    Xendit.Opt.setApiKey("xnd_development_Z568GecuIH66011GIILkDFNJOoR1wFZdGqOOMFBrRVeX64DISB1o7hnNKB");

    //access static variable (same as old code )
    //Xendit.apiKey = "xnd_development_Z568GecuIH66011GIILkDFNJOoR1wFZdGqOOMFBrRVeX64DISB1o7hnNKB";

    try {
      QRCode qrCode = QRCode.createQRCode("12", QRCode.QRCodeType.DYNAMIC, "https://webhook.site", 10000);
      System.out.println(qrCode.getId());
    } catch (XenditException e) {
      e.printStackTrace();
    }
  }
}
