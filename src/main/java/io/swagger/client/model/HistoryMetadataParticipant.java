/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * Details of user or system associated with a issue history metadata item.
 */
@Schema(description = "Details of user or system associated with a issue history metadata item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class HistoryMetadataParticipant extends HashMap<String, Object> {
  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("displayNameKey")
  private String displayNameKey = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  public HistoryMetadataParticipant avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL to an avatar for the user or system associated with a history record.
   * @return avatarUrl
  **/
  @Schema(description = "The URL to an avatar for the user or system associated with a history record.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public HistoryMetadataParticipant displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the user or system associated with a history record.
   * @return displayName
  **/
  @Schema(description = "The display name of the user or system associated with a history record.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public HistoryMetadataParticipant displayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
    return this;
  }

   /**
   * The key of the display name of the user or system associated with a history record.
   * @return displayNameKey
  **/
  @Schema(description = "The key of the display name of the user or system associated with a history record.")
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  public HistoryMetadataParticipant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the user or system associated with a history record.
   * @return id
  **/
  @Schema(description = "The ID of the user or system associated with a history record.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoryMetadataParticipant type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the user or system associated with a history record.
   * @return type
  **/
  @Schema(description = "The type of the user or system associated with a history record.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoryMetadataParticipant url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the user or system associated with a history record.
   * @return url
  **/
  @Schema(description = "The URL of the user or system associated with a history record.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryMetadataParticipant historyMetadataParticipant = (HistoryMetadataParticipant) o;
    return Objects.equals(this.avatarUrl, historyMetadataParticipant.avatarUrl) &&
        Objects.equals(this.displayName, historyMetadataParticipant.displayName) &&
        Objects.equals(this.displayNameKey, historyMetadataParticipant.displayNameKey) &&
        Objects.equals(this.id, historyMetadataParticipant.id) &&
        Objects.equals(this.type, historyMetadataParticipant.type) &&
        Objects.equals(this.url, historyMetadataParticipant.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, displayName, displayNameKey, id, type, url, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadataParticipant {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameKey: ").append(toIndentedString(displayNameKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
