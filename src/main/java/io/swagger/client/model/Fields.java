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
import io.swagger.client.model.IssueTypeDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Key fields from the linked issue.
 */
@Schema(description = "Key fields from the linked issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class Fields {
  @SerializedName("assignee")
  private AllOfFieldsAssignee assignee = null;

  @SerializedName("issueType")
  private AllOfFieldsIssueType issueType = null;

  @SerializedName("issuetype")
  private IssueTypeDetails issuetype = null;

  @SerializedName("priority")
  private AllOfFieldsPriority priority = null;

  @SerializedName("status")
  private AllOfFieldsStatus status = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("timetracking")
  private AllOfFieldsTimetracking timetracking = null;

   /**
   * The assignee of the linked issue.
   * @return assignee
  **/
  @Schema(description = "The assignee of the linked issue.")
  public AllOfFieldsAssignee getAssignee() {
    return assignee;
  }

   /**
   * The type of the linked issue.
   * @return issueType
  **/
  @Schema(description = "The type of the linked issue.")
  public AllOfFieldsIssueType getIssueType() {
    return issueType;
  }

  public Fields issuetype(IssueTypeDetails issuetype) {
    this.issuetype = issuetype;
    return this;
  }

   /**
   * Get issuetype
   * @return issuetype
  **/
  @Schema(description = "")
  public IssueTypeDetails getIssuetype() {
    return issuetype;
  }

  public void setIssuetype(IssueTypeDetails issuetype) {
    this.issuetype = issuetype;
  }

   /**
   * The priority of the linked issue.
   * @return priority
  **/
  @Schema(description = "The priority of the linked issue.")
  public AllOfFieldsPriority getPriority() {
    return priority;
  }

   /**
   * The status of the linked issue.
   * @return status
  **/
  @Schema(description = "The status of the linked issue.")
  public AllOfFieldsStatus getStatus() {
    return status;
  }

   /**
   * The summary description of the linked issue.
   * @return summary
  **/
  @Schema(description = "The summary description of the linked issue.")
  public String getSummary() {
    return summary;
  }

   /**
   * The time tracking of the linked issue.
   * @return timetracking
  **/
  @Schema(description = "The time tracking of the linked issue.")
  public AllOfFieldsTimetracking getTimetracking() {
    return timetracking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fields fields = (Fields) o;
    return Objects.equals(this.assignee, fields.assignee) &&
        Objects.equals(this.issueType, fields.issueType) &&
        Objects.equals(this.issuetype, fields.issuetype) &&
        Objects.equals(this.priority, fields.priority) &&
        Objects.equals(this.status, fields.status) &&
        Objects.equals(this.summary, fields.summary) &&
        Objects.equals(this.timetracking, fields.timetracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, issueType, issuetype, priority, status, summary, timetracking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fields {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    issuetype: ").append(toIndentedString(issuetype)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timetracking: ").append(toIndentedString(timetracking)).append("\n");
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
