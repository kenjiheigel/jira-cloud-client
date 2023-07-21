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
import io.swagger.client.model.ProjectIssueTypes;
import io.swagger.client.model.WorkflowLayout;
import io.swagger.client.model.WorkflowReferenceStatus;
import io.swagger.client.model.WorkflowScope;
import io.swagger.client.model.WorkflowTransitions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of a workflow.
 */
@Schema(description = "Details of a workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class JiraWorkflow {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isEditable")
  private Boolean isEditable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scope")
  private WorkflowScope scope = null;

  @SerializedName("startPointLayout")
  private WorkflowLayout startPointLayout = null;

  @SerializedName("statuses")
  private List<WorkflowReferenceStatus> statuses = null;

  @SerializedName("taskId")
  private String taskId = null;

  @SerializedName("transitions")
  private List<WorkflowTransitions> transitions = null;

  @SerializedName("usages")
  private List<ProjectIssueTypes> usages = null;

  @SerializedName("version")
  private DocumentVersion version = null;

  public JiraWorkflow description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow.
   * @return description
  **/
  @Schema(description = "The description of the workflow.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JiraWorkflow id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the workflow.
   * @return id
  **/
  @Schema(description = "The ID of the workflow.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JiraWorkflow isEditable(Boolean isEditable) {
    this.isEditable = isEditable;
    return this;
  }

   /**
   * Indicates if the workflow can be edited.
   * @return isEditable
  **/
  @Schema(description = "Indicates if the workflow can be edited.")
  public Boolean isIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }

  public JiraWorkflow name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow.
   * @return name
  **/
  @Schema(description = "The name of the workflow.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraWorkflow scope(WorkflowScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public WorkflowScope getScope() {
    return scope;
  }

  public void setScope(WorkflowScope scope) {
    this.scope = scope;
  }

  public JiraWorkflow startPointLayout(WorkflowLayout startPointLayout) {
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

  public JiraWorkflow statuses(List<WorkflowReferenceStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public JiraWorkflow addStatusesItem(WorkflowReferenceStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<WorkflowReferenceStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses referenced in this workflow.
   * @return statuses
  **/
  @Schema(description = "The statuses referenced in this workflow.")
  public List<WorkflowReferenceStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<WorkflowReferenceStatus> statuses) {
    this.statuses = statuses;
  }

  public JiraWorkflow taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * If there is a current [asynchronous task](#async-operations) operation for this workflow.
   * @return taskId
  **/
  @Schema(description = "If there is a current [asynchronous task](#async-operations) operation for this workflow.")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public JiraWorkflow transitions(List<WorkflowTransitions> transitions) {
    this.transitions = transitions;
    return this;
  }

  public JiraWorkflow addTransitionsItem(WorkflowTransitions transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<WorkflowTransitions>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The transitions of the workflow.
   * @return transitions
  **/
  @Schema(description = "The transitions of the workflow.")
  public List<WorkflowTransitions> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<WorkflowTransitions> transitions) {
    this.transitions = transitions;
  }

  public JiraWorkflow usages(List<ProjectIssueTypes> usages) {
    this.usages = usages;
    return this;
  }

  public JiraWorkflow addUsagesItem(ProjectIssueTypes usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<ProjectIssueTypes>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * The &#x60;workflows.usages&#x60; expand is an optional parameter that can be used when reading and updating workflows in Jira. It provides additional information about the projects and issue types associated with the requested workflows.
   * @return usages
  **/
  @Schema(description = "The `workflows.usages` expand is an optional parameter that can be used when reading and updating workflows in Jira. It provides additional information about the projects and issue types associated with the requested workflows.")
  public List<ProjectIssueTypes> getUsages() {
    return usages;
  }

  public void setUsages(List<ProjectIssueTypes> usages) {
    this.usages = usages;
  }

  public JiraWorkflow version(DocumentVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
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
    JiraWorkflow jiraWorkflow = (JiraWorkflow) o;
    return Objects.equals(this.description, jiraWorkflow.description) &&
        Objects.equals(this.id, jiraWorkflow.id) &&
        Objects.equals(this.isEditable, jiraWorkflow.isEditable) &&
        Objects.equals(this.name, jiraWorkflow.name) &&
        Objects.equals(this.scope, jiraWorkflow.scope) &&
        Objects.equals(this.startPointLayout, jiraWorkflow.startPointLayout) &&
        Objects.equals(this.statuses, jiraWorkflow.statuses) &&
        Objects.equals(this.taskId, jiraWorkflow.taskId) &&
        Objects.equals(this.transitions, jiraWorkflow.transitions) &&
        Objects.equals(this.usages, jiraWorkflow.usages) &&
        Objects.equals(this.version, jiraWorkflow.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isEditable, name, scope, startPointLayout, statuses, taskId, transitions, usages, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraWorkflow {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    startPointLayout: ").append(toIndentedString(startPointLayout)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
