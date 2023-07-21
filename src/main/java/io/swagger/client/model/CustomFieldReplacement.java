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
 * Details about the replacement for a deleted version.
 */
@Schema(description = "Details about the replacement for a deleted version.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CustomFieldReplacement {
  @SerializedName("customFieldId")
  private Long customFieldId = null;

  @SerializedName("moveTo")
  private Long moveTo = null;

  public CustomFieldReplacement customFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
    return this;
  }

   /**
   * The ID of the custom field in which to replace the version number.
   * @return customFieldId
  **/
  @Schema(description = "The ID of the custom field in which to replace the version number.")
  public Long getCustomFieldId() {
    return customFieldId;
  }

  public void setCustomFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
  }

  public CustomFieldReplacement moveTo(Long moveTo) {
    this.moveTo = moveTo;
    return this;
  }

   /**
   * The version number to use as a replacement for the deleted version.
   * @return moveTo
  **/
  @Schema(description = "The version number to use as a replacement for the deleted version.")
  public Long getMoveTo() {
    return moveTo;
  }

  public void setMoveTo(Long moveTo) {
    this.moveTo = moveTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldReplacement customFieldReplacement = (CustomFieldReplacement) o;
    return Objects.equals(this.customFieldId, customFieldReplacement.customFieldId) &&
        Objects.equals(this.moveTo, customFieldReplacement.moveTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, moveTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldReplacement {\n");
    
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    moveTo: ").append(toIndentedString(moveTo)).append("\n");
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
