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
import io.swagger.client.model.ProjectFeature;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The list of features on a project.
 */
@Schema(description = "The list of features on a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class ContainerForProjectFeatures {
  @SerializedName("features")
  private List<ProjectFeature> features = null;

  public ContainerForProjectFeatures features(List<ProjectFeature> features) {
    this.features = features;
    return this;
  }

  public ContainerForProjectFeatures addFeaturesItem(ProjectFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<ProjectFeature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * The project features.
   * @return features
  **/
  @Schema(description = "The project features.")
  public List<ProjectFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<ProjectFeature> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForProjectFeatures containerForProjectFeatures = (ContainerForProjectFeatures) o;
    return Objects.equals(this.features, containerForProjectFeatures.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForProjectFeatures {\n");
    
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
