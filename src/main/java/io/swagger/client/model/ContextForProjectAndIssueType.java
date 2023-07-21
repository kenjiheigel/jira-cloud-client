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
 * The project and issue type mapping with a matching custom field context.
 */
@Schema(description = "The project and issue type mapping with a matching custom field context.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class ContextForProjectAndIssueType {
  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("issueTypeId")
  private String issueTypeId = null;

  @SerializedName("projectId")
  private String projectId = null;

  public ContextForProjectAndIssueType contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the custom field context.
   * @return contextId
  **/
  @Schema(required = true, description = "The ID of the custom field context.")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public ContextForProjectAndIssueType issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type.
   * @return issueTypeId
  **/
  @Schema(required = true, description = "The ID of the issue type.")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public ContextForProjectAndIssueType projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(required = true, description = "The ID of the project.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextForProjectAndIssueType contextForProjectAndIssueType = (ContextForProjectAndIssueType) o;
    return Objects.equals(this.contextId, contextForProjectAndIssueType.contextId) &&
        Objects.equals(this.issueTypeId, contextForProjectAndIssueType.issueTypeId) &&
        Objects.equals(this.projectId, contextForProjectAndIssueType.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, issueTypeId, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextForProjectAndIssueType {\n");
    
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
