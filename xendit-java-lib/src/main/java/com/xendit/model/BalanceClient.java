package com.xendit.model;

import com.xendit.Xendit;
import com.xendit.exception.XenditException;
import com.xendit.network.NetworkClient;
import com.xendit.network.RequestResource;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BalanceClient {

  private Xendit.Option opt;

  private NetworkClient requestClient;

  protected Xendit.Option getOpt() {
    return opt;
  }

  public Balance get() throws XenditException {
    return getBalance(new HashMap<>(), null);
  }

  public Balance get(Balance.AccountType accountType) throws XenditException {
    return getBalance(new HashMap<>(), accountType);
  }

  public Balance get(Map<String, String> headers, Balance.AccountType accountType)
      throws XenditException {
    return getBalance(headers, accountType);
  }

  public Balance getBalance(Map<String, String> headers, Balance.AccountType accountType)
      throws XenditException {
    String url = String.format("%s%s", opt.getXenditURL(), "/balance");
    if (accountType != null) {
      url = String.format("%s%s%s", url, "?account_type=", accountType);
    }

    Balance response =
        this.requestClient.request(
            RequestResource.Method.GET,
            url,
            headers,
            null,
            opt.getApiKey(),
            opt.getPrivateKey(),
            Balance.class);

    return response;
  }
}
