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
 * Details about a licensed Jira application.
 */
@Schema(description = "Details about a licensed Jira application.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class LicensedApplication {
  @SerializedName("id")
  private String id = null;

  /**
   * The licensing plan.
   */
  @JsonAdapter(PlanEnum.Adapter.class)
  public enum PlanEnum {
    @SerializedName("UNLICENSED")
    UNLICENSED("UNLICENSED"),
    @SerializedName("FREE")
    FREE("FREE"),
    @SerializedName("PAID")
    PAID("PAID");

    private String value;

    PlanEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PlanEnum fromValue(String input) {
      for (PlanEnum b : PlanEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PlanEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PlanEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("plan")
  private PlanEnum plan = null;

   /**
   * The ID of the application.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the application.")
  public String getId() {
    return id;
  }

   /**
   * The licensing plan.
   * @return plan
  **/
  @Schema(required = true, description = "The licensing plan.")
  public PlanEnum getPlan() {
    return plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicensedApplication licensedApplication = (LicensedApplication) o;
    return Objects.equals(this.id, licensedApplication.id) &&
        Objects.equals(this.plan, licensedApplication.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicensedApplication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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
