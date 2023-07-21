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
 * The default text for a read only custom field.
 */
@Schema(description = "The default text for a read only custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CustomFieldContextDefaultValueReadOnly implements CustomFieldContextDefaultValue {
  @SerializedName("text")
  private String text = null;

  @SerializedName("type")
  private String type = null;

  public CustomFieldContextDefaultValueReadOnly text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The default text. The maximum length is 255 characters.
   * @return text
  **/
  @Schema(description = "The default text. The maximum length is 255 characters.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CustomFieldContextDefaultValueReadOnly type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueReadOnly customFieldContextDefaultValueReadOnly = (CustomFieldContextDefaultValueReadOnly) o;
    return Objects.equals(this.text, customFieldContextDefaultValueReadOnly.text) &&
        Objects.equals(this.type, customFieldContextDefaultValueReadOnly.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueReadOnly {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
