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
import io.swagger.client.model.StatusMigration;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The mapping of old to new status ID for a specific project and issue type.
 */
@Schema(description = "The mapping of old to new status ID for a specific project and issue type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class StatusMappingDTO extends HashMap<String, Object> {
  @SerializedName("issueTypeId")
  private String issueTypeId = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("statusMigrations")
  private List<StatusMigration> statusMigrations = new ArrayList<StatusMigration>();

  public StatusMappingDTO issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The issue type for the status mapping.
   * @return issueTypeId
  **/
  @Schema(required = true, description = "The issue type for the status mapping.")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public StatusMappingDTO projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The project for the status mapping.
   * @return projectId
  **/
  @Schema(required = true, description = "The project for the status mapping.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public StatusMappingDTO statusMigrations(List<StatusMigration> statusMigrations) {
    this.statusMigrations = statusMigrations;
    return this;
  }

  public StatusMappingDTO addStatusMigrationsItem(StatusMigration statusMigrationsItem) {
    this.statusMigrations.add(statusMigrationsItem);
    return this;
  }

   /**
   * The list of old and new status ID mappings for the specified project and issue type.
   * @return statusMigrations
  **/
  @Schema(required = true, description = "The list of old and new status ID mappings for the specified project and issue type.")
  public List<StatusMigration> getStatusMigrations() {
    return statusMigrations;
  }

  public void setStatusMigrations(List<StatusMigration> statusMigrations) {
    this.statusMigrations = statusMigrations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMappingDTO statusMappingDTO = (StatusMappingDTO) o;
    return Objects.equals(this.issueTypeId, statusMappingDTO.issueTypeId) &&
        Objects.equals(this.projectId, statusMappingDTO.projectId) &&
        Objects.equals(this.statusMigrations, statusMappingDTO.statusMigrations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, projectId, statusMigrations, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMappingDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    statusMigrations: ").append(toIndentedString(statusMigrations)).append("\n");
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