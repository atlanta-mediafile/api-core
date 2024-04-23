/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.grpc;

import com.google.protobuf.ByteString;
import com.mediafile.classes.generated.grpc.FileServiceGrpc;
import com.mediafile.classes.generated.grpc.FileServiceGrpc.FileServiceBlockingStub;
import com.mediafile.classes.generated.grpc.FileServiceGrpc.FileServiceStub;
import com.mediafile.classes.generated.grpc.FileServiceOuterClass.UploadSingleFileRequest;
import com.mediafile.classes.generated.grpc.FileServiceOuterClass.GetSingleFileRequest;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import java.util.Base64;


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
    public String[] uploadFile(byte[] fileBytes) {
        
        var request = UploadSingleFileRequest
                .newBuilder()
                .setFile(ByteString.copyFrom(fileBytes)).build();
        
        var response = stub.uploadSingleFile(request);
        response.getNodeIp();
        
        String[] res = new String[2];
        res[0] = response.getFileId();
        res[1] = response.getNodeIp();
        
        return res;
    }

    @Override
     public String getFile(String fileId) {
         
        var request = GetSingleFileRequest.newBuilder()
                .setFileId(fileId)
                .build();

        var  response = stub.getSingleFile(request);
        return Base64.getEncoder().encodeToString(response.getFile().toByteArray());
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
