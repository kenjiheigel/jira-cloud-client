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
 * An operand that is a user-provided value.
 */
@Schema(description = "An operand that is a user-provided value.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class ValueOperand implements JqlQueryClauseOperand, JqlQueryUnitaryOperand {
  @SerializedName("encodedValue")
  private String encodedValue = null;

  @SerializedName("value")
  private String value = null;

  public ValueOperand encodedValue(String encodedValue) {
    this.encodedValue = encodedValue;
    return this;
  }

   /**
   * Encoded value, which can be used directly in a JQL query.
   * @return encodedValue
  **/
  @Schema(description = "Encoded value, which can be used directly in a JQL query.")
  public String getEncodedValue() {
    return encodedValue;
  }

  public void setEncodedValue(String encodedValue) {
    this.encodedValue = encodedValue;
  }

  public ValueOperand value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The operand value.
   * @return value
  **/
  @Schema(required = true, description = "The operand value.")
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
    ValueOperand valueOperand = (ValueOperand) o;
    return Objects.equals(this.encodedValue, valueOperand.encodedValue) &&
        Objects.equals(this.value, valueOperand.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedValue, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueOperand {\n");
    
    sb.append("    encodedValue: ").append(toIndentedString(encodedValue)).append("\n");
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
