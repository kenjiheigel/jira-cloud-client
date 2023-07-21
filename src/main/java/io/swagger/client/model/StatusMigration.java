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
import java.util.HashMap;
import java.util.Map;
/**
 * The mapping of old to new status ID.
 */
@Schema(description = "The mapping of old to new status ID.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class StatusMigration extends HashMap<String, Object> {
  @SerializedName("newStatusReference")
  private String newStatusReference = null;

  @SerializedName("oldStatusReference")
  private String oldStatusReference = null;

  public StatusMigration newStatusReference(String newStatusReference) {
    this.newStatusReference = newStatusReference;
    return this;
  }

   /**
   * The new status ID.
   * @return newStatusReference
  **/
  @Schema(required = true, description = "The new status ID.")
  public String getNewStatusReference() {
    return newStatusReference;
  }

  public void setNewStatusReference(String newStatusReference) {
    this.newStatusReference = newStatusReference;
  }

  public StatusMigration oldStatusReference(String oldStatusReference) {
    this.oldStatusReference = oldStatusReference;
    return this;
  }

   /**
   * The old status ID.
   * @return oldStatusReference
  **/
  @Schema(required = true, description = "The old status ID.")
  public String getOldStatusReference() {
    return oldStatusReference;
  }

  public void setOldStatusReference(String oldStatusReference) {
    this.oldStatusReference = oldStatusReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMigration statusMigration = (StatusMigration) o;
    return Objects.equals(this.newStatusReference, statusMigration.newStatusReference) &&
        Objects.equals(this.oldStatusReference, statusMigration.oldStatusReference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newStatusReference, oldStatusReference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMigration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    newStatusReference: ").append(toIndentedString(newStatusReference)).append("\n");
    sb.append("    oldStatusReference: ").append(toIndentedString(oldStatusReference)).append("\n");
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
