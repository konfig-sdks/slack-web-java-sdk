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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ChatUnfurlRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChatUnfurlRequest {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private String ts;

  public static final String SERIALIZED_NAME_UNFURLS = "unfurls";
  @SerializedName(SERIALIZED_NAME_UNFURLS)
  private String unfurls;

  public static final String SERIALIZED_NAME_USER_AUTH_MESSAGE = "user_auth_message";
  @SerializedName(SERIALIZED_NAME_USER_AUTH_MESSAGE)
  private String userAuthMessage;

  public static final String SERIALIZED_NAME_USER_AUTH_REQUIRED = "user_auth_required";
  @SerializedName(SERIALIZED_NAME_USER_AUTH_REQUIRED)
  private Boolean userAuthRequired;

  public static final String SERIALIZED_NAME_USER_AUTH_URL = "user_auth_url";
  @SerializedName(SERIALIZED_NAME_USER_AUTH_URL)
  private String userAuthUrl;

  public ChatUnfurlRequest() {
  }

  public ChatUnfurlRequest channel(String channel) {
    
    
    
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel ID of the message
   * @return channel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Channel ID of the message")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    
    
    
    this.channel = channel;
  }


  public ChatUnfurlRequest ts(String ts) {
    
    
    
    
    this.ts = ts;
    return this;
  }

   /**
   * Timestamp of the message to add unfurl behavior to.
   * @return ts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Timestamp of the message to add unfurl behavior to.")

  public String getTs() {
    return ts;
  }


  public void setTs(String ts) {
    
    
    
    this.ts = ts;
  }


  public ChatUnfurlRequest unfurls(String unfurls) {
    
    
    
    
    this.unfurls = unfurls;
    return this;
  }

   /**
   * URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments.
   * @return unfurls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments.")

  public String getUnfurls() {
    return unfurls;
  }


  public void setUnfurls(String unfurls) {
    
    
    
    this.unfurls = unfurls;
  }


  public ChatUnfurlRequest userAuthMessage(String userAuthMessage) {
    
    
    
    
    this.userAuthMessage = userAuthMessage;
    return this;
  }

   /**
   * Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior
   * @return userAuthMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior")

  public String getUserAuthMessage() {
    return userAuthMessage;
  }


  public void setUserAuthMessage(String userAuthMessage) {
    
    
    
    this.userAuthMessage = userAuthMessage;
  }


  public ChatUnfurlRequest userAuthRequired(Boolean userAuthRequired) {
    
    
    
    
    this.userAuthRequired = userAuthRequired;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain
   * @return userAuthRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain")

  public Boolean getUserAuthRequired() {
    return userAuthRequired;
  }


  public void setUserAuthRequired(Boolean userAuthRequired) {
    
    
    
    this.userAuthRequired = userAuthRequired;
  }


  public ChatUnfurlRequest userAuthUrl(String userAuthUrl) {
    
    
    
    
    this.userAuthUrl = userAuthUrl;
    return this;
  }

   /**
   * Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded.
   * @return userAuthUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded.")

  public String getUserAuthUrl() {
    return userAuthUrl;
  }


  public void setUserAuthUrl(String userAuthUrl) {
    
    
    
    this.userAuthUrl = userAuthUrl;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ChatUnfurlRequest instance itself
   */
  public ChatUnfurlRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatUnfurlRequest chatUnfurlRequest = (ChatUnfurlRequest) o;
    return Objects.equals(this.channel, chatUnfurlRequest.channel) &&
        Objects.equals(this.ts, chatUnfurlRequest.ts) &&
        Objects.equals(this.unfurls, chatUnfurlRequest.unfurls) &&
        Objects.equals(this.userAuthMessage, chatUnfurlRequest.userAuthMessage) &&
        Objects.equals(this.userAuthRequired, chatUnfurlRequest.userAuthRequired) &&
        Objects.equals(this.userAuthUrl, chatUnfurlRequest.userAuthUrl)&&
        Objects.equals(this.additionalProperties, chatUnfurlRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, ts, unfurls, userAuthMessage, userAuthRequired, userAuthUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatUnfurlRequest {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    unfurls: ").append(toIndentedString(unfurls)).append("\n");
    sb.append("    userAuthMessage: ").append(toIndentedString(userAuthMessage)).append("\n");
    sb.append("    userAuthRequired: ").append(toIndentedString(userAuthRequired)).append("\n");
    sb.append("    userAuthUrl: ").append(toIndentedString(userAuthUrl)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("channel");
    openapiFields.add("ts");
    openapiFields.add("unfurls");
    openapiFields.add("user_auth_message");
    openapiFields.add("user_auth_required");
    openapiFields.add("user_auth_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("ts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChatUnfurlRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChatUnfurlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatUnfurlRequest is not found in the empty JSON string", ChatUnfurlRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatUnfurlRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (!jsonObj.get("ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ts").toString()));
      }
      if ((jsonObj.get("unfurls") != null && !jsonObj.get("unfurls").isJsonNull()) && !jsonObj.get("unfurls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unfurls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unfurls").toString()));
      }
      if ((jsonObj.get("user_auth_message") != null && !jsonObj.get("user_auth_message").isJsonNull()) && !jsonObj.get("user_auth_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_auth_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_auth_message").toString()));
      }
      if ((jsonObj.get("user_auth_url") != null && !jsonObj.get("user_auth_url").isJsonNull()) && !jsonObj.get("user_auth_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_auth_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_auth_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatUnfurlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatUnfurlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatUnfurlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatUnfurlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatUnfurlRequest>() {
           @Override
           public void write(JsonWriter out, ChatUnfurlRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatUnfurlRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChatUnfurlRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatUnfurlRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatUnfurlRequest
  * @throws IOException if the JSON string is invalid with respect to ChatUnfurlRequest
  */
  public static ChatUnfurlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatUnfurlRequest.class);
  }

 /**
  * Convert an instance of ChatUnfurlRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

