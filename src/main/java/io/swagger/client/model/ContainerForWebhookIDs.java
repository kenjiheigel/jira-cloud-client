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
 * Container for a list of webhook IDs.
 */
@Schema(description = "Container for a list of webhook IDs.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class ContainerForWebhookIDs {
  @SerializedName("webhookIds")
  private List<Long> webhookIds = new ArrayList<Long>();

  public ContainerForWebhookIDs webhookIds(List<Long> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public ContainerForWebhookIDs addWebhookIdsItem(Long webhookIdsItem) {
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

   /**
   * A list of webhook IDs.
   * @return webhookIds
  **/
  @Schema(required = true, description = "A list of webhook IDs.")
  public List<Long> getWebhookIds() {
    return webhookIds;
  }

  public void setWebhookIds(List<Long> webhookIds) {
    this.webhookIds = webhookIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForWebhookIDs containerForWebhookIDs = (ContainerForWebhookIDs) o;
    return Objects.equals(this.webhookIds, containerForWebhookIDs.webhookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForWebhookIDs {\n");
    
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
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
