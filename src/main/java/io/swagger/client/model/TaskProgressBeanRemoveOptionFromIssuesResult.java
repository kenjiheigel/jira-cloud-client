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
 * Details about a task.
 */
@Schema(description = "Details about a task.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-21T14:14:33.600-07:00[America/Los_Angeles]")

public class TaskProgressBeanRemoveOptionFromIssuesResult {
  @SerializedName("description")
  private String description = null;

  @SerializedName("elapsedRuntime")
  private Long elapsedRuntime = null;

  @SerializedName("finished")
  private Long finished = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lastUpdate")
  private Long lastUpdate = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("progress")
  private Long progress = null;

  @SerializedName("result")
  private AllOfTaskProgressBeanRemoveOptionFromIssuesResultResult result = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("started")
  private Long started = null;

  /**
   * The status of the task.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("ENQUEUED")
    ENQUEUED("ENQUEUED"),
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    @SerializedName("COMPLETE")
    COMPLETE("COMPLETE"),
    @SerializedName("FAILED")
    FAILED("FAILED"),
    @SerializedName("CANCEL_REQUESTED")
    CANCEL_REQUESTED("CANCEL_REQUESTED"),
    @SerializedName("CANCELLED")
    CANCELLED("CANCELLED"),
    @SerializedName("DEAD")
    DEAD("DEAD");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("submitted")
  private Long submitted = null;

  @SerializedName("submittedBy")
  private Long submittedBy = null;

  public TaskProgressBeanRemoveOptionFromIssuesResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the task.
   * @return description
  **/
  @Schema(description = "The description of the task.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult elapsedRuntime(Long elapsedRuntime) {
    this.elapsedRuntime = elapsedRuntime;
    return this;
  }

   /**
   * The execution time of the task, in milliseconds.
   * @return elapsedRuntime
  **/
  @Schema(required = true, description = "The execution time of the task, in milliseconds.")
  public Long getElapsedRuntime() {
    return elapsedRuntime;
  }

  public void setElapsedRuntime(Long elapsedRuntime) {
    this.elapsedRuntime = elapsedRuntime;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult finished(Long finished) {
    this.finished = finished;
    return this;
  }

   /**
   * A timestamp recording when the task was finished.
   * @return finished
  **/
  @Schema(description = "A timestamp recording when the task was finished.")
  public Long getFinished() {
    return finished;
  }

  public void setFinished(Long finished) {
    this.finished = finished;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the task.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the task.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult lastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * A timestamp recording when the task progress was last updated.
   * @return lastUpdate
  **/
  @Schema(required = true, description = "A timestamp recording when the task progress was last updated.")
  public Long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Information about the progress of the task.
   * @return message
  **/
  @Schema(description = "Information about the progress of the task.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult progress(Long progress) {
    this.progress = progress;
    return this;
  }

   /**
   * The progress of the task, as a percentage complete.
   * @return progress
  **/
  @Schema(required = true, description = "The progress of the task, as a percentage complete.")
  public Long getProgress() {
    return progress;
  }

  public void setProgress(Long progress) {
    this.progress = progress;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult result(AllOfTaskProgressBeanRemoveOptionFromIssuesResultResult result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the task execution.
   * @return result
  **/
  @Schema(description = "The result of the task execution.")
  public AllOfTaskProgressBeanRemoveOptionFromIssuesResultResult getResult() {
    return result;
  }

  public void setResult(AllOfTaskProgressBeanRemoveOptionFromIssuesResultResult result) {
    this.result = result;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the task.
   * @return self
  **/
  @Schema(required = true, description = "The URL of the task.")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult started(Long started) {
    this.started = started;
    return this;
  }

   /**
   * A timestamp recording when the task was started.
   * @return started
  **/
  @Schema(description = "A timestamp recording when the task was started.")
  public Long getStarted() {
    return started;
  }

  public void setStarted(Long started) {
    this.started = started;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the task.
   * @return status
  **/
  @Schema(required = true, description = "The status of the task.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult submitted(Long submitted) {
    this.submitted = submitted;
    return this;
  }

   /**
   * A timestamp recording when the task was submitted.
   * @return submitted
  **/
  @Schema(required = true, description = "A timestamp recording when the task was submitted.")
  public Long getSubmitted() {
    return submitted;
  }

  public void setSubmitted(Long submitted) {
    this.submitted = submitted;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult submittedBy(Long submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }

   /**
   * The ID of the user who submitted the task.
   * @return submittedBy
  **/
  @Schema(required = true, description = "The ID of the user who submitted the task.")
  public Long getSubmittedBy() {
    return submittedBy;
  }

  public void setSubmittedBy(Long submittedBy) {
    this.submittedBy = submittedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskProgressBeanRemoveOptionFromIssuesResult taskProgressBeanRemoveOptionFromIssuesResult = (TaskProgressBeanRemoveOptionFromIssuesResult) o;
    return Objects.equals(this.description, taskProgressBeanRemoveOptionFromIssuesResult.description) &&
        Objects.equals(this.elapsedRuntime, taskProgressBeanRemoveOptionFromIssuesResult.elapsedRuntime) &&
        Objects.equals(this.finished, taskProgressBeanRemoveOptionFromIssuesResult.finished) &&
        Objects.equals(this.id, taskProgressBeanRemoveOptionFromIssuesResult.id) &&
        Objects.equals(this.lastUpdate, taskProgressBeanRemoveOptionFromIssuesResult.lastUpdate) &&
        Objects.equals(this.message, taskProgressBeanRemoveOptionFromIssuesResult.message) &&
        Objects.equals(this.progress, taskProgressBeanRemoveOptionFromIssuesResult.progress) &&
        Objects.equals(this.result, taskProgressBeanRemoveOptionFromIssuesResult.result) &&
        Objects.equals(this.self, taskProgressBeanRemoveOptionFromIssuesResult.self) &&
        Objects.equals(this.started, taskProgressBeanRemoveOptionFromIssuesResult.started) &&
        Objects.equals(this.status, taskProgressBeanRemoveOptionFromIssuesResult.status) &&
        Objects.equals(this.submitted, taskProgressBeanRemoveOptionFromIssuesResult.submitted) &&
        Objects.equals(this.submittedBy, taskProgressBeanRemoveOptionFromIssuesResult.submittedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, elapsedRuntime, finished, id, lastUpdate, message, progress, result, self, started, status, submitted, submittedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskProgressBeanRemoveOptionFromIssuesResult {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    elapsedRuntime: ").append(toIndentedString(elapsedRuntime)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
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
