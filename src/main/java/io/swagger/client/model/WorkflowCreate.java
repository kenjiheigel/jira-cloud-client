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
import io.swagger.client.model.StatusLayoutUpdate;
import io.swagger.client.model.TransitionUpdateDTO;
import io.swagger.client.model.WorkflowLayout;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The details of the workflows to create.
 */
@Schema(description = "The details of the workflows to create.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class WorkflowCreate {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startPointLayout")
  private WorkflowLayout startPointLayout = null;

  @SerializedName("statuses")
  private List<StatusLayoutUpdate> statuses = new ArrayList<StatusLayoutUpdate>();

  @SerializedName("transitions")
  private List<TransitionUpdateDTO> transitions = new ArrayList<TransitionUpdateDTO>();

  public WorkflowCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow to create.
   * @return description
  **/
  @Schema(description = "The description of the workflow to create.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkflowCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow to create.
   * @return name
  **/
  @Schema(required = true, description = "The name of the workflow to create.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowCreate startPointLayout(WorkflowLayout startPointLayout) {
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

  public WorkflowCreate statuses(List<StatusLayoutUpdate> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowCreate addStatusesItem(StatusLayoutUpdate statusesItem) {
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

  public WorkflowCreate transitions(List<TransitionUpdateDTO> transitions) {
    this.transitions = transitions;
    return this;
  }

  public WorkflowCreate addTransitionsItem(TransitionUpdateDTO transitionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCreate workflowCreate = (WorkflowCreate) o;
    return Objects.equals(this.description, workflowCreate.description) &&
        Objects.equals(this.name, workflowCreate.name) &&
        Objects.equals(this.startPointLayout, workflowCreate.startPointLayout) &&
        Objects.equals(this.statuses, workflowCreate.statuses) &&
        Objects.equals(this.transitions, workflowCreate.transitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, startPointLayout, statuses, transitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startPointLayout: ").append(toIndentedString(startPointLayout)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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