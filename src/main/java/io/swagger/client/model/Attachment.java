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
import org.threeten.bp.OffsetDateTime;
/**
 * Details about an attachment.
 */
@Schema(description = "Details about an attachment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class Attachment extends HashMap<String, Object> {
  @SerializedName("author")
  private AllOfAttachmentAuthor author = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("thumbnail")
  private String thumbnail = null;

   /**
   * Details of the user who added the attachment.
   * @return author
  **/
  @Schema(description = "Details of the user who added the attachment.")
  public AllOfAttachmentAuthor getAuthor() {
    return author;
  }

   /**
   * The content of the attachment.
   * @return content
  **/
  @Schema(description = "The content of the attachment.")
  public String getContent() {
    return content;
  }

   /**
   * The datetime the attachment was created.
   * @return created
  **/
  @Schema(description = "The datetime the attachment was created.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The file name of the attachment.
   * @return filename
  **/
  @Schema(description = "The file name of the attachment.")
  public String getFilename() {
    return filename;
  }

   /**
   * The ID of the attachment.
   * @return id
  **/
  @Schema(description = "The ID of the attachment.")
  public String getId() {
    return id;
  }

   /**
   * The MIME type of the attachment.
   * @return mimeType
  **/
  @Schema(description = "The MIME type of the attachment.")
  public String getMimeType() {
    return mimeType;
  }

   /**
   * The URL of the attachment details response.
   * @return self
  **/
  @Schema(description = "The URL of the attachment details response.")
  public String getSelf() {
    return self;
  }

   /**
   * The size of the attachment.
   * @return size
  **/
  @Schema(description = "The size of the attachment.")
  public Long getSize() {
    return size;
  }

   /**
   * The URL of a thumbnail representing the attachment.
   * @return thumbnail
  **/
  @Schema(description = "The URL of a thumbnail representing the attachment.")
  public String getThumbnail() {
    return thumbnail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.author, attachment.author) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.created, attachment.created) &&
        Objects.equals(this.filename, attachment.filename) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.self, attachment.self) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.thumbnail, attachment.thumbnail) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, created, filename, id, mimeType, self, size, thumbnail, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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