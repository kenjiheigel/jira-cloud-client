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
import io.swagger.client.model.IncludedFields;
import io.swagger.client.model.IssueTransition;
import io.swagger.client.model.JsonTypeBean;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details about an issue.
 */
@Schema(description = "Details about an issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class IssueBean {
  @SerializedName("changelog")
  private AllOfIssueBeanChangelog changelog = null;

  @SerializedName("editmeta")
  private AllOfIssueBeanEditmeta editmeta = null;

  @SerializedName("expand")
  private String expand = null;

  @SerializedName("fields")
  private Map<String, Object> fields = null;

  @SerializedName("fieldsToInclude")
  private IncludedFields fieldsToInclude = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("names")
  private Map<String, String> names = null;

  @SerializedName("operations")
  private AllOfIssueBeanOperations operations = null;

  @SerializedName("properties")
  private Map<String, Object> properties = null;

  @SerializedName("renderedFields")
  private Map<String, Object> renderedFields = null;

  @SerializedName("schema")
  private Map<String, JsonTypeBean> schema = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("transitions")
  private List<IssueTransition> transitions = null;

  @SerializedName("versionedRepresentations")
  private Map<String, Map<String, Object>> versionedRepresentations = null;

   /**
   * Details of changelogs associated with the issue.
   * @return changelog
  **/
  @Schema(description = "Details of changelogs associated with the issue.")
  public AllOfIssueBeanChangelog getChangelog() {
    return changelog;
  }

   /**
   * The metadata for the fields on the issue that can be amended.
   * @return editmeta
  **/
  @Schema(description = "The metadata for the fields on the issue that can be amended.")
  public AllOfIssueBeanEditmeta getEditmeta() {
    return editmeta;
  }

   /**
   * Expand options that include additional issue details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional issue details in the response.")
  public String getExpand() {
    return expand;
  }

  public IssueBean fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IssueBean putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<String, Object>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @Schema(description = "")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IssueBean fieldsToInclude(IncludedFields fieldsToInclude) {
    this.fieldsToInclude = fieldsToInclude;
    return this;
  }

   /**
   * Get fieldsToInclude
   * @return fieldsToInclude
  **/
  @Schema(description = "")
  public IncludedFields getFieldsToInclude() {
    return fieldsToInclude;
  }

  public void setFieldsToInclude(IncludedFields fieldsToInclude) {
    this.fieldsToInclude = fieldsToInclude;
  }

   /**
   * The ID of the issue.
   * @return id
  **/
  @Schema(description = "The ID of the issue.")
  public String getId() {
    return id;
  }

   /**
   * The key of the issue.
   * @return key
  **/
  @Schema(description = "The key of the issue.")
  public String getKey() {
    return key;
  }

   /**
   * The ID and name of each field present on the issue.
   * @return names
  **/
  @Schema(description = "The ID and name of each field present on the issue.")
  public Map<String, String> getNames() {
    return names;
  }

   /**
   * The operations that can be performed on the issue.
   * @return operations
  **/
  @Schema(description = "The operations that can be performed on the issue.")
  public AllOfIssueBeanOperations getOperations() {
    return operations;
  }

   /**
   * Details of the issue properties identified in the request.
   * @return properties
  **/
  @Schema(description = "Details of the issue properties identified in the request.")
  public Map<String, Object> getProperties() {
    return properties;
  }

   /**
   * The rendered value of each field present on the issue.
   * @return renderedFields
  **/
  @Schema(description = "The rendered value of each field present on the issue.")
  public Map<String, Object> getRenderedFields() {
    return renderedFields;
  }

   /**
   * The schema describing each field present on the issue.
   * @return schema
  **/
  @Schema(description = "The schema describing each field present on the issue.")
  public Map<String, JsonTypeBean> getSchema() {
    return schema;
  }

   /**
   * The URL of the issue details.
   * @return self
  **/
  @Schema(description = "The URL of the issue details.")
  public String getSelf() {
    return self;
  }

   /**
   * The transitions that can be performed on the issue.
   * @return transitions
  **/
  @Schema(description = "The transitions that can be performed on the issue.")
  public List<IssueTransition> getTransitions() {
    return transitions;
  }

   /**
   * The versions of each field on the issue.
   * @return versionedRepresentations
  **/
  @Schema(description = "The versions of each field on the issue.")
  public Map<String, Map<String, Object>> getVersionedRepresentations() {
    return versionedRepresentations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueBean issueBean = (IssueBean) o;
    return Objects.equals(this.changelog, issueBean.changelog) &&
        Objects.equals(this.editmeta, issueBean.editmeta) &&
        Objects.equals(this.expand, issueBean.expand) &&
        Objects.equals(this.fields, issueBean.fields) &&
        Objects.equals(this.fieldsToInclude, issueBean.fieldsToInclude) &&
        Objects.equals(this.id, issueBean.id) &&
        Objects.equals(this.key, issueBean.key) &&
        Objects.equals(this.names, issueBean.names) &&
        Objects.equals(this.operations, issueBean.operations) &&
        Objects.equals(this.properties, issueBean.properties) &&
        Objects.equals(this.renderedFields, issueBean.renderedFields) &&
        Objects.equals(this.schema, issueBean.schema) &&
        Objects.equals(this.self, issueBean.self) &&
        Objects.equals(this.transitions, issueBean.transitions) &&
        Objects.equals(this.versionedRepresentations, issueBean.versionedRepresentations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changelog, editmeta, expand, fields, fieldsToInclude, id, key, names, operations, properties, renderedFields, schema, self, transitions, versionedRepresentations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBean {\n");
    
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    editmeta: ").append(toIndentedString(editmeta)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    fieldsToInclude: ").append(toIndentedString(fieldsToInclude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    renderedFields: ").append(toIndentedString(renderedFields)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    versionedRepresentations: ").append(toIndentedString(versionedRepresentations)).append("\n");
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
