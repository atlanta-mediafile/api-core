/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.grpc;

import com.google.protobuf.ByteString;
import com.mediafile.classes.generated.grpc.FileServiceGrpc;
import com.mediafile.classes.generated.grpc.FileServiceGrpc.FileServiceBlockingStub;
import com.mediafile.classes.generated.grpc.FileServiceGrpc.FileServiceStub;
import com.mediafile.classes.generated.grpc.FileServiceOuterClass;
import com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest;
import com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileResponse;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import java.util.Base64;
import org.springframework.stereotype.Component;


/**
 *
 * @author Dego
 */
public class FileRepository implements IFileRepository {
    
    private final FileServiceBlockingStub stub;
    private final FileServiceStub asyncStub;
    private final Channel channel;
    
    public FileRepository(){
        this("localhost", 5010);
    }
    
    public FileRepository(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }
    
    public FileRepository(ManagedChannelBuilder<?> channelBuilder) {
        this.channel    = channelBuilder.build();
        this.stub       = FileServiceGrpc.newBlockingStub(channel);
        this.asyncStub  = FileServiceGrpc.newStub(channel);
    }
    
    @Override
    public String uploadFile(String b64File) {
        
        ByteString byteString = ByteString.copyFrom(Base64.getDecoder().decode(b64File));
        
        var request = UploadSingleFileRequest
                .newBuilder()
                .setFile(byteString).build();
        
        var response = stub.uploadSingleFile(request);
        return response.getFileId();
    }

    @Override
    public String getFile(String fileId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String uploadFileAsync(String b64File) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFileAsync(String fileId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
