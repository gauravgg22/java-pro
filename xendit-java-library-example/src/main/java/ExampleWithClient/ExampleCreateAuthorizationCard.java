package ExampleWithClient;

import com.xendit.exception.XenditException;
import com.xenditclient.creditCard.CreditCardCharge;
import com.xendit.XenditClient;

public class ExampleCreateAuthorizationCard {
  public static void main(String[] args) {
    //create xendit client which holds value of apikey
    XenditClient xenditClient = new XenditClient.Builder()
            .apikey("xnd_development_Z568GecuIH66011GIILkDFNJOoR1wFZdGqOOMFBrRVeX64DISB1o7hnNKB")
            .build();

    try {
      CreditCardCharge creditCardCharge = xenditClient.creditCard.createAuthorization("token_id", "external_id", 75000, "auth_id", "123", false);
      System.out.println(creditCardCharge.getId());
    } catch (XenditException e) {
      e.printStackTrace();
    }
  }
}