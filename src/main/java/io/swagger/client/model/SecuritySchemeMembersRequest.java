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
import io.swagger.client.model.SecuritySchemeLevelMemberBean;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of issue security scheme level new members.
 */
@Schema(description = "Details of issue security scheme level new members.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class SecuritySchemeMembersRequest {
  @SerializedName("members")
  private List<SecuritySchemeLevelMemberBean> members = null;

  public SecuritySchemeMembersRequest members(List<SecuritySchemeLevelMemberBean> members) {
    this.members = members;
    return this;
  }

  public SecuritySchemeMembersRequest addMembersItem(SecuritySchemeLevelMemberBean membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<SecuritySchemeLevelMemberBean>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * The list of level members which should be added to the issue security scheme level.
   * @return members
  **/
  @Schema(description = "The list of level members which should be added to the issue security scheme level.")
  public List<SecuritySchemeLevelMemberBean> getMembers() {
    return members;
  }

  public void setMembers(List<SecuritySchemeLevelMemberBean> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemeMembersRequest securitySchemeMembersRequest = (SecuritySchemeMembersRequest) o;
    return Objects.equals(this.members, securitySchemeMembersRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemeMembersRequest {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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