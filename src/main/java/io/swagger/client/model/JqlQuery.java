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
import io.swagger.client.model.JqlQueryOrderByClause;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A parsed JQL query.
 */
@Schema(description = "A parsed JQL query.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class JqlQuery {
  @SerializedName("orderBy")
  private JqlQueryOrderByClause orderBy = null;

  @SerializedName("where")
  private JqlQueryClause where = null;

  public JqlQuery orderBy(JqlQueryOrderByClause orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @Schema(description = "")
  public JqlQueryOrderByClause getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(JqlQueryOrderByClause orderBy) {
    this.orderBy = orderBy;
  }

  public JqlQuery where(JqlQueryClause where) {
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @Schema(description = "")
  public JqlQueryClause getWhere() {
    return where;
  }

  public void setWhere(JqlQueryClause where) {
    this.where = where;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQuery jqlQuery = (JqlQuery) o;
    return Objects.equals(this.orderBy, jqlQuery.orderBy) &&
        Objects.equals(this.where, jqlQuery.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, where);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQuery {\n");
    
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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
