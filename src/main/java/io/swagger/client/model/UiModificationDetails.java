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
import io.swagger.client.model.UiModificationContextDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The details of a UI modification.
 */
@Schema(description = "The details of a UI modification.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class UiModificationDetails {
  @SerializedName("contexts")
  private List<UiModificationContextDetails> contexts = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private String self = null;

   /**
   * List of contexts of the UI modification. The maximum number of contexts is 1000.
   * @return contexts
  **/
  @Schema(description = "List of contexts of the UI modification. The maximum number of contexts is 1000.")
  public List<UiModificationContextDetails> getContexts() {
    return contexts;
  }

   /**
   * The data of the UI modification. The maximum size of the data is 50000 characters.
   * @return data
  **/
  @Schema(description = "The data of the UI modification. The maximum size of the data is 50000 characters.")
  public String getData() {
    return data;
  }

   /**
   * The description of the UI modification. The maximum length is 255 characters.
   * @return description
  **/
  @Schema(description = "The description of the UI modification. The maximum length is 255 characters.")
  public String getDescription() {
    return description;
  }

   /**
   * The ID of the UI modification.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the UI modification.")
  public String getId() {
    return id;
  }

   /**
   * The name of the UI modification. The maximum length is 255 characters.
   * @return name
  **/
  @Schema(required = true, description = "The name of the UI modification. The maximum length is 255 characters.")
  public String getName() {
    return name;
  }

   /**
   * The URL of the UI modification.
   * @return self
  **/
  @Schema(required = true, description = "The URL of the UI modification.")
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
    UiModificationDetails uiModificationDetails = (UiModificationDetails) o;
    return Objects.equals(this.contexts, uiModificationDetails.contexts) &&
        Objects.equals(this.data, uiModificationDetails.data) &&
        Objects.equals(this.description, uiModificationDetails.description) &&
        Objects.equals(this.id, uiModificationDetails.id) &&
        Objects.equals(this.name, uiModificationDetails.name) &&
        Objects.equals(this.self, uiModificationDetails.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts, data, description, id, name, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiModificationDetails {\n");
    
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
