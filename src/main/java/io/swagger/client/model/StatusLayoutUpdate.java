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
import io.swagger.client.model.WorkflowLayout;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The statuses associated with this workflow.
 */
@Schema(description = "The statuses associated with this workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class StatusLayoutUpdate extends HashMap<String, Object> {
  @SerializedName("layout")
  private WorkflowLayout layout = null;

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  @SerializedName("statusReference")
  private String statusReference = null;

  public StatusLayoutUpdate layout(WorkflowLayout layout) {
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @Schema(description = "")
  public WorkflowLayout getLayout() {
    return layout;
  }

  public void setLayout(WorkflowLayout layout) {
    this.layout = layout;
  }

  public StatusLayoutUpdate properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public StatusLayoutUpdate putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties for this status layout.
   * @return properties
  **/
  @Schema(required = true, description = "The properties for this status layout.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public StatusLayoutUpdate statusReference(String statusReference) {
    this.statusReference = statusReference;
    return this;
  }

   /**
   * A unique ID which the status will use to refer to this layout configuration.
   * @return statusReference
  **/
  @Schema(required = true, description = "A unique ID which the status will use to refer to this layout configuration.")
  public String getStatusReference() {
    return statusReference;
  }

  public void setStatusReference(String statusReference) {
    this.statusReference = statusReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusLayoutUpdate statusLayoutUpdate = (StatusLayoutUpdate) o;
    return Objects.equals(this.layout, statusLayoutUpdate.layout) &&
        Objects.equals(this.properties, statusLayoutUpdate.properties) &&
        Objects.equals(this.statusReference, statusLayoutUpdate.statusReference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, properties, statusReference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusLayoutUpdate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    statusReference: ").append(toIndentedString(statusReference)).append("\n");
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