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
import java.util.ArrayList;
import java.util.List;
/**
 * The default text for a Forge collection of strings custom field.
 */
@Schema(description = "The default text for a Forge collection of strings custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CustomFieldContextDefaultValueForgeMultiStringField implements CustomFieldContextDefaultValue {
  @SerializedName("type")
  private String type = null;

  @SerializedName("values")
  private List<String> values = null;

  public CustomFieldContextDefaultValueForgeMultiStringField type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeMultiStringField values(List<String> values) {
    this.values = values;
    return this;
  }

  public CustomFieldContextDefaultValueForgeMultiStringField addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * List of string values. The maximum length for a value is 254 characters.
   * @return values
  **/
  @Schema(description = "List of string values. The maximum length for a value is 254 characters.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeMultiStringField customFieldContextDefaultValueForgeMultiStringField = (CustomFieldContextDefaultValueForgeMultiStringField) o;
    return Objects.equals(this.type, customFieldContextDefaultValueForgeMultiStringField.type) &&
        Objects.equals(this.values, customFieldContextDefaultValueForgeMultiStringField.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeMultiStringField {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
