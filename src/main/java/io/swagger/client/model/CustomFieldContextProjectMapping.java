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
 * Details of a context to project association.
 */
@Schema(description = "Details of a context to project association.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CustomFieldContextProjectMapping {
  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("isGlobalContext")
  private Boolean isGlobalContext = null;

  @SerializedName("projectId")
  private String projectId = null;

   /**
   * The ID of the context.
   * @return contextId
  **/
  @Schema(required = true, description = "The ID of the context.")
  public String getContextId() {
    return contextId;
  }

   /**
   * Whether context is global.
   * @return isGlobalContext
  **/
  @Schema(description = "Whether context is global.")
  public Boolean isIsGlobalContext() {
    return isGlobalContext;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(description = "The ID of the project.")
  public String getProjectId() {
    return projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextProjectMapping customFieldContextProjectMapping = (CustomFieldContextProjectMapping) o;
    return Objects.equals(this.contextId, customFieldContextProjectMapping.contextId) &&
        Objects.equals(this.isGlobalContext, customFieldContextProjectMapping.isGlobalContext) &&
        Objects.equals(this.projectId, customFieldContextProjectMapping.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, isGlobalContext, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextProjectMapping {\n");
    
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
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
