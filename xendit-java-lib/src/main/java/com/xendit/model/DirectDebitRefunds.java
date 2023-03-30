package com.xendit.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class DirectDebitRefunds extends AbstractResponseHeaders {
  @SerializedName("data")
  private String[] data;

  @SerializedName("has_more")
  private Boolean hasMore;

  @SerializedName("url")
  private String url;
}
