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
 * Details of a custom field context.
 */
@Schema(description = "Details of a custom field context.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CustomFieldContextUpdateDetails {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  public CustomFieldContextUpdateDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the custom field context. The maximum length is 255 characters.
   * @return description
  **/
  @Schema(description = "The description of the custom field context. The maximum length is 255 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomFieldContextUpdateDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field context. The name must be unique. The maximum length is 255 characters.
   * @return name
  **/
  @Schema(description = "The name of the custom field context. The name must be unique. The maximum length is 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextUpdateDetails customFieldContextUpdateDetails = (CustomFieldContextUpdateDetails) o;
    return Objects.equals(this.description, customFieldContextUpdateDetails.description) &&
        Objects.equals(this.name, customFieldContextUpdateDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextUpdateDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
