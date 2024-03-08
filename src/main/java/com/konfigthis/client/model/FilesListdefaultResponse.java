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
import com.konfigthis.client.model.DefsOkFalse;
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
 * Schema for error response from files.list method
 */
@ApiModel(description = "Schema for error response from files.list method")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FilesListdefaultResponse {
  public static final String SERIALIZED_NAME_CALLSTACK = "callstack";
  @SerializedName(SERIALIZED_NAME_CALLSTACK)
  private String callstack;

  /**
   * Gets or Sets error
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
 public enum ErrorEnum {
    USER_NOT_FOUND("user_not_found"),
    
    UNKNOWN_TYPE("unknown_type"),
    
    NOT_AUTHED("not_authed"),
    
    INVALID_AUTH("invalid_auth"),
    
    ACCOUNT_INACTIVE("account_inactive"),
    
    NO_PERMISSION("no_permission"),
    
    USER_IS_BOT("user_is_bot"),
    
    INVALID_ARG_NAME("invalid_arg_name"),
    
    INVALID_ARRAY_ARG("invalid_array_arg"),
    
    INVALID_CHARSET("invalid_charset"),
    
    INVALID_FORM_DATA("invalid_form_data"),
    
    INVALID_POST_TYPE("invalid_post_type"),
    
    MISSING_POST_TYPE("missing_post_type"),
    
    TEAM_ADDED_TO_ORG("team_added_to_org"),
    
    INVALID_JSON("invalid_json"),
    
    JSON_NOT_OBJECT("json_not_object"),
    
    REQUEST_TIMEOUT("request_timeout"),
    
    UPGRADE_REQUIRED("upgrade_required");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorEnum error;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkFalse ok;

  public FilesListdefaultResponse() {
  }

  public FilesListdefaultResponse callstack(String callstack) {
    
    
    
    
    this.callstack = callstack;
    return this;
  }

   /**
   * Note: PHP callstack is only visible in dev/qa
   * @return callstack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Note: PHP callstack is only visible in dev/qa")

  public String getCallstack() {
    return callstack;
  }


  public void setCallstack(String callstack) {
    
    
    
    this.callstack = callstack;
  }


  public FilesListdefaultResponse error(ErrorEnum error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ErrorEnum getError() {
    return error;
  }


  public void setError(ErrorEnum error) {
    
    
    
    this.error = error;
  }


  public FilesListdefaultResponse ok(DefsOkFalse ok) {
    
    
    
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DefsOkFalse getOk() {
    return ok;
  }


  public void setOk(DefsOkFalse ok) {
    
    
    
    this.ok = ok;
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
   * @return the FilesListdefaultResponse instance itself
   */
  public FilesListdefaultResponse putAdditionalProperty(String key, Object value) {
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
    FilesListdefaultResponse filesListdefaultResponse = (FilesListdefaultResponse) o;
    return Objects.equals(this.callstack, filesListdefaultResponse.callstack) &&
        Objects.equals(this.error, filesListdefaultResponse.error) &&
        Objects.equals(this.ok, filesListdefaultResponse.ok)&&
        Objects.equals(this.additionalProperties, filesListdefaultResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callstack, error, ok, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesListdefaultResponse {\n");
    sb.append("    callstack: ").append(toIndentedString(callstack)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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
    openapiFields.add("callstack");
    openapiFields.add("error");
    openapiFields.add("ok");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilesListdefaultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilesListdefaultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilesListdefaultResponse is not found in the empty JSON string", FilesListdefaultResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilesListdefaultResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("callstack") != null && !jsonObj.get("callstack").isJsonNull()) && !jsonObj.get("callstack").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callstack` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callstack").toString()));
      }
      if (!jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilesListdefaultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilesListdefaultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilesListdefaultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilesListdefaultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FilesListdefaultResponse>() {
           @Override
           public void write(JsonWriter out, FilesListdefaultResponse value) throws IOException {
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
           public FilesListdefaultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FilesListdefaultResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FilesListdefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilesListdefaultResponse
  * @throws IOException if the JSON string is invalid with respect to FilesListdefaultResponse
  */
  public static FilesListdefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilesListdefaultResponse.class);
  }

 /**
  * Convert an instance of FilesListdefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

