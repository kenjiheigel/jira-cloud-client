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
import java.util.UUID;
/**
 * Details about an issue type.
 */
@Schema(description = "Details about an issue type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueTypeDetails {
  @SerializedName("avatarId")
  private Long avatarId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("entityId")
  private UUID entityId = null;

  @SerializedName("hierarchyLevel")
  private Integer hierarchyLevel = null;

  @SerializedName("iconUrl")
  private String iconUrl = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scope")
  private AllOfIssueTypeDetailsScope scope = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("subtask")
  private Boolean subtask = null;

   /**
   * The ID of the issue type&#x27;s avatar.
   * @return avatarId
  **/
  @Schema(description = "The ID of the issue type's avatar.")
  public Long getAvatarId() {
    return avatarId;
  }

   /**
   * The description of the issue type.
   * @return description
  **/
  @Schema(description = "The description of the issue type.")
  public String getDescription() {
    return description;
  }

   /**
   * Unique ID for next-gen projects.
   * @return entityId
  **/
  @Schema(description = "Unique ID for next-gen projects.")
  public UUID getEntityId() {
    return entityId;
  }

   /**
   * Hierarchy level of the issue type.
   * @return hierarchyLevel
  **/
  @Schema(description = "Hierarchy level of the issue type.")
  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }

   /**
   * The URL of the issue type&#x27;s avatar.
   * @return iconUrl
  **/
  @Schema(description = "The URL of the issue type's avatar.")
  public String getIconUrl() {
    return iconUrl;
  }

   /**
   * The ID of the issue type.
   * @return id
  **/
  @Schema(description = "The ID of the issue type.")
  public String getId() {
    return id;
  }

   /**
   * The name of the issue type.
   * @return name
  **/
  @Schema(description = "The name of the issue type.")
  public String getName() {
    return name;
  }

   /**
   * Details of the next-gen projects the issue type is available in.
   * @return scope
  **/
  @Schema(description = "Details of the next-gen projects the issue type is available in.")
  public AllOfIssueTypeDetailsScope getScope() {
    return scope;
  }

   /**
   * The URL of these issue type details.
   * @return self
  **/
  @Schema(description = "The URL of these issue type details.")
  public String getSelf() {
    return self;
  }

   /**
   * Whether this issue type is used to create subtasks.
   * @return subtask
  **/
  @Schema(description = "Whether this issue type is used to create subtasks.")
  public Boolean isSubtask() {
    return subtask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeDetails issueTypeDetails = (IssueTypeDetails) o;
    return Objects.equals(this.avatarId, issueTypeDetails.avatarId) &&
        Objects.equals(this.description, issueTypeDetails.description) &&
        Objects.equals(this.entityId, issueTypeDetails.entityId) &&
        Objects.equals(this.hierarchyLevel, issueTypeDetails.hierarchyLevel) &&
        Objects.equals(this.iconUrl, issueTypeDetails.iconUrl) &&
        Objects.equals(this.id, issueTypeDetails.id) &&
        Objects.equals(this.name, issueTypeDetails.name) &&
        Objects.equals(this.scope, issueTypeDetails.scope) &&
        Objects.equals(this.self, issueTypeDetails.self) &&
        Objects.equals(this.subtask, issueTypeDetails.subtask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, description, entityId, hierarchyLevel, iconUrl, id, name, scope, self, subtask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeDetails {\n");
    
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
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