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
import java.net.URI;

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
 * ObjsUserProfileShort
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ObjsUserProfileShort {
  public static final String SERIALIZED_NAME_AVATAR_HASH = "avatar_hash";
  @SerializedName(SERIALIZED_NAME_AVATAR_HASH)
  private String avatarHash;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME_NORMALIZED = "display_name_normalized";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_NORMALIZED)
  private String displayNameNormalized;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_IMAGE72 = "image_72";
  @SerializedName(SERIALIZED_NAME_IMAGE72)
  private URI image72;

  public static final String SERIALIZED_NAME_IS_RESTRICTED = "is_restricted";
  @SerializedName(SERIALIZED_NAME_IS_RESTRICTED)
  private Boolean isRestricted;

  public static final String SERIALIZED_NAME_IS_ULTRA_RESTRICTED = "is_ultra_restricted";
  @SerializedName(SERIALIZED_NAME_IS_ULTRA_RESTRICTED)
  private Boolean isUltraRestricted;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_REAL_NAME_NORMALIZED = "real_name_normalized";
  @SerializedName(SERIALIZED_NAME_REAL_NAME_NORMALIZED)
  private String realNameNormalized;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public ObjsUserProfileShort() {
  }

  public ObjsUserProfileShort avatarHash(String avatarHash) {
    
    
    
    
    this.avatarHash = avatarHash;
    return this;
  }

   /**
   * Get avatarHash
   * @return avatarHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAvatarHash() {
    return avatarHash;
  }


  public void setAvatarHash(String avatarHash) {
    
    
    
    this.avatarHash = avatarHash;
  }


  public ObjsUserProfileShort displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ObjsUserProfileShort displayNameNormalized(String displayNameNormalized) {
    
    
    
    
    this.displayNameNormalized = displayNameNormalized;
    return this;
  }

   /**
   * Get displayNameNormalized
   * @return displayNameNormalized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayNameNormalized() {
    return displayNameNormalized;
  }


  public void setDisplayNameNormalized(String displayNameNormalized) {
    
    
    
    this.displayNameNormalized = displayNameNormalized;
  }


  public ObjsUserProfileShort firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public ObjsUserProfileShort image72(URI image72) {
    
    
    
    
    this.image72 = image72;
    return this;
  }

   /**
   * Get image72
   * @return image72
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getImage72() {
    return image72;
  }


  public void setImage72(URI image72) {
    
    
    
    this.image72 = image72;
  }


  public ObjsUserProfileShort isRestricted(Boolean isRestricted) {
    
    
    
    
    this.isRestricted = isRestricted;
    return this;
  }

   /**
   * Get isRestricted
   * @return isRestricted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsRestricted() {
    return isRestricted;
  }


  public void setIsRestricted(Boolean isRestricted) {
    
    
    
    this.isRestricted = isRestricted;
  }


  public ObjsUserProfileShort isUltraRestricted(Boolean isUltraRestricted) {
    
    
    
    
    this.isUltraRestricted = isUltraRestricted;
    return this;
  }

   /**
   * Get isUltraRestricted
   * @return isUltraRestricted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsUltraRestricted() {
    return isUltraRestricted;
  }


  public void setIsUltraRestricted(Boolean isUltraRestricted) {
    
    
    
    this.isUltraRestricted = isUltraRestricted;
  }


  public ObjsUserProfileShort name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ObjsUserProfileShort realName(String realName) {
    
    
    
    
    this.realName = realName;
    return this;
  }

   /**
   * Get realName
   * @return realName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    
    
    
    this.realName = realName;
  }


  public ObjsUserProfileShort realNameNormalized(String realNameNormalized) {
    
    
    
    
    this.realNameNormalized = realNameNormalized;
    return this;
  }

   /**
   * Get realNameNormalized
   * @return realNameNormalized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRealNameNormalized() {
    return realNameNormalized;
  }


  public void setRealNameNormalized(String realNameNormalized) {
    
    
    
    this.realNameNormalized = realNameNormalized;
  }


  public ObjsUserProfileShort team(String team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    
    
    
    this.team = team;
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
   * @return the ObjsUserProfileShort instance itself
   */
  public ObjsUserProfileShort putAdditionalProperty(String key, Object value) {
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
    ObjsUserProfileShort objsUserProfileShort = (ObjsUserProfileShort) o;
    return Objects.equals(this.avatarHash, objsUserProfileShort.avatarHash) &&
        Objects.equals(this.displayName, objsUserProfileShort.displayName) &&
        Objects.equals(this.displayNameNormalized, objsUserProfileShort.displayNameNormalized) &&
        Objects.equals(this.firstName, objsUserProfileShort.firstName) &&
        Objects.equals(this.image72, objsUserProfileShort.image72) &&
        Objects.equals(this.isRestricted, objsUserProfileShort.isRestricted) &&
        Objects.equals(this.isUltraRestricted, objsUserProfileShort.isUltraRestricted) &&
        Objects.equals(this.name, objsUserProfileShort.name) &&
        Objects.equals(this.realName, objsUserProfileShort.realName) &&
        Objects.equals(this.realNameNormalized, objsUserProfileShort.realNameNormalized) &&
        Objects.equals(this.team, objsUserProfileShort.team)&&
        Objects.equals(this.additionalProperties, objsUserProfileShort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarHash, displayName, displayNameNormalized, firstName, image72, isRestricted, isUltraRestricted, name, realName, realNameNormalized, team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjsUserProfileShort {\n");
    sb.append("    avatarHash: ").append(toIndentedString(avatarHash)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameNormalized: ").append(toIndentedString(displayNameNormalized)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    image72: ").append(toIndentedString(image72)).append("\n");
    sb.append("    isRestricted: ").append(toIndentedString(isRestricted)).append("\n");
    sb.append("    isUltraRestricted: ").append(toIndentedString(isUltraRestricted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    realNameNormalized: ").append(toIndentedString(realNameNormalized)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
    openapiFields.add("avatar_hash");
    openapiFields.add("display_name");
    openapiFields.add("display_name_normalized");
    openapiFields.add("first_name");
    openapiFields.add("image_72");
    openapiFields.add("is_restricted");
    openapiFields.add("is_ultra_restricted");
    openapiFields.add("name");
    openapiFields.add("real_name");
    openapiFields.add("real_name_normalized");
    openapiFields.add("team");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("avatar_hash");
    openapiRequiredFields.add("display_name");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("image_72");
    openapiRequiredFields.add("is_restricted");
    openapiRequiredFields.add("is_ultra_restricted");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("real_name");
    openapiRequiredFields.add("team");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjsUserProfileShort
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjsUserProfileShort.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjsUserProfileShort is not found in the empty JSON string", ObjsUserProfileShort.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ObjsUserProfileShort.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("avatar_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_hash").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("display_name_normalized") != null && !jsonObj.get("display_name_normalized").isJsonNull()) && !jsonObj.get("display_name_normalized").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name_normalized` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name_normalized").toString()));
      }
      if (!jsonObj.get("first_name").isJsonNull() && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (!jsonObj.get("image_72").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_72` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_72").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      if ((jsonObj.get("real_name_normalized") != null && !jsonObj.get("real_name_normalized").isJsonNull()) && !jsonObj.get("real_name_normalized").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name_normalized` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name_normalized").toString()));
      }
      if (!jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjsUserProfileShort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjsUserProfileShort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjsUserProfileShort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjsUserProfileShort.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjsUserProfileShort>() {
           @Override
           public void write(JsonWriter out, ObjsUserProfileShort value) throws IOException {
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
           public ObjsUserProfileShort read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ObjsUserProfileShort instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ObjsUserProfileShort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjsUserProfileShort
  * @throws IOException if the JSON string is invalid with respect to ObjsUserProfileShort
  */
  public static ObjsUserProfileShort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjsUserProfileShort.class);
  }

 /**
  * Convert an instance of ObjsUserProfileShort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

