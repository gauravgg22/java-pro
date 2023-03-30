package com.xendit.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableRetailOutletInvoice extends AbstractResponseHeaders {
  @SerializedName("retail_outlet_name")
  private String retailOutletName;

  @SerializedName("payment_code")
  private String paymentCode;

  @SerializedName("transfer_amount")
  private Number transferAmount;

  @SerializedName("merchant_name")
  private String merchantName;
}
