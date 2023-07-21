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
 * VersionMoveBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class VersionMoveBean {
  @SerializedName("after")
  private String after = null;

  /**
   * An absolute position in which to place the moved version. Cannot be used with &#x60;after&#x60;.
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    @SerializedName("Earlier")
    EARLIER("Earlier"),
    @SerializedName("Later")
    LATER("Later"),
    @SerializedName("First")
    FIRST("First"),
    @SerializedName("Last")
    LAST("Last");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PositionEnum fromValue(String input) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PositionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("position")
  private PositionEnum position = null;

  public VersionMoveBean after(String after) {
    this.after = after;
    return this;
  }

   /**
   * The URL (self link) of the version after which to place the moved version. Cannot be used with &#x60;position&#x60;.
   * @return after
  **/
  @Schema(description = "The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public VersionMoveBean position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * An absolute position in which to place the moved version. Cannot be used with &#x60;after&#x60;.
   * @return position
  **/
  @Schema(description = "An absolute position in which to place the moved version. Cannot be used with `after`.")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionMoveBean versionMoveBean = (VersionMoveBean) o;
    return Objects.equals(this.after, versionMoveBean.after) &&
        Objects.equals(this.position, versionMoveBean.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionMoveBean {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
