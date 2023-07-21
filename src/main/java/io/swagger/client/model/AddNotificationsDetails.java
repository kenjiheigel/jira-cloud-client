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
import io.swagger.client.model.NotificationSchemeEventDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of notifications which should be added to the notification scheme.
 */
@Schema(description = "Details of notifications which should be added to the notification scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class AddNotificationsDetails extends HashMap<String, Object> {
  @SerializedName("notificationSchemeEvents")
  private List<NotificationSchemeEventDetails> notificationSchemeEvents = new ArrayList<NotificationSchemeEventDetails>();

  public AddNotificationsDetails notificationSchemeEvents(List<NotificationSchemeEventDetails> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public AddNotificationsDetails addNotificationSchemeEventsItem(NotificationSchemeEventDetails notificationSchemeEventsItem) {
    this.notificationSchemeEvents.add(notificationSchemeEventsItem);
    return this;
  }

   /**
   * The list of notifications which should be added to the notification scheme.
   * @return notificationSchemeEvents
  **/
  @Schema(required = true, description = "The list of notifications which should be added to the notification scheme.")
  public List<NotificationSchemeEventDetails> getNotificationSchemeEvents() {
    return notificationSchemeEvents;
  }

  public void setNotificationSchemeEvents(List<NotificationSchemeEventDetails> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddNotificationsDetails addNotificationsDetails = (AddNotificationsDetails) o;
    return Objects.equals(this.notificationSchemeEvents, addNotificationsDetails.notificationSchemeEvents) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationSchemeEvents, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddNotificationsDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    notificationSchemeEvents: ").append(toIndentedString(notificationSchemeEvents)).append("\n");
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
