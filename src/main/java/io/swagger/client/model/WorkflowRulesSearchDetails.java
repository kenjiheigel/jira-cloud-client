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
import io.swagger.client.model.WorkflowTransitionRules;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Details of workflow transition rules.
 */
@Schema(description = "Details of workflow transition rules.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class WorkflowRulesSearchDetails {
  @SerializedName("invalidRules")
  private List<UUID> invalidRules = null;

  @SerializedName("validRules")
  private List<WorkflowTransitionRules> validRules = null;

  @SerializedName("workflowEntityId")
  private UUID workflowEntityId = null;

  public WorkflowRulesSearchDetails invalidRules(List<UUID> invalidRules) {
    this.invalidRules = invalidRules;
    return this;
  }

  public WorkflowRulesSearchDetails addInvalidRulesItem(UUID invalidRulesItem) {
    if (this.invalidRules == null) {
      this.invalidRules = new ArrayList<UUID>();
    }
    this.invalidRules.add(invalidRulesItem);
    return this;
  }

   /**
   * List of workflow rule IDs that do not belong to the workflow or can not be found.
   * @return invalidRules
  **/
  @Schema(description = "List of workflow rule IDs that do not belong to the workflow or can not be found.")
  public List<UUID> getInvalidRules() {
    return invalidRules;
  }

  public void setInvalidRules(List<UUID> invalidRules) {
    this.invalidRules = invalidRules;
  }

  public WorkflowRulesSearchDetails validRules(List<WorkflowTransitionRules> validRules) {
    this.validRules = validRules;
    return this;
  }

  public WorkflowRulesSearchDetails addValidRulesItem(WorkflowTransitionRules validRulesItem) {
    if (this.validRules == null) {
      this.validRules = new ArrayList<WorkflowTransitionRules>();
    }
    this.validRules.add(validRulesItem);
    return this;
  }

   /**
   * List of valid workflow transition rules.
   * @return validRules
  **/
  @Schema(description = "List of valid workflow transition rules.")
  public List<WorkflowTransitionRules> getValidRules() {
    return validRules;
  }

  public void setValidRules(List<WorkflowTransitionRules> validRules) {
    this.validRules = validRules;
  }

  public WorkflowRulesSearchDetails workflowEntityId(UUID workflowEntityId) {
    this.workflowEntityId = workflowEntityId;
    return this;
  }

   /**
   * The workflow ID.
   * @return workflowEntityId
  **/
  @Schema(example = "a498d711-685d-428d-8c3e-bc03bb450ea7", description = "The workflow ID.")
  public UUID getWorkflowEntityId() {
    return workflowEntityId;
  }

  public void setWorkflowEntityId(UUID workflowEntityId) {
    this.workflowEntityId = workflowEntityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRulesSearchDetails workflowRulesSearchDetails = (WorkflowRulesSearchDetails) o;
    return Objects.equals(this.invalidRules, workflowRulesSearchDetails.invalidRules) &&
        Objects.equals(this.validRules, workflowRulesSearchDetails.validRules) &&
        Objects.equals(this.workflowEntityId, workflowRulesSearchDetails.workflowEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidRules, validRules, workflowEntityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRulesSearchDetails {\n");
    
    sb.append("    invalidRules: ").append(toIndentedString(invalidRules)).append("\n");
    sb.append("    validRules: ").append(toIndentedString(validRules)).append("\n");
    sb.append("    workflowEntityId: ").append(toIndentedString(workflowEntityId)).append("\n");
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
