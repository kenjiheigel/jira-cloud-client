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
import java.util.HashMap;
import java.util.Map;
/**
 * Details of scheme and new default level.
 */
@Schema(description = "Details of scheme and new default level.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class DefaultLevelValue extends HashMap<String, Object> {
  @SerializedName("defaultLevelId")
  private String defaultLevelId = null;

  @SerializedName("issueSecuritySchemeId")
  private String issueSecuritySchemeId = null;

  public DefaultLevelValue defaultLevelId(String defaultLevelId) {
    this.defaultLevelId = defaultLevelId;
    return this;
  }

   /**
   * The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
   * @return defaultLevelId
  **/
  @Schema(required = true, description = "The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.")
  public String getDefaultLevelId() {
    return defaultLevelId;
  }

  public void setDefaultLevelId(String defaultLevelId) {
    this.defaultLevelId = defaultLevelId;
  }

  public DefaultLevelValue issueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
    return this;
  }

   /**
   * The ID of the issue security scheme to set default level for.
   * @return issueSecuritySchemeId
  **/
  @Schema(required = true, description = "The ID of the issue security scheme to set default level for.")
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

  public void setIssueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultLevelValue defaultLevelValue = (DefaultLevelValue) o;
    return Objects.equals(this.defaultLevelId, defaultLevelValue.defaultLevelId) &&
        Objects.equals(this.issueSecuritySchemeId, defaultLevelValue.issueSecuritySchemeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLevelId, issueSecuritySchemeId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultLevelValue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultLevelId: ").append(toIndentedString(defaultLevelId)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
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