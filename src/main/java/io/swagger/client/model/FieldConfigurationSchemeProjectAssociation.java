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
 * Associated field configuration scheme and project.
 */
@Schema(description = "Associated field configuration scheme and project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class FieldConfigurationSchemeProjectAssociation {
  @SerializedName("fieldConfigurationSchemeId")
  private String fieldConfigurationSchemeId = null;

  @SerializedName("projectId")
  private String projectId = null;

  public FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
    return this;
  }

   /**
   * The ID of the field configuration scheme. If the field configuration scheme ID is &#x60;null&#x60;, the operation assigns the default field configuration scheme.
   * @return fieldConfigurationSchemeId
  **/
  @Schema(description = "The ID of the field configuration scheme. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.")
  public String getFieldConfigurationSchemeId() {
    return fieldConfigurationSchemeId;
  }

  public void setFieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
  }

  public FieldConfigurationSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(required = true, description = "The ID of the project.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation = (FieldConfigurationSchemeProjectAssociation) o;
    return Objects.equals(this.fieldConfigurationSchemeId, fieldConfigurationSchemeProjectAssociation.fieldConfigurationSchemeId) &&
        Objects.equals(this.projectId, fieldConfigurationSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationSchemeId, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjectAssociation {\n");
    
    sb.append("    fieldConfigurationSchemeId: ").append(toIndentedString(fieldConfigurationSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
