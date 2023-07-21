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
 * Details of an issue remote link.
 */
@Schema(description = "Details of an issue remote link.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class RemoteIssueLink {
  @SerializedName("application")
  private AllOfRemoteIssueLinkApplication application = null;

  @SerializedName("globalId")
  private String globalId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("object")
  private AllOfRemoteIssueLinkObject object = null;

  @SerializedName("relationship")
  private String relationship = null;

  @SerializedName("self")
  private String self = null;

  public RemoteIssueLink application(AllOfRemoteIssueLinkApplication application) {
    this.application = application;
    return this;
  }

   /**
   * Details of the remote application the linked item is in.
   * @return application
  **/
  @Schema(description = "Details of the remote application the linked item is in.")
  public AllOfRemoteIssueLinkApplication getApplication() {
    return application;
  }

  public void setApplication(AllOfRemoteIssueLinkApplication application) {
    this.application = application;
  }

  public RemoteIssueLink globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * The global ID of the link, such as the ID of the item on the remote system.
   * @return globalId
  **/
  @Schema(description = "The global ID of the link, such as the ID of the item on the remote system.")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public RemoteIssueLink id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the link.
   * @return id
  **/
  @Schema(description = "The ID of the link.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RemoteIssueLink object(AllOfRemoteIssueLinkObject object) {
    this.object = object;
    return this;
  }

   /**
   * Details of the item linked to.
   * @return object
  **/
  @Schema(description = "Details of the item linked to.")
  public AllOfRemoteIssueLinkObject getObject() {
    return object;
  }

  public void setObject(AllOfRemoteIssueLinkObject object) {
    this.object = object;
  }

  public RemoteIssueLink relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Description of the relationship between the issue and the linked item.
   * @return relationship
  **/
  @Schema(description = "Description of the relationship between the issue and the linked item.")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public RemoteIssueLink self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the link.
   * @return self
  **/
  @Schema(description = "The URL of the link.")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteIssueLink remoteIssueLink = (RemoteIssueLink) o;
    return Objects.equals(this.application, remoteIssueLink.application) &&
        Objects.equals(this.globalId, remoteIssueLink.globalId) &&
        Objects.equals(this.id, remoteIssueLink.id) &&
        Objects.equals(this.object, remoteIssueLink.object) &&
        Objects.equals(this.relationship, remoteIssueLink.relationship) &&
        Objects.equals(this.self, remoteIssueLink.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, globalId, id, object, relationship, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLink {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
