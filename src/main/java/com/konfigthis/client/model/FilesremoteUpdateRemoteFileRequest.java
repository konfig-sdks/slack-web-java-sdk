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
 * FilesremoteUpdateRemoteFileRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FilesremoteUpdateRemoteFileRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_FILETYPE = "filetype";
  @SerializedName(SERIALIZED_NAME_FILETYPE)
  private String filetype;

  public static final String SERIALIZED_NAME_INDEXABLE_FILE_CONTENTS = "indexable_file_contents";
  @SerializedName(SERIALIZED_NAME_INDEXABLE_FILE_CONTENTS)
  private String indexableFileContents;

  public static final String SERIALIZED_NAME_PREVIEW_IMAGE = "preview_image";
  @SerializedName(SERIALIZED_NAME_PREVIEW_IMAGE)
  private String previewImage;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public FilesremoteUpdateRemoteFileRequest() {
  }

  public FilesremoteUpdateRemoteFileRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title of the file being shared.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the file being shared.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public FilesremoteUpdateRemoteFileRequest externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Creator defined GUID for the file.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creator defined GUID for the file.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public FilesremoteUpdateRemoteFileRequest externalUrl(String externalUrl) {
    
    
    
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * URL of the remote file.
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the remote file.")

  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    
    
    
    this.externalUrl = externalUrl;
  }


  public FilesremoteUpdateRemoteFileRequest _file(String _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * Specify a file by providing its ID.
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify a file by providing its ID.")

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    
    
    
    this._file = _file;
  }


  public FilesremoteUpdateRemoteFileRequest filetype(String filetype) {
    
    
    
    
    this.filetype = filetype;
    return this;
  }

   /**
   * type of file
   * @return filetype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type of file")

  public String getFiletype() {
    return filetype;
  }


  public void setFiletype(String filetype) {
    
    
    
    this.filetype = filetype;
  }


  public FilesremoteUpdateRemoteFileRequest indexableFileContents(String indexableFileContents) {
    
    
    
    
    this.indexableFileContents = indexableFileContents;
    return this;
  }

   /**
   * File containing contents that can be used to improve searchability for the remote file.
   * @return indexableFileContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File containing contents that can be used to improve searchability for the remote file.")

  public String getIndexableFileContents() {
    return indexableFileContents;
  }


  public void setIndexableFileContents(String indexableFileContents) {
    
    
    
    this.indexableFileContents = indexableFileContents;
  }


  public FilesremoteUpdateRemoteFileRequest previewImage(String previewImage) {
    
    
    
    
    this.previewImage = previewImage;
    return this;
  }

   /**
   * Preview of the document via &#x60;multipart/form-data&#x60;.
   * @return previewImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Preview of the document via `multipart/form-data`.")

  public String getPreviewImage() {
    return previewImage;
  }


  public void setPreviewImage(String previewImage) {
    
    
    
    this.previewImage = previewImage;
  }


  public FilesremoteUpdateRemoteFileRequest token(String token) {
    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token. Requires scope: &#x60;remote_files:write&#x60;
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token. Requires scope: `remote_files:write`")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    
    
    
    this.token = token;
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
   * @return the FilesremoteUpdateRemoteFileRequest instance itself
   */
  public FilesremoteUpdateRemoteFileRequest putAdditionalProperty(String key, Object value) {
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
    FilesremoteUpdateRemoteFileRequest filesremoteUpdateRemoteFileRequest = (FilesremoteUpdateRemoteFileRequest) o;
    return Objects.equals(this.title, filesremoteUpdateRemoteFileRequest.title) &&
        Objects.equals(this.externalId, filesremoteUpdateRemoteFileRequest.externalId) &&
        Objects.equals(this.externalUrl, filesremoteUpdateRemoteFileRequest.externalUrl) &&
        Objects.equals(this._file, filesremoteUpdateRemoteFileRequest._file) &&
        Objects.equals(this.filetype, filesremoteUpdateRemoteFileRequest.filetype) &&
        Objects.equals(this.indexableFileContents, filesremoteUpdateRemoteFileRequest.indexableFileContents) &&
        Objects.equals(this.previewImage, filesremoteUpdateRemoteFileRequest.previewImage) &&
        Objects.equals(this.token, filesremoteUpdateRemoteFileRequest.token)&&
        Objects.equals(this.additionalProperties, filesremoteUpdateRemoteFileRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, externalId, externalUrl, _file, filetype, indexableFileContents, previewImage, token, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesremoteUpdateRemoteFileRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    filetype: ").append(toIndentedString(filetype)).append("\n");
    sb.append("    indexableFileContents: ").append(toIndentedString(indexableFileContents)).append("\n");
    sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("external_id");
    openapiFields.add("external_url");
    openapiFields.add("file");
    openapiFields.add("filetype");
    openapiFields.add("indexable_file_contents");
    openapiFields.add("preview_image");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilesremoteUpdateRemoteFileRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilesremoteUpdateRemoteFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilesremoteUpdateRemoteFileRequest is not found in the empty JSON string", FilesremoteUpdateRemoteFileRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("external_url") != null && !jsonObj.get("external_url").isJsonNull()) && !jsonObj.get("external_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_url").toString()));
      }
      if ((jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) && !jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      if ((jsonObj.get("filetype") != null && !jsonObj.get("filetype").isJsonNull()) && !jsonObj.get("filetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filetype").toString()));
      }
      if ((jsonObj.get("indexable_file_contents") != null && !jsonObj.get("indexable_file_contents").isJsonNull()) && !jsonObj.get("indexable_file_contents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexable_file_contents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexable_file_contents").toString()));
      }
      if ((jsonObj.get("preview_image") != null && !jsonObj.get("preview_image").isJsonNull()) && !jsonObj.get("preview_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview_image").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilesremoteUpdateRemoteFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilesremoteUpdateRemoteFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilesremoteUpdateRemoteFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilesremoteUpdateRemoteFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FilesremoteUpdateRemoteFileRequest>() {
           @Override
           public void write(JsonWriter out, FilesremoteUpdateRemoteFileRequest value) throws IOException {
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
           public FilesremoteUpdateRemoteFileRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FilesremoteUpdateRemoteFileRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FilesremoteUpdateRemoteFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilesremoteUpdateRemoteFileRequest
  * @throws IOException if the JSON string is invalid with respect to FilesremoteUpdateRemoteFileRequest
  */
  public static FilesremoteUpdateRemoteFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilesremoteUpdateRemoteFileRequest.class);
  }

 /**
  * Convert an instance of FilesremoteUpdateRemoteFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

