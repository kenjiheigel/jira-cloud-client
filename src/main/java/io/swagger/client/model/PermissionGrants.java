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
import io.swagger.client.model.PermissionGrant;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of permission grants.
 */
@Schema(description = "List of permission grants.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class PermissionGrants {
  @SerializedName("expand")
  private String expand = null;

  @SerializedName("permissions")
  private List<PermissionGrant> permissions = null;

   /**
   * Expand options that include additional permission grant details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional permission grant details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * Permission grants list.
   * @return permissions
  **/
  @Schema(description = "Permission grants list.")
  public List<PermissionGrant> getPermissions() {
    return permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionGrants permissionGrants = (PermissionGrants) o;
    return Objects.equals(this.expand, permissionGrants.expand) &&
        Objects.equals(this.permissions, permissionGrants.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionGrants {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
