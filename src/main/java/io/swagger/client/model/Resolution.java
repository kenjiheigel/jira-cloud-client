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
 * Details of an issue resolution.
 */
@Schema(description = "Details of an issue resolution.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class Resolution {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private String self = null;

  public Resolution description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue resolution.
   * @return description
  **/
  @Schema(description = "The description of the issue resolution.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Resolution id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue resolution.
   * @return id
  **/
  @Schema(description = "The ID of the issue resolution.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Resolution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the issue resolution.
   * @return name
  **/
  @Schema(description = "The name of the issue resolution.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resolution self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the issue resolution.
   * @return self
  **/
  @Schema(description = "The URL of the issue resolution.")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resolution resolution = (Resolution) o;
    return Objects.equals(this.description, resolution.description) &&
        Objects.equals(this.id, resolution.id) &&
        Objects.equals(this.name, resolution.name) &&
        Objects.equals(this.self, resolution.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resolution {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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