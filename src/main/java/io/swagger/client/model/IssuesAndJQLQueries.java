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
 * List of issues and JQL queries.
 */
@Schema(description = "List of issues and JQL queries.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssuesAndJQLQueries {
  @SerializedName("issueIds")
  private List<Long> issueIds = new ArrayList<Long>();

  @SerializedName("jqls")
  private List<String> jqls = new ArrayList<String>();

  public IssuesAndJQLQueries issueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
    return this;
  }

  public IssuesAndJQLQueries addIssueIdsItem(Long issueIdsItem) {
    this.issueIds.add(issueIdsItem);
    return this;
  }

   /**
   * A list of issue IDs.
   * @return issueIds
  **/
  @Schema(required = true, description = "A list of issue IDs.")
  public List<Long> getIssueIds() {
    return issueIds;
  }

  public void setIssueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
  }

  public IssuesAndJQLQueries jqls(List<String> jqls) {
    this.jqls = jqls;
    return this;
  }

  public IssuesAndJQLQueries addJqlsItem(String jqlsItem) {
    this.jqls.add(jqlsItem);
    return this;
  }

   /**
   * A list of JQL queries.
   * @return jqls
  **/
  @Schema(required = true, description = "A list of JQL queries.")
  public List<String> getJqls() {
    return jqls;
  }

  public void setJqls(List<String> jqls) {
    this.jqls = jqls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesAndJQLQueries issuesAndJQLQueries = (IssuesAndJQLQueries) o;
    return Objects.equals(this.issueIds, issuesAndJQLQueries.issueIds) &&
        Objects.equals(this.jqls, issuesAndJQLQueries.jqls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds, jqls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesAndJQLQueries {\n");
    
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    jqls: ").append(toIndentedString(jqls)).append("\n");
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
