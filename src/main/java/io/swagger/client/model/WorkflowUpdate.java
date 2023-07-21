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
import io.swagger.client.model.DocumentVersion;
import io.swagger.client.model.StatusLayoutUpdate;
import io.swagger.client.model.StatusMappingDTO;
import io.swagger.client.model.StatusMigration;
import io.swagger.client.model.TransitionUpdateDTO;
import io.swagger.client.model.WorkflowLayout;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The details of the workflows to update.
 */
@Schema(description = "The details of the workflows to update.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class WorkflowUpdate extends HashMap<String, Object> {
  @SerializedName("defaultStatusMappings")
  private List<StatusMigration> defaultStatusMappings = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("startPointLayout")
  private WorkflowLayout startPointLayout = null;

  @SerializedName("statusMappings")
  private List<StatusMappingDTO> statusMappings = null;

  @SerializedName("statuses")
  private List<StatusLayoutUpdate> statuses = new ArrayList<StatusLayoutUpdate>();

  @SerializedName("transitions")
  private List<TransitionUpdateDTO> transitions = new ArrayList<TransitionUpdateDTO>();

  @SerializedName("version")
  private DocumentVersion version = null;

  public WorkflowUpdate defaultStatusMappings(List<StatusMigration> defaultStatusMappings) {
    this.defaultStatusMappings = defaultStatusMappings;
    return this;
  }

  public WorkflowUpdate addDefaultStatusMappingsItem(StatusMigration defaultStatusMappingsItem) {
    if (this.defaultStatusMappings == null) {
      this.defaultStatusMappings = new ArrayList<StatusMigration>();
    }
    this.defaultStatusMappings.add(defaultStatusMappingsItem);
    return this;
  }

   /**
   * The mapping of old to new status ID.
   * @return defaultStatusMappings
  **/
  @Schema(description = "The mapping of old to new status ID.")
  public List<StatusMigration> getDefaultStatusMappings() {
    return defaultStatusMappings;
  }

  public void setDefaultStatusMappings(List<StatusMigration> defaultStatusMappings) {
    this.defaultStatusMappings = defaultStatusMappings;
  }

  public WorkflowUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The new description for this workflow.
   * @return description
  **/
  @Schema(description = "The new description for this workflow.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkflowUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this workflow.
   * @return id
  **/
  @Schema(required = true, description = "The ID of this workflow.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowUpdate startPointLayout(WorkflowLayout startPointLayout) {
    this.startPointLayout = startPointLayout;
    return this;
  }

   /**
   * Get startPointLayout
   * @return startPointLayout
  **/
  @Schema(description = "")
  public WorkflowLayout getStartPointLayout() {
    return startPointLayout;
  }

  public void setStartPointLayout(WorkflowLayout startPointLayout) {
    this.startPointLayout = startPointLayout;
  }

  public WorkflowUpdate statusMappings(List<StatusMappingDTO> statusMappings) {
    this.statusMappings = statusMappings;
    return this;
  }

  public WorkflowUpdate addStatusMappingsItem(StatusMappingDTO statusMappingsItem) {
    if (this.statusMappings == null) {
      this.statusMappings = new ArrayList<StatusMappingDTO>();
    }
    this.statusMappings.add(statusMappingsItem);
    return this;
  }

   /**
   * The mapping of old to new status ID for a specific project and issue type.
   * @return statusMappings
  **/
  @Schema(description = "The mapping of old to new status ID for a specific project and issue type.")
  public List<StatusMappingDTO> getStatusMappings() {
    return statusMappings;
  }

  public void setStatusMappings(List<StatusMappingDTO> statusMappings) {
    this.statusMappings = statusMappings;
  }

  public WorkflowUpdate statuses(List<StatusLayoutUpdate> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowUpdate addStatusesItem(StatusLayoutUpdate statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses associated with this workflow.
   * @return statuses
  **/
  @Schema(required = true, description = "The statuses associated with this workflow.")
  public List<StatusLayoutUpdate> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusLayoutUpdate> statuses) {
    this.statuses = statuses;
  }

  public WorkflowUpdate transitions(List<TransitionUpdateDTO> transitions) {
    this.transitions = transitions;
    return this;
  }

  public WorkflowUpdate addTransitionsItem(TransitionUpdateDTO transitionsItem) {
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The transitions of this workflow.
   * @return transitions
  **/
  @Schema(required = true, description = "The transitions of this workflow.")
  public List<TransitionUpdateDTO> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<TransitionUpdateDTO> transitions) {
    this.transitions = transitions;
  }

  public WorkflowUpdate version(DocumentVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public DocumentVersion getVersion() {
    return version;
  }

  public void setVersion(DocumentVersion version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowUpdate workflowUpdate = (WorkflowUpdate) o;
    return Objects.equals(this.defaultStatusMappings, workflowUpdate.defaultStatusMappings) &&
        Objects.equals(this.description, workflowUpdate.description) &&
        Objects.equals(this.id, workflowUpdate.id) &&
        Objects.equals(this.startPointLayout, workflowUpdate.startPointLayout) &&
        Objects.equals(this.statusMappings, workflowUpdate.statusMappings) &&
        Objects.equals(this.statuses, workflowUpdate.statuses) &&
        Objects.equals(this.transitions, workflowUpdate.transitions) &&
        Objects.equals(this.version, workflowUpdate.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultStatusMappings, description, id, startPointLayout, statusMappings, statuses, transitions, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUpdate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultStatusMappings: ").append(toIndentedString(defaultStatusMappings)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startPointLayout: ").append(toIndentedString(startPointLayout)).append("\n");
    sb.append("    statusMappings: ").append(toIndentedString(statusMappings)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
