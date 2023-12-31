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
import io.swagger.client.model.Comment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PaginatedResponseComment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class PaginatedResponseComment {
  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("results")
  private List<Comment> results = null;

  @SerializedName("startAt")
  private Long startAt = null;

  @SerializedName("total")
  private Long total = null;

  public PaginatedResponseComment maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public PaginatedResponseComment results(List<Comment> results) {
    this.results = results;
    return this;
  }

  public PaginatedResponseComment addResultsItem(Comment resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Comment>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<Comment> getResults() {
    return results;
  }

  public void setResults(List<Comment> results) {
    this.results = results;
  }

  public PaginatedResponseComment startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @Schema(description = "")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public PaginatedResponseComment total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedResponseComment paginatedResponseComment = (PaginatedResponseComment) o;
    return Objects.equals(this.maxResults, paginatedResponseComment.maxResults) &&
        Objects.equals(this.results, paginatedResponseComment.results) &&
        Objects.equals(this.startAt, paginatedResponseComment.startAt) &&
        Objects.equals(this.total, paginatedResponseComment.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, results, startAt, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResponseComment {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
