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
 * Metadata for an item in an attachment archive.
 */
@Schema(description = "Metadata for an item in an attachment archive.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class AttachmentArchiveItemReadable {
  @SerializedName("index")
  private Long index = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("size")
  private String size = null;

   /**
   * The position of the item within the archive.
   * @return index
  **/
  @Schema(description = "The position of the item within the archive.")
  public Long getIndex() {
    return index;
  }

   /**
   * The label for the archive item.
   * @return label
  **/
  @Schema(description = "The label for the archive item.")
  public String getLabel() {
    return label;
  }

   /**
   * The MIME type of the archive item.
   * @return mediaType
  **/
  @Schema(description = "The MIME type of the archive item.")
  public String getMediaType() {
    return mediaType;
  }

   /**
   * The path of the archive item.
   * @return path
  **/
  @Schema(description = "The path of the archive item.")
  public String getPath() {
    return path;
  }

   /**
   * The size of the archive item.
   * @return size
  **/
  @Schema(description = "The size of the archive item.")
  public String getSize() {
    return size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveItemReadable attachmentArchiveItemReadable = (AttachmentArchiveItemReadable) o;
    return Objects.equals(this.index, attachmentArchiveItemReadable.index) &&
        Objects.equals(this.label, attachmentArchiveItemReadable.label) &&
        Objects.equals(this.mediaType, attachmentArchiveItemReadable.mediaType) &&
        Objects.equals(this.path, attachmentArchiveItemReadable.path) &&
        Objects.equals(this.size, attachmentArchiveItemReadable.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, label, mediaType, path, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveItemReadable {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
