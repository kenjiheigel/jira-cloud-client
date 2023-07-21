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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details about an issue security scheme.
 */
@Schema(description = "Details about an issue security scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class SecuritySchemeWithProjects extends HashMap<String, Object> {
  @SerializedName("defaultLevel")
  private Long defaultLevel = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectIds")
  private List<Long> projectIds = null;

  @SerializedName("self")
  private String self = null;

   /**
   * The default level ID of the issue security scheme.
   * @return defaultLevel
  **/
  @Schema(description = "The default level ID of the issue security scheme.")
  public Long getDefaultLevel() {
    return defaultLevel;
  }

   /**
   * The description of the issue security scheme.
   * @return description
  **/
  @Schema(description = "The description of the issue security scheme.")
  public String getDescription() {
    return description;
  }

   /**
   * The ID of the issue security scheme.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the issue security scheme.")
  public Long getId() {
    return id;
  }

   /**
   * The name of the issue security scheme.
   * @return name
  **/
  @Schema(required = true, description = "The name of the issue security scheme.")
  public String getName() {
    return name;
  }

   /**
   * The list of project IDs associated with the issue security scheme.
   * @return projectIds
  **/
  @Schema(description = "The list of project IDs associated with the issue security scheme.")
  public List<Long> getProjectIds() {
    return projectIds;
  }

   /**
   * The URL of the issue security scheme.
   * @return self
  **/
  @Schema(required = true, description = "The URL of the issue security scheme.")
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
    SecuritySchemeWithProjects securitySchemeWithProjects = (SecuritySchemeWithProjects) o;
    return Objects.equals(this.defaultLevel, securitySchemeWithProjects.defaultLevel) &&
        Objects.equals(this.description, securitySchemeWithProjects.description) &&
        Objects.equals(this.id, securitySchemeWithProjects.id) &&
        Objects.equals(this.name, securitySchemeWithProjects.name) &&
        Objects.equals(this.projectIds, securitySchemeWithProjects.projectIds) &&
        Objects.equals(this.self, securitySchemeWithProjects.self) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLevel, description, id, name, projectIds, self, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemeWithProjects {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultLevel: ").append(toIndentedString(defaultLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
