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
 * The list of available trigger types.
 */
@Schema(description = "The list of available trigger types.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class AvailableWorkflowTriggerTypes {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public AvailableWorkflowTriggerTypes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the trigger rule.
   * @return description
  **/
  @Schema(description = "The description of the trigger rule.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AvailableWorkflowTriggerTypes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the trigger rule.
   * @return name
  **/
  @Schema(description = "The name of the trigger rule.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AvailableWorkflowTriggerTypes type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type identifier of trigger rule.
   * @return type
  **/
  @Schema(description = "The type identifier of trigger rule.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableWorkflowTriggerTypes availableWorkflowTriggerTypes = (AvailableWorkflowTriggerTypes) o;
    return Objects.equals(this.description, availableWorkflowTriggerTypes.description) &&
        Objects.equals(this.name, availableWorkflowTriggerTypes.name) &&
        Objects.equals(this.type, availableWorkflowTriggerTypes.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableWorkflowTriggerTypes {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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