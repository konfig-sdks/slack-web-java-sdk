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
import com.konfigthis.client.model.ExternalOrgMigrationsProperty;
import com.konfigthis.client.model.TeamObjectPropertyIcon;
import com.konfigthis.client.model.TeamObjectPropertyPrimaryOwner;
import com.konfigthis.client.model.TeamObjectPropertySsoProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
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
 * TeamObjectProperty
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TeamObjectProperty {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_AVATAR_BASE_URL = "avatar_base_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_BASE_URL)
  private URI avatarBaseUrl;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_DATE_CREATE = "date_create";
  @SerializedName(SERIALIZED_NAME_DATE_CREATE)
  private Integer dateCreate;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DISCOVERABLE = "discoverable";
  @SerializedName(SERIALIZED_NAME_DISCOVERABLE)
  private Object discoverable = null;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_EMAIL_DOMAIN = "email_domain";
  @SerializedName(SERIALIZED_NAME_EMAIL_DOMAIN)
  private String emailDomain;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_ENTERPRISE_NAME = "enterprise_name";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_NAME)
  private String enterpriseName;

  public static final String SERIALIZED_NAME_EXTERNAL_ORG_MIGRATIONS = "external_org_migrations";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORG_MIGRATIONS)
  private ExternalOrgMigrationsProperty externalOrgMigrations;

  public static final String SERIALIZED_NAME_HAS_COMPLIANCE_EXPORT = "has_compliance_export";
  @SerializedName(SERIALIZED_NAME_HAS_COMPLIANCE_EXPORT)
  private Boolean hasComplianceExport;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private TeamObjectPropertyIcon icon;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_ASSIGNED = "is_assigned";
  @SerializedName(SERIALIZED_NAME_IS_ASSIGNED)
  private Boolean isAssigned;

  public static final String SERIALIZED_NAME_IS_ENTERPRISE = "is_enterprise";
  @SerializedName(SERIALIZED_NAME_IS_ENTERPRISE)
  private Integer isEnterprise;

  public static final String SERIALIZED_NAME_IS_OVER_STORAGE_LIMIT = "is_over_storage_limit";
  @SerializedName(SERIALIZED_NAME_IS_OVER_STORAGE_LIMIT)
  private Boolean isOverStorageLimit;

  public static final String SERIALIZED_NAME_LIMIT_TS = "limit_ts";
  @SerializedName(SERIALIZED_NAME_LIMIT_TS)
  private Integer limitTs;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_MESSAGES_COUNT = "messages_count";
  @SerializedName(SERIALIZED_NAME_MESSAGES_COUNT)
  private Integer messagesCount;

  public static final String SERIALIZED_NAME_MSG_EDIT_WINDOW_MINS = "msg_edit_window_mins";
  @SerializedName(SERIALIZED_NAME_MSG_EDIT_WINDOW_MINS)
  private Integer msgEditWindowMins;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OVER_INTEGRATIONS_LIMIT = "over_integrations_limit";
  @SerializedName(SERIALIZED_NAME_OVER_INTEGRATIONS_LIMIT)
  private Boolean overIntegrationsLimit;

  public static final String SERIALIZED_NAME_OVER_STORAGE_LIMIT = "over_storage_limit";
  @SerializedName(SERIALIZED_NAME_OVER_STORAGE_LIMIT)
  private Boolean overStorageLimit;

  public static final String SERIALIZED_NAME_PAY_PROD_CUR = "pay_prod_cur";
  @SerializedName(SERIALIZED_NAME_PAY_PROD_CUR)
  private String payProdCur;

  /**
   * Gets or Sets plan
   */
  @JsonAdapter(PlanEnum.Adapter.class)
 public enum PlanEnum {
    EMPTY(""),
    
    STD("std"),
    
    PLUS("plus"),
    
    COMPLIANCE("compliance"),
    
    ENTERPRISE("enterprise");

    private String value;

    PlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlanEnum fromValue(String value) {
      for (PlanEnum b : PlanEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlanEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlanEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private PlanEnum plan;

  public static final String SERIALIZED_NAME_PRIMARY_OWNER = "primary_owner";
  @SerializedName(SERIALIZED_NAME_PRIMARY_OWNER)
  private TeamObjectPropertyPrimaryOwner primaryOwner;

  public static final String SERIALIZED_NAME_SSO_PROVIDER = "sso_provider";
  @SerializedName(SERIALIZED_NAME_SSO_PROVIDER)
  private TeamObjectPropertySsoProvider ssoProvider;

  public TeamObjectProperty() {
  }

  public TeamObjectProperty description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TeamObjectProperty archived(Boolean archived) {
    
    
    
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    
    
    
    this.archived = archived;
  }


  public TeamObjectProperty avatarBaseUrl(URI avatarBaseUrl) {
    
    
    
    
    this.avatarBaseUrl = avatarBaseUrl;
    return this;
  }

   /**
   * Get avatarBaseUrl
   * @return avatarBaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getAvatarBaseUrl() {
    return avatarBaseUrl;
  }


  public void setAvatarBaseUrl(URI avatarBaseUrl) {
    
    
    
    this.avatarBaseUrl = avatarBaseUrl;
  }


  public TeamObjectProperty created(Integer created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreated() {
    return created;
  }


  public void setCreated(Integer created) {
    
    
    
    this.created = created;
  }


  public TeamObjectProperty dateCreate(Integer dateCreate) {
    
    
    
    
    this.dateCreate = dateCreate;
    return this;
  }

   /**
   * Get dateCreate
   * @return dateCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDateCreate() {
    return dateCreate;
  }


  public void setDateCreate(Integer dateCreate) {
    
    
    
    this.dateCreate = dateCreate;
  }


  public TeamObjectProperty deleted(Boolean deleted) {
    
    
    
    
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


  public TeamObjectProperty discoverable(Object discoverable) {
    
    
    
    
    this.discoverable = discoverable;
    return this;
  }

   /**
   * Get discoverable
   * @return discoverable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDiscoverable() {
    return discoverable;
  }


  public void setDiscoverable(Object discoverable) {
    
    
    
    this.discoverable = discoverable;
  }


  public TeamObjectProperty domain(String domain) {
    
    
    
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    
    
    
    this.domain = domain;
  }


  public TeamObjectProperty emailDomain(String emailDomain) {
    
    
    
    
    this.emailDomain = emailDomain;
    return this;
  }

   /**
   * Get emailDomain
   * @return emailDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmailDomain() {
    return emailDomain;
  }


  public void setEmailDomain(String emailDomain) {
    
    
    
    this.emailDomain = emailDomain;
  }


  public TeamObjectProperty enterpriseId(String enterpriseId) {
    
    
    
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * Get enterpriseId
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    
    
    
    this.enterpriseId = enterpriseId;
  }


  public TeamObjectProperty enterpriseName(String enterpriseName) {
    
    
    
    
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * Get enterpriseName
   * @return enterpriseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnterpriseName() {
    return enterpriseName;
  }


  public void setEnterpriseName(String enterpriseName) {
    
    
    
    this.enterpriseName = enterpriseName;
  }


  public TeamObjectProperty externalOrgMigrations(ExternalOrgMigrationsProperty externalOrgMigrations) {
    
    
    
    
    this.externalOrgMigrations = externalOrgMigrations;
    return this;
  }

   /**
   * Get externalOrgMigrations
   * @return externalOrgMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalOrgMigrationsProperty getExternalOrgMigrations() {
    return externalOrgMigrations;
  }


  public void setExternalOrgMigrations(ExternalOrgMigrationsProperty externalOrgMigrations) {
    
    
    
    this.externalOrgMigrations = externalOrgMigrations;
  }


  public TeamObjectProperty hasComplianceExport(Boolean hasComplianceExport) {
    
    
    
    
    this.hasComplianceExport = hasComplianceExport;
    return this;
  }

   /**
   * Get hasComplianceExport
   * @return hasComplianceExport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasComplianceExport() {
    return hasComplianceExport;
  }


  public void setHasComplianceExport(Boolean hasComplianceExport) {
    
    
    
    this.hasComplianceExport = hasComplianceExport;
  }


  public TeamObjectProperty icon(TeamObjectPropertyIcon icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TeamObjectPropertyIcon getIcon() {
    return icon;
  }


  public void setIcon(TeamObjectPropertyIcon icon) {
    
    
    
    this.icon = icon;
  }


  public TeamObjectProperty id(String id) {
    
    
    
    
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


  public TeamObjectProperty isAssigned(Boolean isAssigned) {
    
    
    
    
    this.isAssigned = isAssigned;
    return this;
  }

   /**
   * Get isAssigned
   * @return isAssigned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAssigned() {
    return isAssigned;
  }


  public void setIsAssigned(Boolean isAssigned) {
    
    
    
    this.isAssigned = isAssigned;
  }


  public TeamObjectProperty isEnterprise(Integer isEnterprise) {
    
    
    
    
    this.isEnterprise = isEnterprise;
    return this;
  }

   /**
   * Get isEnterprise
   * @return isEnterprise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIsEnterprise() {
    return isEnterprise;
  }


  public void setIsEnterprise(Integer isEnterprise) {
    
    
    
    this.isEnterprise = isEnterprise;
  }


  public TeamObjectProperty isOverStorageLimit(Boolean isOverStorageLimit) {
    
    
    
    
    this.isOverStorageLimit = isOverStorageLimit;
    return this;
  }

   /**
   * Get isOverStorageLimit
   * @return isOverStorageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOverStorageLimit() {
    return isOverStorageLimit;
  }


  public void setIsOverStorageLimit(Boolean isOverStorageLimit) {
    
    
    
    this.isOverStorageLimit = isOverStorageLimit;
  }


  public TeamObjectProperty limitTs(Integer limitTs) {
    
    
    
    
    this.limitTs = limitTs;
    return this;
  }

   /**
   * Get limitTs
   * @return limitTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLimitTs() {
    return limitTs;
  }


  public void setLimitTs(Integer limitTs) {
    
    
    
    this.limitTs = limitTs;
  }


  public TeamObjectProperty locale(String locale) {
    
    
    
    
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


  public TeamObjectProperty messagesCount(Integer messagesCount) {
    
    
    
    
    this.messagesCount = messagesCount;
    return this;
  }

   /**
   * Get messagesCount
   * @return messagesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMessagesCount() {
    return messagesCount;
  }


  public void setMessagesCount(Integer messagesCount) {
    
    
    
    this.messagesCount = messagesCount;
  }


  public TeamObjectProperty msgEditWindowMins(Integer msgEditWindowMins) {
    
    
    
    
    this.msgEditWindowMins = msgEditWindowMins;
    return this;
  }

   /**
   * Get msgEditWindowMins
   * @return msgEditWindowMins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMsgEditWindowMins() {
    return msgEditWindowMins;
  }


  public void setMsgEditWindowMins(Integer msgEditWindowMins) {
    
    
    
    this.msgEditWindowMins = msgEditWindowMins;
  }


  public TeamObjectProperty name(String name) {
    
    
    
    
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


  public TeamObjectProperty overIntegrationsLimit(Boolean overIntegrationsLimit) {
    
    
    
    
    this.overIntegrationsLimit = overIntegrationsLimit;
    return this;
  }

   /**
   * Get overIntegrationsLimit
   * @return overIntegrationsLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverIntegrationsLimit() {
    return overIntegrationsLimit;
  }


  public void setOverIntegrationsLimit(Boolean overIntegrationsLimit) {
    
    
    
    this.overIntegrationsLimit = overIntegrationsLimit;
  }


  public TeamObjectProperty overStorageLimit(Boolean overStorageLimit) {
    
    
    
    
    this.overStorageLimit = overStorageLimit;
    return this;
  }

   /**
   * Get overStorageLimit
   * @return overStorageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverStorageLimit() {
    return overStorageLimit;
  }


  public void setOverStorageLimit(Boolean overStorageLimit) {
    
    
    
    this.overStorageLimit = overStorageLimit;
  }


  public TeamObjectProperty payProdCur(String payProdCur) {
    
    
    
    
    this.payProdCur = payProdCur;
    return this;
  }

   /**
   * Get payProdCur
   * @return payProdCur
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayProdCur() {
    return payProdCur;
  }


  public void setPayProdCur(String payProdCur) {
    
    
    
    this.payProdCur = payProdCur;
  }


  public TeamObjectProperty plan(PlanEnum plan) {
    
    
    
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlanEnum getPlan() {
    return plan;
  }


  public void setPlan(PlanEnum plan) {
    
    
    
    this.plan = plan;
  }


  public TeamObjectProperty primaryOwner(TeamObjectPropertyPrimaryOwner primaryOwner) {
    
    
    
    
    this.primaryOwner = primaryOwner;
    return this;
  }

   /**
   * Get primaryOwner
   * @return primaryOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamObjectPropertyPrimaryOwner getPrimaryOwner() {
    return primaryOwner;
  }


  public void setPrimaryOwner(TeamObjectPropertyPrimaryOwner primaryOwner) {
    
    
    
    this.primaryOwner = primaryOwner;
  }


  public TeamObjectProperty ssoProvider(TeamObjectPropertySsoProvider ssoProvider) {
    
    
    
    
    this.ssoProvider = ssoProvider;
    return this;
  }

   /**
   * Get ssoProvider
   * @return ssoProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamObjectPropertySsoProvider getSsoProvider() {
    return ssoProvider;
  }


  public void setSsoProvider(TeamObjectPropertySsoProvider ssoProvider) {
    
    
    
    this.ssoProvider = ssoProvider;
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
   * @return the TeamObjectProperty instance itself
   */
  public TeamObjectProperty putAdditionalProperty(String key, Object value) {
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
    TeamObjectProperty teamObjectProperty = (TeamObjectProperty) o;
    return Objects.equals(this.description, teamObjectProperty.description) &&
        Objects.equals(this.archived, teamObjectProperty.archived) &&
        Objects.equals(this.avatarBaseUrl, teamObjectProperty.avatarBaseUrl) &&
        Objects.equals(this.created, teamObjectProperty.created) &&
        Objects.equals(this.dateCreate, teamObjectProperty.dateCreate) &&
        Objects.equals(this.deleted, teamObjectProperty.deleted) &&
        Objects.equals(this.discoverable, teamObjectProperty.discoverable) &&
        Objects.equals(this.domain, teamObjectProperty.domain) &&
        Objects.equals(this.emailDomain, teamObjectProperty.emailDomain) &&
        Objects.equals(this.enterpriseId, teamObjectProperty.enterpriseId) &&
        Objects.equals(this.enterpriseName, teamObjectProperty.enterpriseName) &&
        Objects.equals(this.externalOrgMigrations, teamObjectProperty.externalOrgMigrations) &&
        Objects.equals(this.hasComplianceExport, teamObjectProperty.hasComplianceExport) &&
        Objects.equals(this.icon, teamObjectProperty.icon) &&
        Objects.equals(this.id, teamObjectProperty.id) &&
        Objects.equals(this.isAssigned, teamObjectProperty.isAssigned) &&
        Objects.equals(this.isEnterprise, teamObjectProperty.isEnterprise) &&
        Objects.equals(this.isOverStorageLimit, teamObjectProperty.isOverStorageLimit) &&
        Objects.equals(this.limitTs, teamObjectProperty.limitTs) &&
        Objects.equals(this.locale, teamObjectProperty.locale) &&
        Objects.equals(this.messagesCount, teamObjectProperty.messagesCount) &&
        Objects.equals(this.msgEditWindowMins, teamObjectProperty.msgEditWindowMins) &&
        Objects.equals(this.name, teamObjectProperty.name) &&
        Objects.equals(this.overIntegrationsLimit, teamObjectProperty.overIntegrationsLimit) &&
        Objects.equals(this.overStorageLimit, teamObjectProperty.overStorageLimit) &&
        Objects.equals(this.payProdCur, teamObjectProperty.payProdCur) &&
        Objects.equals(this.plan, teamObjectProperty.plan) &&
        Objects.equals(this.primaryOwner, teamObjectProperty.primaryOwner) &&
        Objects.equals(this.ssoProvider, teamObjectProperty.ssoProvider)&&
        Objects.equals(this.additionalProperties, teamObjectProperty.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, archived, avatarBaseUrl, created, dateCreate, deleted, discoverable, domain, emailDomain, enterpriseId, enterpriseName, externalOrgMigrations, hasComplianceExport, icon, id, isAssigned, isEnterprise, isOverStorageLimit, limitTs, locale, messagesCount, msgEditWindowMins, name, overIntegrationsLimit, overStorageLimit, payProdCur, plan, primaryOwner, ssoProvider, additionalProperties);
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
    sb.append("class TeamObjectProperty {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    avatarBaseUrl: ").append(toIndentedString(avatarBaseUrl)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dateCreate: ").append(toIndentedString(dateCreate)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    discoverable: ").append(toIndentedString(discoverable)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    emailDomain: ").append(toIndentedString(emailDomain)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    externalOrgMigrations: ").append(toIndentedString(externalOrgMigrations)).append("\n");
    sb.append("    hasComplianceExport: ").append(toIndentedString(hasComplianceExport)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAssigned: ").append(toIndentedString(isAssigned)).append("\n");
    sb.append("    isEnterprise: ").append(toIndentedString(isEnterprise)).append("\n");
    sb.append("    isOverStorageLimit: ").append(toIndentedString(isOverStorageLimit)).append("\n");
    sb.append("    limitTs: ").append(toIndentedString(limitTs)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    messagesCount: ").append(toIndentedString(messagesCount)).append("\n");
    sb.append("    msgEditWindowMins: ").append(toIndentedString(msgEditWindowMins)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overIntegrationsLimit: ").append(toIndentedString(overIntegrationsLimit)).append("\n");
    sb.append("    overStorageLimit: ").append(toIndentedString(overStorageLimit)).append("\n");
    sb.append("    payProdCur: ").append(toIndentedString(payProdCur)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    primaryOwner: ").append(toIndentedString(primaryOwner)).append("\n");
    sb.append("    ssoProvider: ").append(toIndentedString(ssoProvider)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("archived");
    openapiFields.add("avatar_base_url");
    openapiFields.add("created");
    openapiFields.add("date_create");
    openapiFields.add("deleted");
    openapiFields.add("discoverable");
    openapiFields.add("domain");
    openapiFields.add("email_domain");
    openapiFields.add("enterprise_id");
    openapiFields.add("enterprise_name");
    openapiFields.add("external_org_migrations");
    openapiFields.add("has_compliance_export");
    openapiFields.add("icon");
    openapiFields.add("id");
    openapiFields.add("is_assigned");
    openapiFields.add("is_enterprise");
    openapiFields.add("is_over_storage_limit");
    openapiFields.add("limit_ts");
    openapiFields.add("locale");
    openapiFields.add("messages_count");
    openapiFields.add("msg_edit_window_mins");
    openapiFields.add("name");
    openapiFields.add("over_integrations_limit");
    openapiFields.add("over_storage_limit");
    openapiFields.add("pay_prod_cur");
    openapiFields.add("plan");
    openapiFields.add("primary_owner");
    openapiFields.add("sso_provider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("email_domain");
    openapiRequiredFields.add("icon");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamObjectProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamObjectProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamObjectProperty is not found in the empty JSON string", TeamObjectProperty.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamObjectProperty.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("avatar_base_url") != null && !jsonObj.get("avatar_base_url").isJsonNull()) && !jsonObj.get("avatar_base_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_base_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_base_url").toString()));
      }
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if (!jsonObj.get("email_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_domain").toString()));
      }
      if ((jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonNull()) && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if ((jsonObj.get("enterprise_name") != null && !jsonObj.get("enterprise_name").isJsonNull()) && !jsonObj.get("enterprise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_name").toString()));
      }
      // validate the optional field `external_org_migrations`
      if (jsonObj.get("external_org_migrations") != null && !jsonObj.get("external_org_migrations").isJsonNull()) {
        ExternalOrgMigrationsProperty.validateJsonObject(jsonObj.getAsJsonObject("external_org_migrations"));
      }
      // validate the required field `icon`
      TeamObjectPropertyIcon.validateJsonObject(jsonObj.getAsJsonObject("icon"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pay_prod_cur") != null && !jsonObj.get("pay_prod_cur").isJsonNull()) && !jsonObj.get("pay_prod_cur").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_prod_cur` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_prod_cur").toString()));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      // validate the optional field `primary_owner`
      if (jsonObj.get("primary_owner") != null && !jsonObj.get("primary_owner").isJsonNull()) {
        TeamObjectPropertyPrimaryOwner.validateJsonObject(jsonObj.getAsJsonObject("primary_owner"));
      }
      // validate the optional field `sso_provider`
      if (jsonObj.get("sso_provider") != null && !jsonObj.get("sso_provider").isJsonNull()) {
        TeamObjectPropertySsoProvider.validateJsonObject(jsonObj.getAsJsonObject("sso_provider"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamObjectProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamObjectProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamObjectProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamObjectProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamObjectProperty>() {
           @Override
           public void write(JsonWriter out, TeamObjectProperty value) throws IOException {
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
           public TeamObjectProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TeamObjectProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TeamObjectProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamObjectProperty
  * @throws IOException if the JSON string is invalid with respect to TeamObjectProperty
  */
  public static TeamObjectProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamObjectProperty.class);
  }

 /**
  * Convert an instance of TeamObjectProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

