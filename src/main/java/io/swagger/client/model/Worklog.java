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
import io.swagger.client.model.EntityProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Details of a worklog.
 */
@Schema(description = "Details of a worklog.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class Worklog extends HashMap<String, Object> {
  @SerializedName("author")
  private AllOfWorklogAuthor author = null;

  @SerializedName("comment")
  private Object comment = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("issueId")
  private String issueId = null;

  @SerializedName("properties")
  private List<EntityProperty> properties = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("started")
  private OffsetDateTime started = null;

  @SerializedName("timeSpent")
  private String timeSpent = null;

  @SerializedName("timeSpentSeconds")
  private Long timeSpentSeconds = null;

  @SerializedName("updateAuthor")
  private AllOfWorklogUpdateAuthor updateAuthor = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  @SerializedName("visibility")
  private AllOfWorklogVisibility visibility = null;

   /**
   * Details of the user who created the worklog.
   * @return author
  **/
  @Schema(description = "Details of the user who created the worklog.")
  public AllOfWorklogAuthor getAuthor() {
    return author;
  }

  public Worklog comment(Object comment) {
    this.comment = comment;
    return this;
  }

   /**
   * A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
   * @return comment
  **/
  @Schema(description = "A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.")
  public Object getComment() {
    return comment;
  }

  public void setComment(Object comment) {
    this.comment = comment;
  }

   /**
   * The datetime on which the worklog was created.
   * @return created
  **/
  @Schema(description = "The datetime on which the worklog was created.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The ID of the worklog record.
   * @return id
  **/
  @Schema(description = "The ID of the worklog record.")
  public String getId() {
    return id;
  }

   /**
   * The ID of the issue this worklog is for.
   * @return issueId
  **/
  @Schema(description = "The ID of the issue this worklog is for.")
  public String getIssueId() {
    return issueId;
  }

  public Worklog properties(List<EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Worklog addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<EntityProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Details of properties for the worklog. Optional when creating or updating a worklog.
   * @return properties
  **/
  @Schema(description = "Details of properties for the worklog. Optional when creating or updating a worklog.")
  public List<EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<EntityProperty> properties) {
    this.properties = properties;
  }

   /**
   * The URL of the worklog item.
   * @return self
  **/
  @Schema(description = "The URL of the worklog item.")
  public String getSelf() {
    return self;
  }

  public Worklog started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

   /**
   * The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
   * @return started
  **/
  @Schema(description = "The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.")
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public Worklog timeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

   /**
   * The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if &#x60;timeSpentSeconds&#x60; isn&#x27;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpentSecond&#x60; is provided.
   * @return timeSpent
  **/
  @Schema(description = "The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if `timeSpentSeconds` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpentSecond` is provided.")
  public String getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
  }

  public Worklog timeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
    return this;
  }

   /**
   * The time in seconds spent working on the issue. Required when creating a worklog if &#x60;timeSpent&#x60; isn&#x27;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpent&#x60; is provided.
   * @return timeSpentSeconds
  **/
  @Schema(description = "The time in seconds spent working on the issue. Required when creating a worklog if `timeSpent` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpent` is provided.")
  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
  }

  public void setTimeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
  }

   /**
   * Details of the user who last updated the worklog.
   * @return updateAuthor
  **/
  @Schema(description = "Details of the user who last updated the worklog.")
  public AllOfWorklogUpdateAuthor getUpdateAuthor() {
    return updateAuthor;
  }

   /**
   * The datetime on which the worklog was last updated.
   * @return updated
  **/
  @Schema(description = "The datetime on which the worklog was last updated.")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public Worklog visibility(AllOfWorklogVisibility visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Details about any restrictions in the visibility of the worklog. Optional when creating or updating a worklog.
   * @return visibility
  **/
  @Schema(description = "Details about any restrictions in the visibility of the worklog. Optional when creating or updating a worklog.")
  public AllOfWorklogVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(AllOfWorklogVisibility visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Worklog worklog = (Worklog) o;
    return Objects.equals(this.author, worklog.author) &&
        Objects.equals(this.comment, worklog.comment) &&
        Objects.equals(this.created, worklog.created) &&
        Objects.equals(this.id, worklog.id) &&
        Objects.equals(this.issueId, worklog.issueId) &&
        Objects.equals(this.properties, worklog.properties) &&
        Objects.equals(this.self, worklog.self) &&
        Objects.equals(this.started, worklog.started) &&
        Objects.equals(this.timeSpent, worklog.timeSpent) &&
        Objects.equals(this.timeSpentSeconds, worklog.timeSpentSeconds) &&
        Objects.equals(this.updateAuthor, worklog.updateAuthor) &&
        Objects.equals(this.updated, worklog.updated) &&
        Objects.equals(this.visibility, worklog.visibility) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, comment, created, id, issueId, properties, self, started, timeSpent, timeSpentSeconds, updateAuthor, updated, visibility, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Worklog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
    sb.append("    updateAuthor: ").append(toIndentedString(updateAuthor)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
