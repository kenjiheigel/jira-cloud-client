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
 * JiraExpressionEvalRequestBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class JiraExpressionEvalRequestBean {
  @SerializedName("context")
  private AllOfJiraExpressionEvalRequestBeanContext context = null;

  @SerializedName("expression")
  private String expression = null;

  public JiraExpressionEvalRequestBean context(AllOfJiraExpressionEvalRequestBeanContext context) {
    this.context = context;
    return this;
  }

   /**
   * The context in which the Jira expression is evaluated.
   * @return context
  **/
  @Schema(description = "The context in which the Jira expression is evaluated.")
  public AllOfJiraExpressionEvalRequestBeanContext getContext() {
    return context;
  }

  public void setContext(AllOfJiraExpressionEvalRequestBeanContext context) {
    this.context = context;
  }

  public JiraExpressionEvalRequestBean expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The Jira expression to evaluate.
   * @return expression
  **/
  @Schema(example = "{ key: issue.key, type: issue.issueType.name, links: issue.links.map(link => link.linkedIssue.id) }", required = true, description = "The Jira expression to evaluate.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalRequestBean jiraExpressionEvalRequestBean = (JiraExpressionEvalRequestBean) o;
    return Objects.equals(this.context, jiraExpressionEvalRequestBean.context) &&
        Objects.equals(this.expression, jiraExpressionEvalRequestBean.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, expression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalRequestBean {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
