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
/**
 * Details about the mapping between an issue type and a workflow.
 */
@Schema(description = "Details about the mapping between an issue type and a workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueTypeWorkflowMapping {
  @SerializedName("issueType")
  private String issueType = null;

  @SerializedName("updateDraftIfNeeded")
  private Boolean updateDraftIfNeeded = null;

  @SerializedName("workflow")
  private String workflow = null;

  public IssueTypeWorkflowMapping issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

   /**
   * The ID of the issue type. Not required if updating the issue type-workflow mapping.
   * @return issueType
  **/
  @Schema(description = "The ID of the issue type. Not required if updating the issue type-workflow mapping.")
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }

  public IssueTypeWorkflowMapping updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

   /**
   * Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. Only applicable when updating the workflow-issue types mapping.
   * @return updateDraftIfNeeded
  **/
  @Schema(description = "Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.")
  public Boolean isUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }

  public IssueTypeWorkflowMapping workflow(String workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * The name of the workflow.
   * @return workflow
  **/
  @Schema(description = "The name of the workflow.")
  public String getWorkflow() {
    return workflow;
  }

  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeWorkflowMapping issueTypeWorkflowMapping = (IssueTypeWorkflowMapping) o;
    return Objects.equals(this.issueType, issueTypeWorkflowMapping.issueType) &&
        Objects.equals(this.updateDraftIfNeeded, issueTypeWorkflowMapping.updateDraftIfNeeded) &&
        Objects.equals(this.workflow, issueTypeWorkflowMapping.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueType, updateDraftIfNeeded, workflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeWorkflowMapping {\n");
    
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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
