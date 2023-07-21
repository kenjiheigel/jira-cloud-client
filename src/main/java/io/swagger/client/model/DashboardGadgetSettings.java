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
 * Details of the settings for a dashboard gadget.
 */
@Schema(description = "Details of the settings for a dashboard gadget.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class DashboardGadgetSettings {
  @SerializedName("color")
  private String color = null;

  @SerializedName("ignoreUriAndModuleKeyValidation")
  private Boolean ignoreUriAndModuleKeyValidation = null;

  @SerializedName("moduleKey")
  private String moduleKey = null;

  @SerializedName("position")
  private AllOfDashboardGadgetSettingsPosition position = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("uri")
  private String uri = null;

  public DashboardGadgetSettings color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The color of the gadget. Should be one of &#x60;blue&#x60;, &#x60;red&#x60;, &#x60;yellow&#x60;, &#x60;green&#x60;, &#x60;cyan&#x60;, &#x60;purple&#x60;, &#x60;gray&#x60;, or &#x60;white&#x60;.
   * @return color
  **/
  @Schema(description = "The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DashboardGadgetSettings ignoreUriAndModuleKeyValidation(Boolean ignoreUriAndModuleKeyValidation) {
    this.ignoreUriAndModuleKeyValidation = ignoreUriAndModuleKeyValidation;
    return this;
  }

   /**
   * Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn&#x27;t installed.
   * @return ignoreUriAndModuleKeyValidation
  **/
  @Schema(description = "Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.")
  public Boolean isIgnoreUriAndModuleKeyValidation() {
    return ignoreUriAndModuleKeyValidation;
  }

  public void setIgnoreUriAndModuleKeyValidation(Boolean ignoreUriAndModuleKeyValidation) {
    this.ignoreUriAndModuleKeyValidation = ignoreUriAndModuleKeyValidation;
  }

  public DashboardGadgetSettings moduleKey(String moduleKey) {
    this.moduleKey = moduleKey;
    return this;
  }

   /**
   * The module key of the gadget type. Can&#x27;t be provided with &#x60;uri&#x60;.
   * @return moduleKey
  **/
  @Schema(description = "The module key of the gadget type. Can't be provided with `uri`.")
  public String getModuleKey() {
    return moduleKey;
  }

  public void setModuleKey(String moduleKey) {
    this.moduleKey = moduleKey;
  }

  public DashboardGadgetSettings position(AllOfDashboardGadgetSettingsPosition position) {
    this.position = position;
    return this;
  }

   /**
   * The position of the gadget. When the gadget is placed into the position, other gadgets in the same column are moved down to accommodate it.
   * @return position
  **/
  @Schema(description = "The position of the gadget. When the gadget is placed into the position, other gadgets in the same column are moved down to accommodate it.")
  public AllOfDashboardGadgetSettingsPosition getPosition() {
    return position;
  }

  public void setPosition(AllOfDashboardGadgetSettingsPosition position) {
    this.position = position;
  }

  public DashboardGadgetSettings title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the gadget.
   * @return title
  **/
  @Schema(description = "The title of the gadget.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DashboardGadgetSettings uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the gadget type. Can&#x27;t be provided with &#x60;moduleKey&#x60;.
   * @return uri
  **/
  @Schema(description = "The URI of the gadget type. Can't be provided with `moduleKey`.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetSettings dashboardGadgetSettings = (DashboardGadgetSettings) o;
    return Objects.equals(this.color, dashboardGadgetSettings.color) &&
        Objects.equals(this.ignoreUriAndModuleKeyValidation, dashboardGadgetSettings.ignoreUriAndModuleKeyValidation) &&
        Objects.equals(this.moduleKey, dashboardGadgetSettings.moduleKey) &&
        Objects.equals(this.position, dashboardGadgetSettings.position) &&
        Objects.equals(this.title, dashboardGadgetSettings.title) &&
        Objects.equals(this.uri, dashboardGadgetSettings.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, ignoreUriAndModuleKeyValidation, moduleKey, position, title, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetSettings {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    ignoreUriAndModuleKeyValidation: ").append(toIndentedString(ignoreUriAndModuleKeyValidation)).append("\n");
    sb.append("    moduleKey: ").append(toIndentedString(moduleKey)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
