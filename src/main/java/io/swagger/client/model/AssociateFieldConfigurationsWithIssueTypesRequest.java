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
import io.swagger.client.model.FieldConfigurationToIssueTypeMapping;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of a field configuration to issue type mappings.
 */
@Schema(description = "Details of a field configuration to issue type mappings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class AssociateFieldConfigurationsWithIssueTypesRequest {
  @SerializedName("mappings")
  private List<FieldConfigurationToIssueTypeMapping> mappings = new ArrayList<FieldConfigurationToIssueTypeMapping>();

  public AssociateFieldConfigurationsWithIssueTypesRequest mappings(List<FieldConfigurationToIssueTypeMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public AssociateFieldConfigurationsWithIssueTypesRequest addMappingsItem(FieldConfigurationToIssueTypeMapping mappingsItem) {
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Field configuration to issue type mappings.
   * @return mappings
  **/
  @Schema(required = true, description = "Field configuration to issue type mappings.")
  public List<FieldConfigurationToIssueTypeMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<FieldConfigurationToIssueTypeMapping> mappings) {
    this.mappings = mappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateFieldConfigurationsWithIssueTypesRequest associateFieldConfigurationsWithIssueTypesRequest = (AssociateFieldConfigurationsWithIssueTypesRequest) o;
    return Objects.equals(this.mappings, associateFieldConfigurationsWithIssueTypesRequest.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateFieldConfigurationsWithIssueTypesRequest {\n");
    
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
