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
import java.util.ArrayList;
import java.util.List;
/**
 * A workflow scheme along with a list of projects that use it.
 */
@Schema(description = "A workflow scheme along with a list of projects that use it.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class WorkflowSchemeAssociations {
  @SerializedName("projectIds")
  private List<String> projectIds = new ArrayList<String>();

  @SerializedName("workflowScheme")
  private AllOfWorkflowSchemeAssociationsWorkflowScheme workflowScheme = null;

  public WorkflowSchemeAssociations projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public WorkflowSchemeAssociations addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The list of projects that use the workflow scheme.
   * @return projectIds
  **/
  @Schema(required = true, description = "The list of projects that use the workflow scheme.")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  public WorkflowSchemeAssociations workflowScheme(AllOfWorkflowSchemeAssociationsWorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
    return this;
  }

   /**
   * The workflow scheme.
   * @return workflowScheme
  **/
  @Schema(required = true, description = "The workflow scheme.")
  public AllOfWorkflowSchemeAssociationsWorkflowScheme getWorkflowScheme() {
    return workflowScheme;
  }

  public void setWorkflowScheme(AllOfWorkflowSchemeAssociationsWorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeAssociations workflowSchemeAssociations = (WorkflowSchemeAssociations) o;
    return Objects.equals(this.projectIds, workflowSchemeAssociations.projectIds) &&
        Objects.equals(this.workflowScheme, workflowSchemeAssociations.workflowScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, workflowScheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeAssociations {\n");
    
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    workflowScheme: ").append(toIndentedString(workflowScheme)).append("\n");
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
