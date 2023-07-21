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
 * UserBeanAvatarUrls
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class UserBeanAvatarUrls {
  @SerializedName("16x16")
  private String _16x16 = null;

  @SerializedName("24x24")
  private String _24x24 = null;

  @SerializedName("32x32")
  private String _32x32 = null;

  @SerializedName("48x48")
  private String _48x48 = null;

  public UserBeanAvatarUrls _16x16(String _16x16) {
    this._16x16 = _16x16;
    return this;
  }

   /**
   * The URL of the user&#x27;s 16x16 pixel avatar.
   * @return _16x16
  **/
  @Schema(description = "The URL of the user's 16x16 pixel avatar.")
  public String get16x16() {
    return _16x16;
  }

  public void set16x16(String _16x16) {
    this._16x16 = _16x16;
  }

  public UserBeanAvatarUrls _24x24(String _24x24) {
    this._24x24 = _24x24;
    return this;
  }

   /**
   * The URL of the user&#x27;s 24x24 pixel avatar.
   * @return _24x24
  **/
  @Schema(description = "The URL of the user's 24x24 pixel avatar.")
  public String get24x24() {
    return _24x24;
  }

  public void set24x24(String _24x24) {
    this._24x24 = _24x24;
  }

  public UserBeanAvatarUrls _32x32(String _32x32) {
    this._32x32 = _32x32;
    return this;
  }

   /**
   * The URL of the user&#x27;s 32x32 pixel avatar.
   * @return _32x32
  **/
  @Schema(description = "The URL of the user's 32x32 pixel avatar.")
  public String get32x32() {
    return _32x32;
  }

  public void set32x32(String _32x32) {
    this._32x32 = _32x32;
  }

  public UserBeanAvatarUrls _48x48(String _48x48) {
    this._48x48 = _48x48;
    return this;
  }

   /**
   * The URL of the user&#x27;s 48x48 pixel avatar.
   * @return _48x48
  **/
  @Schema(description = "The URL of the user's 48x48 pixel avatar.")
  public String get48x48() {
    return _48x48;
  }

  public void set48x48(String _48x48) {
    this._48x48 = _48x48;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBeanAvatarUrls userBeanAvatarUrls = (UserBeanAvatarUrls) o;
    return Objects.equals(this._16x16, userBeanAvatarUrls._16x16) &&
        Objects.equals(this._24x24, userBeanAvatarUrls._24x24) &&
        Objects.equals(this._32x32, userBeanAvatarUrls._32x32) &&
        Objects.equals(this._48x48, userBeanAvatarUrls._48x48);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_16x16, _24x24, _32x32, _48x48);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBeanAvatarUrls {\n");
    
    sb.append("    _16x16: ").append(toIndentedString(_16x16)).append("\n");
    sb.append("    _24x24: ").append(toIndentedString(_24x24)).append("\n");
    sb.append("    _32x32: ").append(toIndentedString(_32x32)).append("\n");
    sb.append("    _48x48: ").append(toIndentedString(_48x48)).append("\n");
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
