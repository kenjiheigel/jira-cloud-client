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
import io.swagger.client.model.MultipleCustomFieldValuesUpdate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of updates for a custom fields.
 */
@Schema(description = "List of updates for a custom fields.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class MultipleCustomFieldValuesUpdateDetails {
  @SerializedName("updates")
  private List<MultipleCustomFieldValuesUpdate> updates = null;

  public MultipleCustomFieldValuesUpdateDetails updates(List<MultipleCustomFieldValuesUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public MultipleCustomFieldValuesUpdateDetails addUpdatesItem(MultipleCustomFieldValuesUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<MultipleCustomFieldValuesUpdate>();
    }
    this.updates.add(updatesItem);
    return this;
  }

   /**
   * Get updates
   * @return updates
  **/
  @Schema(description = "")
  public List<MultipleCustomFieldValuesUpdate> getUpdates() {
    return updates;
  }

  public void setUpdates(List<MultipleCustomFieldValuesUpdate> updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails = (MultipleCustomFieldValuesUpdateDetails) o;
    return Objects.equals(this.updates, multipleCustomFieldValuesUpdateDetails.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleCustomFieldValuesUpdateDetails {\n");
    
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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