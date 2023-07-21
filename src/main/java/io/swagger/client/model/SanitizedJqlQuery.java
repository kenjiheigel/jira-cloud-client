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
 * Details of the sanitized JQL query.
 */
@Schema(description = "Details of the sanitized JQL query.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class SanitizedJqlQuery {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("errors")
  private AllOfSanitizedJqlQueryErrors errors = null;

  @SerializedName("initialQuery")
  private String initialQuery = null;

  @SerializedName("sanitizedQuery")
  private String sanitizedQuery = null;

  public SanitizedJqlQuery accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user for whom sanitization was performed.
   * @return accountId
  **/
  @Schema(description = "The account ID of the user for whom sanitization was performed.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SanitizedJqlQuery errors(AllOfSanitizedJqlQueryErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * The list of errors.
   * @return errors
  **/
  @Schema(description = "The list of errors.")
  public AllOfSanitizedJqlQueryErrors getErrors() {
    return errors;
  }

  public void setErrors(AllOfSanitizedJqlQueryErrors errors) {
    this.errors = errors;
  }

  public SanitizedJqlQuery initialQuery(String initialQuery) {
    this.initialQuery = initialQuery;
    return this;
  }

   /**
   * The initial query.
   * @return initialQuery
  **/
  @Schema(description = "The initial query.")
  public String getInitialQuery() {
    return initialQuery;
  }

  public void setInitialQuery(String initialQuery) {
    this.initialQuery = initialQuery;
  }

  public SanitizedJqlQuery sanitizedQuery(String sanitizedQuery) {
    this.sanitizedQuery = sanitizedQuery;
    return this;
  }

   /**
   * The sanitized query, if there were no errors.
   * @return sanitizedQuery
  **/
  @Schema(description = "The sanitized query, if there were no errors.")
  public String getSanitizedQuery() {
    return sanitizedQuery;
  }

  public void setSanitizedQuery(String sanitizedQuery) {
    this.sanitizedQuery = sanitizedQuery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanitizedJqlQuery sanitizedJqlQuery = (SanitizedJqlQuery) o;
    return Objects.equals(this.accountId, sanitizedJqlQuery.accountId) &&
        Objects.equals(this.errors, sanitizedJqlQuery.errors) &&
        Objects.equals(this.initialQuery, sanitizedJqlQuery.initialQuery) &&
        Objects.equals(this.sanitizedQuery, sanitizedJqlQuery.sanitizedQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, errors, initialQuery, sanitizedQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanitizedJqlQuery {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    initialQuery: ").append(toIndentedString(initialQuery)).append("\n");
    sb.append("    sanitizedQuery: ").append(toIndentedString(sanitizedQuery)).append("\n");
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