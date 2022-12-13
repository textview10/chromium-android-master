// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.protos.ipc.invalidation;

// @@protoc_insertion_point(imports_scope)

@SuppressWarnings("hiding")
public interface NanoAndroidChannel {

  // enum MajorVersion
  public static final int INITIAL = 0;
  public static final int BATCH = 1;
  public static final int DEFAULT = INITIAL;
  public static final int MIN_SUPPORTED = INITIAL;
  public static final int MAX_SUPPORTED = BATCH;

  public static final class AndroidEndpointId extends
      com.google.protobuf.nano.ExtendableMessageNano<AndroidEndpointId> {

    private static volatile AndroidEndpointId[] _emptyArray;
    public static AndroidEndpointId[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new AndroidEndpointId[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional string c2dm_registration_id = 2;
    public java.lang.String c2DmRegistrationId;

    // optional string client_key = 3;
    public java.lang.String clientKey;

    // optional string sender_id = 4 [deprecated = true];
    public java.lang.String senderId;

    // optional .com.google.protos.ipc.invalidation.Version channel_version = 5;
    public com.google.protos.ipc.invalidation.nano.NanoClientProtocol.Version channelVersion;

    // optional string package_name = 6;
    public java.lang.String packageName;

    // @@protoc_insertion_point(class_scope:com.google.protos.ipc.invalidation.AndroidEndpointId)

    public AndroidEndpointId() {
      clear();
    }

    public AndroidEndpointId clear() {
      c2DmRegistrationId = null;
      clientKey = null;
      senderId = null;
      channelVersion = null;
      packageName = null;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.c2DmRegistrationId != null) {
        output.writeString(2, this.c2DmRegistrationId);
      }
      if (this.clientKey != null) {
        output.writeString(3, this.clientKey);
      }
      if (this.senderId != null) {
        output.writeString(4, this.senderId);
      }
      if (this.channelVersion != null) {
        output.writeMessage(5, this.channelVersion);
      }
      if (this.packageName != null) {
        output.writeString(6, this.packageName);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.c2DmRegistrationId != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(2, this.c2DmRegistrationId);
      }
      if (this.clientKey != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.clientKey);
      }
      if (this.senderId != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(4, this.senderId);
      }
      if (this.channelVersion != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(5, this.channelVersion);
      }
      if (this.packageName != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(6, this.packageName);
      }
      return size;
    }

    @Override
    public AndroidEndpointId mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!super.storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 18: {
            this.c2DmRegistrationId = input.readString();
            break;
          }
          case 26: {
            this.clientKey = input.readString();
            break;
          }
          case 34: {
            this.senderId = input.readString();
            break;
          }
          case 42: {
            if (this.channelVersion == null) {
              this.channelVersion = new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.Version();
            }
            input.readMessage(this.channelVersion);
            break;
          }
          case 50: {
            this.packageName = input.readString();
            break;
          }
        }
      }
    }

    public static AndroidEndpointId parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new AndroidEndpointId(), data);
    }

    public static AndroidEndpointId parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new AndroidEndpointId().mergeFrom(input);
    }
  }

  public static final class AddressedAndroidMessage extends
      com.google.protobuf.nano.ExtendableMessageNano<AddressedAndroidMessage> {

    private static volatile AddressedAndroidMessage[] _emptyArray;
    public static AddressedAndroidMessage[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new AddressedAndroidMessage[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional string client_key = 1;
    public java.lang.String clientKey;

    // optional bytes message = 2;
    public byte[] message;

    // @@protoc_insertion_point(class_scope:com.google.protos.ipc.invalidation.AddressedAndroidMessage)

    public AddressedAndroidMessage() {
      clear();
    }

    public AddressedAndroidMessage clear() {
      clientKey = null;
      message = null;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.clientKey != null) {
        output.writeString(1, this.clientKey);
      }
      if (this.message != null) {
        output.writeBytes(2, this.message);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.clientKey != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.clientKey);
      }
      if (this.message != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(2, this.message);
      }
      return size;
    }

    @Override
    public AddressedAndroidMessage mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!super.storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.clientKey = input.readString();
            break;
          }
          case 18: {
            this.message = input.readBytes();
            break;
          }
        }
      }
    }

    public static AddressedAndroidMessage parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new AddressedAndroidMessage(), data);
    }

    public static AddressedAndroidMessage parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new AddressedAndroidMessage().mergeFrom(input);
    }
  }

  public static final class AddressedAndroidMessageBatch extends
      com.google.protobuf.nano.ExtendableMessageNano<AddressedAndroidMessageBatch> {

    private static volatile AddressedAndroidMessageBatch[] _emptyArray;
    public static AddressedAndroidMessageBatch[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new AddressedAndroidMessageBatch[0];
          }
        }
      }
      return _emptyArray;
    }

    // repeated .com.google.protos.ipc.invalidation.AddressedAndroidMessage addressed_message = 1;
    public com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage[] addressedMessage;

    // @@protoc_insertion_point(class_scope:com.google.protos.ipc.invalidation.AddressedAndroidMessageBatch)

    public AddressedAndroidMessageBatch() {
      clear();
    }

    public AddressedAndroidMessageBatch clear() {
      addressedMessage = com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage.emptyArray();
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.addressedMessage != null && this.addressedMessage.length > 0) {
        for (int i = 0; i < this.addressedMessage.length; i++) {
          com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage element = this.addressedMessage[i];
          if (element != null) {
            output.writeMessage(1, element);
          }
        }
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.addressedMessage != null && this.addressedMessage.length > 0) {
        for (int i = 0; i < this.addressedMessage.length; i++) {
          com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage element = this.addressedMessage[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(1, element);
          }
        }
      }
      return size;
    }

    @Override
    public AddressedAndroidMessageBatch mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!super.storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 10);
            int i = this.addressedMessage == null ? 0 : this.addressedMessage.length;
            com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage[] newArray =
                new com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.addressedMessage, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.google.protos.ipc.invalidation.NanoAndroidChannel.AddressedAndroidMessage();
            input.readMessage(newArray[i]);
            this.addressedMessage = newArray;
            break;
          }
        }
      }
    }

    public static AddressedAndroidMessageBatch parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new AddressedAndroidMessageBatch(), data);
    }

    public static AddressedAndroidMessageBatch parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new AddressedAndroidMessageBatch().mergeFrom(input);
    }
  }
}
