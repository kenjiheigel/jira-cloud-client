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
import io.swagger.client.model.Worklog;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Paginated list of worklog details
 */
@Schema(description = "Paginated list of worklog details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class PageOfWorklogs extends HashMap<String, Object> {
  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("startAt")
  private Integer startAt = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("worklogs")
  private List<Worklog> worklogs = null;

   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of results that could be on the page.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @Schema(description = "The index of the first item returned on the page.")
  public Integer getStartAt() {
    return startAt;
  }

   /**
   * The number of results on the page.
   * @return total
  **/
  @Schema(description = "The number of results on the page.")
  public Integer getTotal() {
    return total;
  }

   /**
   * List of worklogs.
   * @return worklogs
  **/
  @Schema(description = "List of worklogs.")
  public List<Worklog> getWorklogs() {
    return worklogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfWorklogs pageOfWorklogs = (PageOfWorklogs) o;
    return Objects.equals(this.maxResults, pageOfWorklogs.maxResults) &&
        Objects.equals(this.startAt, pageOfWorklogs.startAt) &&
        Objects.equals(this.total, pageOfWorklogs.total) &&
        Objects.equals(this.worklogs, pageOfWorklogs.worklogs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, startAt, total, worklogs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfWorklogs {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    worklogs: ").append(toIndentedString(worklogs)).append("\n");
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
