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
import io.swagger.client.model.JqlQueryClause;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A JQL query clause that consists of nested clauses. For example, &#x60;(labels in (urgent, blocker) OR lastCommentedBy &#x3D; currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \&quot;A OR B AND C\&quot; is parsed as \&quot;(A OR B) AND C\&quot;. See Setting the precedence of operators for more information about precedence in JQL queries.&#x60;
 */
@Schema(description = "A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \"A OR B AND C\" is parsed as \"(A OR B) AND C\". See Setting the precedence of operators for more information about precedence in JQL queries.`")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class CompoundClause implements JqlQueryClause {
  @SerializedName("clauses")
  private List<JqlQueryClause> clauses = new ArrayList<JqlQueryClause>();

  /**
   * The operator between the clauses.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    @SerializedName("and")
    AND("and"),
    @SerializedName("or")
    OR("or"),
    @SerializedName("not")
    NOT("not");

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

  public CompoundClause clauses(List<JqlQueryClause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public CompoundClause addClausesItem(JqlQueryClause clausesItem) {
    this.clauses.add(clausesItem);
    return this;
  }

   /**
   * The list of nested clauses.
   * @return clauses
  **/
  @Schema(required = true, description = "The list of nested clauses.")
  public List<JqlQueryClause> getClauses() {
    return clauses;
  }

  public void setClauses(List<JqlQueryClause> clauses) {
    this.clauses = clauses;
  }

  public CompoundClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The operator between the clauses.
   * @return operator
  **/
  @Schema(required = true, description = "The operator between the clauses.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundClause compoundClause = (CompoundClause) o;
    return Objects.equals(this.clauses, compoundClause.clauses) &&
        Objects.equals(this.operator, compoundClause.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundClause {\n");
    
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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