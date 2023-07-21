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
 * Details of the instance&#x27;s attachment settings.
 */
@Schema(description = "Details of the instance's attachment settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class AttachmentSettings {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("uploadLimit")
  private Long uploadLimit = null;

   /**
   * Whether the ability to add attachments is enabled.
   * @return enabled
  **/
  @Schema(description = "Whether the ability to add attachments is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

   /**
   * The maximum size of attachments permitted, in bytes.
   * @return uploadLimit
  **/
  @Schema(description = "The maximum size of attachments permitted, in bytes.")
  public Long getUploadLimit() {
    return uploadLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSettings attachmentSettings = (AttachmentSettings) o;
    return Objects.equals(this.enabled, attachmentSettings.enabled) &&
        Objects.equals(this.uploadLimit, attachmentSettings.uploadLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, uploadLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    uploadLimit: ").append(toIndentedString(uploadLimit)).append("\n");
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