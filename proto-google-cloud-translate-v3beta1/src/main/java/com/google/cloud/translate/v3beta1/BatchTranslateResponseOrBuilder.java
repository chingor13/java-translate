/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface BatchTranslateResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.BatchTranslateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Total number of characters (Unicode codepoints).
   * </pre>
   *
   * <code>int64 total_characters = 1;</code>
   */
  long getTotalCharacters();

  /**
   *
   *
   * <pre>
   * Number of successfully translated characters (Unicode codepoints).
   * </pre>
   *
   * <code>int64 translated_characters = 2;</code>
   */
  long getTranslatedCharacters();

  /**
   *
   *
   * <pre>
   * Number of characters that have failed to process (Unicode codepoints).
   * </pre>
   *
   * <code>int64 failed_characters = 3;</code>
   */
  long getFailedCharacters();

  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 4;</code>
   */
  boolean hasSubmitTime();
  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 4;</code>
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
