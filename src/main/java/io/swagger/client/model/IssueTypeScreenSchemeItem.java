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
 * The screen scheme for an issue type.
 */
@Schema(description = "The screen scheme for an issue type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueTypeScreenSchemeItem {
  @SerializedName("issueTypeId")
  private String issueTypeId = null;

  @SerializedName("issueTypeScreenSchemeId")
  private String issueTypeScreenSchemeId = null;

  @SerializedName("screenSchemeId")
  private String screenSchemeId = null;

  public IssueTypeScreenSchemeItem issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can&#x27;t be provided.
   * @return issueTypeId
  **/
  @Schema(required = true, description = "The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public IssueTypeScreenSchemeItem issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

   /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  **/
  @Schema(required = true, description = "The ID of the issue type screen scheme.")
  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }

  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }

  public IssueTypeScreenSchemeItem screenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
    return this;
  }

   /**
   * The ID of the screen scheme.
   * @return screenSchemeId
  **/
  @Schema(required = true, description = "The ID of the screen scheme.")
  public String getScreenSchemeId() {
    return screenSchemeId;
  }

  public void setScreenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeItem issueTypeScreenSchemeItem = (IssueTypeScreenSchemeItem) o;
    return Objects.equals(this.issueTypeId, issueTypeScreenSchemeItem.issueTypeId) &&
        Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeItem.issueTypeScreenSchemeId) &&
        Objects.equals(this.screenSchemeId, issueTypeScreenSchemeItem.screenSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, issueTypeScreenSchemeId, screenSchemeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeItem {\n");
    
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
    sb.append("    screenSchemeId: ").append(toIndentedString(screenSchemeId)).append("\n");
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
