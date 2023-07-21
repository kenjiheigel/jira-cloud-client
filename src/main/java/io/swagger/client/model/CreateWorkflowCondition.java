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
import io.swagger.client.model.CreateWorkflowCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * A workflow transition condition.
 */
@Schema(description = "A workflow transition condition.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CreateWorkflowCondition {
  @SerializedName("conditions")
  private List<CreateWorkflowCondition> conditions = null;

  @SerializedName("configuration")
  private Map<String, Object> _configuration = null;

  /**
   * The compound condition operator.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    @SerializedName("AND")
    AND("AND"),
    @SerializedName("OR")
    OR("OR");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperatorEnum fromValue(String input) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OperatorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("type")
  private String type = null;

  public CreateWorkflowCondition conditions(List<CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public CreateWorkflowCondition addConditionsItem(CreateWorkflowCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<CreateWorkflowCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The list of workflow conditions.
   * @return conditions
  **/
  @Schema(description = "The list of workflow conditions.")
  public List<CreateWorkflowCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
  }

  public CreateWorkflowCondition _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public CreateWorkflowCondition putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<String, Object>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  **/
  @Schema(description = "EXPERIMENTAL. The configuration of the transition rule.")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }

  public CreateWorkflowCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The compound condition operator.
   * @return operator
  **/
  @Schema(description = "The compound condition operator.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public CreateWorkflowCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the transition rule.
   * @return type
  **/
  @Schema(description = "The type of the transition rule.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowCondition createWorkflowCondition = (CreateWorkflowCondition) o;
    return Objects.equals(this.conditions, createWorkflowCondition.conditions) &&
        Objects.equals(this._configuration, createWorkflowCondition._configuration) &&
        Objects.equals(this.operator, createWorkflowCondition.operator) &&
        Objects.equals(this.type, createWorkflowCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, _configuration, operator, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowCondition {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
