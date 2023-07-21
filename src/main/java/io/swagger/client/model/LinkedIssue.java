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
 * The ID or key of a linked issue.
 */
@Schema(description = "The ID or key of a linked issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class LinkedIssue {
  @SerializedName("fields")
  private AllOfLinkedIssueFields fields = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("self")
  private String self = null;

   /**
   * The fields associated with the issue.
   * @return fields
  **/
  @Schema(description = "The fields associated with the issue.")
  public AllOfLinkedIssueFields getFields() {
    return fields;
  }

  public LinkedIssue id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of an issue. Required if &#x60;key&#x60; isn&#x27;t provided.
   * @return id
  **/
  @Schema(description = "The ID of an issue. Required if `key` isn't provided.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LinkedIssue key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of an issue. Required if &#x60;id&#x60; isn&#x27;t provided.
   * @return key
  **/
  @Schema(description = "The key of an issue. Required if `id` isn't provided.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

   /**
   * The URL of the issue.
   * @return self
  **/
  @Schema(description = "The URL of the issue.")
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedIssue linkedIssue = (LinkedIssue) o;
    return Objects.equals(this.fields, linkedIssue.fields) &&
        Objects.equals(this.id, linkedIssue.id) &&
        Objects.equals(this.key, linkedIssue.key) &&
        Objects.equals(this.self, linkedIssue.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, id, key, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedIssue {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
