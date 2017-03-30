/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-02-08 11:51:56 PST)
 * on 2017-02-08 at 19:52:26 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.cloudtasks.v2beta2.model;

/**
 * Pull target, task-level settings.
 *
 * This proto can only be used for tasks in a queue which has Queue.pull_target set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullTaskTarget extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of attempts for a task.
   *
   * Cloud Tasks will attempt the task `max_attempts` times. If the first attempt fails, then there
   * will be `max_attempts - 1` retries). Must be > 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxAttempts;

  /**
   * A data payload consumed by the task worker to execute the task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * A meta-data tag for this task.
   *
   * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
   *
   * The tag must be less than 500 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * If true, then the number of attempts is unlimited. If false, then by default Cloud Tasks will
   * retry the task 100 times.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean unlimitedAttempts;

  /**
   * The maximum number of attempts for a task.
   *
   * Cloud Tasks will attempt the task `max_attempts` times. If the first attempt fails, then there
   * will be `max_attempts - 1` retries). Must be > 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxAttempts() {
    return maxAttempts;
  }

  /**
   * The maximum number of attempts for a task.
   *
   * Cloud Tasks will attempt the task `max_attempts` times. If the first attempt fails, then there
   * will be `max_attempts - 1` retries). Must be > 0.
   * @param maxAttempts maxAttempts or {@code null} for none
   */
  public PullTaskTarget setMaxAttempts(java.lang.Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

  /**
   * A data payload consumed by the task worker to execute the task.
   * @see #decodePayload()
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * A data payload consumed by the task worker to execute the task.
   * @see #getPayload()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePayload() {
    return com.google.api.client.util.Base64.decodeBase64(payload);
  }

  /**
   * A data payload consumed by the task worker to execute the task.
   * @see #encodePayload()
   * @param payload payload or {@code null} for none
   */
  public PullTaskTarget setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * A data payload consumed by the task worker to execute the task.
   * @see #setPayload()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PullTaskTarget encodePayload(byte[] payload) {
    this.payload = com.google.api.client.util.Base64.encodeBase64URLSafeString(payload);
    return this;
  }

  /**
   * A meta-data tag for this task.
   *
   * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
   *
   * The tag must be less than 500 bytes.
   * @see #decodeTag()
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * A meta-data tag for this task.
   *
   * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
   *
   * The tag must be less than 500 bytes.
   * @see #getTag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTag() {
    return com.google.api.client.util.Base64.decodeBase64(tag);
  }

  /**
   * A meta-data tag for this task.
   *
   * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
   *
   * The tag must be less than 500 bytes.
   * @see #encodeTag()
   * @param tag tag or {@code null} for none
   */
  public PullTaskTarget setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * A meta-data tag for this task.
   *
   * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
   *
   * The tag must be less than 500 bytes.
   * @see #setTag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PullTaskTarget encodeTag(byte[] tag) {
    this.tag = com.google.api.client.util.Base64.encodeBase64URLSafeString(tag);
    return this;
  }

  /**
   * If true, then the number of attempts is unlimited. If false, then by default Cloud Tasks will
   * retry the task 100 times.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnlimitedAttempts() {
    return unlimitedAttempts;
  }

  /**
   * If true, then the number of attempts is unlimited. If false, then by default Cloud Tasks will
   * retry the task 100 times.
   * @param unlimitedAttempts unlimitedAttempts or {@code null} for none
   */
  public PullTaskTarget setUnlimitedAttempts(java.lang.Boolean unlimitedAttempts) {
    this.unlimitedAttempts = unlimitedAttempts;
    return this;
  }

  @Override
  public PullTaskTarget set(String fieldName, Object value) {
    return (PullTaskTarget) super.set(fieldName, value);
  }

  @Override
  public PullTaskTarget clone() {
    return (PullTaskTarget) super.clone();
  }

}