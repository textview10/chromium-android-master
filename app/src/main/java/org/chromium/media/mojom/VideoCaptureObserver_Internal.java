
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class VideoCaptureObserver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<VideoCaptureObserver, VideoCaptureObserver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<VideoCaptureObserver, VideoCaptureObserver.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.VideoCaptureObserver";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, VideoCaptureObserver impl) {
            return new Stub(core, impl);
        }

        @Override
        public VideoCaptureObserver[] buildArray(int size) {
          return new VideoCaptureObserver[size];
        }
    };


    private static final int ON_STATE_CHANGED_ORDINAL = 0;

    private static final int ON_NEW_BUFFER_ORDINAL = 1;

    private static final int ON_BUFFER_READY_ORDINAL = 2;

    private static final int ON_BUFFER_DESTROYED_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements VideoCaptureObserver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onStateChanged(
int state) {

            VideoCaptureObserverOnStateChangedParams _message = new VideoCaptureObserverOnStateChangedParams();

            _message.state = state;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_STATE_CHANGED_ORDINAL)));

        }


        @Override
        public void onNewBuffer(
int bufferId, VideoBufferHandle bufferHandle) {

            VideoCaptureObserverOnNewBufferParams _message = new VideoCaptureObserverOnNewBufferParams();

            _message.bufferId = bufferId;

            _message.bufferHandle = bufferHandle;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_NEW_BUFFER_ORDINAL)));

        }


        @Override
        public void onBufferReady(
int bufferId, VideoFrameInfo info) {

            VideoCaptureObserverOnBufferReadyParams _message = new VideoCaptureObserverOnBufferReadyParams();

            _message.bufferId = bufferId;

            _message.info = info;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_BUFFER_READY_ORDINAL)));

        }


        @Override
        public void onBufferDestroyed(
int bufferId) {

            VideoCaptureObserverOnBufferDestroyedParams _message = new VideoCaptureObserverOnBufferDestroyedParams();

            _message.bufferId = bufferId;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_BUFFER_DESTROYED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<VideoCaptureObserver> {

        Stub(org.chromium.mojo.system.Core core, VideoCaptureObserver impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                VideoCaptureObserver_Internal.MANAGER, messageWithHeader);





                    case ON_STATE_CHANGED_ORDINAL: {

                        VideoCaptureObserverOnStateChangedParams data =
                                VideoCaptureObserverOnStateChangedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onStateChanged(data.state);
                        return true;
                    }





                    case ON_NEW_BUFFER_ORDINAL: {

                        VideoCaptureObserverOnNewBufferParams data =
                                VideoCaptureObserverOnNewBufferParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onNewBuffer(data.bufferId, data.bufferHandle);
                        return true;
                    }





                    case ON_BUFFER_READY_ORDINAL: {

                        VideoCaptureObserverOnBufferReadyParams data =
                                VideoCaptureObserverOnBufferReadyParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onBufferReady(data.bufferId, data.info);
                        return true;
                    }





                    case ON_BUFFER_DESTROYED_ORDINAL: {

                        VideoCaptureObserverOnBufferDestroyedParams data =
                                VideoCaptureObserverOnBufferDestroyedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onBufferDestroyed(data.bufferId);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), VideoCaptureObserver_Internal.MANAGER, messageWithHeader, receiver);










                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class VideoCaptureObserverOnStateChangedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int state;

        private VideoCaptureObserverOnStateChangedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoCaptureObserverOnStateChangedParams() {
            this(0);
        }

        public static VideoCaptureObserverOnStateChangedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoCaptureObserverOnStateChangedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoCaptureObserverOnStateChangedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoCaptureObserverOnStateChangedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoCaptureObserverOnStateChangedParams(elementsOrVersion);
                    {
                        
                    result.state = decoder0.readInt(8);
                        VideoCaptureState.validate(result.state);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.state, 8);
        }
    }



    
    static final class VideoCaptureObserverOnNewBufferParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int bufferId;
        public VideoBufferHandle bufferHandle;

        private VideoCaptureObserverOnNewBufferParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoCaptureObserverOnNewBufferParams() {
            this(0);
        }

        public static VideoCaptureObserverOnNewBufferParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoCaptureObserverOnNewBufferParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoCaptureObserverOnNewBufferParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoCaptureObserverOnNewBufferParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoCaptureObserverOnNewBufferParams(elementsOrVersion);
                    {
                        
                    result.bufferId = decoder0.readInt(8);
                    }
                    {
                        
                    result.bufferHandle = VideoBufferHandle.decode(decoder0, 16);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.bufferId, 8);
            
            encoder0.encode(this.bufferHandle, 16, false);
        }
    }



    
    static final class VideoCaptureObserverOnBufferReadyParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int bufferId;
        public VideoFrameInfo info;

        private VideoCaptureObserverOnBufferReadyParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoCaptureObserverOnBufferReadyParams() {
            this(0);
        }

        public static VideoCaptureObserverOnBufferReadyParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoCaptureObserverOnBufferReadyParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoCaptureObserverOnBufferReadyParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoCaptureObserverOnBufferReadyParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoCaptureObserverOnBufferReadyParams(elementsOrVersion);
                    {
                        
                    result.bufferId = decoder0.readInt(8);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.info = VideoFrameInfo.decode(decoder1);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.bufferId, 8);
            
            encoder0.encode(this.info, 16, false);
        }
    }



    
    static final class VideoCaptureObserverOnBufferDestroyedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int bufferId;

        private VideoCaptureObserverOnBufferDestroyedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoCaptureObserverOnBufferDestroyedParams() {
            this(0);
        }

        public static VideoCaptureObserverOnBufferDestroyedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoCaptureObserverOnBufferDestroyedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoCaptureObserverOnBufferDestroyedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoCaptureObserverOnBufferDestroyedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoCaptureObserverOnBufferDestroyedParams(elementsOrVersion);
                    {
                        
                    result.bufferId = decoder0.readInt(8);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.bufferId, 8);
        }
    }



}
