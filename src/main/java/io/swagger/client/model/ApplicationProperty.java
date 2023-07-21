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
 * Details of an application property.
 */
@Schema(description = "Details of an application property.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class ApplicationProperty {
  @SerializedName("allowedValues")
  private List<String> allowedValues = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("example")
  private String example = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  public ApplicationProperty allowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public ApplicationProperty addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<String>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * The allowed values, if applicable.
   * @return allowedValues
  **/
  @Schema(description = "The allowed values, if applicable.")
  public List<String> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }

  public ApplicationProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value of the application property.
   * @return defaultValue
  **/
  @Schema(description = "The default value of the application property.")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ApplicationProperty desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * The description of the application property.
   * @return desc
  **/
  @Schema(description = "The description of the application property.")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ApplicationProperty example(String example) {
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @Schema(description = "")
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public ApplicationProperty id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the application property. The ID and key are the same.
   * @return id
  **/
  @Schema(description = "The ID of the application property. The ID and key are the same.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the application property. The ID and key are the same.
   * @return key
  **/
  @Schema(description = "The key of the application property. The ID and key are the same.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApplicationProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application property.
   * @return name
  **/
  @Schema(description = "The name of the application property.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The data type of the application property.
   * @return type
  **/
  @Schema(description = "The data type of the application property.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ApplicationProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The new value.
   * @return value
  **/
  @Schema(description = "The new value.")
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
    ApplicationProperty applicationProperty = (ApplicationProperty) o;
    return Objects.equals(this.allowedValues, applicationProperty.allowedValues) &&
        Objects.equals(this.defaultValue, applicationProperty.defaultValue) &&
        Objects.equals(this.desc, applicationProperty.desc) &&
        Objects.equals(this.example, applicationProperty.example) &&
        Objects.equals(this.id, applicationProperty.id) &&
        Objects.equals(this.key, applicationProperty.key) &&
        Objects.equals(this.name, applicationProperty.name) &&
        Objects.equals(this.type, applicationProperty.type) &&
        Objects.equals(this.value, applicationProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, defaultValue, desc, example, id, key, name, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProperty {\n");
    
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
