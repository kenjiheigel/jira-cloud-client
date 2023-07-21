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
import io.swagger.client.model.CustomFieldContextDefaultValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Default values to update.
 */
@Schema(description = "Default values to update.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CustomFieldContextDefaultValueUpdate {
  @SerializedName("defaultValues")
  private List<CustomFieldContextDefaultValue> defaultValues = null;

  public CustomFieldContextDefaultValueUpdate defaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public CustomFieldContextDefaultValueUpdate addDefaultValuesItem(CustomFieldContextDefaultValue defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<CustomFieldContextDefaultValue>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

   /**
   * Get defaultValues
   * @return defaultValues
  **/
  @Schema(description = "")
  public List<CustomFieldContextDefaultValue> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate = (CustomFieldContextDefaultValueUpdate) o;
    return Objects.equals(this.defaultValues, customFieldContextDefaultValueUpdate.defaultValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueUpdate {\n");
    
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
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
