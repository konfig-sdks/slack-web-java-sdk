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
 * ChatScheduleMessageRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChatScheduleMessageRequest {
  public static final String SERIALIZED_NAME_AS_USER = "as_user";
  @SerializedName(SERIALIZED_NAME_AS_USER)
  private Boolean asUser;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private String attachments;

  public static final String SERIALIZED_NAME_BLOCKS = "blocks";
  @SerializedName(SERIALIZED_NAME_BLOCKS)
  private String blocks;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_LINK_NAMES = "link_names";
  @SerializedName(SERIALIZED_NAME_LINK_NAMES)
  private Boolean linkNames;

  public static final String SERIALIZED_NAME_PARSE = "parse";
  @SerializedName(SERIALIZED_NAME_PARSE)
  private String parse;

  public static final String SERIALIZED_NAME_POST_AT = "post_at";
  @SerializedName(SERIALIZED_NAME_POST_AT)
  private String postAt;

  public static final String SERIALIZED_NAME_REPLY_BROADCAST = "reply_broadcast";
  @SerializedName(SERIALIZED_NAME_REPLY_BROADCAST)
  private Boolean replyBroadcast;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_THREAD_TS = "thread_ts";
  @SerializedName(SERIALIZED_NAME_THREAD_TS)
  private Double threadTs;

  public static final String SERIALIZED_NAME_UNFURL_LINKS = "unfurl_links";
  @SerializedName(SERIALIZED_NAME_UNFURL_LINKS)
  private Boolean unfurlLinks;

  public static final String SERIALIZED_NAME_UNFURL_MEDIA = "unfurl_media";
  @SerializedName(SERIALIZED_NAME_UNFURL_MEDIA)
  private Boolean unfurlMedia;

  public ChatScheduleMessageRequest() {
  }

  public ChatScheduleMessageRequest asUser(Boolean asUser) {
    
    
    
    
    this.asUser = asUser;
    return this;
  }

   /**
   * Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship).
   * @return asUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship).")

  public Boolean getAsUser() {
    return asUser;
  }


  public void setAsUser(Boolean asUser) {
    
    
    
    this.asUser = asUser;
  }


  public ChatScheduleMessageRequest attachments(String attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

   /**
   * A JSON-based array of structured attachments, presented as a URL-encoded string.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON-based array of structured attachments, presented as a URL-encoded string.")

  public String getAttachments() {
    return attachments;
  }


  public void setAttachments(String attachments) {
    
    
    
    this.attachments = attachments;
  }


  public ChatScheduleMessageRequest blocks(String blocks) {
    
    
    
    
    this.blocks = blocks;
    return this;
  }

   /**
   * A JSON-based array of structured blocks, presented as a URL-encoded string.
   * @return blocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON-based array of structured blocks, presented as a URL-encoded string.")

  public String getBlocks() {
    return blocks;
  }


  public void setBlocks(String blocks) {
    
    
    
    this.blocks = blocks;
  }


  public ChatScheduleMessageRequest channel(String channel) {
    
    
    
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details.
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details.")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    
    
    
    this.channel = channel;
  }


  public ChatScheduleMessageRequest linkNames(Boolean linkNames) {
    
    
    
    
    this.linkNames = linkNames;
    return this;
  }

   /**
   * Find and link channel names and usernames.
   * @return linkNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Find and link channel names and usernames.")

  public Boolean getLinkNames() {
    return linkNames;
  }


  public void setLinkNames(Boolean linkNames) {
    
    
    
    this.linkNames = linkNames;
  }


  public ChatScheduleMessageRequest parse(String parse) {
    
    
    
    
    this.parse = parse;
    return this;
  }

   /**
   * Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting).
   * @return parse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Change how messages are treated. Defaults to `none`. See [chat.postMessage](chat.postMessage#formatting).")

  public String getParse() {
    return parse;
  }


  public void setParse(String parse) {
    
    
    
    this.parse = parse;
  }


  public ChatScheduleMessageRequest postAt(String postAt) {
    
    
    
    
    this.postAt = postAt;
    return this;
  }

   /**
   * Unix EPOCH timestamp of time in future to send the message.
   * @return postAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix EPOCH timestamp of time in future to send the message.")

  public String getPostAt() {
    return postAt;
  }


  public void setPostAt(String postAt) {
    
    
    
    this.postAt = postAt;
  }


  public ChatScheduleMessageRequest replyBroadcast(Boolean replyBroadcast) {
    
    
    
    
    this.replyBroadcast = replyBroadcast;
    return this;
  }

   /**
   * Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;.
   * @return replyBroadcast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.")

  public Boolean getReplyBroadcast() {
    return replyBroadcast;
  }


  public void setReplyBroadcast(Boolean replyBroadcast) {
    
    
    
    this.replyBroadcast = replyBroadcast;
  }


  public ChatScheduleMessageRequest text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public ChatScheduleMessageRequest threadTs(Double threadTs) {
    
    
    
    
    this.threadTs = threadTs;
    return this;
  }

  public ChatScheduleMessageRequest threadTs(Integer threadTs) {
    
    
    
    
    this.threadTs = threadTs.doubleValue();
    return this;
  }

   /**
   * Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead.
   * @return threadTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.")

  public Double getThreadTs() {
    return threadTs;
  }


  public void setThreadTs(Double threadTs) {
    
    
    
    this.threadTs = threadTs;
  }


  public ChatScheduleMessageRequest unfurlLinks(Boolean unfurlLinks) {
    
    
    
    
    this.unfurlLinks = unfurlLinks;
    return this;
  }

   /**
   * Pass true to enable unfurling of primarily text-based content.
   * @return unfurlLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pass true to enable unfurling of primarily text-based content.")

  public Boolean getUnfurlLinks() {
    return unfurlLinks;
  }


  public void setUnfurlLinks(Boolean unfurlLinks) {
    
    
    
    this.unfurlLinks = unfurlLinks;
  }


  public ChatScheduleMessageRequest unfurlMedia(Boolean unfurlMedia) {
    
    
    
    
    this.unfurlMedia = unfurlMedia;
    return this;
  }

   /**
   * Pass false to disable unfurling of media content.
   * @return unfurlMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pass false to disable unfurling of media content.")

  public Boolean getUnfurlMedia() {
    return unfurlMedia;
  }


  public void setUnfurlMedia(Boolean unfurlMedia) {
    
    
    
    this.unfurlMedia = unfurlMedia;
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
   * @return the ChatScheduleMessageRequest instance itself
   */
  public ChatScheduleMessageRequest putAdditionalProperty(String key, Object value) {
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
    ChatScheduleMessageRequest chatScheduleMessageRequest = (ChatScheduleMessageRequest) o;
    return Objects.equals(this.asUser, chatScheduleMessageRequest.asUser) &&
        Objects.equals(this.attachments, chatScheduleMessageRequest.attachments) &&
        Objects.equals(this.blocks, chatScheduleMessageRequest.blocks) &&
        Objects.equals(this.channel, chatScheduleMessageRequest.channel) &&
        Objects.equals(this.linkNames, chatScheduleMessageRequest.linkNames) &&
        Objects.equals(this.parse, chatScheduleMessageRequest.parse) &&
        Objects.equals(this.postAt, chatScheduleMessageRequest.postAt) &&
        Objects.equals(this.replyBroadcast, chatScheduleMessageRequest.replyBroadcast) &&
        Objects.equals(this.text, chatScheduleMessageRequest.text) &&
        Objects.equals(this.threadTs, chatScheduleMessageRequest.threadTs) &&
        Objects.equals(this.unfurlLinks, chatScheduleMessageRequest.unfurlLinks) &&
        Objects.equals(this.unfurlMedia, chatScheduleMessageRequest.unfurlMedia)&&
        Objects.equals(this.additionalProperties, chatScheduleMessageRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asUser, attachments, blocks, channel, linkNames, parse, postAt, replyBroadcast, text, threadTs, unfurlLinks, unfurlMedia, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatScheduleMessageRequest {\n");
    sb.append("    asUser: ").append(toIndentedString(asUser)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    linkNames: ").append(toIndentedString(linkNames)).append("\n");
    sb.append("    parse: ").append(toIndentedString(parse)).append("\n");
    sb.append("    postAt: ").append(toIndentedString(postAt)).append("\n");
    sb.append("    replyBroadcast: ").append(toIndentedString(replyBroadcast)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    threadTs: ").append(toIndentedString(threadTs)).append("\n");
    sb.append("    unfurlLinks: ").append(toIndentedString(unfurlLinks)).append("\n");
    sb.append("    unfurlMedia: ").append(toIndentedString(unfurlMedia)).append("\n");
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
    openapiFields.add("as_user");
    openapiFields.add("attachments");
    openapiFields.add("blocks");
    openapiFields.add("channel");
    openapiFields.add("link_names");
    openapiFields.add("parse");
    openapiFields.add("post_at");
    openapiFields.add("reply_broadcast");
    openapiFields.add("text");
    openapiFields.add("thread_ts");
    openapiFields.add("unfurl_links");
    openapiFields.add("unfurl_media");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChatScheduleMessageRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChatScheduleMessageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatScheduleMessageRequest is not found in the empty JSON string", ChatScheduleMessageRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) && !jsonObj.get("attachments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }
      if ((jsonObj.get("blocks") != null && !jsonObj.get("blocks").isJsonNull()) && !jsonObj.get("blocks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blocks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blocks").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("parse") != null && !jsonObj.get("parse").isJsonNull()) && !jsonObj.get("parse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parse").toString()));
      }
      if ((jsonObj.get("post_at") != null && !jsonObj.get("post_at").isJsonNull()) && !jsonObj.get("post_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `post_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("post_at").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatScheduleMessageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatScheduleMessageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatScheduleMessageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatScheduleMessageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatScheduleMessageRequest>() {
           @Override
           public void write(JsonWriter out, ChatScheduleMessageRequest value) throws IOException {
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
           public ChatScheduleMessageRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChatScheduleMessageRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChatScheduleMessageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatScheduleMessageRequest
  * @throws IOException if the JSON string is invalid with respect to ChatScheduleMessageRequest
  */
  public static ChatScheduleMessageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatScheduleMessageRequest.class);
  }

 /**
  * Convert an instance of ChatScheduleMessageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

