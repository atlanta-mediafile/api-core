package com.mediafile.classes.generated.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: file_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileServiceGrpc {

  private FileServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "fileservice.FileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest,
      com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse> getGetSingleFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSingleFile",
      requestType = com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest.class,
      responseType = com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest,
      com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse> getGetSingleFileMethod() {
    io.grpc.MethodDescriptor<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest, com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse> getGetSingleFileMethod;
    if ((getGetSingleFileMethod = FileServiceGrpc.getGetSingleFileMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getGetSingleFileMethod = FileServiceGrpc.getGetSingleFileMethod) == null) {
          FileServiceGrpc.getGetSingleFileMethod = getGetSingleFileMethod =
              io.grpc.MethodDescriptor.<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest, com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSingleFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("GetSingleFile"))
              .build();
        }
      }
    }
    return getGetSingleFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest,
      com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse> getUploadSingleFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadSingleFile",
      requestType = com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest.class,
      responseType = com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest,
      com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse> getUploadSingleFileMethod() {
    io.grpc.MethodDescriptor<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest, com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse> getUploadSingleFileMethod;
    if ((getUploadSingleFileMethod = FileServiceGrpc.getUploadSingleFileMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getUploadSingleFileMethod = FileServiceGrpc.getUploadSingleFileMethod) == null) {
          FileServiceGrpc.getUploadSingleFileMethod = getUploadSingleFileMethod =
              io.grpc.MethodDescriptor.<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest, com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadSingleFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("UploadSingleFile"))
              .build();
        }
      }
    }
    return getUploadSingleFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceStub>() {
        @java.lang.Override
        public FileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceStub(channel, callOptions);
        }
      };
    return FileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceBlockingStub>() {
        @java.lang.Override
        public FileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceBlockingStub(channel, callOptions);
        }
      };
    return FileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceFutureStub>() {
        @java.lang.Override
        public FileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceFutureStub(channel, callOptions);
        }
      };
    return FileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSingleFile(com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest request,
        io.grpc.stub.StreamObserver<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSingleFileMethod(), responseObserver);
    }

    /**
     */
    default void uploadSingleFile(com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest request,
        io.grpc.stub.StreamObserver<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadSingleFileMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FileService.
   */
  public static abstract class FileServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FileServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FileService.
   */
  public static final class FileServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FileServiceStub> {
    private FileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSingleFile(com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest request,
        io.grpc.stub.StreamObserver<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSingleFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadSingleFile(com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest request,
        io.grpc.stub.StreamObserver<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadSingleFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FileService.
   */
  public static final class FileServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FileServiceBlockingStub> {
    private FileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse getSingleFile(com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSingleFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse uploadSingleFile(com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadSingleFileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FileService.
   */
  public static final class FileServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FileServiceFutureStub> {
    private FileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse> getSingleFile(
        com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSingleFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse> uploadSingleFile(
        com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadSingleFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SINGLE_FILE = 0;
  private static final int METHODID_UPLOAD_SINGLE_FILE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SINGLE_FILE:
          serviceImpl.getSingleFile((com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest) request,
              (io.grpc.stub.StreamObserver<com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_SINGLE_FILE:
          serviceImpl.uploadSingleFile((com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest) request,
              (io.grpc.stub.StreamObserver<com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetSingleFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest,
              com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileResponse>(
                service, METHODID_GET_SINGLE_FILE)))
        .addMethod(
          getUploadSingleFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest,
              com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse>(
                service, METHODID_UPLOAD_SINGLE_FILE)))
        .build();
  }

  private static abstract class FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mediafile.classes.generated.grpc.FileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileService");
    }
  }

  private static final class FileServiceFileDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier {
    FileServiceFileDescriptorSupplier() {}
  }

  private static final class FileServiceMethodDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FileServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileServiceFileDescriptorSupplier())
              .addMethod(getGetSingleFileMethod())
              .addMethod(getUploadSingleFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
