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
import java.util.HashMap;
import java.util.Map;
/**
 * Details of a remote issue link.
 */
@Schema(description = "Details of a remote issue link.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class RemoteIssueLinkRequest extends HashMap<String, Object> {
  @SerializedName("application")
  private AllOfRemoteIssueLinkRequestApplication application = null;

  @SerializedName("globalId")
  private String globalId = null;

  @SerializedName("object")
  private AllOfRemoteIssueLinkRequestObject object = null;

  @SerializedName("relationship")
  private String relationship = null;

  public RemoteIssueLinkRequest application(AllOfRemoteIssueLinkRequestApplication application) {
    this.application = application;
    return this;
  }

   /**
   * Details of the remote application the linked item is in. For example, trello.
   * @return application
  **/
  @Schema(description = "Details of the remote application the linked item is in. For example, trello.")
  public AllOfRemoteIssueLinkRequestApplication getApplication() {
    return application;
  }

  public void setApplication(AllOfRemoteIssueLinkRequestApplication application) {
    this.application = application;
  }

  public RemoteIssueLinkRequest globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: &#x60;appId&#x3D;456&amp;pageId&#x3D;123&#x60;.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record&#x27;s Jira ID.  The maximum length is 255 characters.
   * @return globalId
  **/
  @Schema(description = "An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public RemoteIssueLinkRequest object(AllOfRemoteIssueLinkRequestObject object) {
    this.object = object;
    return this;
  }

   /**
   * Details of the item linked to.
   * @return object
  **/
  @Schema(required = true, description = "Details of the item linked to.")
  public AllOfRemoteIssueLinkRequestObject getObject() {
    return object;
  }

  public void setObject(AllOfRemoteIssueLinkRequestObject object) {
    this.object = object;
  }

  public RemoteIssueLinkRequest relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Description of the relationship between the issue and the linked item. If not set, the relationship description \&quot;links to\&quot; is used in Jira.
   * @return relationship
  **/
  @Schema(description = "Description of the relationship between the issue and the linked item. If not set, the relationship description \"links to\" is used in Jira.")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteIssueLinkRequest remoteIssueLinkRequest = (RemoteIssueLinkRequest) o;
    return Objects.equals(this.application, remoteIssueLinkRequest.application) &&
        Objects.equals(this.globalId, remoteIssueLinkRequest.globalId) &&
        Objects.equals(this.object, remoteIssueLinkRequest.object) &&
        Objects.equals(this.relationship, remoteIssueLinkRequest.relationship) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, globalId, object, relationship, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLinkRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
