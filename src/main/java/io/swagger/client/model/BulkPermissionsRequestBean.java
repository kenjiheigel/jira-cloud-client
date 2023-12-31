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
import io.swagger.client.model.BulkProjectPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of global permissions to look up and project permissions with associated projects and issues to look up.
 */
@Schema(description = "Details of global permissions to look up and project permissions with associated projects and issues to look up.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class BulkPermissionsRequestBean {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("globalPermissions")
  private List<String> globalPermissions = null;

  @SerializedName("projectPermissions")
  private List<BulkProjectPermissions> projectPermissions = null;

  public BulkPermissionsRequestBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of a user.
   * @return accountId
  **/
  @Schema(description = "The account ID of a user.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BulkPermissionsRequestBean globalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addGlobalPermissionsItem(String globalPermissionsItem) {
    if (this.globalPermissions == null) {
      this.globalPermissions = new ArrayList<String>();
    }
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * Global permissions to look up.
   * @return globalPermissions
  **/
  @Schema(description = "Global permissions to look up.")
  public List<String> getGlobalPermissions() {
    return globalPermissions;
  }

  public void setGlobalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }

  public BulkPermissionsRequestBean projectPermissions(List<BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addProjectPermissionsItem(BulkProjectPermissions projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new ArrayList<BulkProjectPermissions>();
    }
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * Project permissions with associated projects and issues to look up.
   * @return projectPermissions
  **/
  @Schema(description = "Project permissions with associated projects and issues to look up.")
  public List<BulkProjectPermissions> getProjectPermissions() {
    return projectPermissions;
  }

  public void setProjectPermissions(List<BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionsRequestBean bulkPermissionsRequestBean = (BulkPermissionsRequestBean) o;
    return Objects.equals(this.accountId, bulkPermissionsRequestBean.accountId) &&
        Objects.equals(this.globalPermissions, bulkPermissionsRequestBean.globalPermissions) &&
        Objects.equals(this.projectPermissions, bulkPermissionsRequestBean.projectPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, globalPermissions, projectPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionsRequestBean {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
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
