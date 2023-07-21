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
 * Property key details.
 */
@Schema(description = "Property key details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class PropertyKey {
  @SerializedName("key")
  private String key = null;

  @SerializedName("self")
  private String self = null;

   /**
   * The key of the property.
   * @return key
  **/
  @Schema(description = "The key of the property.")
  public String getKey() {
    return key;
  }

   /**
   * The URL of the property.
   * @return self
  **/
  @Schema(description = "The URL of the property.")
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyKey propertyKey = (PropertyKey) o;
    return Objects.equals(this.key, propertyKey.key) &&
        Objects.equals(this.self, propertyKey.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyKey {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
