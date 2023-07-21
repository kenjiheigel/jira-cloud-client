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
import io.swagger.client.model.AvailableWorkflowConnectRule;
import io.swagger.client.model.AvailableWorkflowForgeRule;
import io.swagger.client.model.AvailableWorkflowSystemRule;
import io.swagger.client.model.AvailableWorkflowTriggers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * WorkflowCapabilities
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class WorkflowCapabilities {
  @SerializedName("connectRules")
  private List<AvailableWorkflowConnectRule> connectRules = null;

  /**
   * The scope of the workflow capabilities. &#x60;GLOBAL&#x60; for company-managed projects and &#x60;PROJECT&#x60; for team-managed projects.
   */
  @JsonAdapter(EditorScopeEnum.Adapter.class)
  public enum EditorScopeEnum {
    @SerializedName("PROJECT")
    PROJECT("PROJECT"),
    @SerializedName("GLOBAL")
    GLOBAL("GLOBAL");

    private String value;

    EditorScopeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EditorScopeEnum fromValue(String input) {
      for (EditorScopeEnum b : EditorScopeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EditorScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EditorScopeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EditorScopeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EditorScopeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("editorScope")
  private EditorScopeEnum editorScope = null;

  @SerializedName("forgeRules")
  private List<AvailableWorkflowForgeRule> forgeRules = null;

  /**
   * The types of projects that this capability set is available for.
   */
  @JsonAdapter(ProjectTypesEnum.Adapter.class)
  public enum ProjectTypesEnum {
    @SerializedName("software")
    SOFTWARE("software"),
    @SerializedName("service_desk")
    SERVICE_DESK("service_desk"),
    @SerializedName("product_discovery")
    PRODUCT_DISCOVERY("product_discovery"),
    @SerializedName("business")
    BUSINESS("business"),
    @SerializedName("unknown")
    UNKNOWN("unknown");

    private String value;

    ProjectTypesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProjectTypesEnum fromValue(String input) {
      for (ProjectTypesEnum b : ProjectTypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProjectTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTypesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProjectTypesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProjectTypesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("projectTypes")
  private List<ProjectTypesEnum> projectTypes = null;

  @SerializedName("systemRules")
  private List<AvailableWorkflowSystemRule> systemRules = null;

  @SerializedName("triggerRules")
  private List<AvailableWorkflowTriggers> triggerRules = null;

  public WorkflowCapabilities connectRules(List<AvailableWorkflowConnectRule> connectRules) {
    this.connectRules = connectRules;
    return this;
  }

  public WorkflowCapabilities addConnectRulesItem(AvailableWorkflowConnectRule connectRulesItem) {
    if (this.connectRules == null) {
      this.connectRules = new ArrayList<AvailableWorkflowConnectRule>();
    }
    this.connectRules.add(connectRulesItem);
    return this;
  }

   /**
   * The Connect provided ecosystem rules available.
   * @return connectRules
  **/
  @Schema(description = "The Connect provided ecosystem rules available.")
  public List<AvailableWorkflowConnectRule> getConnectRules() {
    return connectRules;
  }

  public void setConnectRules(List<AvailableWorkflowConnectRule> connectRules) {
    this.connectRules = connectRules;
  }

  public WorkflowCapabilities editorScope(EditorScopeEnum editorScope) {
    this.editorScope = editorScope;
    return this;
  }

   /**
   * The scope of the workflow capabilities. &#x60;GLOBAL&#x60; for company-managed projects and &#x60;PROJECT&#x60; for team-managed projects.
   * @return editorScope
  **/
  @Schema(description = "The scope of the workflow capabilities. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.")
  public EditorScopeEnum getEditorScope() {
    return editorScope;
  }

  public void setEditorScope(EditorScopeEnum editorScope) {
    this.editorScope = editorScope;
  }

  public WorkflowCapabilities forgeRules(List<AvailableWorkflowForgeRule> forgeRules) {
    this.forgeRules = forgeRules;
    return this;
  }

  public WorkflowCapabilities addForgeRulesItem(AvailableWorkflowForgeRule forgeRulesItem) {
    if (this.forgeRules == null) {
      this.forgeRules = new ArrayList<AvailableWorkflowForgeRule>();
    }
    this.forgeRules.add(forgeRulesItem);
    return this;
  }

   /**
   * The Forge provided ecosystem rules available.
   * @return forgeRules
  **/
  @Schema(description = "The Forge provided ecosystem rules available.")
  public List<AvailableWorkflowForgeRule> getForgeRules() {
    return forgeRules;
  }

  public void setForgeRules(List<AvailableWorkflowForgeRule> forgeRules) {
    this.forgeRules = forgeRules;
  }

  public WorkflowCapabilities projectTypes(List<ProjectTypesEnum> projectTypes) {
    this.projectTypes = projectTypes;
    return this;
  }

  public WorkflowCapabilities addProjectTypesItem(ProjectTypesEnum projectTypesItem) {
    if (this.projectTypes == null) {
      this.projectTypes = new ArrayList<ProjectTypesEnum>();
    }
    this.projectTypes.add(projectTypesItem);
    return this;
  }

   /**
   * The types of projects that this capability set is available for.
   * @return projectTypes
  **/
  @Schema(description = "The types of projects that this capability set is available for.")
  public List<ProjectTypesEnum> getProjectTypes() {
    return projectTypes;
  }

  public void setProjectTypes(List<ProjectTypesEnum> projectTypes) {
    this.projectTypes = projectTypes;
  }

  public WorkflowCapabilities systemRules(List<AvailableWorkflowSystemRule> systemRules) {
    this.systemRules = systemRules;
    return this;
  }

  public WorkflowCapabilities addSystemRulesItem(AvailableWorkflowSystemRule systemRulesItem) {
    if (this.systemRules == null) {
      this.systemRules = new ArrayList<AvailableWorkflowSystemRule>();
    }
    this.systemRules.add(systemRulesItem);
    return this;
  }

   /**
   * The Atlassian provided system rules available.
   * @return systemRules
  **/
  @Schema(description = "The Atlassian provided system rules available.")
  public List<AvailableWorkflowSystemRule> getSystemRules() {
    return systemRules;
  }

  public void setSystemRules(List<AvailableWorkflowSystemRule> systemRules) {
    this.systemRules = systemRules;
  }

  public WorkflowCapabilities triggerRules(List<AvailableWorkflowTriggers> triggerRules) {
    this.triggerRules = triggerRules;
    return this;
  }

  public WorkflowCapabilities addTriggerRulesItem(AvailableWorkflowTriggers triggerRulesItem) {
    if (this.triggerRules == null) {
      this.triggerRules = new ArrayList<AvailableWorkflowTriggers>();
    }
    this.triggerRules.add(triggerRulesItem);
    return this;
  }

   /**
   * The trigger rules available.
   * @return triggerRules
  **/
  @Schema(description = "The trigger rules available.")
  public List<AvailableWorkflowTriggers> getTriggerRules() {
    return triggerRules;
  }

  public void setTriggerRules(List<AvailableWorkflowTriggers> triggerRules) {
    this.triggerRules = triggerRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCapabilities workflowCapabilities = (WorkflowCapabilities) o;
    return Objects.equals(this.connectRules, workflowCapabilities.connectRules) &&
        Objects.equals(this.editorScope, workflowCapabilities.editorScope) &&
        Objects.equals(this.forgeRules, workflowCapabilities.forgeRules) &&
        Objects.equals(this.projectTypes, workflowCapabilities.projectTypes) &&
        Objects.equals(this.systemRules, workflowCapabilities.systemRules) &&
        Objects.equals(this.triggerRules, workflowCapabilities.triggerRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectRules, editorScope, forgeRules, projectTypes, systemRules, triggerRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCapabilities {\n");
    
    sb.append("    connectRules: ").append(toIndentedString(connectRules)).append("\n");
    sb.append("    editorScope: ").append(toIndentedString(editorScope)).append("\n");
    sb.append("    forgeRules: ").append(toIndentedString(forgeRules)).append("\n");
    sb.append("    projectTypes: ").append(toIndentedString(projectTypes)).append("\n");
    sb.append("    systemRules: ").append(toIndentedString(systemRules)).append("\n");
    sb.append("    triggerRules: ").append(toIndentedString(triggerRules)).append("\n");
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
