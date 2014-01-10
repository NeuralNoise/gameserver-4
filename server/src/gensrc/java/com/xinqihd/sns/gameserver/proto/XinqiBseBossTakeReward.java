// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseBossTakeReward.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseBossTakeReward {
  private XinqiBseBossTakeReward() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseBossTakeRewardOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool success = 1 [default = true];
    boolean hasSuccess();
    boolean getSuccess();
    
    // optional string desc = 2;
    boolean hasDesc();
    String getDesc();
  }
  public static final class BseBossTakeReward extends
      com.google.protobuf.GeneratedMessage
      implements BseBossTakeRewardOrBuilder {
    // Use BseBossTakeReward.newBuilder() to construct.
    private BseBossTakeReward(Builder builder) {
      super(builder);
    }
    private BseBossTakeReward(boolean noInit) {}
    
    private static final BseBossTakeReward defaultInstance;
    public static BseBossTakeReward getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseBossTakeReward getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool success = 1 [default = true];
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getSuccess() {
      return success_;
    }
    
    // optional string desc = 2;
    public static final int DESC_FIELD_NUMBER = 2;
    private java.lang.Object desc_;
    public boolean hasDesc() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          desc_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      success_ = true;
      desc_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDescBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDescBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        success_ = true;
        bitField0_ = (bitField0_ & ~0x00000001);
        desc_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward result = new com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.desc_ = desc_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward.getDefaultInstance()) return this;
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasDesc()) {
          setDesc(other.getDesc());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSuccess()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              success_ = input.readBool();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              desc_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool success = 1 [default = true];
      private boolean success_ = true;
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getSuccess() {
        return success_;
      }
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        success_ = value;
        onChanged();
        return this;
      }
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = true;
        onChanged();
        return this;
      }
      
      // optional string desc = 2;
      private java.lang.Object desc_ = "";
      public boolean hasDesc() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDesc(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        desc_ = value;
        onChanged();
        return this;
      }
      public Builder clearDesc() {
        bitField0_ = (bitField0_ & ~0x00000002);
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      void setDesc(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        desc_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseBossTakeReward)
    }
    
    static {
      defaultInstance = new BseBossTakeReward(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseBossTakeReward)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BseBossTakeReward.proto\022 com.xinqihd.s" +
      "ns.gameserver.proto\"8\n\021BseBossTakeReward" +
      "\022\025\n\007success\030\001 \002(\010:\004true\022\014\n\004desc\030\002 \001(\tB\030B" +
      "\026XinqiBseBossTakeReward"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseBossTakeReward_descriptor,
              new java.lang.String[] { "Success", "Desc", },
              com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseBossTakeReward.BseBossTakeReward.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}