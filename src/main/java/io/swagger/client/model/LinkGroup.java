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
import io.swagger.client.model.LinkGroup;
import io.swagger.client.model.SimpleLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details a link group, which defines issue operations.
 */
@Schema(description = "Details a link group, which defines issue operations.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class LinkGroup {
  @SerializedName("groups")
  private List<LinkGroup> groups = null;

  @SerializedName("header")
  private SimpleLink header = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("links")
  private List<SimpleLink> links = null;

  @SerializedName("styleClass")
  private String styleClass = null;

  @SerializedName("weight")
  private Integer weight = null;

  public LinkGroup groups(List<LinkGroup> groups) {
    this.groups = groups;
    return this;
  }

  public LinkGroup addGroupsItem(LinkGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<LinkGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<LinkGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<LinkGroup> groups) {
    this.groups = groups;
  }

  public LinkGroup header(SimpleLink header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @Schema(description = "")
  public SimpleLink getHeader() {
    return header;
  }

  public void setHeader(SimpleLink header) {
    this.header = header;
  }

  public LinkGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LinkGroup links(List<SimpleLink> links) {
    this.links = links;
    return this;
  }

  public LinkGroup addLinksItem(SimpleLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<SimpleLink>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public List<SimpleLink> getLinks() {
    return links;
  }

  public void setLinks(List<SimpleLink> links) {
    this.links = links;
  }

  public LinkGroup styleClass(String styleClass) {
    this.styleClass = styleClass;
    return this;
  }

   /**
   * Get styleClass
   * @return styleClass
  **/
  @Schema(description = "")
  public String getStyleClass() {
    return styleClass;
  }

  public void setStyleClass(String styleClass) {
    this.styleClass = styleClass;
  }

  public LinkGroup weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGroup linkGroup = (LinkGroup) o;
    return Objects.equals(this.groups, linkGroup.groups) &&
        Objects.equals(this.header, linkGroup.header) &&
        Objects.equals(this.id, linkGroup.id) &&
        Objects.equals(this.links, linkGroup.links) &&
        Objects.equals(this.styleClass, linkGroup.styleClass) &&
        Objects.equals(this.weight, linkGroup.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, header, id, links, styleClass, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGroup {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    styleClass: ").append(toIndentedString(styleClass)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
