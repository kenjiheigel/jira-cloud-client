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
import java.util.List;
/**
 * Details of the projects the option is available in.
 */
@Schema(description = "Details of the projects the option is available in.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueFieldOptionConfiguration {
  /**
   * Gets or Sets attributes
   */
  @JsonAdapter(AttributesEnum.Adapter.class)
  public enum AttributesEnum {
    @SerializedName("notSelectable")
    NOTSELECTABLE("notSelectable"),
    @SerializedName("defaultValue")
    DEFAULTVALUE("defaultValue");

    private String value;

    AttributesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AttributesEnum fromValue(String input) {
      for (AttributesEnum b : AttributesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AttributesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttributesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AttributesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AttributesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("attributes")
  private List<AttributesEnum> attributes = null;

  @SerializedName("scope")
  private AllOfIssueFieldOptionConfigurationScope scope = null;

  public IssueFieldOptionConfiguration attributes(List<AttributesEnum> attributes) {
    this.attributes = attributes;
    return this;
  }

  public IssueFieldOptionConfiguration addAttributesItem(AttributesEnum attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<AttributesEnum>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * DEPRECATED
   * @return attributes
  **/
  @Schema(description = "DEPRECATED")
  public List<AttributesEnum> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributesEnum> attributes) {
    this.attributes = attributes;
  }

  public IssueFieldOptionConfiguration scope(AllOfIssueFieldOptionConfigurationScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Defines the projects that the option is available in. If the scope is not defined, then the option is available in all projects.
   * @return scope
  **/
  @Schema(description = "Defines the projects that the option is available in. If the scope is not defined, then the option is available in all projects.")
  public AllOfIssueFieldOptionConfigurationScope getScope() {
    return scope;
  }

  public void setScope(AllOfIssueFieldOptionConfigurationScope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFieldOptionConfiguration issueFieldOptionConfiguration = (IssueFieldOptionConfiguration) o;
    return Objects.equals(this.attributes, issueFieldOptionConfiguration.attributes) &&
        Objects.equals(this.scope, issueFieldOptionConfiguration.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOptionConfiguration {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
