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
 * The details of the available dashboard gadget.
 */
@Schema(description = "The details of the available dashboard gadget.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class AvailableDashboardGadget {
  @SerializedName("moduleKey")
  private String moduleKey = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("uri")
  private String uri = null;

   /**
   * The module key of the gadget type.
   * @return moduleKey
  **/
  @Schema(description = "The module key of the gadget type.")
  public String getModuleKey() {
    return moduleKey;
  }

   /**
   * The title of the gadget.
   * @return title
  **/
  @Schema(required = true, description = "The title of the gadget.")
  public String getTitle() {
    return title;
  }

   /**
   * The URI of the gadget type.
   * @return uri
  **/
  @Schema(description = "The URI of the gadget type.")
  public String getUri() {
    return uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableDashboardGadget availableDashboardGadget = (AvailableDashboardGadget) o;
    return Objects.equals(this.moduleKey, availableDashboardGadget.moduleKey) &&
        Objects.equals(this.title, availableDashboardGadget.title) &&
        Objects.equals(this.uri, availableDashboardGadget.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleKey, title, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableDashboardGadget {\n");
    
    sb.append("    moduleKey: ").append(toIndentedString(moduleKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
