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
 * Details of a user, group, field, or project role that holds a permission. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
 */
@Schema(description = "Details of a user, group, field, or project role that holds a permission. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class PermissionHolder {
  @SerializedName("expand")
  private String expand = null;

  @SerializedName("parameter")
  private String parameter = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

   /**
   * Expand options that include additional permission holder details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional permission holder details in the response.")
  public String getExpand() {
    return expand;
  }

  public PermissionHolder parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * As a group&#x27;s name can change, use of &#x60;value&#x60; is recommended. The identifier associated withthe &#x60;type&#x60; value that defines the holder of the permission.
   * @return parameter
  **/
  @Schema(description = "As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public PermissionHolder type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of permission holder.
   * @return type
  **/
  @Schema(required = true, description = "The type of permission holder.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PermissionHolder value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The identifier associated with the &#x60;type&#x60; value that defines the holder of the permission.
   * @return value
  **/
  @Schema(description = "The identifier associated with the `type` value that defines the holder of the permission.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionHolder permissionHolder = (PermissionHolder) o;
    return Objects.equals(this.expand, permissionHolder.expand) &&
        Objects.equals(this.parameter, permissionHolder.parameter) &&
        Objects.equals(this.type, permissionHolder.type) &&
        Objects.equals(this.value, permissionHolder.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, parameter, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionHolder {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
