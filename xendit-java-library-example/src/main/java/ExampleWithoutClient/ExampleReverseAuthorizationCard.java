package ExampleWithoutClient;

import com.xendit.exception.XenditException;
import com.xenditclient.creditCard.CreditCardReverseAuth;
import com.xendit.Xendit;
import com.xenditclient.creditCard.CreditCard;

public class ExampleReverseAuthorizationCard {
  public static void main(String[] args) {
    //access key with Option
    Xendit.Opt.setApiKey("xnd_development_Z568GecuIH66011GIILkDFNJOoR1wFZdGqOOMFBrRVeX64DISB1o7hnNKB");

    //access static variable (same as old code )
    //Xendit.apiKey = "xnd_development_Z568GecuIH66011GIILkDFNJOoR1wFZdGqOOMFBrRVeX64DISB1o7hnNKB";

    try {
      CreditCardReverseAuth creditCardReverseAuth = CreditCard.reverseAuthorization("1234567","external_id");
      System.out.println(creditCardReverseAuth.getId());
    } catch (XenditException e) {
      e.printStackTrace();
    }
  }
}