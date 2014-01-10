// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceMoveProp.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceMoveProp {
  private XinqiBceMoveProp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceMovePropOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 curPlace = 1;
    boolean hasCurPlace();
    int getCurPlace();
    
    // required int32 prePlace = 2;
    boolean hasPrePlace();
    int getPrePlace();
    
    // required string curId = 3;
    boolean hasCurId();
    String getCurId();
    
    // required string preId = 4;
    boolean hasPreId();
    String getPreId();
  }
  public static final class BceMoveProp extends
      com.google.protobuf.GeneratedMessage
      implements BceMovePropOrBuilder {
    // Use BceMoveProp.newBuilder() to construct.
    private BceMoveProp(Builder builder) {
      super(builder);
    }
    private BceMoveProp(boolean noInit) {}
    
    private static final BceMoveProp defaultInstance;
    public static BceMoveProp getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceMoveProp getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 curPlace = 1;
    public static final int CURPLACE_FIELD_NUMBER = 1;
    private int curPlace_;
    public boolean hasCurPlace() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getCurPlace() {
      return curPlace_;
    }
    
    // required int32 prePlace = 2;
    public static final int PREPLACE_FIELD_NUMBER = 2;
    private int prePlace_;
    public boolean hasPrePlace() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getPrePlace() {
      return prePlace_;
    }
    
    // required string curId = 3;
    public static final int CURID_FIELD_NUMBER = 3;
    private java.lang.Object curId_;
    public boolean hasCurId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getCurId() {
      java.lang.Object ref = curId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          curId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCurIdBytes() {
      java.lang.Object ref = curId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        curId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string preId = 4;
    public static final int PREID_FIELD_NUMBER = 4;
    private java.lang.Object preId_;
    public boolean hasPreId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getPreId() {
      java.lang.Object ref = preId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          preId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPreIdBytes() {
      java.lang.Object ref = preId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        preId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      curPlace_ = 0;
      prePlace_ = 0;
      curId_ = "";
      preId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasCurPlace()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPrePlace()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCurId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPreId()) {
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
        output.writeInt32(1, curPlace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, prePlace_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getCurIdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getPreIdBytes());
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
          .computeInt32Size(1, curPlace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, prePlace_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getCurIdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getPreIdBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMovePropOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp.newBuilder()
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
        curPlace_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        prePlace_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        curId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        preId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp result = new com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.curPlace_ = curPlace_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.prePlace_ = prePlace_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.curId_ = curId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.preId_ = preId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp.getDefaultInstance()) return this;
        if (other.hasCurPlace()) {
          setCurPlace(other.getCurPlace());
        }
        if (other.hasPrePlace()) {
          setPrePlace(other.getPrePlace());
        }
        if (other.hasCurId()) {
          setCurId(other.getCurId());
        }
        if (other.hasPreId()) {
          setPreId(other.getPreId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasCurPlace()) {
          
          return false;
        }
        if (!hasPrePlace()) {
          
          return false;
        }
        if (!hasCurId()) {
          
          return false;
        }
        if (!hasPreId()) {
          
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
              curPlace_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              prePlace_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              curId_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              preId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 curPlace = 1;
      private int curPlace_ ;
      public boolean hasCurPlace() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getCurPlace() {
        return curPlace_;
      }
      public Builder setCurPlace(int value) {
        bitField0_ |= 0x00000001;
        curPlace_ = value;
        onChanged();
        return this;
      }
      public Builder clearCurPlace() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curPlace_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 prePlace = 2;
      private int prePlace_ ;
      public boolean hasPrePlace() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getPrePlace() {
        return prePlace_;
      }
      public Builder setPrePlace(int value) {
        bitField0_ |= 0x00000002;
        prePlace_ = value;
        onChanged();
        return this;
      }
      public Builder clearPrePlace() {
        bitField0_ = (bitField0_ & ~0x00000002);
        prePlace_ = 0;
        onChanged();
        return this;
      }
      
      // required string curId = 3;
      private java.lang.Object curId_ = "";
      public boolean hasCurId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getCurId() {
        java.lang.Object ref = curId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          curId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCurId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        curId_ = value;
        onChanged();
        return this;
      }
      public Builder clearCurId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curId_ = getDefaultInstance().getCurId();
        onChanged();
        return this;
      }
      void setCurId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        curId_ = value;
        onChanged();
      }
      
      // required string preId = 4;
      private java.lang.Object preId_ = "";
      public boolean hasPreId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getPreId() {
        java.lang.Object ref = preId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          preId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPreId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        preId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPreId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        preId_ = getDefaultInstance().getPreId();
        onChanged();
        return this;
      }
      void setPreId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        preId_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceMoveProp)
    }
    
    static {
      defaultInstance = new BceMoveProp(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceMoveProp)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BceMoveProp.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"O\n\013BceMoveProp\022\020\n\010curPlace" +
      "\030\001 \002(\005\022\020\n\010prePlace\030\002 \002(\005\022\r\n\005curId\030\003 \002(\t\022" +
      "\r\n\005preId\030\004 \002(\tB\022B\020XinqiBceMoveProp"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceMoveProp_descriptor,
              new java.lang.String[] { "CurPlace", "PrePlace", "CurId", "PreId", },
              com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceMoveProp.BceMoveProp.Builder.class);
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