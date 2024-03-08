/*
 * Slack Web API
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets defs_ok_false
 */
@JsonAdapter(DefsOkFalse.Adapter.class)public enum DefsOkFalse {
  
  FALSE("false");

  private Boolean value;

  DefsOkFalse(Boolean value) {
    this.value = value;
  }

  public Boolean getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DefsOkFalse fromValue(Boolean value) {
    for (DefsOkFalse b : DefsOkFalse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DefsOkFalse> {
    @Override
    public void write(final JsonWriter jsonWriter, final DefsOkFalse enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DefsOkFalse read(final JsonReader jsonReader) throws IOException {
      Boolean value = jsonReader.nextBoolean();
      return DefsOkFalse.fromValue(value);
    }
  }
}

