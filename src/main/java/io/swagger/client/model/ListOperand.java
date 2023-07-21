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
import io.swagger.client.model.JqlQueryUnitaryOperand;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * An operand that is a list of values.
 */
@Schema(description = "An operand that is a list of values.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class ListOperand implements JqlQueryClauseOperand {
  @SerializedName("encodedOperand")
  private String encodedOperand = null;

  @SerializedName("values")
  private List<JqlQueryUnitaryOperand> values = new ArrayList<JqlQueryUnitaryOperand>();

  public ListOperand encodedOperand(String encodedOperand) {
    this.encodedOperand = encodedOperand;
    return this;
  }

   /**
   * Encoded operand, which can be used directly in a JQL query.
   * @return encodedOperand
  **/
  @Schema(description = "Encoded operand, which can be used directly in a JQL query.")
  public String getEncodedOperand() {
    return encodedOperand;
  }

  public void setEncodedOperand(String encodedOperand) {
    this.encodedOperand = encodedOperand;
  }

  public ListOperand values(List<JqlQueryUnitaryOperand> values) {
    this.values = values;
    return this;
  }

  public ListOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of operand values.
   * @return values
  **/
  @Schema(required = true, description = "The list of operand values.")
  public List<JqlQueryUnitaryOperand> getValues() {
    return values;
  }

  public void setValues(List<JqlQueryUnitaryOperand> values) {
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
    ListOperand listOperand = (ListOperand) o;
    return Objects.equals(this.encodedOperand, listOperand.encodedOperand) &&
        Objects.equals(this.values, listOperand.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedOperand, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOperand {\n");
    
    sb.append("    encodedOperand: ").append(toIndentedString(encodedOperand)).append("\n");
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