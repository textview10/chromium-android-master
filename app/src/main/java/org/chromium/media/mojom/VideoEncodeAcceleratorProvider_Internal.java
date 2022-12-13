
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class VideoEncodeAcceleratorProvider_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<VideoEncodeAcceleratorProvider, VideoEncodeAcceleratorProvider.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<VideoEncodeAcceleratorProvider, VideoEncodeAcceleratorProvider.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.VideoEncodeAcceleratorProvider";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, VideoEncodeAcceleratorProvider impl) {
            return new Stub(core, impl);
        }

        @Override
        public VideoEncodeAcceleratorProvider[] buildArray(int size) {
          return new VideoEncodeAcceleratorProvider[size];
        }
    };


    private static final int CREATE_VIDEO_ENCODE_ACCELERATOR_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements VideoEncodeAcceleratorProvider.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createVideoEncodeAccelerator(
org.chromium.mojo.bindings.InterfaceRequest<VideoEncodeAccelerator> request) {

            VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams _message = new VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams();

            _message.request = request;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CREATE_VIDEO_ENCODE_ACCELERATOR_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<VideoEncodeAcceleratorProvider> {

        Stub(org.chromium.mojo.system.Core core, VideoEncodeAcceleratorProvider impl) {
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
                                VideoEncodeAcceleratorProvider_Internal.MANAGER, messageWithHeader);





                    case CREATE_VIDEO_ENCODE_ACCELERATOR_ORDINAL: {

                        VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams data =
                                VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createVideoEncodeAccelerator(data.request);
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
                                getCore(), VideoEncodeAcceleratorProvider_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<VideoEncodeAccelerator> request;

        private VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoEncodeAcceleratorProviderCreateVideoEncodeAcceleratorParams(elementsOrVersion);
                    {
                        
                    result.request = decoder0.readInterfaceRequest(8, false);
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
            
            encoder0.encode(this.request, 8, false);
        }
    }



}
