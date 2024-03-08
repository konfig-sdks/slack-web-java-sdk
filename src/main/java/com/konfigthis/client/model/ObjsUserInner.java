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
import com.konfigthis.client.model.ObjsUserInnerEnterpriseUser;
import com.konfigthis.client.model.ObjsUserInnerTeamProfile;
import com.konfigthis.client.model.UserProfileObjectProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * user object for non enterprise type
 */
@ApiModel(description = "user object for non enterprise type")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ObjsUserInner {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ENTERPRISE_USER = "enterprise_user";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_USER)
  private ObjsUserInnerEnterpriseUser enterpriseUser;

  public static final String SERIALIZED_NAME_HAS2FA = "has_2fa";
  @SerializedName(SERIALIZED_NAME_HAS2FA)
  private Boolean has2fa;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_IS_APP_USER = "is_app_user";
  @SerializedName(SERIALIZED_NAME_IS_APP_USER)
  private Boolean isAppUser;

  public static final String SERIALIZED_NAME_IS_BOT = "is_bot";
  @SerializedName(SERIALIZED_NAME_IS_BOT)
  private Boolean isBot;

  public static final String SERIALIZED_NAME_IS_EXTERNAL = "is_external";
  @SerializedName(SERIALIZED_NAME_IS_EXTERNAL)
  private Boolean isExternal;

  public static final String SERIALIZED_NAME_IS_FORGOTTEN = "is_forgotten";
  @SerializedName(SERIALIZED_NAME_IS_FORGOTTEN)
  private Boolean isForgotten;

  public static final String SERIALIZED_NAME_IS_INVITED_USER = "is_invited_user";
  @SerializedName(SERIALIZED_NAME_IS_INVITED_USER)
  private Boolean isInvitedUser;

  public static final String SERIALIZED_NAME_IS_OWNER = "is_owner";
  @SerializedName(SERIALIZED_NAME_IS_OWNER)
  private Boolean isOwner;

  public static final String SERIALIZED_NAME_IS_PRIMARY_OWNER = "is_primary_owner";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_OWNER)
  private Boolean isPrimaryOwner;

  public static final String SERIALIZED_NAME_IS_RESTRICTED = "is_restricted";
  @SerializedName(SERIALIZED_NAME_IS_RESTRICTED)
  private Boolean isRestricted;

  public static final String SERIALIZED_NAME_IS_STRANGER = "is_stranger";
  @SerializedName(SERIALIZED_NAME_IS_STRANGER)
  private Boolean isStranger;

  public static final String SERIALIZED_NAME_IS_ULTRA_RESTRICTED = "is_ultra_restricted";
  @SerializedName(SERIALIZED_NAME_IS_ULTRA_RESTRICTED)
  private Boolean isUltraRestricted;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRESENCE = "presence";
  @SerializedName(SERIALIZED_NAME_PRESENCE)
  private String presence;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private UserProfileObjectProperty profile;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_TEAM_PROFILE = "team_profile";
  @SerializedName(SERIALIZED_NAME_TEAM_PROFILE)
  private ObjsUserInnerTeamProfile teamProfile;

  public static final String SERIALIZED_NAME_TWO_FACTOR_TYPE = "two_factor_type";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_TYPE)
  private String twoFactorType;

  public static final String SERIALIZED_NAME_TZ = "tz";
  @SerializedName(SERIALIZED_NAME_TZ)
  private Object tz = null;

  public static final String SERIALIZED_NAME_TZ_LABEL = "tz_label";
  @SerializedName(SERIALIZED_NAME_TZ_LABEL)
  private String tzLabel;

  public static final String SERIALIZED_NAME_TZ_OFFSET = "tz_offset";
  @SerializedName(SERIALIZED_NAME_TZ_OFFSET)
  private Double tzOffset;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Double updated;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private Set<String> teams = null;

  public ObjsUserInner() {
  }

  public ObjsUserInner color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public ObjsUserInner deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    
    
    
    this.deleted = deleted;
  }


  public ObjsUserInner enterpriseUser(ObjsUserInnerEnterpriseUser enterpriseUser) {
    
    
    
    
    this.enterpriseUser = enterpriseUser;
    return this;
  }

   /**
   * Get enterpriseUser
   * @return enterpriseUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsUserInnerEnterpriseUser getEnterpriseUser() {
    return enterpriseUser;
  }


  public void setEnterpriseUser(ObjsUserInnerEnterpriseUser enterpriseUser) {
    
    
    
    this.enterpriseUser = enterpriseUser;
  }


  public ObjsUserInner has2fa(Boolean has2fa) {
    
    
    
    
    this.has2fa = has2fa;
    return this;
  }

   /**
   * Get has2fa
   * @return has2fa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHas2fa() {
    return has2fa;
  }


  public void setHas2fa(Boolean has2fa) {
    
    
    
    this.has2fa = has2fa;
  }


  public ObjsUserInner id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ObjsUserInner isAdmin(Boolean isAdmin) {
    
    
    
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Boolean isAdmin) {
    
    
    
    this.isAdmin = isAdmin;
  }


  public ObjsUserInner isAppUser(Boolean isAppUser) {
    
    
    
    
    this.isAppUser = isAppUser;
    return this;
  }

   /**
   * Get isAppUser
   * @return isAppUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAppUser() {
    return isAppUser;
  }


  public void setIsAppUser(Boolean isAppUser) {
    
    
    
    this.isAppUser = isAppUser;
  }


  public ObjsUserInner isBot(Boolean isBot) {
    
    
    
    
    this.isBot = isBot;
    return this;
  }

   /**
   * Get isBot
   * @return isBot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsBot() {
    return isBot;
  }


  public void setIsBot(Boolean isBot) {
    
    
    
    this.isBot = isBot;
  }


  public ObjsUserInner isExternal(Boolean isExternal) {
    
    
    
    
    this.isExternal = isExternal;
    return this;
  }

   /**
   * Get isExternal
   * @return isExternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsExternal() {
    return isExternal;
  }


  public void setIsExternal(Boolean isExternal) {
    
    
    
    this.isExternal = isExternal;
  }


  public ObjsUserInner isForgotten(Boolean isForgotten) {
    
    
    
    
    this.isForgotten = isForgotten;
    return this;
  }

   /**
   * Get isForgotten
   * @return isForgotten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsForgotten() {
    return isForgotten;
  }


  public void setIsForgotten(Boolean isForgotten) {
    
    
    
    this.isForgotten = isForgotten;
  }


  public ObjsUserInner isInvitedUser(Boolean isInvitedUser) {
    
    
    
    
    this.isInvitedUser = isInvitedUser;
    return this;
  }

   /**
   * Get isInvitedUser
   * @return isInvitedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsInvitedUser() {
    return isInvitedUser;
  }


  public void setIsInvitedUser(Boolean isInvitedUser) {
    
    
    
    this.isInvitedUser = isInvitedUser;
  }


  public ObjsUserInner isOwner(Boolean isOwner) {
    
    
    
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOwner() {
    return isOwner;
  }


  public void setIsOwner(Boolean isOwner) {
    
    
    
    this.isOwner = isOwner;
  }


  public ObjsUserInner isPrimaryOwner(Boolean isPrimaryOwner) {
    
    
    
    
    this.isPrimaryOwner = isPrimaryOwner;
    return this;
  }

   /**
   * Get isPrimaryOwner
   * @return isPrimaryOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrimaryOwner() {
    return isPrimaryOwner;
  }


  public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
    
    
    
    this.isPrimaryOwner = isPrimaryOwner;
  }


  public ObjsUserInner isRestricted(Boolean isRestricted) {
    
    
    
    
    this.isRestricted = isRestricted;
    return this;
  }

   /**
   * Get isRestricted
   * @return isRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRestricted() {
    return isRestricted;
  }


  public void setIsRestricted(Boolean isRestricted) {
    
    
    
    this.isRestricted = isRestricted;
  }


  public ObjsUserInner isStranger(Boolean isStranger) {
    
    
    
    
    this.isStranger = isStranger;
    return this;
  }

   /**
   * Get isStranger
   * @return isStranger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsStranger() {
    return isStranger;
  }


  public void setIsStranger(Boolean isStranger) {
    
    
    
    this.isStranger = isStranger;
  }


  public ObjsUserInner isUltraRestricted(Boolean isUltraRestricted) {
    
    
    
    
    this.isUltraRestricted = isUltraRestricted;
    return this;
  }

   /**
   * Get isUltraRestricted
   * @return isUltraRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsUltraRestricted() {
    return isUltraRestricted;
  }


  public void setIsUltraRestricted(Boolean isUltraRestricted) {
    
    
    
    this.isUltraRestricted = isUltraRestricted;
  }


  public ObjsUserInner locale(String locale) {
    
    
    
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    
    
    
    this.locale = locale;
  }


  public ObjsUserInner name(String name) {
    
    
    
    
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


  public ObjsUserInner presence(String presence) {
    
    
    
    
    this.presence = presence;
    return this;
  }

   /**
   * Get presence
   * @return presence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPresence() {
    return presence;
  }


  public void setPresence(String presence) {
    
    
    
    this.presence = presence;
  }


  public ObjsUserInner profile(UserProfileObjectProperty profile) {
    
    
    
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserProfileObjectProperty getProfile() {
    return profile;
  }


  public void setProfile(UserProfileObjectProperty profile) {
    
    
    
    this.profile = profile;
  }


  public ObjsUserInner realName(String realName) {
    
    
    
    
    this.realName = realName;
    return this;
  }

   /**
   * Get realName
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    
    
    
    this.realName = realName;
  }


  public ObjsUserInner team(String team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    
    
    
    this.team = team;
  }


  public ObjsUserInner teamId(String teamId) {
    
    
    
    
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    
    
    
    this.teamId = teamId;
  }


  public ObjsUserInner teamProfile(ObjsUserInnerTeamProfile teamProfile) {
    
    
    
    
    this.teamProfile = teamProfile;
    return this;
  }

   /**
   * Get teamProfile
   * @return teamProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsUserInnerTeamProfile getTeamProfile() {
    return teamProfile;
  }


  public void setTeamProfile(ObjsUserInnerTeamProfile teamProfile) {
    
    
    
    this.teamProfile = teamProfile;
  }


  public ObjsUserInner twoFactorType(String twoFactorType) {
    
    
    
    
    this.twoFactorType = twoFactorType;
    return this;
  }

   /**
   * Get twoFactorType
   * @return twoFactorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTwoFactorType() {
    return twoFactorType;
  }


  public void setTwoFactorType(String twoFactorType) {
    
    
    
    this.twoFactorType = twoFactorType;
  }


  public ObjsUserInner tz(Object tz) {
    
    
    
    
    this.tz = tz;
    return this;
  }

   /**
   * Get tz
   * @return tz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTz() {
    return tz;
  }


  public void setTz(Object tz) {
    
    
    
    this.tz = tz;
  }


  public ObjsUserInner tzLabel(String tzLabel) {
    
    
    
    
    this.tzLabel = tzLabel;
    return this;
  }

   /**
   * Get tzLabel
   * @return tzLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTzLabel() {
    return tzLabel;
  }


  public void setTzLabel(String tzLabel) {
    
    
    
    this.tzLabel = tzLabel;
  }


  public ObjsUserInner tzOffset(Double tzOffset) {
    
    
    
    
    this.tzOffset = tzOffset;
    return this;
  }

  public ObjsUserInner tzOffset(Integer tzOffset) {
    
    
    
    
    this.tzOffset = tzOffset.doubleValue();
    return this;
  }

   /**
   * Get tzOffset
   * @return tzOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTzOffset() {
    return tzOffset;
  }


  public void setTzOffset(Double tzOffset) {
    
    
    
    this.tzOffset = tzOffset;
  }


  public ObjsUserInner updated(Double updated) {
    
    
    
    
    this.updated = updated;
    return this;
  }

  public ObjsUserInner updated(Integer updated) {
    
    
    
    
    this.updated = updated.doubleValue();
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getUpdated() {
    return updated;
  }


  public void setUpdated(Double updated) {
    
    
    
    this.updated = updated;
  }


  public ObjsUserInner teams(Set<String> teams) {
    
    
    
    
    this.teams = teams;
    return this;
  }

  public ObjsUserInner addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new LinkedHashSet<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTeams() {
    return teams;
  }


  public void setTeams(Set<String> teams) {
    
    
    
    this.teams = teams;
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
   * @return the ObjsUserInner instance itself
   */
  public ObjsUserInner putAdditionalProperty(String key, Object value) {
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
    ObjsUserInner objsUserInner = (ObjsUserInner) o;
    return Objects.equals(this.color, objsUserInner.color) &&
        Objects.equals(this.deleted, objsUserInner.deleted) &&
        Objects.equals(this.enterpriseUser, objsUserInner.enterpriseUser) &&
        Objects.equals(this.has2fa, objsUserInner.has2fa) &&
        Objects.equals(this.id, objsUserInner.id) &&
        Objects.equals(this.isAdmin, objsUserInner.isAdmin) &&
        Objects.equals(this.isAppUser, objsUserInner.isAppUser) &&
        Objects.equals(this.isBot, objsUserInner.isBot) &&
        Objects.equals(this.isExternal, objsUserInner.isExternal) &&
        Objects.equals(this.isForgotten, objsUserInner.isForgotten) &&
        Objects.equals(this.isInvitedUser, objsUserInner.isInvitedUser) &&
        Objects.equals(this.isOwner, objsUserInner.isOwner) &&
        Objects.equals(this.isPrimaryOwner, objsUserInner.isPrimaryOwner) &&
        Objects.equals(this.isRestricted, objsUserInner.isRestricted) &&
        Objects.equals(this.isStranger, objsUserInner.isStranger) &&
        Objects.equals(this.isUltraRestricted, objsUserInner.isUltraRestricted) &&
        Objects.equals(this.locale, objsUserInner.locale) &&
        Objects.equals(this.name, objsUserInner.name) &&
        Objects.equals(this.presence, objsUserInner.presence) &&
        Objects.equals(this.profile, objsUserInner.profile) &&
        Objects.equals(this.realName, objsUserInner.realName) &&
        Objects.equals(this.team, objsUserInner.team) &&
        Objects.equals(this.teamId, objsUserInner.teamId) &&
        Objects.equals(this.teamProfile, objsUserInner.teamProfile) &&
        Objects.equals(this.twoFactorType, objsUserInner.twoFactorType) &&
        Objects.equals(this.tz, objsUserInner.tz) &&
        Objects.equals(this.tzLabel, objsUserInner.tzLabel) &&
        Objects.equals(this.tzOffset, objsUserInner.tzOffset) &&
        Objects.equals(this.updated, objsUserInner.updated) &&
        Objects.equals(this.teams, objsUserInner.teams)&&
        Objects.equals(this.additionalProperties, objsUserInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, deleted, enterpriseUser, has2fa, id, isAdmin, isAppUser, isBot, isExternal, isForgotten, isInvitedUser, isOwner, isPrimaryOwner, isRestricted, isStranger, isUltraRestricted, locale, name, presence, profile, realName, team, teamId, teamProfile, twoFactorType, tz, tzLabel, tzOffset, updated, teams, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjsUserInner {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enterpriseUser: ").append(toIndentedString(enterpriseUser)).append("\n");
    sb.append("    has2fa: ").append(toIndentedString(has2fa)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isAppUser: ").append(toIndentedString(isAppUser)).append("\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    isForgotten: ").append(toIndentedString(isForgotten)).append("\n");
    sb.append("    isInvitedUser: ").append(toIndentedString(isInvitedUser)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isPrimaryOwner: ").append(toIndentedString(isPrimaryOwner)).append("\n");
    sb.append("    isRestricted: ").append(toIndentedString(isRestricted)).append("\n");
    sb.append("    isStranger: ").append(toIndentedString(isStranger)).append("\n");
    sb.append("    isUltraRestricted: ").append(toIndentedString(isUltraRestricted)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamProfile: ").append(toIndentedString(teamProfile)).append("\n");
    sb.append("    twoFactorType: ").append(toIndentedString(twoFactorType)).append("\n");
    sb.append("    tz: ").append(toIndentedString(tz)).append("\n");
    sb.append("    tzLabel: ").append(toIndentedString(tzLabel)).append("\n");
    sb.append("    tzOffset: ").append(toIndentedString(tzOffset)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
    openapiFields.add("color");
    openapiFields.add("deleted");
    openapiFields.add("enterprise_user");
    openapiFields.add("has_2fa");
    openapiFields.add("id");
    openapiFields.add("is_admin");
    openapiFields.add("is_app_user");
    openapiFields.add("is_bot");
    openapiFields.add("is_external");
    openapiFields.add("is_forgotten");
    openapiFields.add("is_invited_user");
    openapiFields.add("is_owner");
    openapiFields.add("is_primary_owner");
    openapiFields.add("is_restricted");
    openapiFields.add("is_stranger");
    openapiFields.add("is_ultra_restricted");
    openapiFields.add("locale");
    openapiFields.add("name");
    openapiFields.add("presence");
    openapiFields.add("profile");
    openapiFields.add("real_name");
    openapiFields.add("team");
    openapiFields.add("team_id");
    openapiFields.add("team_profile");
    openapiFields.add("two_factor_type");
    openapiFields.add("tz");
    openapiFields.add("tz_label");
    openapiFields.add("tz_offset");
    openapiFields.add("updated");
    openapiFields.add("teams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("is_app_user");
    openapiRequiredFields.add("is_bot");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("profile");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjsUserInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjsUserInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjsUserInner is not found in the empty JSON string", ObjsUserInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ObjsUserInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the optional field `enterprise_user`
      if (jsonObj.get("enterprise_user") != null && !jsonObj.get("enterprise_user").isJsonNull()) {
        ObjsUserInnerEnterpriseUser.validateJsonObject(jsonObj.getAsJsonObject("enterprise_user"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("presence") != null && !jsonObj.get("presence").isJsonNull()) && !jsonObj.get("presence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presence").toString()));
      }
      // validate the required field `profile`
      UserProfileObjectProperty.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      if ((jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonNull()) && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      if ((jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) && !jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
      if ((jsonObj.get("team_id") != null && !jsonObj.get("team_id").isJsonNull()) && !jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
      // validate the optional field `team_profile`
      if (jsonObj.get("team_profile") != null && !jsonObj.get("team_profile").isJsonNull()) {
        ObjsUserInnerTeamProfile.validateJsonObject(jsonObj.getAsJsonObject("team_profile"));
      }
      if ((jsonObj.get("two_factor_type") != null && !jsonObj.get("two_factor_type").isJsonNull()) && !jsonObj.get("two_factor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `two_factor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("two_factor_type").toString()));
      }
      if ((jsonObj.get("tz_label") != null && !jsonObj.get("tz_label").isJsonNull()) && !jsonObj.get("tz_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tz_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tz_label").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjsUserInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjsUserInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjsUserInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjsUserInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjsUserInner>() {
           @Override
           public void write(JsonWriter out, ObjsUserInner value) throws IOException {
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
           public ObjsUserInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ObjsUserInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ObjsUserInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjsUserInner
  * @throws IOException if the JSON string is invalid with respect to ObjsUserInner
  */
  public static ObjsUserInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjsUserInner.class);
  }

 /**
  * Convert an instance of ObjsUserInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
