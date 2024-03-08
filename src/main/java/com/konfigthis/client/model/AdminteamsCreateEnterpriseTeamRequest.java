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
 * AdminteamsCreateEnterpriseTeamRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AdminteamsCreateEnterpriseTeamRequest {
  public static final String SERIALIZED_NAME_TEAM_DESCRIPTION = "team_description";
  @SerializedName(SERIALIZED_NAME_TEAM_DESCRIPTION)
  private String teamDescription;

  public static final String SERIALIZED_NAME_TEAM_DISCOVERABILITY = "team_discoverability";
  @SerializedName(SERIALIZED_NAME_TEAM_DISCOVERABILITY)
  private String teamDiscoverability;

  public static final String SERIALIZED_NAME_TEAM_DOMAIN = "team_domain";
  @SerializedName(SERIALIZED_NAME_TEAM_DOMAIN)
  private String teamDomain;

  public static final String SERIALIZED_NAME_TEAM_NAME = "team_name";
  @SerializedName(SERIALIZED_NAME_TEAM_NAME)
  private String teamName;

  public AdminteamsCreateEnterpriseTeamRequest() {
  }

  public AdminteamsCreateEnterpriseTeamRequest teamDescription(String teamDescription) {
    
    
    
    
    this.teamDescription = teamDescription;
    return this;
  }

   /**
   * Description for the team.
   * @return teamDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for the team.")

  public String getTeamDescription() {
    return teamDescription;
  }


  public void setTeamDescription(String teamDescription) {
    
    
    
    this.teamDescription = teamDescription;
  }


  public AdminteamsCreateEnterpriseTeamRequest teamDiscoverability(String teamDiscoverability) {
    
    
    
    
    this.teamDiscoverability = teamDiscoverability;
    return this;
  }

   /**
   * Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;.
   * @return teamDiscoverability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.")

  public String getTeamDiscoverability() {
    return teamDiscoverability;
  }


  public void setTeamDiscoverability(String teamDiscoverability) {
    
    
    
    this.teamDiscoverability = teamDiscoverability;
  }


  public AdminteamsCreateEnterpriseTeamRequest teamDomain(String teamDomain) {
    
    
    
    
    this.teamDomain = teamDomain;
    return this;
  }

   /**
   * Team domain (for example, slacksoftballteam).
   * @return teamDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Team domain (for example, slacksoftballteam).")

  public String getTeamDomain() {
    return teamDomain;
  }


  public void setTeamDomain(String teamDomain) {
    
    
    
    this.teamDomain = teamDomain;
  }


  public AdminteamsCreateEnterpriseTeamRequest teamName(String teamName) {
    
    
    
    
    this.teamName = teamName;
    return this;
  }

   /**
   * Team name (for example, Slack Softball Team).
   * @return teamName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Team name (for example, Slack Softball Team).")

  public String getTeamName() {
    return teamName;
  }


  public void setTeamName(String teamName) {
    
    
    
    this.teamName = teamName;
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
   * @return the AdminteamsCreateEnterpriseTeamRequest instance itself
   */
  public AdminteamsCreateEnterpriseTeamRequest putAdditionalProperty(String key, Object value) {
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
    AdminteamsCreateEnterpriseTeamRequest adminteamsCreateEnterpriseTeamRequest = (AdminteamsCreateEnterpriseTeamRequest) o;
    return Objects.equals(this.teamDescription, adminteamsCreateEnterpriseTeamRequest.teamDescription) &&
        Objects.equals(this.teamDiscoverability, adminteamsCreateEnterpriseTeamRequest.teamDiscoverability) &&
        Objects.equals(this.teamDomain, adminteamsCreateEnterpriseTeamRequest.teamDomain) &&
        Objects.equals(this.teamName, adminteamsCreateEnterpriseTeamRequest.teamName)&&
        Objects.equals(this.additionalProperties, adminteamsCreateEnterpriseTeamRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamDescription, teamDiscoverability, teamDomain, teamName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminteamsCreateEnterpriseTeamRequest {\n");
    sb.append("    teamDescription: ").append(toIndentedString(teamDescription)).append("\n");
    sb.append("    teamDiscoverability: ").append(toIndentedString(teamDiscoverability)).append("\n");
    sb.append("    teamDomain: ").append(toIndentedString(teamDomain)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
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
    openapiFields.add("team_description");
    openapiFields.add("team_discoverability");
    openapiFields.add("team_domain");
    openapiFields.add("team_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("team_domain");
    openapiRequiredFields.add("team_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdminteamsCreateEnterpriseTeamRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdminteamsCreateEnterpriseTeamRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminteamsCreateEnterpriseTeamRequest is not found in the empty JSON string", AdminteamsCreateEnterpriseTeamRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdminteamsCreateEnterpriseTeamRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("team_description") != null && !jsonObj.get("team_description").isJsonNull()) && !jsonObj.get("team_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_description").toString()));
      }
      if ((jsonObj.get("team_discoverability") != null && !jsonObj.get("team_discoverability").isJsonNull()) && !jsonObj.get("team_discoverability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_discoverability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_discoverability").toString()));
      }
      if (!jsonObj.get("team_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_domain").toString()));
      }
      if (!jsonObj.get("team_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminteamsCreateEnterpriseTeamRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminteamsCreateEnterpriseTeamRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminteamsCreateEnterpriseTeamRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminteamsCreateEnterpriseTeamRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminteamsCreateEnterpriseTeamRequest>() {
           @Override
           public void write(JsonWriter out, AdminteamsCreateEnterpriseTeamRequest value) throws IOException {
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
           public AdminteamsCreateEnterpriseTeamRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdminteamsCreateEnterpriseTeamRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdminteamsCreateEnterpriseTeamRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdminteamsCreateEnterpriseTeamRequest
  * @throws IOException if the JSON string is invalid with respect to AdminteamsCreateEnterpriseTeamRequest
  */
  public static AdminteamsCreateEnterpriseTeamRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminteamsCreateEnterpriseTeamRequest.class);
  }

 /**
  * Convert an instance of AdminteamsCreateEnterpriseTeamRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

