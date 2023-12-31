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
import io.swagger.client.model.ProjectIssueCreateMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The wrapper for the issue creation metadata for a list of projects.
 */
@Schema(description = "The wrapper for the issue creation metadata for a list of projects.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueCreateMetadata {
  @SerializedName("expand")
  private String expand = null;

  @SerializedName("projects")
  private List<ProjectIssueCreateMetadata> projects = null;

   /**
   * Expand options that include additional project details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional project details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * List of projects and their issue creation metadata.
   * @return projects
  **/
  @Schema(description = "List of projects and their issue creation metadata.")
  public List<ProjectIssueCreateMetadata> getProjects() {
    return projects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueCreateMetadata issueCreateMetadata = (IssueCreateMetadata) o;
    return Objects.equals(this.expand, issueCreateMetadata.expand) &&
        Objects.equals(this.projects, issueCreateMetadata.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, projects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCreateMetadata {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
