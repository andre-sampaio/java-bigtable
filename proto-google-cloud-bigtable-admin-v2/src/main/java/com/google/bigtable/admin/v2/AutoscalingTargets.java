/*
 * Copyright 2020 Google LLC
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
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

/**
 *
 *
 * <pre>
 * The Autoscaling targets for a Cluster. These determine the recommended nodes.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.AutoscalingTargets}
 */
public final class AutoscalingTargets extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.AutoscalingTargets)
    AutoscalingTargetsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoscalingTargets.newBuilder() to construct.
  private AutoscalingTargets(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoscalingTargets() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoscalingTargets();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AutoscalingTargets(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16:
            {
              cpuUtilizationPercent_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.admin.v2.InstanceProto
        .internal_static_google_bigtable_admin_v2_AutoscalingTargets_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.InstanceProto
        .internal_static_google_bigtable_admin_v2_AutoscalingTargets_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.AutoscalingTargets.class,
            com.google.bigtable.admin.v2.AutoscalingTargets.Builder.class);
  }

  public static final int CPU_UTILIZATION_PERCENT_FIELD_NUMBER = 2;
  private int cpuUtilizationPercent_;
  /**
   *
   *
   * <pre>
   * The cpu utilization that the Autoscaler should be trying to achieve.
   * This number is on a scale from 0 (no utilization) to
   * 100 (total utilization), and is limited between 10 and 80, otherwise it
   * will return INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>int32 cpu_utilization_percent = 2;</code>
   *
   * @return The cpuUtilizationPercent.
   */
  @java.lang.Override
  public int getCpuUtilizationPercent() {
    return cpuUtilizationPercent_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (cpuUtilizationPercent_ != 0) {
      output.writeInt32(2, cpuUtilizationPercent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cpuUtilizationPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, cpuUtilizationPercent_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.bigtable.admin.v2.AutoscalingTargets)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.AutoscalingTargets other =
        (com.google.bigtable.admin.v2.AutoscalingTargets) obj;

    if (getCpuUtilizationPercent() != other.getCpuUtilizationPercent()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CPU_UTILIZATION_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getCpuUtilizationPercent();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.admin.v2.AutoscalingTargets prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The Autoscaling targets for a Cluster. These determine the recommended nodes.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.AutoscalingTargets}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.AutoscalingTargets)
      com.google.bigtable.admin.v2.AutoscalingTargetsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.admin.v2.InstanceProto
          .internal_static_google_bigtable_admin_v2_AutoscalingTargets_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.InstanceProto
          .internal_static_google_bigtable_admin_v2_AutoscalingTargets_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.AutoscalingTargets.class,
              com.google.bigtable.admin.v2.AutoscalingTargets.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.AutoscalingTargets.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      cpuUtilizationPercent_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.admin.v2.InstanceProto
          .internal_static_google_bigtable_admin_v2_AutoscalingTargets_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.AutoscalingTargets getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.AutoscalingTargets.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.AutoscalingTargets build() {
      com.google.bigtable.admin.v2.AutoscalingTargets result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.AutoscalingTargets buildPartial() {
      com.google.bigtable.admin.v2.AutoscalingTargets result =
          new com.google.bigtable.admin.v2.AutoscalingTargets(this);
      result.cpuUtilizationPercent_ = cpuUtilizationPercent_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.AutoscalingTargets) {
        return mergeFrom((com.google.bigtable.admin.v2.AutoscalingTargets) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.AutoscalingTargets other) {
      if (other == com.google.bigtable.admin.v2.AutoscalingTargets.getDefaultInstance())
        return this;
      if (other.getCpuUtilizationPercent() != 0) {
        setCpuUtilizationPercent(other.getCpuUtilizationPercent());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.AutoscalingTargets parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.AutoscalingTargets) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cpuUtilizationPercent_;
    /**
     *
     *
     * <pre>
     * The cpu utilization that the Autoscaler should be trying to achieve.
     * This number is on a scale from 0 (no utilization) to
     * 100 (total utilization), and is limited between 10 and 80, otherwise it
     * will return INVALID_ARGUMENT error.
     * </pre>
     *
     * <code>int32 cpu_utilization_percent = 2;</code>
     *
     * @return The cpuUtilizationPercent.
     */
    @java.lang.Override
    public int getCpuUtilizationPercent() {
      return cpuUtilizationPercent_;
    }
    /**
     *
     *
     * <pre>
     * The cpu utilization that the Autoscaler should be trying to achieve.
     * This number is on a scale from 0 (no utilization) to
     * 100 (total utilization), and is limited between 10 and 80, otherwise it
     * will return INVALID_ARGUMENT error.
     * </pre>
     *
     * <code>int32 cpu_utilization_percent = 2;</code>
     *
     * @param value The cpuUtilizationPercent to set.
     * @return This builder for chaining.
     */
    public Builder setCpuUtilizationPercent(int value) {

      cpuUtilizationPercent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cpu utilization that the Autoscaler should be trying to achieve.
     * This number is on a scale from 0 (no utilization) to
     * 100 (total utilization), and is limited between 10 and 80, otherwise it
     * will return INVALID_ARGUMENT error.
     * </pre>
     *
     * <code>int32 cpu_utilization_percent = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpuUtilizationPercent() {

      cpuUtilizationPercent_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.AutoscalingTargets)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.AutoscalingTargets)
  private static final com.google.bigtable.admin.v2.AutoscalingTargets DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.AutoscalingTargets();
  }

  public static com.google.bigtable.admin.v2.AutoscalingTargets getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalingTargets> PARSER =
      new com.google.protobuf.AbstractParser<AutoscalingTargets>() {
        @java.lang.Override
        public AutoscalingTargets parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AutoscalingTargets(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AutoscalingTargets> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalingTargets> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.AutoscalingTargets getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
