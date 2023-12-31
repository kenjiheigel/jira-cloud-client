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
 * Issue security level member.
 */
@Schema(description = "Issue security level member.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueSecurityLevelMember {
  @SerializedName("holder")
  private AllOfIssueSecurityLevelMemberHolder holder = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issueSecurityLevelId")
  private Long issueSecurityLevelId = null;

  public IssueSecurityLevelMember holder(AllOfIssueSecurityLevelMemberHolder holder) {
    this.holder = holder;
    return this;
  }

   /**
   * The user or group being granted the permission. It consists of a &#x60;type&#x60; and a type-dependent &#x60;parameter&#x60;. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
   * @return holder
  **/
  @Schema(required = true, description = "The user or group being granted the permission. It consists of a `type` and a type-dependent `parameter`. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.")
  public AllOfIssueSecurityLevelMemberHolder getHolder() {
    return holder;
  }

  public void setHolder(AllOfIssueSecurityLevelMemberHolder holder) {
    this.holder = holder;
  }

  public IssueSecurityLevelMember id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue security level member.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the issue security level member.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IssueSecurityLevelMember issueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
    return this;
  }

   /**
   * The ID of the issue security level.
   * @return issueSecurityLevelId
  **/
  @Schema(required = true, description = "The ID of the issue security level.")
  public Long getIssueSecurityLevelId() {
    return issueSecurityLevelId;
  }

  public void setIssueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSecurityLevelMember issueSecurityLevelMember = (IssueSecurityLevelMember) o;
    return Objects.equals(this.holder, issueSecurityLevelMember.holder) &&
        Objects.equals(this.id, issueSecurityLevelMember.id) &&
        Objects.equals(this.issueSecurityLevelId, issueSecurityLevelMember.issueSecurityLevelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, id, issueSecurityLevelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSecurityLevelMember {\n");
    
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSecurityLevelId: ").append(toIndentedString(issueSecurityLevelId)).append("\n");
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
