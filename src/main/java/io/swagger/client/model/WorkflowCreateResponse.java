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
import io.swagger.client.model.JiraWorkflow;
import io.swagger.client.model.JiraWorkflowStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of the created workflows and statuses.
 */
@Schema(description = "Details of the created workflows and statuses.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class WorkflowCreateResponse {
  @SerializedName("statuses")
  private List<JiraWorkflowStatus> statuses = null;

  @SerializedName("workflows")
  private List<JiraWorkflow> workflows = null;

  public WorkflowCreateResponse statuses(List<JiraWorkflowStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowCreateResponse addStatusesItem(JiraWorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<JiraWorkflowStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * List of created statuses.
   * @return statuses
  **/
  @Schema(description = "List of created statuses.")
  public List<JiraWorkflowStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<JiraWorkflowStatus> statuses) {
    this.statuses = statuses;
  }

  public WorkflowCreateResponse workflows(List<JiraWorkflow> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowCreateResponse addWorkflowsItem(JiraWorkflow workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new ArrayList<JiraWorkflow>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * List of created workflows.
   * @return workflows
  **/
  @Schema(description = "List of created workflows.")
  public List<JiraWorkflow> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<JiraWorkflow> workflows) {
    this.workflows = workflows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCreateResponse workflowCreateResponse = (WorkflowCreateResponse) o;
    return Objects.equals(this.statuses, workflowCreateResponse.statuses) &&
        Objects.equals(this.workflows, workflowCreateResponse.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, workflows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCreateResponse {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
