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
import io.swagger.client.model.GroupName;
import io.swagger.client.model.UserDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of the users and groups to receive the notification.
 */
@Schema(description = "Details of the users and groups to receive the notification.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class NotificationRecipients extends HashMap<String, Object> {
  @SerializedName("assignee")
  private Boolean assignee = null;

  @SerializedName("groupIds")
  private List<String> groupIds = null;

  @SerializedName("groups")
  private List<GroupName> groups = null;

  @SerializedName("reporter")
  private Boolean reporter = null;

  @SerializedName("users")
  private List<UserDetails> users = null;

  @SerializedName("voters")
  private Boolean voters = null;

  @SerializedName("watchers")
  private Boolean watchers = null;

  public NotificationRecipients assignee(Boolean assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#x27;s assignees.
   * @return assignee
  **/
  @Schema(description = "Whether the notification should be sent to the issue's assignees.")
  public Boolean isAssignee() {
    return assignee;
  }

  public void setAssignee(Boolean assignee) {
    this.assignee = assignee;
  }

  public NotificationRecipients groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public NotificationRecipients addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<String>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * List of groupIds to receive the notification.
   * @return groupIds
  **/
  @Schema(description = "List of groupIds to receive the notification.")
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public NotificationRecipients groups(List<GroupName> groups) {
    this.groups = groups;
    return this;
  }

  public NotificationRecipients addGroupsItem(GroupName groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GroupName>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groups to receive the notification.
   * @return groups
  **/
  @Schema(description = "List of groups to receive the notification.")
  public List<GroupName> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupName> groups) {
    this.groups = groups;
  }

  public NotificationRecipients reporter(Boolean reporter) {
    this.reporter = reporter;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#x27;s reporter.
   * @return reporter
  **/
  @Schema(description = "Whether the notification should be sent to the issue's reporter.")
  public Boolean isReporter() {
    return reporter;
  }

  public void setReporter(Boolean reporter) {
    this.reporter = reporter;
  }

  public NotificationRecipients users(List<UserDetails> users) {
    this.users = users;
    return this;
  }

  public NotificationRecipients addUsersItem(UserDetails usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserDetails>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users to receive the notification.
   * @return users
  **/
  @Schema(description = "List of users to receive the notification.")
  public List<UserDetails> getUsers() {
    return users;
  }

  public void setUsers(List<UserDetails> users) {
    this.users = users;
  }

  public NotificationRecipients voters(Boolean voters) {
    this.voters = voters;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#x27;s voters.
   * @return voters
  **/
  @Schema(description = "Whether the notification should be sent to the issue's voters.")
  public Boolean isVoters() {
    return voters;
  }

  public void setVoters(Boolean voters) {
    this.voters = voters;
  }

  public NotificationRecipients watchers(Boolean watchers) {
    this.watchers = watchers;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#x27;s watchers.
   * @return watchers
  **/
  @Schema(description = "Whether the notification should be sent to the issue's watchers.")
  public Boolean isWatchers() {
    return watchers;
  }

  public void setWatchers(Boolean watchers) {
    this.watchers = watchers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRecipients notificationRecipients = (NotificationRecipients) o;
    return Objects.equals(this.assignee, notificationRecipients.assignee) &&
        Objects.equals(this.groupIds, notificationRecipients.groupIds) &&
        Objects.equals(this.groups, notificationRecipients.groups) &&
        Objects.equals(this.reporter, notificationRecipients.reporter) &&
        Objects.equals(this.users, notificationRecipients.users) &&
        Objects.equals(this.voters, notificationRecipients.voters) &&
        Objects.equals(this.watchers, notificationRecipients.watchers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, groupIds, groups, reporter, users, voters, watchers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipients {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
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
