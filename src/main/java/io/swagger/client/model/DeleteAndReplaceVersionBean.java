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
import io.swagger.client.model.CustomFieldReplacement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DeleteAndReplaceVersionBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class DeleteAndReplaceVersionBean {
  @SerializedName("customFieldReplacementList")
  private List<CustomFieldReplacement> customFieldReplacementList = null;

  @SerializedName("moveAffectedIssuesTo")
  private Long moveAffectedIssuesTo = null;

  @SerializedName("moveFixIssuesTo")
  private Long moveFixIssuesTo = null;

  public DeleteAndReplaceVersionBean customFieldReplacementList(List<CustomFieldReplacement> customFieldReplacementList) {
    this.customFieldReplacementList = customFieldReplacementList;
    return this;
  }

  public DeleteAndReplaceVersionBean addCustomFieldReplacementListItem(CustomFieldReplacement customFieldReplacementListItem) {
    if (this.customFieldReplacementList == null) {
      this.customFieldReplacementList = new ArrayList<CustomFieldReplacement>();
    }
    this.customFieldReplacementList.add(customFieldReplacementListItem);
    return this;
  }

   /**
   * An array of custom field IDs (&#x60;customFieldId&#x60;) and version IDs (&#x60;moveTo&#x60;) to update when the fields contain the deleted version.
   * @return customFieldReplacementList
  **/
  @Schema(description = "An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.")
  public List<CustomFieldReplacement> getCustomFieldReplacementList() {
    return customFieldReplacementList;
  }

  public void setCustomFieldReplacementList(List<CustomFieldReplacement> customFieldReplacementList) {
    this.customFieldReplacementList = customFieldReplacementList;
  }

  public DeleteAndReplaceVersionBean moveAffectedIssuesTo(Long moveAffectedIssuesTo) {
    this.moveAffectedIssuesTo = moveAffectedIssuesTo;
    return this;
  }

   /**
   * The ID of the version to update &#x60;affectedVersion&#x60; to when the field contains the deleted version.
   * @return moveAffectedIssuesTo
  **/
  @Schema(description = "The ID of the version to update `affectedVersion` to when the field contains the deleted version.")
  public Long getMoveAffectedIssuesTo() {
    return moveAffectedIssuesTo;
  }

  public void setMoveAffectedIssuesTo(Long moveAffectedIssuesTo) {
    this.moveAffectedIssuesTo = moveAffectedIssuesTo;
  }

  public DeleteAndReplaceVersionBean moveFixIssuesTo(Long moveFixIssuesTo) {
    this.moveFixIssuesTo = moveFixIssuesTo;
    return this;
  }

   /**
   * The ID of the version to update &#x60;fixVersion&#x60; to when the field contains the deleted version.
   * @return moveFixIssuesTo
  **/
  @Schema(description = "The ID of the version to update `fixVersion` to when the field contains the deleted version.")
  public Long getMoveFixIssuesTo() {
    return moveFixIssuesTo;
  }

  public void setMoveFixIssuesTo(Long moveFixIssuesTo) {
    this.moveFixIssuesTo = moveFixIssuesTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAndReplaceVersionBean deleteAndReplaceVersionBean = (DeleteAndReplaceVersionBean) o;
    return Objects.equals(this.customFieldReplacementList, deleteAndReplaceVersionBean.customFieldReplacementList) &&
        Objects.equals(this.moveAffectedIssuesTo, deleteAndReplaceVersionBean.moveAffectedIssuesTo) &&
        Objects.equals(this.moveFixIssuesTo, deleteAndReplaceVersionBean.moveFixIssuesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldReplacementList, moveAffectedIssuesTo, moveFixIssuesTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAndReplaceVersionBean {\n");
    
    sb.append("    customFieldReplacementList: ").append(toIndentedString(customFieldReplacementList)).append("\n");
    sb.append("    moveAffectedIssuesTo: ").append(toIndentedString(moveAffectedIssuesTo)).append("\n");
    sb.append("    moveFixIssuesTo: ").append(toIndentedString(moveFixIssuesTo)).append("\n");
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
